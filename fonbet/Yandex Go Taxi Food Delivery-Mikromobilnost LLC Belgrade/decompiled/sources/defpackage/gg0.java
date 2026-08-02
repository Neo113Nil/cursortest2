package defpackage;

import android.content.Context;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.addmethod.ui.home.e;
import com.yandex.go.superapp.web.view.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class gg0 extends pgd {
    public final Context F;
    public final w030 G;
    public final g9a0 H;
    public final a I;
    public final kk0 J;
    public final boolean K;
    public final e L;
    public final p1b M;

    public gg0(Context context, w030 w030Var, g9a0 g9a0Var, a aVar, kk0 kk0Var, boolean z, yh0 yh0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = g9a0Var;
        this.I = aVar;
        this.J = kk0Var;
        this.K = z;
        zh0 zh0Var = yh0Var.a;
        e eVar = new e((tt2) zh0Var.a.get(), (zuj0) zh0Var.b.get(), (c) zh0Var.c.get(), (BindUniversalPaymentMethodApi) zh0Var.d.get(), z);
        this.L = eVar;
        this.M = new p1b(eVar, new com.yandex.go.payments.addmethod.ui.home.a(this, 0));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
