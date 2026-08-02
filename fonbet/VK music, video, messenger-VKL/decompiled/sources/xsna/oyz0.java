package xsna;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class oyz0 {
    public static volatile zzby d;
    public final ed01 a;
    public final rev b;
    public volatile long c;

    public oyz0(ed01 ed01Var) {
        exc0.i(ed01Var);
        this.a = ed01Var;
        this.b = new rev(this, ed01Var);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.f().currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.e().i.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final Handler d() {
        zzby zzbyVar;
        if (d != null) {
            return d;
        }
        synchronized (oyz0.class) {
            try {
                if (d == null) {
                    d = new zzby(this.a.c().getMainLooper());
                }
                zzbyVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyVar;
    }
}
