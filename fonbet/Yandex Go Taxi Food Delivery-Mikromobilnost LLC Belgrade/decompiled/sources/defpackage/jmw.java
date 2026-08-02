package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class jmw extends a390 {
    public final o A0;
    public g18 B0;
    public final lvq0 y0;
    public final fif z0;

    public jmw(b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, w4l0 w4l0Var, msi msiVar, c cVar, nbv0 nbv0Var, lvq0 lvq0Var, fif fifVar, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, o oVar, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, rh9 rh9Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, w4l0Var, msiVar, cVar, nbv0Var, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, rh9Var, pav0Var, cVar2);
        this.y0 = lvq0Var;
        this.z0 = fifVar;
        this.A0 = oVar;
        this.B0 = g18.u1;
        Kh(null);
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, defpackage.w51, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.B0.cancel();
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final boolean Ih() {
        return this.y0.b;
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Lg(String str) {
        super.Lg(str);
        if ((str == null || str.length() == 0) && !this.y0.c) {
            ((j61) Dg()).a9();
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Ng(ftj0 ftj0Var) {
        ((j61) Dg()).P6(ftj0Var.a);
    }

    @Override // defpackage.uh9, com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        this.B0 = this.z0.c(new ob0(3, this));
        this.H.a();
        super.eh(j61Var);
        lvq0 lvq0Var = this.y0;
        if (lvq0Var.b) {
            return;
        }
        String zh = zh();
        if (zh == null) {
            zh = "";
        }
        j61Var.Rb(zh);
        showProgress();
        ((j61) Dg()).Rb(zh);
        showProgress();
        Sg(this.x.d(zh, lvq0Var.e));
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void ih(x9v0 x9v0Var) {
        String str = x9v0Var.b;
        if (this.J || x9v0Var.F != SuggestResult$SuggestAction.SUBSTITUTE || str == null) {
            super.ih(x9v0Var);
            return;
        }
        ((j61) Dg()).Rb(str);
        showProgress();
        Sg(this.x.d(str, this.y0.e));
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void kh() {
        super.kh();
        this.m0.b();
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final void onSourceAddressChanged(pv0 pv0Var) {
        Address address = pv0Var.a;
        Zone g = this.A0.g();
        String zoneName = pv0Var.a.getZoneName();
        if (g == null || zoneName == null || !zoneName.equals(g.a)) {
            g = null;
        }
        this.m0.i(new ZoneAddress(address, g));
        if (this.y0.b) {
            vh();
        } else {
            lh();
        }
    }

    @Override // defpackage.a390, defpackage.uh9, com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        String str = this.y0.d;
        return str == null ? super.zh() : str;
    }
}
