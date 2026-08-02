package defpackage;

import android.app.Activity;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class fjm extends a {
    public final bu0 F;
    public final w030 G;
    public final boolean H;

    public fjm(bu0 bu0Var, w030 w030Var) {
        super(null);
        this.F = bu0Var;
        this.G = w030Var;
        this.H = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        qim qimVar = (qim) obj;
        bu0 bu0Var = this.F;
        bu0Var.getClass();
        return new DriverProfileModalView((Activity) bu0Var.a, (xhm) bu0Var.b, (pav) bu0Var.c, (qmp) bu0Var.d, (jgv) bu0Var.e, qimVar, (jim) bu0Var.f, (k48) bu0Var.g, (bjm) bu0Var.h, (x) bu0Var.i);
    }
}
