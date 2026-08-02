package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import defpackage.fiw;
import defpackage.giw;
import defpackage.iiw;
import defpackage.l9w;
import defpackage.qzj0;
import defpackage.um3;
import defpackage.ynn;
import defpackage.zjw;
import defpackage.zy11;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes14.dex */
public final class ofw implements oew {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ ofw(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.oew
    public final void a(final RawOrderdraftInfo rawOrderdraftInfo, sls slsVar) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((e) h55Var).r(new tls() { // from class: com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        iiw iiwVar = ((giw) obj).a;
                        iiw.P(iiwVar);
                        zjw zjwVar = (zjw) iiwVar.G.get();
                        IntercityDashboardRouter$startSummaryAndCreateOrder$1 intercityDashboardRouter$startSummaryAndCreateOrder$1 = new IntercityDashboardRouter$startSummaryAndCreateOrder$1(0, iiwVar, iiw.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
                        l9w l9wVar = zjwVar.a;
                        l9wVar.a.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new ynn(12, l9wVar, RawOrderdraftInfo.this, intercityDashboardRouter$startSummaryAndCreateOrder$1)), false, false, 28));
                        iiwVar.K = new fiw(iiwVar, 1);
                        return zy11.a;
                    }
                });
                break;
            default:
                gpw gpwVar = (gpw) h55Var;
                gpwVar.r(new ynn(14, gpwVar, rawOrderdraftInfo, slsVar));
                break;
        }
    }
}
