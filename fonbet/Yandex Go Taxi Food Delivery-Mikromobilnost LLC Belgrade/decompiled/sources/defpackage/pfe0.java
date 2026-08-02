package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class pfe0 extends ad5 implements vfe0 {
    public final ofe0 x;
    public final qfe0 y;

    public pfe0(ofe0 ofe0Var, qfe0 qfe0Var) {
        super(nfe0.class);
        this.x = ofe0Var;
        this.y = qfe0Var;
    }

    @Override // defpackage.vfe0
    public final void ae() {
        qfe0 qfe0Var = this.y;
        sfe0 sfe0Var = qfe0Var.c;
        ((pep0) sfe0Var.H).f((m950) sfe0Var.G.get(), new rui(qfe0Var.a, qfe0Var.b, (Expansion) null, (UUID) null, 28), hxx.a);
    }

    @Override // defpackage.vfe0
    public final void close() {
        this.y.c.r(new qu(9));
    }
}
