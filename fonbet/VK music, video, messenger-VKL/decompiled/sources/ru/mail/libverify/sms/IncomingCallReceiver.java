package ru.mail.libverify.sms;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class IncomingCallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @SuppressLint({"UnsafeProtectedBroadcastReceiver"})
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent == null || context == null || !intent.hasExtra("state") || !TextUtils.equals(intent.getStringExtra("state"), TelephonyManager.EXTRA_STATE_RINGING)) {
            return;
        }
        FileLog.v("IncomingCallReceiver", "received call broadcast");
        SmsHandlingService.enqueueWork(context.getApplicationContext(), intent);
    }
}
