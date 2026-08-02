package defpackage;

import com.yandex.quark.js.implementation.facade.PreferredDirectivePayloadFormat;
import com.yandex.quark.js.implementation.webView.internal.c;
import com.yandex.quark.utils.Disposable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public final class mih implements uhg0, shg0, olw0, f38, yt1 {
    public final x821 A;
    public final oj41 B;
    public final ic41 C;
    public final x2n D;
    public final gb20 E;
    public final c a;
    public final zwf0 b;
    public final t830 c;
    public final lc41 w;
    public final gvc0 x;
    public final qlw0 y;
    public final l5u z;

    public mih(c cVar, zwf0 zwf0Var, zq6 zq6Var, t830 t830Var, x2n x2nVar, PreferredDirectivePayloadFormat preferredDirectivePayloadFormat) {
        lc41 lc41Var = new lc41(zwf0Var, cVar, t830Var, x2nVar, preferredDirectivePayloadFormat);
        gvc0 gvc0Var = new gvc0(zwf0Var, cVar);
        qlw0 qlw0Var = new qlw0(cVar);
        l5u l5uVar = new l5u(zq6Var, t830Var, zwf0Var);
        x821 x821Var = new x821();
        oj41 oj41Var = new oj41();
        ic41 ic41Var = new ic41(gvc0Var, zwf0Var);
        this.a = cVar;
        this.b = zwf0Var;
        this.c = t830Var;
        this.w = lc41Var;
        this.x = gvc0Var;
        this.y = qlw0Var;
        this.z = l5uVar;
        this.A = x821Var;
        this.B = oj41Var;
        this.C = ic41Var;
        this.D = x2nVar;
        this.E = new gb20(zq6Var, t830Var, zwf0Var);
        Iterator it = scc.g(new a6u(lc41Var, 1), new a6u(lc41Var, 2), new a6u(lc41Var, 3), new a6u(lc41Var, 0), new v5u(zwf0Var, gvc0Var, t830Var), l5uVar, x821Var, oj41Var).iterator();
        while (it.hasNext()) {
            this.a.a((ifo) it.next());
        }
        Iterator it2 = scc.g(this.w, this.x, this.y).iterator();
        while (it2.hasNext()) {
            this.a.e((zhg0) it2.next());
        }
        this.x.c(new c38(this.E));
    }

    @Override // defpackage.mfo
    public final Disposable a(ifo ifoVar) {
        return this.a.c.a(ifoVar);
    }

    @Override // defpackage.mlc
    public final syj0 b(clc clcVar) {
        return this.a.x.b(clcVar);
    }

    @Override // defpackage.f38
    public final void c(e38 e38Var) {
        this.C.c(e38Var);
    }

    @Override // defpackage.eq60
    public final void e(Object obj) {
        this.a.e((zhg0) obj);
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        this.a.f((zhg0) obj);
    }

    @Override // defpackage.uqw
    public final void g(dsw dswVar) {
        l5u l5uVar = this.z;
        cot cotVar = new cot(2, dswVar);
        gb20 gb20Var = this.E;
        t830 t830Var = this.c;
        l5uVar.w = new quf0(new nfh(gb20Var.d, cotVar, t830Var), this.D, t830Var, this.b);
    }

    @Override // defpackage.olw0
    public final tpr j() {
        return this.A.b;
    }

    @Override // defpackage.yt1
    public final void k(Set set) {
        this.y.k(set);
    }
}
