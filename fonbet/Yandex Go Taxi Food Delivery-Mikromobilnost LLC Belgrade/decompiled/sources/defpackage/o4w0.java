package defpackage;

import com.yandex.go.flex.main_screen.domain.h;
import com.yandex.go.mainscreen.superapp.impl.navigation.c;
import com.yandex.go.superapp.order.multi.old.provider.g;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.service.a;

/* loaded from: classes.dex */
public final class o4w0 extends h55 {
    public final asv0 D;
    public final z1w0 E;
    public final u5w0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final h3y I;
    public final h J;
    public final y5w0 K;
    public final g L;
    public final yvf0 M;
    public final n3h N;
    public final i1w0 O;
    public final goq P;
    public final yvf0 Q;
    public final a R;
    public final y50 S;
    public final yvf0 T;
    public final h3y U;
    public final q3w0 V;
    public final yvf0 W;
    public final tcw0 Z;
    public final yvf0 a0;
    public final jpr b0;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a c0;
    public final vc00 d0;
    public xdw0 e0;
    public vph f0;
    public boolean g0;
    public mag h0;
    public i3y i0;

    public o4w0(asv0 asv0Var, z1w0 z1w0Var, u5w0 u5w0Var, yvf0 yvf0Var, yvf0 yvf0Var2, h3y h3yVar, h hVar, y5w0 y5w0Var, g gVar, yvf0 yvf0Var3, n3h n3hVar, i1w0 i1w0Var, goq goqVar, yvf0 yvf0Var4, a aVar, y50 y50Var, yvf0 yvf0Var5, h3y h3yVar2, q3w0 q3w0Var, yvf0 yvf0Var6, tcw0 tcw0Var, yvf0 yvf0Var7, jpr jprVar, com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a aVar2, vc00 vc00Var) {
        super(null);
        this.D = asv0Var;
        this.E = z1w0Var;
        this.F = u5w0Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = h3yVar;
        this.J = hVar;
        this.K = y5w0Var;
        this.L = gVar;
        this.M = yvf0Var3;
        this.N = n3hVar;
        this.O = i1w0Var;
        this.P = goqVar;
        this.Q = yvf0Var4;
        this.R = aVar;
        this.S = y50Var;
        this.T = yvf0Var5;
        this.U = h3yVar2;
        this.V = q3w0Var;
        this.W = yvf0Var6;
        this.Z = tcw0Var;
        this.a0 = yvf0Var7;
        this.b0 = jprVar;
        this.c0 = aVar2;
        this.d0 = vc00Var;
        this.g0 = true;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        vph vphVar = this.f0;
        if (vphVar != null) {
            Q(vphVar);
            this.f0 = null;
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.d0.a();
        pzt0 pzt0Var = ((c) this.D).B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        m950[] m950VarArr = (m950[]) j73.A(new m950[]{this.e0, P()}).toArray(new m950[0]);
        j(new fpb((m950[]) Arrays.copyOf(m950VarArr, m950VarArr.length)));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.i0 = null;
        this.h0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        va90 va90Var = new va90(this);
        i6r i6rVar = (i6r) this.U.get();
        i6rVar.getClass();
        this.h0 = new mag(i6rVar, va90Var);
        this.i0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(20, this));
    }

    public final u900 P() {
        i3y i3yVar = this.i0;
        if (i3yVar != null) {
            return (u900) i3yVar.getValue();
        }
        return null;
    }

    public final void Q(vph vphVar) {
        if (vphVar instanceof oph) {
            E((m950) this.M.get(), new p4i(((oph) vphVar).a), sy60.Q2, hxx.a);
            return;
        }
        if (vphVar instanceof pph) {
            ((c) this.D).e(((pph) vphVar).a);
            return;
        }
        if (vphVar instanceof sph) {
            this.P.a.d(zy11.a);
            return;
        }
        if (vphVar instanceof rph) {
            this.N.a(((rph) vphVar).a.a(), DeeplinkSource.UNSPECIFIED);
        } else {
            if (jl40.l(vphVar, nph.a) || jl40.l(vphVar, qph.a)) {
                return;
            }
            w511.b();
        }
    }
}
