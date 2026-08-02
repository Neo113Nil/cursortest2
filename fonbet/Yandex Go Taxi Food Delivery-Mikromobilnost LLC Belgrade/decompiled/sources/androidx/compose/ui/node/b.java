package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.ae90;
import defpackage.ag;
import defpackage.avr;
import defpackage.b64;
import defpackage.bs6;
import defpackage.c1y;
import defpackage.cms;
import defpackage.cnq0;
import defpackage.d530;
import defpackage.dab1;
import defpackage.e530;
import defpackage.ejt;
import defpackage.enq0;
import defpackage.fwd0;
import defpackage.fwi;
import defpackage.gnq0;
import defpackage.gwd0;
import defpackage.hz40;
import defpackage.i530;
import defpackage.ivr;
import defpackage.ixv;
import defpackage.izx;
import defpackage.j390;
import defpackage.mnq0;
import defpackage.n390;
import defpackage.oam;
import defpackage.pam;
import defpackage.qje;
import defpackage.qy60;
import defpackage.rur;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.s0y;
import defpackage.tvd0;
import defpackage.uur;
import defpackage.v0y;
import defpackage.x910;
import defpackage.yti0;
import defpackage.ytr;
import defpackage.zd90;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b extends e530 implements v0y, pam, gnq0, gwd0, i530, ae90, izx, ejt, ytr, uur, avr, n390, bs6 {
    public d530 a;
    public HashSet b;

    @Override // defpackage.izx
    public final void A(rzx rzxVar) {
    }

    @Override // defpackage.gwd0
    public final boolean A0() {
        ((PointerInteropFilter) ((fwd0) this.a)).w.getClass();
        return true;
    }

    @Override // defpackage.gwd0
    public final void D() {
        ((PointerInteropFilter) ((fwd0) this.a)).w.b();
    }

    public final void E0(boolean z) {
        if (!isAttached()) {
            ixv.b("initializeModifier called on unattached node");
        }
        d530 d530Var = this.a;
        getKindSet$ui();
        if ((getKindSet$ui() & 4) != 0 && !z) {
            qje.N(this, 2).i1();
        }
        if ((getKindSet$ui() & 2) != 0) {
            if (c.a(this)) {
                s coordinator$ui = getCoordinator$ui();
                ((g) coordinator$ui).E1(this);
                j390 j390Var = coordinator$ui.h0;
                if (j390Var != null) {
                    j390Var.invalidate();
                }
            }
            if (!z) {
                qje.N(this, 2).i1();
                qje.P(this).C();
            }
        }
        if (d530Var instanceof yti0) {
            ((yti0) d530Var).i(qje.P(this));
        }
        getKindSet$ui();
        getKindSet$ui();
        if ((getKindSet$ui() & 256) != 0 && (d530Var instanceof qy60) && c.a(this)) {
            qje.P(this).C();
        }
        if ((getKindSet$ui() & 16) != 0 && (d530Var instanceof fwd0)) {
            ((PointerInteropFilter) ((fwd0) d530Var)).w.a = getCoordinator$ui();
        }
        if ((getKindSet$ui() & 8) != 0) {
            qje.Q(this).onSemanticsChange();
        }
    }

    public final void F0() {
        if (!isAttached()) {
            ixv.b("unInitializeModifier called on unattached node");
        }
        getKindSet$ui();
        if ((getKindSet$ui() & 8) != 0) {
            qje.Q(this).onSemanticsChange();
        }
    }

    @Override // defpackage.pam
    public final void G() {
        rzo.D(this);
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return androidx.compose.ui.layout.e.e((s0y) this.a, lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.ae90
    public final Object X(fwi fwiVar, Object obj) {
        return ((zd90) this.a).j();
    }

    @Override // defpackage.izx, defpackage.ga10
    public final void a(long j) {
    }

    @Override // defpackage.uur
    public final void applyFocusProperties(rur rurVar) {
        d530 d530Var = this.a;
        ixv.b("applyFocusProperties called on wrong node");
        b64.D(d530Var);
        throw null;
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return androidx.compose.ui.layout.e.g((s0y) this.a, lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.bs6
    public final long c() {
        return rzo.a0(qje.N(this, 128).c);
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        ((oam) this.a).d(c1yVar);
    }

    @Override // defpackage.v0y
    public final aa10 e(androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        return ((s0y) this.a).e(kVar, x910Var, j);
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        ((qy60) this.a).g(sVar);
    }

    @Override // defpackage.bs6
    public final fwi getDensity() {
        return qje.P(this).R;
    }

    @Override // defpackage.bs6
    public final LayoutDirection getLayoutDirection() {
        return qje.P(this).S;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return androidx.compose.ui.layout.e.f((s0y) this.a, lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        ((PointerInteropFilter) ((fwd0) this.a)).w.c(tvd0Var, pointerEventPass);
    }

    @Override // defpackage.gwd0
    public final void o() {
        ((PointerInteropFilter) ((fwd0) this.a)).w.getClass();
    }

    @Override // defpackage.e530
    public final void onAttach() {
        E0(true);
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        if (this.a instanceof fwd0) {
            D();
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        F0();
    }

    @Override // defpackage.i530
    public final dab1 q() {
        return dab1.E;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        cnq0 l = ((enq0) this.a).l();
        cnq0 cnq0Var = (cnq0) mnq0Var;
        hz40 hz40Var = cnq0Var.a;
        if (l.c) {
            cnq0Var.c = true;
        }
        if (l.w) {
            cnq0Var.w = true;
        }
        hz40 hz40Var2 = l.a;
        Object[] objArr = hz40Var2.b;
        Object[] objArr2 = hz40Var2.c;
        long[] jArr = hz40Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        androidx.compose.ui.semantics.g gVar = (androidx.compose.ui.semantics.g) obj;
                        if (!hz40Var.a(gVar)) {
                            hz40Var.o(gVar, obj2);
                        } else if (obj2 instanceof ag) {
                            ag agVar = (ag) hz40Var.d(gVar);
                            String b = agVar.b();
                            if (b == null) {
                                b = ((ag) obj2).b();
                            }
                            String str = b;
                            cms a = agVar.a();
                            if (a == null) {
                                a = ((ag) obj2).a();
                            }
                            hz40Var.o(gVar, new ag(str, a));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return androidx.compose.ui.layout.e.d((s0y) this.a, lookaheadCapablePlaceable, x910Var, i);
    }

    @Override // defpackage.ytr
    public final void x0(ivr ivrVar) {
        d530 d530Var = this.a;
        ixv.b("onFocusEvent called on wrong node");
        b64.D(d530Var);
        throw null;
    }
}
