package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import defpackage.b43;
import defpackage.mum;
import defpackage.ny61;
import defpackage.p851;
import defpackage.q851;
import defpackage.wx60;

/* loaded from: classes11.dex */
class WithinAppServiceBinder extends Binder {
    private final p851 intentHandler;

    public WithinAppServiceBinder(p851 p851Var) {
        this.intentHandler = p851Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$send$0(q851 q851Var, Task task) {
        q851Var.b.c(null);
    }

    public void send(final q851 q851Var) {
        Task processIntent;
        if (Binder.getCallingUid() != Process.myUid()) {
            ny61.z("Binding only allowed within app");
            return;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        p851 p851Var = this.intentHandler;
        processIntent = ((EnhancedIntentService) ((mum) p851Var).a).processIntent(q851Var.a);
        processIntent.c(new b43(1), new wx60() { // from class: com.google.firebase.messaging.d
            @Override // defpackage.wx60
            public final void onComplete(Task task) {
                WithinAppServiceBinder.lambda$send$0(q851.this, task);
            }
        });
    }
}
