package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import com.vk.log.L;

/* compiled from: WakeLockEx.java */
/* loaded from: classes7.dex */
public final class m8x0 {
    public final PowerManager.WakeLock a;
    public ju4 b;

    /* compiled from: WakeLockEx.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m8x0 m8x0Var = m8x0.this;
            m8x0Var.b = null;
            m8x0Var.a(0L);
        }
    }

    public m8x0(Context context, String str) {
        this.a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
    }

    public final void a(long j) {
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock.isHeld()) {
            if (j > 0) {
                if (this.b == null) {
                    ju4 ju4Var = new ju4(new a());
                    ju4Var.b(j);
                    this.b = ju4Var;
                    return;
                }
                return;
            }
            L.l(new String[0]);
            wakeLock.release();
            ju4 ju4Var2 = this.b;
            if (ju4Var2 != null) {
                ((Handler) ju4Var2.a).removeCallbacks((Runnable) ju4Var2.b);
                this.b = null;
            }
        }
    }
}
