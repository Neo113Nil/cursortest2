package defpackage;

import com.yandex.go.order.bundle.map.impl.data.repository.g;
import com.yandex.go.order.bundle.map.impl.ui.BundledOrderListView;
import com.yandex.go.order.bundle.map.impl.ui.BundledOrdersModalView;
import com.yandex.go.order.bundle.map.impl.ui.e;
import java.util.Optional;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class ev6 extends m230 {
    public final w030 E;
    public final sr4 F;
    public final yu6 G;
    public final g H;
    public final m180 I;
    public final gy70 J;
    public final fv6 K;
    public final yvf0 L;
    public final boolean M;

    public ev6(w030 w030Var, sr4 sr4Var, yu6 yu6Var, g gVar, m180 m180Var, gy70 gy70Var, fv6 fv6Var, yvf0 yvf0Var) {
        super(null);
        this.E = w030Var;
        this.F = sr4Var;
        this.G = yu6Var;
        this.H = gVar;
        this.I = m180Var;
        this.J = gy70Var;
        this.K = fv6Var;
        this.L = yvf0Var;
        this.M = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        uaf0 uaf0Var = yaf0.c;
        r0 r0Var = this.H.d;
        x4r x4rVar = new x4r(uaf0Var);
        r0Var.getClass();
        r0Var.m(null, x4rVar);
        this.K.getClass();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        dv6 dv6Var = (dv6) ((Optional) obj).get();
        String str = dv6Var.a;
        r0 r0Var = this.H.d;
        w4r w4rVar = new w4r(str);
        r0Var.getClass();
        r0Var.m(null, w4rVar);
        A((m950) this.L.get(), new tfn(dv6Var.a), sy60.Q2);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.M;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        dv6 dv6Var = (dv6) ((Optional) obj).get();
        yaf0 yaf0Var = dv6Var.b;
        String str = dv6Var.a;
        av6 av6Var = ((zu6) this.F.b).a;
        e eVar = new e(str, yaf0Var, (j551) av6Var.a.get(), (tt2) av6Var.b.get(), (h151) av6Var.c.get(), (gc80) av6Var.d.get(), (wr00) av6Var.e.get(), (jt00) av6Var.f.get());
        yu6 yu6Var = this.G;
        yu6Var.getClass();
        BundledOrderListView bundledOrderListView = new BundledOrderListView(yu6Var.a, this.J, eVar, yaf0Var, str, null);
        return new BundledOrdersModalView(bundledOrderListView.getContext(), bundledOrderListView, this.I);
    }
}
