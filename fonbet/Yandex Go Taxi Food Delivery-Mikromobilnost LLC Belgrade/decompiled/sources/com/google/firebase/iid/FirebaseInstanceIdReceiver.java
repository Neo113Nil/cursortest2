package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.a;
import defpackage.lz10;
import defpackage.udq0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) udq0.f(new a(context).b(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent createServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (lz10.d(createServiceIntent)) {
            lz10.c(createServiceIntent.getExtras(), "_nd");
        }
    }
}
