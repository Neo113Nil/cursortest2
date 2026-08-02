package defpackage;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.orders.domain.h;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.f;
import com.yandex.go.superapp.tracking.data.e;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.widgets.domain.d;

/* loaded from: classes14.dex */
public final class o5w0 extends a {
    public final Context F;
    public final c151 G;
    public final jsv0 H;
    public final q5w0 I;
    public final w030 J;
    public final b K;
    public final jyw0 L;

    public o5w0(Context context, c151 c151Var, jsv0 jsv0Var, q5w0 q5w0Var, w030 w030Var, b bVar, jyw0 jyw0Var) {
        super(null);
        this.F = context;
        this.G = c151Var;
        this.H = jsv0Var;
        this.I = q5w0Var;
        this.J = w030Var;
        this.K = bVar;
        this.L = jyw0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        c151 c151Var = this.G;
        c151Var.e.b = kotlin.collections.b.f();
        c151Var.a(c151Var.g, yaf0.b);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ru.yandex.taxi.deeplinks.a.c(o(), this.K, new com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing.a(this));
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.J;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        m5w0 m5w0Var = (m5w0) obj;
        mu6 mu6Var = m5w0Var.a;
        yaf0 yaf0Var = m5w0Var.b;
        wn70 wn70Var = m5w0Var.c;
        n5w0 n5w0Var = new n5w0(this);
        yx1 yx1Var = this.I.a;
        return new SuperAppOrderBundleView(this.F, this.L, new f(mu6Var, wn70Var, yaf0Var, n5w0Var, (tt2) ((xvf0) yx1Var.a).get(), (d) ((xvf0) yx1Var.b).get(), (e) ((xvf0) yx1Var.c).get(), (h151) ((xvf0) yx1Var.d).get(), (gc80) ((xvf0) yx1Var.e).get(), (h) ((xvf0) yx1Var.f).get(), (ehw0) ((n3w) yx1Var.g).a, (ney) ((xvf0) yx1Var.h).get()));
    }
}
