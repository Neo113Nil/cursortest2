package defpackage;

import com.yandex.go.analytics.b;
import ru.yandex.taxi.am.token.internal.c;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.plus.repository.f;
import ru.yandex.taxi.startup.launch.i;

/* loaded from: classes8.dex */
public final class ole implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final eqh c;
    public final xvf0 d;

    public ole(eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 2;
        this.c = eqhVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        eqh eqhVar = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new nle(i5m.a(xvf0Var2), (b) eqhVar.get(), (hs50) xvf0Var.get());
            case 1:
                return new o((n0t) xvf0Var2.get(), i5m.a(eqhVar), (ru.yandex.taxi.perf.b) xvf0Var.get());
            case 2:
                return new spp0((u2d0) eqhVar.get(), (qid0) xvf0Var2.get(), (f) xvf0Var.get());
            default:
                return new c((ru.yandex.taxi.am.token.internal.b) xvf0Var2.get(), (i) eqhVar.get(), (mrj0) xvf0Var.get());
        }
    }

    public /* synthetic */ ole(v7p v7pVar, eqh eqhVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = eqhVar;
        this.d = xvf0Var;
    }
}
