package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.contacts.b;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.safety.center.main.a;
import com.yandex.go.zone.repository.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class btl0 extends m95 {
    public final hrl0 G;
    public final ysl0 H;
    public final vsl0 I;
    public final mrl0 J;
    public final b K;
    public final cql0 L;
    public final tsl0 M;
    public final dvl0 N;
    public final ypc O;
    public final w030 P;
    public final boolean Q = true;

    public btl0(hrl0 hrl0Var, ysl0 ysl0Var, vsl0 vsl0Var, mrl0 mrl0Var, b bVar, cql0 cql0Var, tsl0 tsl0Var, dvl0 dvl0Var, ypc ypcVar, w030 w030Var) {
        this.G = hrl0Var;
        this.H = ysl0Var;
        this.I = vsl0Var;
        this.J = mrl0Var;
        this.K = bVar;
        this.L = cql0Var;
        this.M = tsl0Var;
        this.N = dvl0Var;
        this.O = ypcVar;
        this.P = w030Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.P;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.Q;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        o8g0 o8g0Var = new o8g0(this, (itl0) obj, false);
        m mVar = this.H.a;
        a aVar = new a((j) ((xvf0) mVar.a).get(), (SafetyCenterExperiment) ((xvf0) mVar.b).get(), (as21) ((c7g) mVar.c).get(), (itl0) ((xvf0) mVar.d).get(), (g) ((xvf0) mVar.e).get(), (com.yandex.go.safety.center.m) ((jpf0) mVar.f).get(), (o) ((c7g) mVar.g).get(), (j5z) ((b7g) mVar.h).get(), (com.yandex.go.something_wrong_screen.repository.b) ((c7g) mVar.i).get(), o8g0Var, (com.yandex.go.safety.center.analytics.a) ((xvf0) mVar.j).get(), this.G);
        bu0 bu0Var = this.I.a;
        return new SafetyCenterMainView((Context) ((xvf0) bu0Var.a).get(), aVar, (SafetyCenterExperiment) ((xvf0) bu0Var.b).get(), (qnu0) ((xvf0) bu0Var.c).get(), (xvf0) bu0Var.d, (oep0) ((xvf0) bu0Var.e).get(), (gvz0) ((xvf0) bu0Var.f).get(), (tlu0) ((c7g) bu0Var.g).get(), (pav) ((xvf0) bu0Var.h).get(), (k7x0) ((xvf0) bu0Var.i).get());
    }
}
