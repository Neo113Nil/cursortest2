package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.common.a;
import com.yandex.go.taxi.summary.verticalsummary.router.c;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class jh31 implements gfv0 {
    public final /* synthetic */ d b;
    public final /* synthetic */ ih31 c;

    public jh31(d dVar, ih31 ih31Var) {
        this.b = dVar;
        this.c = ih31Var;
    }

    @Override // defpackage.gfv0
    public final void a() {
        a aVar = this.b.K0;
        if (aVar != null) {
            aVar.i();
        }
        this.c.a.invoke(TariffPageCloseReason.FOOTER_BUTTON);
    }

    @Override // defpackage.gfv0
    public final void b() {
        ((c) this.b.L0.getValue()).v();
    }

    @Override // defpackage.gfv0
    public final void e(sgx0 sgx0Var) {
        fcj0 fcj0Var = this.b.c0;
        com.yandex.go.route.interactor.c cVar = (com.yandex.go.route.interactor.c) fcj0Var.d;
        Address g = cVar.g();
        ((c4r0) fcj0Var.e).d(SelectionOrigin.USER, sgx0Var, "", false);
        if (!z81.a(g, cVar.g()) && ((k) ((wiq0) fcj0Var.c)).m() == null) {
            jst.e.x(new IllegalStateException("Selected tariff was gone"), "No selected tariff after tariffSelected call");
        } else {
            ((rf5) fcj0Var.a).b();
            ((z880) fcj0Var.b).a();
        }
    }
}
