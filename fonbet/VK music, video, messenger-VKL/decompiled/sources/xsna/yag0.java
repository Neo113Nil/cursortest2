package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes12.dex */
public final class yag0 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((hag0) message.obj).a();
            return true;
        }
    }

    public final synchronized void a(hag0<?> hag0Var, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                hag0Var.a();
                this.a = false;
            }
            this.b.obtainMessage(1, hag0Var).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
