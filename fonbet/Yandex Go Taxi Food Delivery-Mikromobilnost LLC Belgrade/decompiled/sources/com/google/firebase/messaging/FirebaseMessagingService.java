package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.cxq0;
import defpackage.fl10;
import defpackage.kzj;
import defpackage.lz10;
import defpackage.udq0;
import defpackage.v150;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private com.google.android.gms.cloudmessaging.a rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (fl10.A(extras)) {
            fl10 fl10Var = new fl10(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new v150("Firebase-Messaging-Network-Io"));
            try {
                if (new kzj(this, fl10Var, newSingleThreadExecutor).a()) {
                    return;
                }
                newSingleThreadExecutor.shutdown();
                if (lz10.d(intent)) {
                    lz10.c(intent.getExtras(), "_nf");
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private com.google.android.gms.cloudmessaging.a getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new com.google.android.gms.cloudmessaging.a(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        com.google.android.gms.cloudmessaging.a rpc = getRpc(this);
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (rpc.c.j() < 233700000) {
            udq0.o(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.getMessageId());
        Integer zza = cloudMessage.zza();
        if (zza != null) {
            bundle.putInt("google.product_id", zza.intValue());
        }
        com.google.android.gms.cloudmessaging.d.a(rpc.b).b(3, bundle);
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = CoreConstants.Transport.GCM;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                lz10.b(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) cxq0.v().x).poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(com.google.android.gms.cloudmessaging.a aVar) {
        this.rpc = aVar;
    }
}
