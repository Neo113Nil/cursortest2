package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.t4c0;
import xsna.xn60;

/* compiled from: PostView.kt */
/* loaded from: classes4.dex */
public final class z8c0 implements fo60 {
    public final /* synthetic */ y8c0 a;

    public z8c0(y8c0 y8c0Var) {
        this.a = y8c0Var;
    }

    @Override // xsna.fo60
    public final void a(xn60 xn60Var) {
        lj50 u4c0Var;
        yzb0 yzb0Var = (yzb0) this.a.w.getValue();
        if (xn60Var instanceof xn60.a) {
            u4c0Var = new t4c0.b((xn60.a) xn60Var);
        } else if (xn60Var instanceof xn60.d) {
            u4c0Var = new t4c0.e((xn60.d) xn60Var);
        } else if (xn60Var instanceof xn60.b) {
            u4c0Var = new t4c0.c((xn60.b) xn60Var);
        } else {
            if (!(xn60Var instanceof xn60.c)) {
                throw new NoWhenBranchMatchedException();
            }
            u4c0Var = new u4c0((xn60.c) xn60Var);
        }
        n5c0 c = ((y8c0) yzb0Var.a.c).c();
        if (c != null) {
            c.b(u4c0Var);
        }
    }
}
