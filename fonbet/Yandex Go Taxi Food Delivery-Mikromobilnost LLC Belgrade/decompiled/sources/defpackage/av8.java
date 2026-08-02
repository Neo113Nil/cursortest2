package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class av8 extends qz2 {
    public final String v0;

    public av8(String str, b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, y9y0 y9y0Var, c cVar, nbv0 nbv0Var, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, y9y0Var, nbv0Var, cVar, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, pav0Var, cVar2);
        this.v0 = str;
        Kh(null);
        pav0Var.a = false;
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        String str = this.v0;
        if (str == null) {
            str = null;
        }
        if (str != null) {
            j61Var.Rb(str);
            showProgress();
            Sg(this.x.b(str));
        }
    }

    @Override // defpackage.qz2, com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        String str = this.v0;
        if (str == null) {
            return null;
        }
        return str;
    }
}
