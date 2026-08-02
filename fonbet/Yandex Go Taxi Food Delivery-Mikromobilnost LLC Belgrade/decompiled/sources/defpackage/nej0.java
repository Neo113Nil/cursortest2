package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.summary.interactor.anchored.state.content.RequirementChipsUiStateInteractor$requirementBubbleDataFlow$$inlined$flatMapLatest$1;
import com.yandex.go.summary.interactor.anchored.state.content.RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$start$1;
import com.yandex.go.summary.interactor.anchored.state.content.t;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class nej0 {
    public final ldj0 a;
    public final ajj0 b;
    public final biv0 c;
    public final zuj0 d;
    public final tpr e;

    public nej0(wiq0 wiq0Var, ldj0 ldj0Var, ajj0 ajj0Var, biv0 biv0Var, zuj0 zuj0Var) {
        this.a = ldj0Var;
        this.b = ajj0Var;
        this.c = biv0Var;
        this.d = zuj0Var;
        this.e = e.t(b.d(new t(e.X(e.s(((k) wiq0Var).j.b(), new g990(28)), new RequirementChipsUiStateInteractor$requirementBubbleDataFlow$$inlined$flatMapLatest$1(null, this)), this), new RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$start$1(2, null)));
    }

    public final String a(ndj0 ndj0Var) {
        zqb zqbVar = ndj0Var.e;
        String obj = zqbVar.b.toString();
        int i = kyh0.supported_requirement_prefix;
        avj0 avj0Var = (avj0) this.d;
        String h = avj0Var.h(i);
        int i2 = mej0.a[zqbVar.a.ordinal()];
        if (i2 == 1) {
            return g8e.p(h, " ", obj);
        }
        if (i2 == 2) {
            return oyr.q(avj0Var.h(kyh0.unsupported_requirement_suffix), " ", h, " ", obj);
        }
        w511.b();
        return null;
    }
}
