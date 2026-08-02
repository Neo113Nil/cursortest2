package defpackage;

import com.yandex.go.payments.delivery.navigation.a;
import com.yandex.go.payments.order.domain.e;
import com.yandex.go.payments.summary.domain.f;

/* loaded from: classes13.dex */
public final class aii implements nba0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ aii(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new qu(9));
                break;
            case 1:
                ((com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity.a) h55Var).r(new qu(9));
                break;
            case 2:
                ((e) h55Var).r(new qu(9));
                break;
            case 3:
                com.yandex.go.overdraft.e eVar = (com.yandex.go.overdraft.e) h55Var;
                eVar.G.h("Close", eVar.T);
                eVar.r(new qu(9));
                break;
            case 4:
                ((com.yandex.go.payments.composite.navigation.a) h55Var).r(new qu(9));
                break;
            case 5:
                ((f) h55Var).r(new qu(9));
                break;
            default:
                ((com.yandex.go.payments.transport.navigation.e) h55Var).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.nba0
    public final void l() {
        switch (this.a) {
            case 0:
                ((a) this.b).r(new qu(9));
                break;
            case 1:
                ((com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity.a) this.b).r(new qu(9));
                break;
            case 2:
                ((e) this.b).r(new qu(9));
                break;
            case 3:
                ((com.yandex.go.overdraft.e) this.b).r(new qu(9));
                break;
            case 4:
                ((com.yandex.go.payments.composite.navigation.a) this.b).r(new u290(20, this));
                break;
            case 5:
                ((f) this.b).r(new qu(9));
                break;
            default:
                ((com.yandex.go.payments.transport.navigation.e) this.b).r(new qu(9));
                break;
        }
    }
}
