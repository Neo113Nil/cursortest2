package defpackage;

import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.preorder.summary.solid.interactors.e0;

/* loaded from: classes6.dex */
public final class iox0 {
    public final fif a;
    public final wiq0 b;
    public final pg9 c;
    public final tt2 d;
    public final b e;
    public final awi f;
    public g18 g;

    public iox0(fif fifVar, wiq0 wiq0Var, pg9 pg9Var, tt2 tt2Var, b bVar, awi awiVar) {
        this.a = fifVar;
        this.b = wiq0Var;
        this.c = pg9Var;
        this.d = tt2Var;
        this.e = bVar;
        this.f = awiVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        tpr t = e.t(new e0(((k) this.b).j.b(), this));
        this.d.getClass();
        return e.F(t, uyj.a).collect(new bax0(5, this), suspendLambda);
    }
}
