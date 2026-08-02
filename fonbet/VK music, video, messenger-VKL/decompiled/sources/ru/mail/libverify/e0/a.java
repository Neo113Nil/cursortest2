package ru.mail.libverify.e0;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.c.g;
import ru.mail.libverify.e0.a;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.l0.e;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.p0.f;
import ru.mail.libverify.platform.gcm.IdProviderService;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.bqy;
import xsna.izs;
import xsna.kv2;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class a implements ru.mail.libverify.h0.a, f {

    @NonNull
    private final MessageBus c;

    @NonNull
    private final d d;

    @NonNull
    private final g e;

    @NonNull
    private final Context f;

    @NonNull
    private final e g;

    @NonNull
    private final bqy<KeyValueStorage> h;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean b = new AtomicBoolean(false);

    @NonNull
    IdProviderService.IdProviderCallback i = new C2195a();

    /* renamed from: ru.mail.libverify.e0.a$a, reason: collision with other inner class name */
    public class C2195a implements IdProviderService.IdProviderCallback {
        public C2195a() {
        }

        @Override // ru.mail.libverify.platform.gcm.IdProviderService.IdProviderCallback
        public final void onException(@NonNull Throwable th) {
            FileLog.e("GcmRegistrar", "GCM service access error", th);
            FileLog.e("GcmRegistrar", "not enough permissions to register GCM channel or other error", th);
            a.this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.GCM_TOKEN_UPDATE_FAILED, th, Boolean.FALSE));
            VerificationFactory.getPlatformService(a.this.f).isServiceAvailable(a.this.f, new izs() { // from class: ru.mail.libverify.e0.c
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    s3q0 a;
                    a = a.C2195a.this.a((String) obj);
                    return a;
                }
            });
        }

        @Override // ru.mail.libverify.platform.gcm.IdProviderService.IdProviderCallback
        public final void onIdProviderCallback(@NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            FileLog.v("GcmRegistrar", "GCM registration id %s was received and stored in shared preferences", str);
            a aVar = a.this;
            synchronized (aVar) {
                int a = ru.mail.libverify.n0.e.a(aVar.f);
                FileLog.v("GcmRegistrar", "save GCM token %s on app version %s", str, Integer.valueOf(a));
                ((KeyValueStorage) aVar.h.get()).putValue("gcm_registration_id" + aVar.e.c(), str).putValue("gcm_app_version" + aVar.e.c(), Integer.toString(a)).commitSync();
            }
            a.this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.GCM_TOKEN_UPDATED, str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ s3q0 a(String str) {
            if (a.this.b.compareAndSet(false, true)) {
                a.this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.GCM_NO_GOOGLE_PLAY_SERVICES_INSTALLED, str));
            }
            FileLog.e("GcmRegistrar", "fatal play services check status: %s", str);
            return s3q0.a;
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(@NonNull Context context, @NonNull e eVar, @NonNull d dVar, @NonNull MessageBus messageBus, @NonNull g gVar, @NonNull bqy<KeyValueStorage> bqyVar) {
        this.f = context;
        this.g = eVar;
        this.h = bqyVar;
        this.c = messageBus;
        this.d = dVar;
        this.e = gVar;
    }

    private synchronized void h() {
        FileLog.v("GcmRegistrar", "clear GCM token");
        this.h.get().removeValue("gcm_registration_id" + this.e.c()).removeValue("gcm_app_version" + this.e.c()).commitSync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            h();
            Context context = this.f;
            VerificationFactory.getPlatformService(context).getIdProviderService().getId(context, this.e.c(), this.i);
        } catch (Throwable th) {
            try {
                ru.mail.libverify.n0.b.a("GcmRegistrar", "failed to register GCM", th);
            } finally {
                this.g.a(this);
                this.a.set(false);
            }
        }
    }

    private void j() {
        if (this.b.get()) {
            return;
        }
        VerificationFactory.getPlatformService(this.f);
        if (this.a.compareAndSet(false, true)) {
            this.g.a(this, false, 0);
            FileLog.v("GcmRegistrar", "initialize registration for %s", this.e.c());
            this.d.d().submit(new kv2(this, 20));
        }
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        int i = b.a[ru.mail.libverify.p0.e.a(message, "GcmRegistrar", e.b.NORMAL).ordinal()];
        if (i == 1) {
            h();
            return true;
        }
        if (i != 2) {
            return false;
        }
        FileLog.v("GcmRegistrar", "refresh token with type: %s", ru.mail.libverify.n0.c.valueOf(((Bundle) ru.mail.libverify.p0.e.a(message)).getString("gcm_token_check_type")));
        h();
        c();
        this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.GCM_TOKEN_REFRESHED, (Object) null));
        return true;
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.c.register(Arrays.asList(ru.mail.libverify.p0.a.API_RESET, ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN), this);
        c();
    }

    @Override // ru.mail.libverify.h0.a
    @Nullable
    public final String c() {
        String value = this.h.get().getValue("gcm_registration_id" + this.e.c());
        if (TextUtils.isEmpty(value)) {
            FileLog.v("GcmRegistrar", "GCM token not found");
            j();
            return null;
        }
        if (TextUtils.equals(this.h.get().getValue("gcm_app_version" + this.e.c()), Integer.toString(ru.mail.libverify.n0.e.a(this.f)))) {
            return value;
        }
        FileLog.v("GcmRegistrar", "app version changed");
        j();
        return null;
    }
}
