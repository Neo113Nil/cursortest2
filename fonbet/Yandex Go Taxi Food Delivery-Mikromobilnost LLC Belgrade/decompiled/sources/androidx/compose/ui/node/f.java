package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import defpackage.ae60;
import defpackage.b1y;
import defpackage.ci91;
import defpackage.cnu;
import defpackage.d1y;
import defpackage.e530;
import defpackage.eb2;
import defpackage.i28;
import defpackage.jwd0;
import defpackage.kt1;
import defpackage.ldc;
import defpackage.m390;
import defpackage.noz;
import defpackage.tls;
import defpackage.v7x0;
import defpackage.wz40;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class f extends s {
    public static final eb2 s0;
    public final v7x0 q0;
    public e r0;

    static {
        eb2 eb2Var = new eb2();
        eb2Var.f(ldc.g);
        eb2Var.m(1.0f);
        eb2Var.n(1);
        s0 = eb2Var;
    }

    public f(LayoutNode layoutNode) {
        super(layoutNode);
        v7x0 v7x0Var = new v7x0();
        this.q0 = v7x0Var;
        v7x0Var.updateCoordinator$ui(this);
        this.r0 = layoutNode.A != null ? new e(this) : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int C0(kt1 kt1Var) {
        e eVar = this.r0;
        if (eVar != null) {
            return eVar.C0(kt1Var);
        }
        p pVar = this.I.b0.p;
        b1y b1yVar = pVar.R;
        if (!pVar.F) {
            if (pVar.y.d == LayoutNode.LayoutState.Measuring) {
                b1yVar.f = true;
                if (b1yVar.b) {
                    pVar.P = true;
                    pVar.Q = true;
                }
            } else {
                b1yVar.g = true;
            }
        }
        f X = pVar.X();
        boolean z = X.D;
        X.D = true;
        pVar.O();
        X.D = z;
        Integer num = (Integer) b1yVar.i.get(kt1Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.x910
    public final int V(int i) {
        return this.I.r().s(i);
    }

    @Override // androidx.compose.ui.node.s
    public final void W0() {
        if (this.r0 == null) {
            this.r0 = new e(this);
        }
    }

    @Override // androidx.compose.ui.node.s
    public final noz Z0() {
        return this.r0;
    }

    @Override // androidx.compose.ui.node.s
    public final e530 b1() {
        return this.q0;
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        return this.I.r().t(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // androidx.compose.ui.node.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(ae60 ae60Var, long j, cnu cnuVar, int i, boolean z) {
        int i2;
        boolean z2;
        LayoutNode layoutNode = this.I;
        boolean z3 = false;
        if (ae60Var.i(layoutNode)) {
            if (C1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (jwd0.a(i2, 1) && (Float.floatToRawIntBits(T0(j, a1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = cnuVar.c;
            wz40 w = layoutNode.w();
            Object[] objArr = w.a;
            int i4 = w.c - 1;
            while (i4 >= 0) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i4];
                if (layoutNode2.G()) {
                    ae60Var.e(layoutNode2, j, cnuVar, i2, z2);
                    long a = cnuVar.a();
                    if (ci91.b(a) < 0.0f && ci91.e(a) && !ci91.d(a) && !ae60Var.f(cnuVar, layoutNode2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            cnuVar.c = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        return this.I.r().r(i);
    }

    @Override // defpackage.x910
    public final androidx.compose.ui.layout.o l0(long j) {
        z0(j);
        LayoutNode layoutNode = this.I;
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).b0.p.E = LayoutNode.UsageByParent.NotUsed;
        }
        u1(layoutNode.P.b(this, layoutNode.j(), j));
        l1();
        return this;
    }

    @Override // androidx.compose.ui.node.s
    public final void q1(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar) {
        LayoutNode layoutNode = this.I;
        m390 a = d1y.a(layoutNode);
        wz40 w = layoutNode.w();
        Object[] objArr = w.a;
        int i = w.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.G()) {
                try {
                    ((s) layoutNode2.a0.e).U0(i28Var, aVar);
                } catch (Throwable th) {
                    layoutNode2.W(th);
                    throw null;
                }
            }
        }
        if (a.getShowLayoutBounds()) {
            long j = this.c;
            i28Var.i(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - 0.5f, s0);
        }
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        r1(j, f, tlsVar, null);
        if (this.C) {
            return;
        }
        this.I.b0.p.G0();
    }

    @Override // androidx.compose.ui.node.s, androidx.compose.ui.layout.o
    public final void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar) {
        r1(j, f, null, aVar);
        if (this.C) {
            return;
        }
        this.I.b0.p.G0();
    }

    @Override // defpackage.x910
    public final int y(int i) {
        return this.I.r().q(i);
    }
}
