package defpackage;

import com.yandex.go.flex.common.router.payment.method.morphlex.a;
import com.yandex.go.payments.lpm.domain.e;
import com.yandex.go.payments.lpm.navigation.d;

/* loaded from: classes13.dex */
public final class ezz implements nba0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public ezz(a aVar, m830 m830Var) {
        this.a = 1;
        this.c = aVar;
        this.b = m830Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                d.P((d) this.b, (e) this.c);
                break;
            case 1:
                ((a) this.c).r(new qu(9));
                break;
            default:
                ((com.yandex.go.payments.plus.navigation.a) this.b).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.nba0
    public final void l() {
        switch (this.a) {
            case 0:
                d.P((d) this.b, (e) this.c);
                break;
            case 1:
                a aVar = (a) this.c;
                kpi0 kpi0Var = aVar.G;
                if (!jl40.l((m830) this.b, new m830(kpi0Var.a(), kpi0Var.c.a.e()))) {
                    aVar.r(new ps20(19));
                    break;
                } else {
                    aVar.r(new qu(9));
                    break;
                }
            default:
                ((com.yandex.go.payments.plus.navigation.a) this.b).r(new cjd0((bjd0) this.c, 1));
                break;
        }
    }

    public /* synthetic */ ezz(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }
}
