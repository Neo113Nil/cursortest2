package com.yandex.passport.internal.smsretriever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public class SmsRetrieverReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.yandex.passport.legacy.a.a("Sms receiver");
        if (intent == null || !"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.yandex.passport.legacy.a.a("Extras are null in received SMS");
            return;
        }
        Status status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        if (status == null) {
            com.yandex.passport.legacy.a.a("EXTRA_STATUS not found in extras");
            return;
        }
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            if (statusCode != 15) {
                return;
            }
            com.yandex.passport.legacy.a.a("Timeout waiting sms");
            return;
        }
        String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        if (string == null) {
            com.yandex.passport.legacy.a.a("Message is null");
            return;
        }
        a smsRetrieverHelper = com.yandex.passport.internal.di.a.a().getSmsRetrieverHelper();
        smsRetrieverHelper.getClass();
        Matcher matcher = a.c.matcher(string);
        if (matcher.find()) {
            smsRetrieverHelper.a(matcher.group(1), SmsFromType.SMS_RETRIEVER);
        } else {
            com.yandex.passport.legacy.a.a("Sms message don't match pattern: ".concat(string));
        }
    }
}
