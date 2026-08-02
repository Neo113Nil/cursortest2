package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: Workers.java */
/* loaded from: classes3.dex */
public class czx0 extends Handler {
    public final WeakReference<dzx0> a;

    public czx0(dzx0 dzx0Var) {
        this.a = new WeakReference<>(dzx0Var);
    }

    public final boolean a() {
        dzx0 dzx0Var;
        WeakReference<dzx0> weakReference = this.a;
        return (weakReference == null || (dzx0Var = weakReference.get()) == null || !dzx0Var.i()) ? false : true;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        dzx0 dzx0Var = this.a.get();
        if (dzx0Var == null) {
            return;
        }
        if (i != -2) {
            if (i != -1) {
                throw new RuntimeException(lhg.a(i, "unknown message "));
            }
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        dzx0Var.c = false;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
        try {
            Thread thread = dzx0Var.e;
            if (thread != null) {
                if (!thread.isInterrupted()) {
                    dzx0Var.e.interrupt();
                }
                dzx0Var.e.join();
            }
        } catch (Exception unused) {
        }
        dzx0Var.e = null;
    }
}
