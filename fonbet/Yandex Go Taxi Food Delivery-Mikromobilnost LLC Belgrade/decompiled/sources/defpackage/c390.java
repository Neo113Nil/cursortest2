package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.address.search.common.presenter.d;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class c390 extends d {
    public final ga0 J0;

    public c390(b bVar, i iVar, v7b0 v7b0Var, mbv0 mbv0Var, wff wffVar, lcz lczVar, com.yandex.go.zone.interactors.b bVar2, a aVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, caq0 caq0Var, w4l0 w4l0Var, v7j0 v7j0Var, ru.yandex.taxi.address.interactor.b bVar3, nbv0 nbv0Var, igf igfVar, dgf dgfVar, c cVar, pc60 pc60Var, y46 y46Var, h51 h51Var, prj0 prj0Var, msi msiVar, qoi qoiVar, l9g l9gVar, oep0 oep0Var, d6v0 d6v0Var, wb1 wb1Var, h4v0 h4v0Var, ru.yandex.taxi.search.suggest.i iVar2, kr0 kr0Var, tt2 tt2Var, gbv0 gbv0Var, com.yandex.go.taxi.tariffs.interactor.b bVar4, ga0 ga0Var, w6r w6rVar) {
        super(bVar, iVar, v7b0Var, mbv0Var, wffVar, lczVar, bVar2, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, caq0Var, w4l0Var, v7j0Var, bVar3, nbv0Var, igfVar, dgfVar, cVar, pc60Var, y46Var, h51Var, prj0Var, msiVar, qoiVar, l9gVar, oep0Var, d6v0Var, wb1Var, h4v0Var, iVar2, kr0Var, tt2Var, gbv0Var, bVar4, w6rVar);
        this.J0 = ga0Var;
    }

    @Override // com.yandex.go.address.search.common.presenter.d, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        ga0 ga0Var = this.J0;
        String str = ga0Var.a;
        if (str != null) {
            ((j61) Dg()).Rb(str);
            showProgress();
            Sg(this.x.d(str, ga0Var.b));
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.d, com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        String str = this.J0.a;
        if (str != null) {
            return str;
        }
        String zh = super.zh();
        return zh == null ? "" : zh;
    }
}
