package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.otj0;

/* loaded from: classes10.dex */
public final class e {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bumptech.glide.load.engine.ResourceRecycler$ResourceRecyclerCallback
        static final int RECYCLE_RESOURCE = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((otj0) message.obj).a();
            return true;
        }
    });

    public final synchronized void a(otj0 otj0Var, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                otj0Var.a();
                this.a = false;
            }
            this.b.obtainMessage(1, otj0Var).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
