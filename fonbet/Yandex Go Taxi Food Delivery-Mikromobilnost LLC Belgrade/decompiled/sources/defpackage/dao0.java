package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.v2.ScootersPackagesModalView;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class dao0 extends a {
    public final w030 F;
    public final yvf0 G;
    public final j7o0 H;
    public final o7o0 I;
    public final yvf0 J;

    public dao0(w030 w030Var, yvf0 yvf0Var, j7o0 j7o0Var, o7o0 o7o0Var, yvf0 yvf0Var2) {
        super(null);
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = j7o0Var;
        this.I = o7o0Var;
        this.J = yvf0Var2;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        l7o0 l7o0Var = (l7o0) obj;
        cao0 cao0Var = new cao0(this);
        qco0 qco0Var = l7o0Var.a;
        String str = l7o0Var.b;
        ScootersPassesFromScreen scootersPassesFromScreen = l7o0Var.c;
        String str2 = l7o0Var.d;
        z4m0 z4m0Var = this.I.a;
        n7o0 n7o0Var = new n7o0((qxm0) ((ggl0) z4m0Var.b).get(), (po21) ((xvf0) z4m0Var.c).get(), (com.yandex.go.scooters.passes.v2.domain.a) ((z8n0) z4m0Var.w).get(), (i) ((xvf0) z4m0Var.x).get(), (com.yandex.go.scooters.payments.domain.a) ((xvf0) z4m0Var.y).get(), (g) ((xvf0) z4m0Var.z).get(), (ufo0) ((xvf0) z4m0Var.A).get(), str, str2, qco0Var, scootersPassesFromScreen, cao0Var);
        s6k0 s6k0Var = this.H.a;
        return new ScootersPackagesModalView((Context) ((xvf0) s6k0Var.a).get(), n7o0Var, (bia0) ((xvf0) s6k0Var.b).get(), (rea0) ((k7g) s6k0Var.c).get());
    }
}
