package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.aa10;
import defpackage.aa41;
import defpackage.b1y;
import defpackage.ba10;
import defpackage.gkl0;
import defpackage.hz40;
import defpackage.ixv;
import defpackage.iz40;
import defpackage.j73;
import defpackage.jl40;
import defpackage.k6w;
import defpackage.kt1;
import defpackage.loz;
import defpackage.lt1;
import defpackage.m390;
import defpackage.moz;
import defpackage.o3c0;
import defpackage.rzx;
import defpackage.sa31;
import defpackage.sls;
import defpackage.tls;
import defpackage.wa30;
import defpackage.wwg;
import defpackage.z5w;
import defpackage.zy11;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends androidx.compose.ui.layout.o implements ba10, wa30 {
    public static final tls H = null;
    public o3c0 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final androidx.compose.ui.layout.j E;
    public gkl0 F;
    public hz40 G;
    public loz y;
    public tls z;

    public LookaheadCapablePlaceable() {
        tls tlsVar = androidx.compose.ui.layout.p.a;
        this.E = new androidx.compose.ui.layout.j(this);
    }

    public static void N0(s sVar) {
        b1y b1yVar;
        s sVar2 = sVar.J;
        LayoutNode layoutNode = sVar.I;
        if (!jl40.l(sVar2 != null ? sVar2.I : null, layoutNode)) {
            layoutNode.b0.p.R.g();
            return;
        }
        lt1 A = layoutNode.b0.p.A();
        if (A == null || (b1yVar = ((p) A).R) == null) {
            return;
        }
        b1yVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(LayoutNode layoutNode, androidx.compose.ui.layout.r rVar) {
        char c;
        long j;
        long j2;
        long j3;
        hz40 hz40Var;
        hz40 hz40Var2;
        Object d;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        hz40 hz40Var3 = this.G;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (hz40Var3 != null) {
            Object[] objArr = hz40Var3.c;
            long[] jArr3 = hz40Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                iz40 iz40Var = (iz40) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = iz40Var.b;
                                long[] jArr4 = iz40Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((aa41) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean F = layoutNode2.F();
                                                        i4 = i8;
                                                        if (F) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    iz40Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                hz40Var = this.G;
                if (hz40Var != null) {
                    long[] jArr5 = hz40Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((iz40) hz40Var.c[i18]).g()) {
                                            hz40Var.n(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                hz40Var2 = this.G;
                if (hz40Var2 == null) {
                    hz40Var2 = new hz40((Object) null);
                    this.G = hz40Var2;
                }
                d = hz40Var2.d(rVar);
                if (d == null) {
                    d = new iz40((Object) null);
                    hz40Var2.o(rVar, d);
                }
                ((iz40) d).k(new aa41(layoutNode));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        hz40Var = this.G;
        if (hz40Var != null) {
        }
        hz40Var2 = this.G;
        if (hz40Var2 == null) {
        }
        d = hz40Var2.d(rVar);
        if (d == null) {
        }
        ((iz40) d).k(new aa41(layoutNode));
    }

    public abstract int C0(kt1 kt1Var);

    @Override // androidx.compose.ui.layout.k
    public final aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2) {
        if ((i & ModalContentViewContainer.BASE_SHADOW_COLOR) != 0 || ((-16777216) & i2) != 0) {
            ixv.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new moz(i, i2, map, tlsVar, tlsVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(final o3c0 o3c0Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        iz40 iz40Var;
        w snapshotObserver;
        hz40 hz40Var = this.G;
        gkl0 gkl0Var = this.F;
        if (gkl0Var == null) {
            gkl0Var = new gkl0();
            this.F = gkl0Var;
        }
        gkl0 gkl0Var2 = gkl0Var;
        m390 m390Var = Q().G;
        if (m390Var != null && (snapshotObserver = m390Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.c(o3c0Var, LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.w, new sls() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = LookaheadCapablePlaceable.this;
                    tls tlsVar = LookaheadCapablePlaceable.H;
                    lookaheadCapablePlaceable.M0().a = false;
                    LookaheadCapablePlaceable.this.M0().b = j;
                    LookaheadCapablePlaceable.this.M0().c = j2;
                    tls a = o3c0Var.a.a();
                    if (a != null) {
                        a.invoke(LookaheadCapablePlaceable.this.M0());
                    }
                    return zy11.a;
                }
            });
        }
        boolean d0 = d0();
        iz40 iz40Var2 = gkl0Var2.e;
        iz40 iz40Var3 = gkl0Var2.f;
        int i2 = gkl0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = gkl0Var2.d[i3];
            if (b == 3) {
                iz40Var3.k(gkl0Var2.b[i3]);
            } else if (b != 0 && hz40Var != null && (iz40Var = (iz40) hz40Var.m(gkl0Var2.b[i3])) != null) {
                iz40Var2.j(iz40Var);
            }
        }
        int i4 = gkl0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = gkl0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                androidx.compose.ui.layout.r[] rVarArr = gkl0Var2.b;
                rVarArr[i6 - i5] = rVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = gkl0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            gkl0Var2.b[i8] = null;
        }
        gkl0Var2.a -= i5;
        LookaheadCapablePlaceable K0 = K0();
        Object[] objArr = iz40Var3.b;
        long[] jArr = iz40Var3.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            androidx.compose.ui.layout.r rVar = (androidx.compose.ui.layout.r) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            LookaheadCapablePlaceable lookaheadCapablePlaceable = K0 == null ? this : K0;
                            i = i9;
                            LookaheadCapablePlaceable lookaheadCapablePlaceable2 = lookaheadCapablePlaceable;
                            while (true) {
                                gkl0 gkl0Var3 = lookaheadCapablePlaceable2.F;
                                if (gkl0Var3 != null) {
                                    z2 = d0;
                                    if (j73.y(gkl0Var3.b, rVar)) {
                                        break;
                                    }
                                } else {
                                    z2 = d0;
                                }
                                LookaheadCapablePlaceable K02 = lookaheadCapablePlaceable2.K0();
                                if (K02 == null) {
                                    break;
                                }
                                lookaheadCapablePlaceable2 = K02;
                                d0 = z2;
                            }
                            hz40 hz40Var2 = lookaheadCapablePlaceable2.G;
                            iz40 iz40Var4 = hz40Var2 != null ? (iz40) hz40Var2.m(rVar) : null;
                            if (iz40Var4 != null) {
                                lookaheadCapablePlaceable.O0(iz40Var4);
                            }
                        } else {
                            z2 = d0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        d0 = z2;
                    }
                    z = d0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = d0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                d0 = z;
                i9 = 8;
            }
        } else {
            z = d0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        iz40Var3.b();
        Object[] objArr2 = iz40Var2.b;
        long[] jArr2 = iz40Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((aa41) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.Q(false);
                            } else {
                                layoutNode.S(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        iz40Var2.b();
    }

    public final void F0(aa10 aa10Var) {
        long j;
        long j2;
        hz40 hz40Var = this.G;
        if (this.D) {
            return;
        }
        tls a = aa10Var.a();
        if (a != null) {
            boolean z = this.z != a;
            if (z || !M0().a) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                rzx H0 = H0();
                long V = wwg.V(H0.mo43localToScreenMKHz9U(0L));
                long e = H0.e();
                j2 = V;
                j = e;
                z = (z5w.a(V, M0().b) && k6w.a(e, M0().c)) ? false : true;
            }
            if (z) {
                o3c0 o3c0Var = this.A;
                if (o3c0Var != null) {
                    o3c0Var.a = aa10Var;
                } else {
                    o3c0Var = new o3c0(aa10Var, this);
                    this.A = o3c0Var;
                }
                E0(o3c0Var, j2, j);
                this.z = aa10Var.a();
                return;
            }
            return;
        }
        if (hz40Var != null) {
            Object[] objArr = hz40Var.c;
            long[] jArr = hz40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                O0((iz40) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
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
            hz40Var.h();
        }
    }

    public abstract LookaheadCapablePlaceable G0();

    public abstract rzx H0();

    public abstract boolean I0();

    public abstract aa10 J0();

    public abstract LookaheadCapablePlaceable K0();

    public abstract long L0();

    public final loz M0() {
        loz lozVar = this.y;
        if (lozVar != null) {
            return lozVar;
        }
        loz lozVar2 = new loz(this);
        this.y = lozVar2;
        return lozVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(iz40 iz40Var) {
        LayoutNode layoutNode;
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.a;
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
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((aa41) objArr[(i << 3) + i3]).get()) != null) {
                        if (d0()) {
                            layoutNode.Q(false);
                        } else {
                            layoutNode.S(false);
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

    public abstract void P0();

    @Override // defpackage.ba10
    public abstract LayoutNode Q();

    @Override // defpackage.yuw
    public boolean d0() {
        return false;
    }

    @Override // defpackage.wa30
    public final void g(boolean z) {
        LookaheadCapablePlaceable K0 = K0();
        LayoutNode Q = K0 != null ? K0.Q() : null;
        if (jl40.l(Q, Q())) {
            this.B = z;
            return;
        }
        if ((Q != null ? Q.b0.d : null) != LayoutNode.LayoutState.LayingOut) {
            if ((Q != null ? Q.b0.d : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.B = z;
    }

    @Override // defpackage.ca10
    public final int u(kt1 kt1Var) {
        int C0;
        if (!I0() || (C0 = C0(kt1Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = kt1Var instanceof sa31;
        long j = this.x;
        return C0 + ((int) (z ? j >> 32 : _Gost_CryptoPro_PrivateKeyValues.maxDWORD & j));
    }
}
