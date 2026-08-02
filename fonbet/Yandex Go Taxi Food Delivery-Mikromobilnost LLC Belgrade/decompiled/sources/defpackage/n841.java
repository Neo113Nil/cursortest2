package defpackage;

import com.yandex.go.wallet.flex.a;
import defpackage.kr;
import defpackage.n841;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class n841 extends jhr {
    public final wgr F;
    public final a G;
    public final p841 H;
    public final a850 I;
    public final mjv0 J;
    public final nbs0 K;

    public n841(wgr wgrVar, yvf0 yvf0Var, a aVar, p841 p841Var, a850 a850Var, mjv0 mjv0Var) {
        super(yvf0Var);
        this.F = wgrVar;
        this.G = aVar;
        this.H = p841Var;
        this.I = a850Var;
        this.J = mjv0Var;
        this.K = new nbs0();
    }

    @Override // defpackage.jhr, defpackage.h55
    public final void I(Object obj) {
        this.E = null;
        this.H.b = true;
        this.J.a.remove(qoi0.a(n841.class));
        this.I.d("wallet");
    }

    @Override // defpackage.jhr, defpackage.h55
    public final void J(Object obj) {
        super.J((zy11) obj);
        this.H.c = new m841(this, 0);
        this.I.i("wallet", false);
        this.J.a.add(qoi0.a(n841.class));
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        this.K.a.g(new y741("resumed"));
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.K.a.g(new y741("paused"));
    }

    @Override // defpackage.jhr
    public final rhr Q(Object obj) {
        return this.G.a(new l841(new m841(this, 1), new tls() { // from class: com.yandex.go.flex.wallet.router.a
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                n841 n841Var = n841.this;
                tje.N(n841Var.o(), null, null, new WalletFlexNavigatorRouter$provideFlexConfig$2$1(n841Var, (kr) obj2, null), 3);
                return zy11.a;
            }
        }, new ihr(this)), this.K).a;
    }
}
