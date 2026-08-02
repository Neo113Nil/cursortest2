package xsna;

import android.os.Handler;

/* compiled from: TrackerDaemon.kt */
/* loaded from: classes3.dex */
public final class php0 {
    public final Handler a = new Handler(h5s.a("TrackerDaemon").getLooper());

    public final void a(g840 g840Var) {
        try {
            this.a.removeCallbacks(g840Var);
        } catch (Exception unused) {
        }
    }

    public final void b(g840 g840Var, long j) {
        Handler handler = this.a;
        try {
            if (j <= 0) {
                handler.post(g840Var);
            } else {
                handler.postDelayed(g840Var, j);
            }
        } catch (Exception unused) {
        }
    }

    public final void d() {
        this.a.removeCallbacksAndMessages(null);
    }
}
