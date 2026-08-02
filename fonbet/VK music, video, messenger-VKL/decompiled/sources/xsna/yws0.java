package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: VideoMotionTimer.kt */
/* loaded from: classes8.dex */
public final class yws0 {
    public final int a;
    public final pg b;
    public int d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final w29 e = new w29(this, 12);

    public yws0(int i, pg pgVar) {
        this.a = i;
        this.b = pgVar;
    }

    public final void a() {
        if (this.d >= this.a) {
            return;
        }
        Handler handler = this.c;
        w29 w29Var = this.e;
        handler.removeCallbacks(w29Var);
        handler.postDelayed(w29Var, 50L);
    }
}
