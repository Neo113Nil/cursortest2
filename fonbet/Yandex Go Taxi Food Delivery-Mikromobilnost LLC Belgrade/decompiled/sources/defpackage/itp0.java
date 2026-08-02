package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.impl.navigation.search.a;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.places.impl.ui.search.data.repositories.c;
import com.yandex.go.places.impl.ui.search.f;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class itp0 extends m230 {
    public final b E;
    public final avp0 F;
    public final vvp0 G;
    public final w030 H;
    public final mg80 I;
    public final wbc0 J;
    public final kn80 K;
    public final boolean L;

    public itp0(b bVar, avp0 avp0Var, vvp0 vvp0Var, w030 w030Var, mg80 mg80Var, wbc0 wbc0Var, kn80 kn80Var) {
        super(null);
        this.E = bVar;
        this.F = avp0Var;
        this.G = vvp0Var;
        this.H = w030Var;
        this.I = mg80Var;
        this.J = wbc0Var;
        this.K = kn80Var;
        this.L = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.b();
        this.J.b();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.L;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        cm80 cm80Var = (cm80) obj;
        u370 u370Var = cm80Var.c;
        a aVar = new a(this);
        String str = cm80Var.d;
        boolean z = cm80Var.f;
        boolean z2 = cm80Var.g;
        z4m0 z4m0Var = this.G.a;
        f fVar = new f(aVar, str, z, z2, (ru.yandex.taxi.design.utils.b) ((xvf0) z4m0Var.b).get(), (zuj0) ((xvf0) z4m0Var.c).get(), (pwy0) ((xvf0) z4m0Var.w).get(), (c) ((xvf0) z4m0Var.x).get(), (com.yandex.go.places.impl.analytics.a) ((xvf0) z4m0Var.y).get(), (com.yandex.go.places.impl.ui.search.a) ((gzn0) z4m0Var.z).get(), (mg80) ((xvf0) z4m0Var.A).get());
        hwo0 hwo0Var = this.F.a;
        return new SearchModalView((e) ((x4g) hwo0Var.b).get(), (tt2) ((xvf0) hwo0Var.c).get(), (c2x0) ((z4g) hwo0Var.w).get(), (Context) ((x4g) hwo0Var.x).get(), fVar, u370Var);
    }
}
