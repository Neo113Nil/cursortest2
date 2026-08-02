package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.view.e;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.OrderMvpView;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class o480 implements za80 {
    public final /* synthetic */ e a;

    public o480(e eVar) {
        this.a = eVar;
    }

    @Override // g7i0.a
    public final void Ic() {
        ((OrderMvpView) this.a.Dg()).dismissSelf();
    }

    @Override // defpackage.za80
    public final void Le(String str) {
        ((OrderMvpView) this.a.Dg()).showTipsInput(str);
    }

    @Override // g7i0.a
    public final void Q7(String str) {
        ((f) this.a.D).u0(str);
    }

    @Override // g7i0.a
    public final void Y8(o2y0 o2y0Var) {
        e eVar = this.a;
        ((pep0) eVar.U).f((m950) eVar.S.get(), new csq(o2y0Var, null), hxx.a);
    }

    @Override // defpackage.za80
    public final void k0() {
        ((OrderMvpView) this.a.Dg()).dispatchRatingClick();
    }

    @Override // g7i0.a
    public final void openAfterFeedbackInfo(boolean z) {
        ((OrderMvpView) this.a.Dg()).openAfterFeedbackInfo(z);
    }

    @Override // g7i0.a
    public final void openCostCenter(o2y0 o2y0Var) {
        f fVar = (f) this.a.M.a;
        OrderFragment orderFragment = fVar.p1;
        if (orderFragment == null || !fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
            return;
        }
        orderFragment.openCostCenter(o2y0Var);
    }

    @Override // g7i0.a, defpackage.yr70
    public final void showOrderInfo() {
        ((OrderMvpView) this.a.Dg()).showOrderInfo();
    }

    @Override // g7i0.a
    public final void w5(qim qimVar) {
        ((OrderMvpView) this.a.Dg()).showDriver(qimVar);
    }
}
