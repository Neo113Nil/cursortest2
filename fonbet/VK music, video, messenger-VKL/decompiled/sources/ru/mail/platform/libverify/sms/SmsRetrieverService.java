package ru.mail.platform.libverify.sms;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;
import androidx.core.app.VerifySafeJobIntentService;
import java.util.concurrent.Executors;
import ru.mail.libverify.R;
import ru.mail.libverify.a.a;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.d0.a;
import ru.mail.libverify.n.n;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.platform.core.SmsRetrieverResult;
import ru.mail.verify.core.utils.FileLog;
import xsna.sj1;

/* loaded from: classes9.dex */
public class SmsRetrieverService extends VerifySafeJobIntentService {
    public static final int SMS_SAVE_STATE_TIMEOUT = 300000;

    @Nullable
    static n a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar) {
        a.a((Service) nVar.c(), e.a(ru.mail.libverify.p0.a.SERVICE_SMS_RETRIEVER_SMS_RECEIVED, Integer.valueOf(nVar.b()), nVar.a()));
        a = null;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        try {
            JobIntentService.enqueueWork(context.getApplicationContext(), (Class<?>) SmsRetrieverService.class, context.getResources().getInteger(R.integer.libverify_sms_retriever_job_id), intent);
        } catch (Throwable th) {
            FileLog.e("SmsRetrieverService", "failed to start a service", th);
        }
    }

    public static void resendState() {
        n nVar = a;
        if (nVar == null) {
            return;
        }
        if (System.currentTimeMillis() - nVar.d() > 300000) {
            a = null;
        } else {
            Executors.newFixedThreadPool(4).submit(new sj1(nVar, 13));
        }
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(@NonNull Intent intent) {
        SmsRetrieverResult smsRetrieverService;
        Bundle extras = intent.getExtras();
        if (extras == null || (smsRetrieverService = VerificationFactory.getPlatformService(getApplicationContext()).smsRetrieverService(extras)) == null) {
            return;
        }
        if (ru.mail.libverify.a.a.b() != a.b.INACTIVE) {
            ru.mail.libverify.d0.a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_SMS_RETRIEVER_SMS_RECEIVED, Integer.valueOf(smsRetrieverService.getResultStatus()), smsRetrieverService.getResultMessage()));
        } else {
            a = new n(this, smsRetrieverService.getResultStatus(), smsRetrieverService.getResultMessage(), System.currentTimeMillis());
        }
    }
}
