package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.s;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class noz extends LookaheadCapablePlaceable implements x910 {
    public final s I;
    public LinkedHashMap K;
    public aa10 M;
    public long J = 0;
    public final ooz L = new ooz(this);
    public final qy40 N = kp60.a();

    public noz(s sVar) {
        this.I = sVar;
    }

    public static final void Q0(noz nozVar, aa10 aa10Var) {
        LinkedHashMap linkedHashMap;
        if (aa10Var != null) {
            nozVar.y0((aa10Var.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (aa10Var.getWidth() << 32));
        } else {
            nozVar.y0(0L);
        }
        if (!jl40.l(nozVar.M, aa10Var) && aa10Var != null && ((((linkedHashMap = nozVar.K) != null && !linkedHashMap.isEmpty()) || !aa10Var.b().isEmpty()) && !jl40.l(aa10Var.b(), nozVar.K))) {
            nozVar.I.I.b0.q.b().g();
            LinkedHashMap linkedHashMap2 = nozVar.K;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                nozVar.K = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(aa10Var.b());
        }
        nozVar.M = aa10Var;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable G0() {
        s sVar = this.I.J;
        if (sVar != null) {
            return sVar.Z0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final rzx H0() {
        return this.L;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean I0() {
        return this.M != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final aa10 J0() {
        aa10 aa10Var = this.M;
        if (aa10Var != null) {
            return aa10Var;
        }
        throw x4e.v("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable K0() {
        s sVar = this.I.K;
        if (sVar != null) {
            return sVar.Z0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long L0() {
        return this.J;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void P0() {
        s0(this.J, 0.0f, null);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, defpackage.ba10
    public final LayoutNode Q() {
        return this.I.I;
    }

    public void R0() {
        J0().c();
    }

    public final void S0(long j) {
        if (!z5w.a(this.J, j)) {
            this.J = j;
            s sVar = this.I;
            l lVar = sVar.I.b0.q;
            if (lVar != null) {
                lVar.M0();
            }
            LookaheadCapablePlaceable.N0(sVar);
        }
        if (this.D) {
            return;
        }
        F0(J0());
    }

    public final long T0(noz nozVar, boolean z) {
        long j = 0;
        while (!this.equals(nozVar)) {
            if (!this.B || !z) {
                j = z5w.c(j, this.J);
            }
            this = this.I.K.Z0();
        }
        return j;
    }

    @Override // defpackage.ca10, defpackage.x910
    public final Object a() {
        return this.I.a();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, defpackage.yuw
    public final boolean d0() {
        return true;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.I.getDensity();
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.I.I.S;
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        S0(j);
        if (this.C) {
            return;
        }
        R0();
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.I.u0();
    }
}
