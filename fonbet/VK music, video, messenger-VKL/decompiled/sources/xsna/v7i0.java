package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.j7i0;

/* compiled from: SelectGroupVerificationFeature.kt */
/* loaded from: classes18.dex */
public final class v7i0 extends wk50<p8i0, x7i0, j7i0, c8i0> {
    public final g8i0 f;
    public final UserId g;
    public final unr0 h;
    public final f4z i;
    public final hpj j;

    public v7i0(j7i0 j7i0Var, d8i0 d8i0Var, g8i0 g8i0Var, UserId userId, unr0 unr0Var) {
        super(j7i0Var, d8i0Var);
        this.f = g8i0Var;
        this.g = userId;
        this.h = unr0Var;
        this.i = new f4z();
        this.j = zvj.a(hqu0.a());
    }

    @Override // xsna.wk50
    public final void N(x7i0 x7i0Var, j7i0 j7i0Var) {
        x7i0 x7i0Var2 = x7i0Var;
        j7i0 j7i0Var2 = j7i0Var;
        boolean z = j7i0Var2 instanceof j7i0.a;
        UserId userId = this.g;
        unr0 unr0Var = this.h;
        if (z) {
            unr0Var.i(userId.b);
            myc0.h(this.j, null, null, new u7i0(this, null), 3);
            return;
        }
        boolean z2 = j7i0Var2 instanceof j7i0.b;
        f4z f4zVar = this.i;
        if (z2) {
            f4zVar.b(q7i0.a);
            return;
        }
        if (j7i0Var2 instanceof j7i0.c) {
            f4zVar.b(new r7i0(y7i0.a(x7i0Var2).b));
            y7i0.a(x7i0Var2);
        } else {
            if (!(j7i0Var2 instanceof j7i0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((j7i0.d) j7i0Var2).b;
            if (epx.f(str, "base")) {
                unr0Var.f(userId.b);
            } else if (epx.f(str, "premium")) {
                unr0Var.m(userId.b);
            }
            f4zVar.b(new s7i0(str));
        }
    }
}
