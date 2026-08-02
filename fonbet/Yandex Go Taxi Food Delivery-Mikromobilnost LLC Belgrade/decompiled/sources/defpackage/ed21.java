package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class ed21 implements Runnable {
    public final r2x0 a;
    public volatile Pair b;
    public final /* synthetic */ gd21 c;

    public ed21(gd21 gd21Var, r2x0 r2x0Var) {
        this.c = gd21Var;
        this.a = r2x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.c.n.get();
        gd21 gd21Var = this.c;
        int i = 15;
        if (z) {
            gd21Var.a.post(new t601(i, gd21Var, this));
            return;
        }
        try {
            w1x0 w1x0Var = gd21Var.f;
            r2x0 r2x0Var = this.a;
            if (bi91.f(w1x0Var.b.a)) {
                if (ydz.a.a()) {
                    ((ArrayList) r2x0Var.c).size();
                    ydz.a();
                }
                w1x0Var.a.P(new lzu0(16, w1x0Var, r2x0Var));
            }
            this.b = this.c.g.b();
        } finally {
            gd21 gd21Var2 = this.c;
            gd21Var2.a.post(new t601(i, gd21Var2, this));
        }
    }
}
