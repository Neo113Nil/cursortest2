package xsna;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;

/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes11.dex */
public abstract class m600 extends androidx.compose.ui.node.f implements zo10 {
    public final androidx.compose.ui.node.o q;
    public LinkedHashMap s;
    public dp10 u;
    public long r = 0;
    public final n600 t = new n600(this);
    public final eh50<gt1> v = pp70.a();

    public m600(androidx.compose.ui.node.o oVar) {
        this.q = oVar;
    }

    public static final void W0(m600 m600Var, dp10 dp10Var) {
        LinkedHashMap linkedHashMap;
        if (dp10Var != null) {
            m600Var.s0((dp10Var.getHeight() & 4294967295L) | (dp10Var.getWidth() << 32));
        } else {
            m600Var.s0(0L);
        }
        if (!epx.f(m600Var.u, dp10Var) && dp10Var != null && ((((linkedHashMap = m600Var.s) != null && !linkedHashMap.isEmpty()) || !dp10Var.q().isEmpty()) && !epx.f(dp10Var.q(), m600Var.s))) {
            m600Var.q.q.H.q.t.g();
            LinkedHashMap linkedHashMap2 = m600Var.s;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                m600Var.s = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(dp10Var.q());
        }
        m600Var.u = dp10Var;
    }

    @Override // androidx.compose.ui.node.f
    public final androidx.compose.ui.node.f F0() {
        androidx.compose.ui.node.o oVar = this.q.t;
        if (oVar != null) {
            return oVar.w1();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.f
    public final boolean H0() {
        return this.u != null;
    }

    @Override // androidx.compose.ui.node.f
    public final dp10 J0() {
        dp10 dp10Var = this.u;
        if (dp10Var != null) {
            return dp10Var;
        }
        throw pm0.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.f
    public final androidx.compose.ui.node.f M0() {
        androidx.compose.ui.node.o oVar = this.q.u;
        if (oVar != null) {
            return oVar.w1();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.f
    public final long N0() {
        return this.r;
    }

    @Override // androidx.compose.ui.node.f
    public final void U0() {
        p0(this.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
    }

    @Override // xsna.jp10, xsna.zox
    public final Object c() {
        return this.q.c();
    }

    public final long c1() {
        return (this.c & 4294967295L) | (this.b << 32);
    }

    public void f1() {
        J0().j();
    }

    @Override // androidx.compose.ui.node.f
    public final tny g1() {
        return this.t;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.q.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.q.getFontScale();
    }

    @Override // xsna.apx
    public final LayoutDirection getLayoutDirection() {
        return this.q.q.A;
    }

    public final void h1(long j) {
        if (!h9x.b(this.r, j)) {
            this.r = j;
            androidx.compose.ui.node.o oVar = this.q;
            androidx.compose.ui.node.g gVar = oVar.q.H.q;
            if (gVar != null) {
                gVar.E0();
            }
            androidx.compose.ui.node.f.R0(oVar);
        }
        if (this.l) {
            return;
        }
        E0(J0());
    }

    public final long i1(m600 m600Var, boolean z) {
        long j = 0;
        for (m600 m600Var2 = this; !epx.f(m600Var2, m600Var); m600Var2 = m600Var2.q.u.w1()) {
            if (!m600Var2.j || !z) {
                j = h9x.d(j, m600Var2.r);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.node.f, xsna.fp10
    public final LayoutNode o1() {
        return this.q.q;
    }

    @Override // xsna.tra0
    public final void p0(long j, float f, izs<? super tdu, s3q0> izsVar) {
        h1(j);
        if (this.k) {
            return;
        }
        f1();
    }

    @Override // androidx.compose.ui.node.f, xsna.apx
    public final boolean z1() {
        return true;
    }
}
