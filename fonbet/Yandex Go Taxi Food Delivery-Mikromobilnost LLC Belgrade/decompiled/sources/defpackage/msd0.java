package defpackage;

import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;
import com.yandex.go.payments.paymentlist.domain.i;

/* loaded from: classes8.dex */
public final class msd0 implements jba0 {
    public final fga0 a;
    public final i b;

    public msd0(fga0 fga0Var, i iVar) {
        this.a = fga0Var;
        this.b = iVar;
    }

    @Override // defpackage.jba0
    public final gj8 a(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).o(str)));
    }

    @Override // defpackage.jba0
    public final gj8 b(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).i(str)));
    }

    @Override // defpackage.jba0
    public final gj8 c(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).m(str)));
    }

    @Override // defpackage.jba0
    public final gj8 d(fl8 fl8Var) {
        CardPayment$VerifyStrategy cardPayment$VerifyStrategy = fl8Var.j;
        String str = fl8Var.d;
        qc8 qc8Var = new qc8(str, fl8Var.g, fl8Var.f, fl8Var.e);
        y931 w931Var = lsd0.a[cardPayment$VerifyStrategy.ordinal()] == 1 ? v931.a : new w931(fl8Var.n);
        i iVar = this.b;
        m2v m2vVar = new m2v(iVar.v.a());
        m2vVar.A((cardPayment$VerifyStrategy == CardPayment$VerifyStrategy.ANTIFRAUD || iVar.f()) ? false : true);
        return new gj8(new dj8(m2vVar.f(fl8Var.a, str, qc8Var, w931Var)));
    }

    @Override // defpackage.jba0
    public final gj8 e(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).h(str)));
    }

    @Override // defpackage.jba0
    public final gj8 f(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).k(str)));
    }

    @Override // defpackage.jba0
    public final gj8 g() {
        m2v m2vVar = new m2v(this.b.v.a());
        m2vVar.A(this.a.d().isEmpty());
        return new gj8(new cj8(m2vVar.e()));
    }

    @Override // defpackage.jba0
    public final gj8 h(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).n(str)));
    }

    @Override // defpackage.jba0
    public final gj8 i(String str) {
        return new gj8(new dj8(new m2v(this.b.v.a()).j(str)));
    }
}
