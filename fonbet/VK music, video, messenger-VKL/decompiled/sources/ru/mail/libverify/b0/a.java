package ru.mail.libverify.b0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.c.b;
import ru.mail.libverify.n0.e;
import ru.mail.libverify.platform.core.IPlatformUtils;
import ru.mail.libverify.platform.sms.SmsRetrieverManager;
import ru.mail.libverify.platform.sms.SmsRetrieverPlatformManager;
import ru.mail.verify.core.utils.FileLog;
import xsna.cs2;
import xsna.i0;
import xsna.lbt0;
import xsna.s3q0;
import xsna.to2;
import xsna.tzz;
import xsna.yv6;

/* loaded from: classes9.dex */
public final class a implements SmsRetrieverManager {

    @NonNull
    private final b b;
    private final HashMap a = new HashMap();

    @Nullable
    private Boolean c = null;
    private boolean d = false;

    public a(@NonNull b bVar) {
        this.b = bVar;
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverManager
    public final boolean canUseSmsRetriever() {
        IPlatformUtils utils = VerificationFactory.getPlatformService(this.b.e().getContext()).getUtils();
        if (e.b(this.b.e().getContext(), "android.permission.RECEIVE_SMS") || e.b(this.b.e().getContext(), "android.permission.READ_SMS")) {
            FileLog.d("SmsRetrieverManager", "no reason to use sms retriever (has permissions)");
            return false;
        }
        if (this.d) {
            FileLog.d("SmsRetrieverManager", "there were an error in sms retriever api");
            return false;
        }
        if (this.c == null) {
            if (utils == null) {
                return false;
            }
            this.c = Boolean.valueOf(utils.checkGooglePlayServicesNewer(this.b.e().getContext()));
        }
        return this.c.booleanValue();
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverManager
    public final void onSmsRetrieverSmsReceived(int i, @NonNull String str) {
        SmsRetrieverPlatformManager smsRetrieverPlatformManager = VerificationFactory.getPlatformService(this.b.e().getContext()).getSmsRetrieverPlatformManager();
        if (!this.a.isEmpty()) {
            a();
        }
        smsRetrieverPlatformManager.onSmsRetrieverSmsReceived(i, str, new tzz(5, this, str), new yv6(this, 9));
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverManager
    public final void register(@NonNull SmsRetrieverManager.SmsRetrieverSmsCallback smsRetrieverSmsCallback) {
        if (canUseSmsRetriever()) {
            if (this.a.containsKey(smsRetrieverSmsCallback)) {
                FileLog.e("SmsRetrieverManager", "callback has been already registered");
            } else {
                this.a.put(smsRetrieverSmsCallback, smsRetrieverSmsCallback);
                a();
            }
        }
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverManager
    public final void unregister(@NonNull SmsRetrieverManager.SmsRetrieverSmsCallback smsRetrieverSmsCallback) {
        this.a.remove(smsRetrieverSmsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((SmsRetrieverManager.SmsRetrieverSmsCallback) it.next()).onIncomingSms(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        FileLog.d("SmsRetrieverManager", "SmsRetrieverClient successfully subscribed");
        this.d = false;
        this.b.a().a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_SUCCEEDED, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.b.b().post(new cs2(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.b.a().a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_WAIT_TIMEOUT, (Object) null));
    }

    private void a() {
        VerificationFactory.getPlatformService(this.b.e().getContext()).getSmsRetrieverPlatformManager().checkSmsRetrieverTask(this.b.e().getContext(), new to2(this, 16), new lbt0(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s3q0 b(Exception exc) {
        this.b.b().post(new i0(14, this, exc));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc) {
        FileLog.e("SmsRetrieverManager", "SmsRetrieverClient failed to subscribe", exc);
        this.d = true;
        this.b.a().a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_RETRIEVER_MANAGER_SUBSCRIBE_FAILED, (Object) null));
    }
}
