package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.address.search.common.presenter.FullscreenSuggestedDestinationPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.address.search.common.presenter.FullscreenSuggestedDestinationPresenter$showInput$$inlined$safeCollectIn$1;
import ru.yandex.taxi.address.experiment.d;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public class gks extends a390 {
    public final d y0;
    public final tt2 z0;

    public gks(d dVar, tt2 tt2Var, b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, w4l0 w4l0Var, msi msiVar, nbv0 nbv0Var, c cVar, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, rh9 rh9Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, w4l0Var, msiVar, cVar, nbv0Var, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, rh9Var, pav0Var, cVar2);
        this.y0 = dVar;
        this.z0 = tt2Var;
        Kh(null);
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final void Lh() {
        pzt0 pzt0Var = this.s0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.uh9, com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        tje.N(Jg(), null, null, new FullscreenSuggestedDestinationPresenter$attachView$$inlined$safeCollectIn$1(this.m0.f(), null, j61Var), 3);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void jh() {
        hideKeyboard();
        boolean z = this.m0.k() != null;
        mbv0 mbv0Var = this.M;
        if (mbv0Var.g.B(mbv0.i(mbv0Var, null, 3), z)) {
            return;
        }
        ru.yandex.taxi.analytics.i a = mbv0Var.a("address_search.FullscreenSuggestNextButtonTapped");
        a.g("has_destination", z);
        a.m();
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public void qh() {
        tje.N(Jg(), null, null, new FullscreenSuggestedDestinationPresenter$showInput$$inlined$safeCollectIn$1(this.y0.a(), null, this), 3);
    }
}
