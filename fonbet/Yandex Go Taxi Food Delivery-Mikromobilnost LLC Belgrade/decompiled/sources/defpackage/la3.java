package defpackage;

import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class la3 extends Thread {
    public static final la3 c;
    public ArrayBlockingQueue a;
    public n6e0 b;

    static {
        la3 la3Var = new la3();
        la3Var.a = new ArrayBlockingQueue(10);
        la3Var.b = new n6e0(10);
        c = la3Var;
        la3Var.setName("AsyncLayoutInflator");
        la3Var.start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ka3 ka3Var = (ka3) this.a.take();
                try {
                    ka3Var.d = ka3Var.a.inflate(ka3Var.c, (ViewGroup) null, false);
                } catch (RuntimeException unused) {
                }
                View view = ka3Var.d;
                Message.obtain(ka3Var.b, 0, ka3Var).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }
    }
}
