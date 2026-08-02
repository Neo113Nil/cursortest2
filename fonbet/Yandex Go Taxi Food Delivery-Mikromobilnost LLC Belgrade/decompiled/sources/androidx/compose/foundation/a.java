package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.u;
import defpackage.a7b;
import defpackage.adp;
import defpackage.awk0;
import defpackage.ay40;
import defpackage.c2c;
import defpackage.c9y;
import defpackage.cqh;
import defpackage.dai0;
import defpackage.dd11;
import defpackage.dr60;
import defpackage.dsv;
import defpackage.fud;
import defpackage.gly0;
import defpackage.gnq0;
import defpackage.gwd0;
import defpackage.gy40;
import defpackage.isv;
import defpackage.ixe0;
import defpackage.jl40;
import defpackage.jxe0;
import defpackage.l8x;
import defpackage.lix;
import defpackage.lqh;
import defpackage.ltu;
import defpackage.mnq0;
import defpackage.mtu;
import defpackage.npb1;
import defpackage.prv;
import defpackage.pzt0;
import defpackage.q791;
import defpackage.qje;
import defpackage.r501;
import defpackage.seu;
import defpackage.sls;
import defpackage.tje;
import defpackage.tvd0;
import defpackage.v5;
import defpackage.x2t;
import defpackage.xp31;
import defpackage.y6;
import defpackage.z2t;
import defpackage.zlz;
import defpackage.zvd0;
import defpackage.zx40;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class a extends lqh implements gwd0, lix, gnq0, dd11, fud, dr60, isv, x2t {
    public static final gly0 P = new gly0();
    public boolean A;
    public sls B;
    public final g C;
    public prv D;
    public z2t E;
    public cqh F;
    public jxe0 G;
    public ltu H;
    public final gy40 I = zlz.a();
    public long J = 0;
    public jxe0 K;
    public zx40 L;
    public boolean M;
    public pzt0 N;
    public final gly0 O;
    public zx40 c;
    public prv w;
    public boolean x;
    public String y;
    public awk0 z;

    public a(zx40 zx40Var, prv prvVar, boolean z, boolean z2, String str, awk0 awk0Var, sls slsVar) {
        this.c = zx40Var;
        this.w = prvVar;
        this.x = z;
        this.y = str;
        this.z = awk0Var;
        this.A = z2;
        this.B = slsVar;
        this.C = new g(zx40Var, 0, new AbstractClickableNode$focusableNode$1(1, this, a.class, "onFocusChange", "onFocusChange(Z)V", 0));
        zx40 zx40Var2 = this.c;
        this.L = zx40Var2;
        this.M = zx40Var2 == null;
        this.O = P;
    }

    public void D() {
        ltu ltuVar;
        zx40 zx40Var = this.c;
        if (zx40Var != null && (ltuVar = this.H) != null) {
            ((ay40) zx40Var).b(new mtu(ltuVar));
        }
        this.H = null;
    }

    public void H0(mnq0 mnq0Var) {
    }

    public final void I0() {
        zx40 zx40Var = this.c;
        gy40 gy40Var = this.I;
        if (zx40Var != null) {
            jxe0 jxe0Var = this.G;
            if (jxe0Var != null) {
                ((ay40) zx40Var).b(new ixe0(jxe0Var));
            }
            jxe0 jxe0Var2 = this.K;
            if (jxe0Var2 != null) {
                ((ay40) zx40Var).b(new ixe0(jxe0Var2));
            }
            ltu ltuVar = this.H;
            if (ltuVar != null) {
                ((ay40) zx40Var).b(new mtu(ltuVar));
            }
            Object[] objArr = gy40Var.c;
            long[] jArr = gy40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((ay40) zx40Var).b(new ixe0((jxe0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.G = null;
        this.K = null;
        this.H = null;
        gy40Var.a();
    }

    public final long J0(long j) {
        long R = qje.P(this).R.R(((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).h());
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (R >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (R & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(max) << 32);
    }

    public final void K0(boolean z) {
        zx40 zx40Var = this.c;
        if (zx40Var != null) {
            pzt0 pzt0Var = this.N;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                jxe0 jxe0Var = z ? this.K : this.G;
                if (jxe0Var != null) {
                    ixe0 ixe0Var = new ixe0(jxe0Var);
                    l8x l8xVar = (l8x) getCoroutineScope().getCoroutineContext().get(seu.C);
                    tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(zx40Var, ixe0Var, l8xVar != null ? l8xVar.w(new v5(2, zx40Var, ixe0Var)) : null, null), 3);
                }
            } else {
                pzt0 pzt0Var2 = this.N;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    public final void L0(long j, boolean z) {
        zx40 zx40Var = this.c;
        if (zx40Var != null) {
            pzt0 pzt0Var = this.N;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                jxe0 jxe0Var = z ? this.K : this.G;
                if (jxe0Var != null) {
                    tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(zx40Var, jxe0Var, null), 3);
                }
            } else {
                pzt0Var.a(null);
                tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(pzt0Var, j, zx40Var, null), 3);
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    public final void M0(dsv dsvVar) {
        zx40 zx40Var = this.c;
        if (zx40Var != null) {
            jxe0 jxe0Var = new jxe0(dsvVar.c);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            dai0.L(this, z2t.b, new adp(2, new a7b(21, dsvVar, ref$BooleanRef)));
            if (ref$BooleanRef.element || c2c.a(this)) {
                this.N = tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(zx40Var, jxe0Var, this, null), 3);
            } else {
                this.K = jxe0Var;
                tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(zx40Var, jxe0Var, null), 3);
            }
        }
    }

    public final void N0(zvd0 zvd0Var) {
        boolean z;
        zx40 zx40Var = this.c;
        if (zx40Var != null) {
            jxe0 jxe0Var = new jxe0(zvd0Var.c);
            r501 r501Var = z2t.b;
            if (zvd0Var == null) {
                dd11 n = dai0.n(this, r501Var);
                z2t z2tVar = n instanceof z2t ? (z2t) n : null;
                z = (z2tVar != null ? z2tVar.a : null) != null;
            } else {
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                dai0.L(this, r501Var, new adp(2, new a7b(22, zvd0Var, ref$BooleanRef)));
                z = ref$BooleanRef.element;
            }
            if (z || c2c.a(this)) {
                this.N = tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$1(zx40Var, jxe0Var, this, null), 3);
            } else {
                this.G = jxe0Var;
                tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$2$2(zx40Var, jxe0Var, null), 3);
            }
        }
    }

    public final void O0() {
        if (this.F != null) {
            return;
        }
        prv prvVar = this.x ? this.D : this.w;
        if (prvVar != null) {
            if (this.c == null) {
                this.c = new ay40();
            }
            this.C.I0(this.c);
            cqh a = prvVar.a(this.c);
            E0(a);
            this.F = a;
        }
    }

    public void P0() {
    }

    public abstract boolean Q0(KeyEvent keyEvent);

    public abstract void R0(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r3.F == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(zx40 zx40Var, prv prvVar, boolean z, boolean z2, String str, awk0 awk0Var, sls slsVar) {
        boolean z3;
        cqh cqhVar;
        boolean z4 = true;
        if (jl40.l(this.L, zx40Var)) {
            z3 = false;
        } else {
            I0();
            this.L = zx40Var;
            this.c = zx40Var;
            z3 = true;
        }
        if (!jl40.l(this.w, prvVar)) {
            this.w = prvVar;
            z3 = true;
        }
        if (this.x != z) {
            this.x = z;
            if (z) {
                e0();
            }
            z3 = true;
        }
        boolean z5 = this.A;
        g gVar = this.C;
        if (z5 != z2) {
            if (z2) {
                E0(gVar);
            } else {
                F0(gVar);
                I0();
            }
            qje.P(this).D();
            this.A = z2;
        }
        if (!jl40.l(this.y, str)) {
            this.y = str;
            qje.P(this).D();
        }
        if (!jl40.l(this.z, awk0Var)) {
            this.z = awk0Var;
            qje.P(this).D();
        }
        this.B = slsVar;
        boolean z6 = this.M;
        zx40 zx40Var2 = this.L;
        if (z6 != (zx40Var2 == null)) {
            boolean z7 = zx40Var2 == null;
            this.M = z7;
            if (!z7) {
            }
        }
        z4 = z3;
        if (z4 && ((cqhVar = this.F) != null || !this.M)) {
            if (cqhVar != null) {
                F0(cqhVar);
            }
            this.F = null;
            O0();
        }
        gVar.I0(this.c);
    }

    @Override // defpackage.gnq0
    public final boolean T() {
        return true;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.O;
    }

    @Override // defpackage.dr60
    public final void e0() {
        if (this.x) {
            u.e(this, new y6(this, 0));
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        long j2 = (((j << 32) >> 33) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((j >> 33) << 32);
        float f = (int) (j2 >> 32);
        float f2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.J = (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
        O0();
        if (this.A) {
            if (this.E == null) {
                z2t z2tVar = new z2t(this);
                E0(z2tVar);
                this.E = z2tVar;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = tvd0Var.f;
                if (i == 4) {
                    tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
                } else if (i == 5) {
                    tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // defpackage.lix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o0(KeyEvent keyEvent) {
        boolean z;
        O0();
        long c = c9y.c(keyEvent);
        boolean z2 = this.A;
        gy40 gy40Var = this.I;
        if (!z2 || c9y.f(keyEvent) != 2 || !q791.l(keyEvent)) {
            if (this.A && c9y.f(keyEvent) == 1 && q791.l(keyEvent)) {
                jxe0 jxe0Var = (jxe0) gy40Var.g(c);
                if (jxe0Var != null) {
                    if (this.c != null) {
                        tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, jxe0Var, null), 3);
                    }
                    R0(keyEvent);
                }
                if (jxe0Var != null) {
                    return true;
                }
            }
            return false;
        }
        if (gy40Var.b(c)) {
            z = false;
        } else {
            jxe0 jxe0Var2 = new jxe0(this.J);
            gy40Var.h(c, jxe0Var2);
            if (this.c != null) {
                tje.N(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, jxe0Var2, null), 3);
            }
            z = true;
        }
        if (!Q0(keyEvent) && !z) {
            return false;
        }
    }

    @Override // defpackage.e530
    public final void onAttach() {
        e0();
        if (!this.M) {
            O0();
        }
        if (this.A) {
            E0(this.C);
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        I0();
        if (this.L == null) {
            this.c = null;
        }
        cqh cqhVar = this.F;
        if (cqhVar != null) {
            F0(cqhVar);
        }
        this.F = null;
        z2t z2tVar = this.E;
        if (z2tVar != null) {
            F0(z2tVar);
        }
        this.E = null;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        awk0 awk0Var = this.z;
        if (awk0Var != null) {
            androidx.compose.ui.semantics.f.p(mnq0Var, awk0Var.a);
        }
        androidx.compose.ui.semantics.f.f(mnq0Var, this.y, new y6(this, 1));
        if (this.A) {
            this.C.u(mnq0Var);
        } else {
            androidx.compose.ui.semantics.f.a(mnq0Var);
        }
        H0(mnq0Var);
    }

    @Override // defpackage.lix
    public final boolean y(KeyEvent keyEvent) {
        return false;
    }
}
