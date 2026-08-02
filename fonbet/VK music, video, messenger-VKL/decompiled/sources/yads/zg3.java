package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class zg3 {
    public final lg3 a;
    public final vg3 b;
    public final Handler c;
    public boolean d;

    public /* synthetic */ zg3(lg3 lg3Var, vg3 vg3Var) {
        this(lg3Var, vg3Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.d) {
            this.b.b();
            this.c.removeCallbacksAndMessages(null);
            this.d = false;
        }
    }

    public zg3(lg3 lg3Var, vg3 vg3Var, Handler handler) {
        this.a = lg3Var;
        this.b = vg3Var;
        this.c = handler;
    }
}
