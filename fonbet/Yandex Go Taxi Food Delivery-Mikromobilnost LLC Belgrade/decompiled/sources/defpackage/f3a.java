package defpackage;

import ru.yandex.taxi.main_screen_custom.domain.a;

/* loaded from: classes9.dex */
public final class f3a implements v7p {
    public final /* synthetic */ int a;
    public final npe0 b;
    public final eqf0 c;

    public /* synthetic */ f3a(npe0 npe0Var, eqf0 eqf0Var, int i) {
        this.a = i;
        this.b = npe0Var;
        this.c = eqf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eqf0 eqf0Var = this.c;
        npe0 npe0Var = this.b;
        switch (i) {
            case 0:
                return new e3a((a) npe0Var.get(), (dqf0) eqf0Var.get());
            case 1:
                return new qdi((a) npe0Var.get(), (dqf0) eqf0Var.get());
            default:
                return new ar30((a) npe0Var.get(), (dqf0) eqf0Var.get());
        }
    }
}
