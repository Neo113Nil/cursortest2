package ru.mail.libverify.platform.firebase.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ru.mail.libverify.platform.core.ISmsRetrieverService;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import ru.mail.libverify.platform.firebase.a;

/* loaded from: classes9.dex */
public final class SmsRetrieverReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || !"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            return;
        }
        FirebaseCoreService.Companion.getClass();
        FirebaseCoreService.a.a().v("SmsRetrieverReceiver", "sms retrieved action received");
        ISmsRetrieverService iSmsRetrieverService = a.e;
        if (iSmsRetrieverService == null) {
            iSmsRetrieverService = a.f;
        }
        iSmsRetrieverService.enqueueWork(context.getApplicationContext(), intent);
    }
}
