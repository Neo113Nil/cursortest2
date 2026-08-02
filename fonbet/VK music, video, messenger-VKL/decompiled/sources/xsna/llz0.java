package xsna;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class llz0 extends com.google.android.gms.internal.base.zar {
    public final /* synthetic */ nlz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llz0(nlz0 nlz0Var, Looper looper) {
        super(looper);
        this.a = nlz0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        nlz0 nlz0Var = this.a;
        if (i != 1) {
            if (i != 2) {
                new StringBuilder(String.valueOf(i).length() + 20);
                return;
            } else {
                nlz0Var.r();
                return;
            }
        }
        ReentrantLock reentrantLock = nlz0Var.c;
        reentrantLock.lock();
        try {
            if (nlz0Var.p()) {
                nlz0Var.t();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
