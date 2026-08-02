package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.u53;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {
    private static AtomicReference<FirebaseApp$UserUnlockReceiver> INSTANCE = new AtomicReference<>();
    private final Context applicationContext;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.applicationContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ensureReceiverRegistered(Context context) {
        if (INSTANCE.get() == null) {
            FirebaseApp$UserUnlockReceiver firebaseApp$UserUnlockReceiver = new FirebaseApp$UserUnlockReceiver(context);
            AtomicReference<FirebaseApp$UserUnlockReceiver> atomicReference = INSTANCE;
            while (!atomicReference.compareAndSet(null, firebaseApp$UserUnlockReceiver)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(firebaseApp$UserUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (a.k) {
            try {
                Iterator it = ((u53) a.l.values()).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        unregister();
    }

    public void unregister() {
        this.applicationContext.unregisterReceiver(this);
    }
}
