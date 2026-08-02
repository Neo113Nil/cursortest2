package com.yandex.go.taxi.order.state.driving;

import com.yandex.go.taxi.order.domain.repositories.f;
import defpackage.amm;
import defpackage.d980;
import defpackage.i3y;
import defpackage.ixx0;
import defpackage.jbm;
import defpackage.jqb0;
import defpackage.n0g;
import defpackage.ney;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u0b;
import defpackage.zxs0;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes14.dex */
public final class a extends u0b {
    public final d980 V;
    public final zxs0 W;
    public final f Z;
    public final i3y a0;
    public final ixx0 b0;
    public boolean c0;
    public final tt2 d0;

    public a(n0g n0gVar, ney neyVar, d980 d980Var, zxs0 zxs0Var, f fVar) {
        super(n0gVar, amm.class, neyVar);
        this.V = d980Var;
        this.W = zxs0Var;
        this.Z = fVar;
        this.a0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new jbm(17));
        this.b0 = new ixx0(new jqb0());
        this.d0 = (tt2) n0gVar.b.n.get();
    }

    @Override // com.yandex.go.taxi.order.state.o, defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.V.e();
    }

    public final void Rg() {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        tje.N(Jg(), null, null, new DrivingStateViewPresenter$handleDriverAcceptance$1(this, null), 3);
    }
}
