package ru.mail.libverify.sms;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.VerifySafeJobIntentService;
import ru.mail.libverify.R;
import ru.mail.libverify.d0.a;
import ru.mail.libverify.n0.b;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class SmsHandlingService extends VerifySafeJobIntentService {
    @NonNull
    private static SmsMessage[] a(@NonNull Intent intent) {
        Object[] objArr = (Object[]) intent.getSerializableExtra("pdus");
        String stringExtra = intent.getStringExtra("format");
        if (objArr == null) {
            return new SmsMessage[0];
        }
        int length = objArr.length;
        SmsMessage[] smsMessageArr = new SmsMessage[length];
        for (int i = 0; i < length; i++) {
            byte[] bArr = (byte[]) objArr[i];
            if (TextUtils.isEmpty(stringExtra)) {
                smsMessageArr[i] = SmsMessage.createFromPdu(bArr);
            } else {
                smsMessageArr[i] = SmsMessage.createFromPdu(bArr, stringExtra);
            }
        }
        return smsMessageArr;
    }

    private void b(@NonNull Intent intent) {
        try {
            SmsMessage[] a = a(intent);
            if (a.length == 0) {
                FileLog.e("SmsHandlingService", "received message is empty");
                return;
            }
            String displayOriginatingAddress = a[0].getDisplayOriginatingAddress();
            StringBuilder sb = new StringBuilder(160);
            for (SmsMessage smsMessage : a) {
                sb.append(smsMessage.getMessageBody());
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(displayOriginatingAddress) || TextUtils.isEmpty(sb2)) {
                FileLog.e("SmsHandlingService", "received ether message or phoneNumber is empty");
            } else {
                FileLog.v("SmsHandlingService", "received message");
                a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_SMS_RECEIVED, displayOriginatingAddress, sb2));
            }
        } catch (Throwable th) {
            FileLog.e("SmsHandlingService", "can't parse sms message %s", th.getMessage());
            intent.removeExtra("pdus");
            b.a("SmsHandlingService", "handleSmsMessages", new RuntimeException(new RuntimeException("intent : " + ru.mail.libverify.n0.e.a(intent.getExtras()), th)));
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        try {
            JobIntentService.enqueueWork(context.getApplicationContext(), (Class<?>) SmsHandlingService.class, context.getResources().getInteger(R.integer.libverify_sms_call_job_id), intent);
        } catch (Throwable th) {
            FileLog.e("SmsHandlingService", "failed to start a service", th);
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        FileLog.v("SmsHandlingService", "service destroyed");
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(@NonNull Intent intent) {
        if (intent.getExtras() == null) {
            FileLog.e("SmsHandlingService", "Incoming intent extras is null");
            return;
        }
        try {
            if (intent.hasExtra("pdus")) {
                FileLog.v("SmsHandlingService", "Incoming sms dump %s", ru.mail.libverify.n0.e.a(intent.getExtras()));
                b(intent);
                return;
            }
            if (!intent.hasExtra("state") || !TextUtils.equals(intent.getStringExtra("state"), TelephonyManager.EXTRA_STATE_RINGING)) {
                FileLog.v("SmsHandlingService", "empty intent");
                return;
            }
            FileLog.v("SmsHandlingService", "received call");
            if (intent.getExtras() == null) {
                return;
            }
            String string = intent.getExtras().getString("incoming_number");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_CALL_RECEIVED, string));
        } catch (Throwable th) {
            FileLog.e("SmsHandlingService", "failed to process incoming sms %s", th.getMessage());
        }
    }
}
