package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.lta;

/* compiled from: AvatarChangesApplier.kt */
/* loaded from: classes5.dex */
public final class kq5 implements lta {
    public final pta a;
    public final fzd0 b;
    public final dvq0 c;
    public final ouq0 d;
    public final aha0 e = new aha0();

    public kq5(pta ptaVar, fzd0 fzd0Var, dvq0 dvq0Var, ouq0 ouq0Var) {
        this.a = ptaVar;
        this.b = fzd0Var;
        this.c = dvq0Var;
        this.d = ouq0Var;
    }

    @Override // xsna.lta
    public final io.reactivex.rxjava3.core.x<lta.a> apply() {
        io.reactivex.rxjava3.core.x D;
        pta ptaVar = this.a;
        pta ptaVar2 = pta.this;
        if (epx.f(ptaVar2.c.a, ptaVar2.b.a)) {
            return io.reactivex.rxjava3.core.x.k(lta.a.b.a);
        }
        ir5 ir5Var = ptaVar.c.a;
        UserId c = this.c.c();
        List A = rli0.A(new ulp0(f2k0.c(new ulp0(new i5g(ir5Var.a()), new jq5(c)), 100, 100), new a5(1, this, c)));
        if (A.isEmpty()) {
            D = io.reactivex.rxjava3.core.x.k(EmptyList.b);
        } else {
            D = io.reactivex.rxjava3.core.x.D(A, new tr(new zsw(20), 24));
        }
        int i = 2;
        return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.r(D, new kf3(new cq3(i, ir5Var, this), i)), new wq(6), null);
    }
}
