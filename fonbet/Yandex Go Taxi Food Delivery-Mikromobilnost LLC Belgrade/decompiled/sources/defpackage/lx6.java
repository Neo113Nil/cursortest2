package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.delivery.tracking.a;
import com.yandex.go.payments.shared.business.onboarding.b;
import ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d;
import ru.yandex.taxi.banners.c;

/* loaded from: classes8.dex */
public final class lx6 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final eqh g;
    public final xvf0 h;
    public final xvf0 i;

    public lx6(xvf0 xvf0Var, mz0 mz0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, eqh eqhVar, xvf0 xvf0Var5, eqh eqhVar2) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = mz0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = eqhVar;
        this.h = xvf0Var5;
        this.i = eqhVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.d;
        switch (i) {
            case 0:
                return new b((Lifecycle) xvf0Var2.get(), (ex6) xvf0Var.get(), (c) this.g.get(), (tse) xvf0Var7.get(), (rw6) xvf0Var6.get(), (com.yandex.go.payments.shared.business.c) xvf0Var5.get(), (fw6) xvf0Var4.get(), (mx6) xvf0Var3.get());
            case 1:
                return new a((ru.yandex.taxi.delivery.preorder.a) xvf0Var2.get(), (ru.yandex.taxi.logistics.deliveries.a) xvf0Var.get(), (d) xvf0Var7.get(), (hit) xvf0Var6.get(), (y5i) xvf0Var5.get(), this.g, (com.yandex.go.route.interactor.b) xvf0Var4.get(), (oep0) xvf0Var3.get());
            default:
                return new ru.yandex.taxi.history.b(this.b, this.c, this.g, (rvx0) xvf0Var7.get(), (jj10) xvf0Var6.get(), (ru.yandex.taxi.am.token.a) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (jj3) xvf0Var3.get());
        }
    }

    public /* synthetic */ lx6(int i, eqh eqhVar, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.g = eqhVar;
        this.d = xvf0Var2;
        this.e = v7pVar2;
        this.f = xvf0Var3;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
    }
}
