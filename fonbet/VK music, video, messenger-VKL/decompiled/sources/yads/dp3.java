package yads;

import java.util.Map;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class dp3 {
    public final ic2 a;
    public final a13 b = new a13();

    public dp3(ic2 ic2Var) {
        this.a = ic2Var;
    }

    public final void a(Map map) {
        a13 a13Var = this.b;
        synchronized (a13Var.a) {
            if (a13Var.b) {
                return;
            }
            a13Var.b = true;
            s3q0 s3q0Var = s3q0.a;
            a(this, map);
        }
    }

    public static final void a(dp3 dp3Var, Map map) {
        dp3Var.a.setVisibility(0);
        ic2 ic2Var = dp3Var.a;
        q11 q11Var = ic2Var.g;
        if (q11Var != null) {
            q11Var.a(ic2Var, map);
        }
    }
}
