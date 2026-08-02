package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.navigation.a;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes14.dex */
public final class h5y0 implements sy60 {
    public final /* synthetic */ a a;

    public h5y0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(uzx0 uzx0Var, Preorder preorder) {
        a aVar = this.a;
        yvf0 yvf0Var = aVar.Q;
        ra00 ra00Var = aVar.E;
        aVar.Z.getClass();
        a3y0.h(new String[]{"handleBack"});
        hst hstVar = jst.e;
        if (uzx0Var.equals(qzx0.a)) {
            ra00Var.a();
            return;
        }
        int i = 9;
        if (uzx0Var.equals(szx0.a)) {
            aVar.r(new qu(i));
            return;
        }
        if (!(uzx0Var instanceof tzx0)) {
            if (uzx0Var.equals(rzx0.a)) {
                ra00Var.b((m950) yvf0Var.get(), new hre0(new vpe0(preorder), new fse0(null), "open payments from order", true, dab1.b));
                return;
            } else {
                w511.b();
                return;
            }
        }
        ynv0 ynv0Var = ((tzx0) uzx0Var).a;
        ore0 ore0Var = new ore0(preorder, "open summary from order", ynv0Var);
        if (ynv0Var instanceof unv0) {
            aVar.r(new qu(i));
            ((pep0) aVar.F).f((m950) yvf0Var.get(), ore0Var, hxx.a);
        } else {
            ra00Var.b((m950) yvf0Var.get(), ore0Var);
        }
        aVar.U.a(SavePersonalStateNotifier$SavePersonalStateReason.ORDER_COMPOSITE);
    }
}
