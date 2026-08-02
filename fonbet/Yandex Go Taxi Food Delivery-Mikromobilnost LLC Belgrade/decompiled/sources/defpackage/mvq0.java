package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.address.search.common.presenter.i;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class mvq0 extends i {
    public final lvq0 k0;
    public final fif l0;
    public final nvq0 m0;
    public g18 n0;

    public mvq0(b bVar, ru.yandex.taxi.preorder.suggested.i iVar, v7b0 v7b0Var, mbv0 mbv0Var, a aVar, fhf fhfVar, rwp0 rwp0Var, lvq0 lvq0Var, s3o s3oVar, f3o f3oVar, fif fifVar, c cVar, nbv0 nbv0Var, prj0 prj0Var, h51 h51Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, nvq0 nvq0Var) {
        super(bVar, iVar, v7b0Var, mbv0Var, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, nbv0Var, cVar, prj0Var, h51Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var);
        this.k0 = lvq0Var;
        this.l0 = fifVar;
        this.m0 = nvq0Var;
        this.n0 = g18.u1;
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final void Bh(pv0 pv0Var) {
        ((j61) Dg()).P6(pv0Var);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.n0.cancel();
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Lg(String str) {
        super.Lg(str);
        if ((str == null || str.length() == 0) && !this.k0.c) {
            ((j61) Dg()).a9();
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Ng(ftj0 ftj0Var) {
        ((j61) Dg()).P6(ftj0Var.a);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        this.n0 = this.l0.c(new ob0(12, this));
        this.H.a();
        super.eh(j61Var);
        if (this.k0.b) {
            vh();
            return;
        }
        String filter = j61Var.getFilter();
        if (filter == null || filter.length() == 0) {
            j61Var.a9();
            return;
        }
        j61Var.Rb(filter);
        showProgress();
        Sg(this.x.b(filter));
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void oh(String str) {
        this.m0.a = str;
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        String str = this.m0.a;
        return str == null ? "" : str;
    }
}
