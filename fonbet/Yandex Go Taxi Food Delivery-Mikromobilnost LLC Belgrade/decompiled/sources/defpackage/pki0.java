package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.address.search.common.presenter.RedesignedSuggestedSourcesPresenter$showInput$$inlined$safeCollectIn$1;
import com.yandex.go.address.search.common.presenter.d;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class pki0 extends d {
    public final ru.yandex.taxi.address.experiment.d J0;

    public pki0(b bVar, i iVar, v7b0 v7b0Var, mbv0 mbv0Var, wff wffVar, lcz lczVar, com.yandex.go.zone.interactors.b bVar2, a aVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, com.yandex.go.taxi.tariffs.interactor.b bVar3, caq0 caq0Var, w4l0 w4l0Var, v7j0 v7j0Var, ru.yandex.taxi.address.interactor.b bVar4, nbv0 nbv0Var, igf igfVar, dgf dgfVar, c cVar, oc60 oc60Var, y46 y46Var, h51 h51Var, prj0 prj0Var, msi msiVar, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, wb1 wb1Var, h4v0 h4v0Var, ru.yandex.taxi.search.suggest.i iVar2, kr0 kr0Var, ru.yandex.taxi.address.experiment.d dVar, tt2 tt2Var, gbv0 gbv0Var, w6r w6rVar) {
        super(bVar, iVar, v7b0Var, mbv0Var, wffVar, lczVar, bVar2, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, caq0Var, w4l0Var, v7j0Var, bVar4, nbv0Var, igfVar, dgfVar, cVar, oc60Var, y46Var, h51Var, prj0Var, msiVar, qoiVar, yvf0Var, oep0Var, d6v0Var, wb1Var, h4v0Var, iVar2, kr0Var, tt2Var, gbv0Var, bVar3, w6rVar);
        this.J0 = dVar;
    }

    @Override // com.yandex.go.address.search.common.presenter.d, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        mbv0 mbv0Var = this.M;
        b5v0 b5v0Var = mbv0Var.g;
        long currentTimeMillis = System.currentTimeMillis();
        String c = mbv0Var.e.c();
        String str = mbv0Var.i;
        String str2 = mbv0Var.m;
        String str3 = null;
        if (str2 != null && str2.length() != 0) {
            str3 = str2;
        }
        b5v0Var.p(c, str, str3, mbv0Var.f.a(), currentTimeMillis);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void qh() {
        tje.N(Jg(), null, null, new RedesignedSuggestedSourcesPresenter$showInput$$inlined$safeCollectIn$1(this.J0.a(), null, this), 3);
    }
}
