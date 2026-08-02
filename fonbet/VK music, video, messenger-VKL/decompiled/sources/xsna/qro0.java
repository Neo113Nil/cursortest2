package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ThreadUtils.kt */
/* loaded from: classes11.dex */
public final class qro0 {
    public static final bpn0 a = new bpn0(new b63(13));

    public static void a(gzs gzsVar) {
        e(0L, gzsVar);
    }

    public static final void b(Handler handler, gzs<s3q0> gzsVar) {
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            gzsVar.invoke();
        } else {
            handler.postDelayed(new nro0(gzsVar, 0), 0L);
        }
    }

    public static void c(gzs gzsVar) {
        b((Handler) a.getValue(), gzsVar);
    }

    public static void d(gzs gzsVar, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(new jl90(2, gzsVar), j);
        } else {
            handler.post(new l1l0(1, gzsVar));
        }
    }

    public static void e(long j, gzs gzsVar) {
        d(gzsVar, j, (Handler) a.getValue());
    }
}
