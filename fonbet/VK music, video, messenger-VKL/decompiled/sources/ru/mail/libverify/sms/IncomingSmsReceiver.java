package ru.mail.libverify.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class IncomingSmsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null || intent.getAction() == null || !intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            return;
        }
        FileLog.v("IncomingSmsReceiver", "received sms broadcast");
        SmsHandlingService.enqueueWork(context.getApplicationContext(), intent);
    }
}
