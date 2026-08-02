package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.communications.stepsinstructions.interactor.c;
import ru.yandex.taxi.communications.stepsinstructions.modal.StepsInstructionsModalView;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes5.dex */
public final class abu0 extends a {
    public final w030 F;
    public final n3h G;
    public final z4m0 H;
    public final boolean I;

    public abu0(w030 w030Var, n3h n3hVar, z4m0 z4m0Var) {
        super(null);
        this.F = w030Var;
        this.G = n3hVar;
        this.H = z4m0Var;
        this.I = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.I;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        zau0 zau0Var = (zau0) obj;
        z4m0 z4m0Var = this.H;
        z4m0Var.getClass();
        n3w a = n3w.a(new dbu0(new wor0(new gag(z4m0Var, 2))));
        xau0 xau0Var = (xau0) n3w.a(new xau0(new amp0(new l9t0((xvf0) new gag(z4m0Var, 3), (xvf0) new gag(z4m0Var, 0), (xvf0) new gag(z4m0Var, 6), (xvf0) new gag(z4m0Var, 5), 7, false), new gag(z4m0Var, 1), new gag(z4m0Var, 4)))).a;
        jbu0 jbu0Var = zau0Var.a;
        sob1 sob1Var = zau0Var.b;
        l7s0 l7s0Var = new l7s0(this);
        amp0 amp0Var = xau0Var.a;
        return new StepsInstructionsModalView(new ru.yandex.taxi.communications.stepsinstructions.presenter.a(jbu0Var, sob1Var, l7s0Var, (c) ((l9t0) amp0Var.a).get(), (wsc) ((gag) amp0Var.b).get(), (b) ((gag) amp0Var.c).get()), (Context) ((gag) ((dbu0) a.a).a.a).get());
    }
}
