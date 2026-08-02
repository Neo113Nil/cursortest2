package defpackage;

import com.yandex.go.taxi.summary.shared.selector.interactors.SelectorTypeInteractor$uiModeFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalMode;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class dmq0 {
    public final arv0 a;
    public final ck31 b;
    public final tt2 c;

    public dmq0(arv0 arv0Var, ck31 ck31Var, tt2 tt2Var) {
        this.a = arv0Var;
        this.b = ck31Var;
        this.c = tt2Var;
    }

    public final VerticalMode a() {
        int i = cmq0.a[((a7t0) this.a).a().a.ordinal()];
        if (i == 1) {
            return ((k) this.b).j().b;
        }
        if (i == 2) {
            return VerticalMode.WITHOUT_SELECTOR;
        }
        w511.b();
        return null;
    }

    public final tpr b() {
        tpr t = e.t(e.X(((a7t0) this.a).a, new SelectorTypeInteractor$uiModeFlow$$inlined$flatMapLatest$1(null, this)));
        this.c.getClass();
        return e.F(t, uyj.a);
    }
}
