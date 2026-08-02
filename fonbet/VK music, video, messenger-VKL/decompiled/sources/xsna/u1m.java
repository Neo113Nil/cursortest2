package xsna;

import com.vk.dto.common.id.UserId;
import xsna.lta;

/* compiled from: DescriptionChangesApplier.kt */
/* loaded from: classes5.dex */
public final class u1m implements lta {
    public final pta a;
    public final b25 b;

    public u1m(pta ptaVar, b25 b25Var) {
        this.a = ptaVar;
        this.b = b25Var;
    }

    @Override // xsna.lta
    public final io.reactivex.rxjava3.core.x<lta.a> apply() {
        pta ptaVar = this.a;
        if (!ptaVar.a.a()) {
            return io.reactivex.rxjava3.core.x.k(lta.a.b.a);
        }
        String str = ptaVar.c.d;
        UserId userId = UserId.d;
        hax0 hax0Var = new hax0("status.set");
        hax0Var.K("text", str);
        if (userId.b > 0) {
            hax0Var.F(userId, "group_id");
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.w0(hax0Var).l(new aa6(new p4f(this, 18), 15)), new wq(6), null);
    }
}
