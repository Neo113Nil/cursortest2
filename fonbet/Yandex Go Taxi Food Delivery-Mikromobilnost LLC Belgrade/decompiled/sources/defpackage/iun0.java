package defpackage;

import android.content.Context;
import com.yandex.go.scooters.insurance.suggest.v2.d;
import com.yandex.go.scooters.passes.purchase.packages.g;
import defpackage.agd;
import defpackage.dcd;
import defpackage.fef;
import defpackage.gun0;
import defpackage.hun0;
import defpackage.iun0;
import defpackage.m7n0;
import defpackage.oun0;
import defpackage.qun0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tun0;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class iun0 extends pgd {
    public final /* synthetic */ int F = 1;
    public final Context G;
    public final w030 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final mu5 L;

    public iun0(q8o0 q8o0Var, g gVar, Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = yvf0Var3;
        this.L = new mu5(new zdk0(25, this, q8o0Var, gVar));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
        }
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return this.H;
    }

    public iun0(final tun0 tun0Var, final d dVar, Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = yvf0Var3;
        this.L = new mu5(new tls() { // from class: com.yandex.go.scooters.insurance.suggest.v2.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final iun0 iun0Var = iun0.this;
                final hun0 hun0Var = new hun0(iun0Var);
                final oun0 oun0Var = new oun0();
                fef fefVar = ((gun0) ((agd) yfdVar).a).b;
                tun0 tun0Var2 = tun0Var;
                tpr a = tun0Var2.b.a();
                m7n0 m7n0Var = tun0Var2.e;
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(a, new f(m7n0Var.a.a()), m7n0Var.a.a(), oun0Var.a, new ScootersInsuranceSuggestV2UiStateInteractor$uiStateFlow$2(tun0Var2, fefVar, null)));
                tun0Var2.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = kotlinx.coroutines.flow.e.F(t, uyj.a);
                final d dVar2 = dVar;
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.insurance.suggest.v2.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tje.N(iun0.this.o(), null, null, new ScootersInsuranceSuggestV2Router$content$1$1$1(dVar2, (qun0) obj2, hun0Var, oun0Var, yfdVar, null), 3);
                        return zy11.a;
                    }
                };
                dcd.a.getClass();
                agdVar.g = dcd.b;
                return zy11.a;
            }
        });
    }
}
