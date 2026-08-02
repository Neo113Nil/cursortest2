package defpackage;

import ru.yandex.taxi.persuggest.experiments.b;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.search.f;

/* loaded from: classes6.dex */
public final class k51 implements v7p {
    public final /* synthetic */ int a;
    public final ddf b;
    public final xvf0 c;

    public /* synthetic */ k51(ddf ddfVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = ddfVar;
        this.c = xvf0Var;
    }

    public static f a(ddf ddfVar, w3b0 w3b0Var) {
        rwp0 rwp0Var = (rwp0) ddfVar.b;
        yuf0 yuf0Var = w3b0Var.a;
        return new f((h) ((xvf0) yuf0Var.a).get(), (atd0) ((xvf0) yuf0Var.b).get(), (mu0) ((xvf0) yuf0Var.c).get(), (b) ((vrt0) yuf0Var.d).get(), (y46) ((xvf0) yuf0Var.e).get(), (urv0) ((xvf0) yuf0Var.f).get(), rwp0Var);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        ddf ddfVar = this.b;
        switch (i) {
            case 0:
                return a(ddfVar, (w3b0) xvf0Var.get());
            default:
                return ((jc61) xvf0Var.get()).a((rwp0) ddfVar.b);
        }
    }
}
