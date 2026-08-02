package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.awk0;
import defpackage.bsv;
import defpackage.c9y;
import defpackage.dsv;
import defpackage.gy40;
import defpackage.kx91;
import defpackage.l7b;
import defpackage.l8x;
import defpackage.lvc0;
import defpackage.mnq0;
import defpackage.npb1;
import defpackage.prv;
import defpackage.pzt0;
import defpackage.s5b1;
import defpackage.sls;
import defpackage.tje;
import defpackage.tvd0;
import defpackage.w6u;
import defpackage.wu60;
import defpackage.xic;
import defpackage.xp31;
import defpackage.y92;
import defpackage.z2t;
import defpackage.zlz;
import defpackage.zvd0;
import defpackage.zx40;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class d extends a {
    public String Q;
    public sls R;
    public sls S;
    public boolean T;
    public final gy40 U;
    public final gy40 V;
    public zvd0 W;
    public pzt0 Z;
    public pzt0 a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public boolean e0;
    public dsv f0;
    public pzt0 g0;
    public pzt0 h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public boolean l0;

    public d(sls slsVar, String str, sls slsVar2, sls slsVar3, boolean z, zx40 zx40Var, prv prvVar, boolean z2, boolean z3, awk0 awk0Var) {
        super(zx40Var, prvVar, z2, z3, null, awk0Var, slsVar);
        this.Q = str;
        this.R = slsVar2;
        this.S = slsVar3;
        this.T = z;
        this.U = zlz.a();
        this.V = zlz.a();
        this.d0 = -1L;
        this.k0 = -1L;
    }

    @Override // androidx.compose.foundation.a, defpackage.gwd0
    public final void D() {
        super.D();
        T0(false);
    }

    @Override // androidx.compose.foundation.a
    public final void H0(mnq0 mnq0Var) {
        if (this.R != null) {
            androidx.compose.ui.semantics.f.h(mnq0Var, this.Q, new l7b(22, this));
        }
    }

    @Override // androidx.compose.foundation.a
    public final void P0() {
        W0();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // androidx.compose.foundation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(KeyEvent keyEvent) {
        boolean z;
        xic xicVar;
        long c = c9y.c(keyEvent);
        if (this.R != null) {
            gy40 gy40Var = this.U;
            if (gy40Var.e(c) == null) {
                gy40Var.h(c, tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3));
                z = true;
                gy40 gy40Var2 = this.V;
                xicVar = (xic) gy40Var2.e(c);
                if (xicVar != null) {
                    pzt0 pzt0Var = xicVar.a;
                    if (pzt0Var.isActive()) {
                        pzt0Var.a(null);
                        if (!xicVar.b) {
                            this.B.invoke();
                            gy40Var2.g(c);
                            return z;
                        }
                    } else {
                        gy40Var2.g(c);
                    }
                }
                return z;
            }
        }
        z = false;
        gy40 gy40Var22 = this.V;
        xicVar = (xic) gy40Var22.e(c);
        if (xicVar != null) {
        }
        return z;
    }

    @Override // androidx.compose.foundation.a
    public final void R0(KeyEvent keyEvent) {
        sls slsVar;
        long c = c9y.c(keyEvent);
        gy40 gy40Var = this.U;
        boolean z = false;
        if (gy40Var.e(c) != null) {
            l8x l8xVar = (l8x) gy40Var.e(c);
            if (l8xVar != null) {
                if (l8xVar.isActive()) {
                    l8xVar.a(null);
                } else {
                    z = true;
                }
            }
            gy40Var.g(c);
        }
        if (this.S == null) {
            if (z) {
                return;
            }
            this.B.invoke();
            return;
        }
        gy40 gy40Var2 = this.V;
        if (gy40Var2.e(c) == null) {
            if (z) {
                return;
            }
            gy40Var2.h(c, new xic(tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, c, null), 3)));
        } else {
            if (!z && (slsVar = this.S) != null) {
                slsVar.invoke();
            }
            gy40Var2.g(c);
        }
    }

    public final void T0(boolean z) {
        if (z) {
            this.f0 = null;
            pzt0 pzt0Var = this.g0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.g0 = null;
            pzt0 pzt0Var2 = this.h0;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            this.h0 = null;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1L;
            this.l0 = false;
        } else {
            this.W = null;
            pzt0 pzt0Var3 = this.Z;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            this.Z = null;
            pzt0 pzt0Var4 = this.a0;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            this.a0 = null;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1L;
            this.e0 = false;
        }
        K0(z);
    }

    public final void U0(long j, dsv dsvVar) {
        if (this.A && !this.l0) {
            L0(dsvVar.c, true);
            this.k0 = j;
            if (!this.j0) {
                boolean z = this.i0;
                sls slsVar = this.S;
                if (z) {
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                } else if (slsVar != null) {
                    this.h0 = tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$handleUpEvent$2(this, null), 3);
                } else {
                    this.B.invoke();
                }
            }
        }
        this.f0 = null;
        this.l0 = false;
        this.i0 = false;
        pzt0 pzt0Var = this.g0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g0 = null;
        this.j0 = false;
    }

    public final void V0(long j, zvd0 zvd0Var) {
        if (this.A && !this.e0) {
            L0(zvd0Var.c, false);
            this.d0 = j;
            if (!this.c0) {
                boolean z = this.b0;
                sls slsVar = this.S;
                if (z) {
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                } else if (slsVar != null) {
                    this.a0 = tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$handleUpEvent$1(this, null), 3);
                } else {
                    this.B.invoke();
                }
            }
        }
        this.W = null;
        this.e0 = false;
        this.b0 = false;
        pzt0 pzt0Var = this.Z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.Z = null;
        this.c0 = false;
    }

    public final void W0() {
        char c;
        long j;
        long j2;
        char c2;
        gy40 gy40Var = this.U;
        Object[] objArr = gy40Var.c;
        long[] jArr = gy40Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((l8x) objArr[(i << 3) + i3]).a(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        gy40Var.a();
        gy40 gy40Var2 = this.V;
        Object[] objArr2 = gy40Var2.c;
        long[] jArr2 = gy40Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((xic) objArr2[(i4 << 3) + i6]).a.a(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        gy40Var2.a();
    }

    @Override // androidx.compose.foundation.a, defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        super.m0(tvd0Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.W == null || this.c0) {
                return;
            }
            List list = tvd0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zvd0 zvd0Var = (zvd0) list.get(i);
                if (zvd0Var.j() && zvd0Var != this.W) {
                    T0(false);
                    return;
                }
            }
            return;
        }
        if (this.W == null) {
            if (z.g(tvd0Var, true, false)) {
                zvd0 zvd0Var2 = (zvd0) tvd0Var.a.get(0);
                zvd0Var2.a();
                this.W = zvd0Var2;
                if (this.A) {
                    pzt0 pzt0Var = this.a0;
                    if (pzt0Var != null && pzt0Var.isActive()) {
                        if (zvd0Var2.b - this.d0 < ((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).a()) {
                            this.e0 = true;
                            return;
                        }
                        this.b0 = true;
                        pzt0 pzt0Var2 = this.a0;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        this.a0 = null;
                    }
                    this.c0 = false;
                    N0(zvd0Var2);
                    if (this.R != null) {
                        this.Z = tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = tvd0Var.c == 2;
        List list2 = tvd0Var.a;
        if (z && !this.c0 && this.A && this.R != null) {
            pzt0 pzt0Var3 = this.Z;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            this.Z = null;
            sls slsVar = this.R;
            if (slsVar != null) {
                slsVar.invoke();
            }
            if (this.T) {
                ((lvc0) ((w6u) npb1.c(this, androidx.compose.ui.platform.j.l))).a(0);
            }
            this.c0 = true;
        }
        if (this.c0) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!kx91.d((zvd0) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((zvd0) list2.get(i3)).a();
                    }
                    return;
                }
            }
            zvd0 zvd0Var3 = (zvd0) list2.get(0);
            zvd0Var3.a();
            V0(zvd0Var3.b, this.W);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!kx91.c((zvd0) list2.get(i4))) {
                long J0 = J0(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    zvd0 zvd0Var4 = (zvd0) list2.get(i5);
                    if (zvd0Var4.j() || kx91.f(zvd0Var4, j, J0)) {
                        T0(false);
                        return;
                    }
                }
                return;
            }
        }
        zvd0 zvd0Var5 = (zvd0) list2.get(0);
        zvd0Var5.a();
        V0(zvd0Var5.b, this.W);
    }

    @Override // defpackage.isv
    public final void n0(bsv bsvVar, PointerEventPass pointerEventPass) {
        O0();
        if (this.A && this.E == null) {
            z2t z2tVar = new z2t(this);
            E0(z2tVar);
            this.E = z2tVar;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f0 == null || this.j0) {
                return;
            }
            ArrayList arrayList = ((y92) bsvVar).a;
            int size = arrayList.size();
            while (i < size) {
                dsv dsvVar = (dsv) arrayList.get(i);
                if (dsvVar.i && dsvVar != this.f0) {
                    T0(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f0 == null) {
            ArrayList arrayList2 = ((y92) bsvVar).a;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (s5b1.d((dsv) arrayList2.get(i2))) {
                    dsv dsvVar2 = (dsv) ((y92) bsvVar).a.get(0);
                    dsvVar2.i = true;
                    this.f0 = dsvVar2;
                    if (this.A) {
                        pzt0 pzt0Var = this.h0;
                        if (pzt0Var != null && pzt0Var.isActive()) {
                            if (dsvVar2.b - this.k0 < ((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).a()) {
                                this.l0 = true;
                                return;
                            }
                            this.i0 = true;
                            pzt0 pzt0Var2 = this.h0;
                            if (pzt0Var2 != null) {
                                pzt0Var2.a(null);
                            }
                            this.h0 = null;
                        }
                        this.j0 = false;
                        M0(dsvVar2);
                        if (this.R != null) {
                            this.g0 = tje.N(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.j0) {
            ArrayList arrayList3 = ((y92) bsvVar).a;
            int size3 = arrayList3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                dsv dsvVar3 = (dsv) arrayList3.get(i3);
                if (!dsvVar3.h || dsvVar3.d) {
                    ArrayList arrayList4 = ((y92) bsvVar).a;
                    int size4 = arrayList4.size();
                    while (i < size4) {
                        ((dsv) arrayList4.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            dsv dsvVar4 = (dsv) ((y92) bsvVar).a.get(0);
            dsvVar4.i = true;
            U0(dsvVar4.b, this.f0);
            return;
        }
        ArrayList arrayList5 = ((y92) bsvVar).a;
        int size5 = arrayList5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            dsv dsvVar5 = (dsv) arrayList5.get(i4);
            if (dsvVar5.i || !dsvVar5.h || dsvVar5.d) {
                float c = ((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).c();
                ArrayList arrayList6 = ((y92) bsvVar).a;
                int size6 = arrayList6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    dsv dsvVar6 = (dsv) arrayList6.get(i5);
                    boolean z = Math.abs(wu60.d(wu60.e(dsvVar6.c, this.f0.c))) > c;
                    if (dsvVar6.i || z) {
                        T0(true);
                        return;
                    }
                }
                return;
            }
        }
        dsv dsvVar7 = (dsv) ((y92) bsvVar).a.get(0);
        dsvVar7.i = true;
        U0(dsvVar7.b, this.f0);
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        W0();
    }

    @Override // defpackage.isv
    public final void y0() {
        T0(true);
    }
}
