package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import xsna.xro0;

/* compiled from: RectManager.kt */
/* loaded from: classes11.dex */
public final class fif0 {
    public final p52 a;
    public final bif0 b;
    public final xro0 c;
    public final fh50<gzs<s3q0>> d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Object h;
    public long i;
    public final eif0 j;
    public final oh50 k;

    public fif0(p52 p52Var) {
        this.a = p52Var;
        bif0 bif0Var = new bif0();
        bif0Var.b = new long[PsExtractor.AUDIO_STREAM];
        bif0Var.c = new long[PsExtractor.AUDIO_STREAM];
        this.b = bif0Var;
        this.c = new xro0();
        this.d = new fh50<>((Object) null);
        this.i = -1L;
        this.j = new eif0(this);
        this.k = new oh50();
    }

    public static long d(LayoutNode layoutNode) {
        u470 u470Var = layoutNode.G;
        androidx.compose.ui.node.o oVar = u470Var.d;
        long j = 0;
        for (androidx.compose.ui.node.o oVar2 = u470Var.c; oVar2 != null && oVar2 != oVar; oVar2 = oVar2.u) {
            m490 m490Var = oVar2.P;
            if (m490Var != null && !fco0.e(m490Var.mo409getUnderlyingMatrixsQKQjiQ())) {
                return 9223372034707292159L;
            }
            j = h9x.d(j, oVar2.D);
        }
        return j;
    }

    public static void g(LayoutNode layoutNode) {
        if (layoutNode.d) {
            m490 m490Var = layoutNode.G.d.P;
            if (m490Var == null || fco0.e(m490Var.mo409getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.d = false;
                if (layoutNode.f) {
                    layoutNode.e = d(layoutNode);
                    layoutNode.f = false;
                }
                if (h9x.b(layoutNode.e, 9223372034707292159L)) {
                    return;
                }
                ci50<LayoutNode> L = layoutNode.L();
                LayoutNode[] layoutNodeArr = L.b;
                int i = L.d;
                for (int i2 = 0; i2 < i; i2++) {
                    g(layoutNodeArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        bif0 bif0Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        Object obj = this.h;
        if (obj != null) {
            this.a.X(obj);
            this.h = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        bif0 bif0Var2 = this.b;
        boolean z4 = true;
        xro0 xro0Var = this.c;
        if (z2) {
            this.e = false;
            fh50<gzs<s3q0>> fh50Var = this.d;
            Object[] objArr = fh50Var.a;
            int i3 = fh50Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((gzs) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) bif0Var2.b;
            int i5 = bif0Var2.a;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    xro0.a b = xro0Var.a.b(((int) j6) & 33554431);
                    while (b != null) {
                        xro0.a aVar = b.d;
                        boolean z6 = z3;
                        long j9 = b.g;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        b.e = j7;
                        b.f = j8;
                        if (z7) {
                            b.g = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            b.a(j4, j5, xro0Var.d, xro0Var.e, xro0Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        b = aVar;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) bif0Var2.b;
            int i8 = bif0Var2.a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j10 = xro0Var.d;
            long j11 = xro0Var.e;
            float[] fArr = xro0Var.g;
            pg50<xro0.a> pg50Var = xro0Var.a;
            j2 = 128;
            Object[] objArr2 = pg50Var.c;
            long[] jArr4 = pg50Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    bif0Var = bif0Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                xro0.a aVar2 = (xro0.a) objArr2[(i11 << 3) + i15];
                                while (aVar2 != null) {
                                    xro0Var.a(aVar2, j12, j11, fArr, currentTimeMillis);
                                    aVar2 = aVar2.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    bif0Var2 = bif0Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = xro0Var.d;
                    long j16 = xro0Var.e;
                    float[] fArr2 = xro0Var.g;
                    xro0.a aVar3 = xro0Var.b;
                    if (aVar3 != null) {
                        while (aVar3 != null) {
                            LayoutNode f = itl.f(aVar3.b);
                            aVar3.e = voy.a(f).getRectManager().b(f);
                            androidx.compose.ui.node.k kVar = f.H.p;
                            aVar3.f = ((kVar.b + ((int) (r12 >> 32))) << 32) | ((kVar.c + ((int) (r12 & 4294967295L))) & 4294967295L);
                            xro0Var.a(aVar3, j15, j16, fArr2, currentTimeMillis);
                            aVar3 = aVar3.d;
                        }
                    }
                }
                if (this.g) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.g = false;
                    bif0 bif0Var3 = bif0Var;
                    long[] jArr6 = (long[]) bif0Var3.b;
                    int i17 = bif0Var3.a;
                    long[] jArr7 = (long[]) bif0Var3.c;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != cif0.c) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    bif0Var3.a = i18;
                    bif0Var3.b = jArr7;
                    bif0Var3.c = jArr6;
                }
                if (xro0Var.c <= currentTimeMillis) {
                    pg50<xro0.a> pg50Var2 = xro0Var.a;
                    Object[] objArr3 = pg50Var2.c;
                    long[] jArr8 = pg50Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (xro0.a aVar4 = (xro0.a) objArr3[(i21 << 3) + i23]; aVar4 != null; aVar4 = aVar4.d) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                    xro0.a aVar5 = xro0Var.b;
                    if (aVar5 != null) {
                        while (aVar5 != null) {
                            aVar5 = aVar5.d;
                        }
                    }
                    xro0Var.c = -1L;
                }
                if (xro0Var.c <= j) {
                    h();
                    return;
                }
                return;
            }
            bif0Var = bif0Var2;
            i = 8;
        } else {
            bif0Var = bif0Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.g) {
        }
        if (xro0Var.c <= currentTimeMillis) {
        }
        if (xro0Var.c <= j) {
        }
    }

    public final long b(LayoutNode layoutNode) {
        long j;
        int i = layoutNode.c & 33554431;
        bif0 bif0Var = this.b;
        long[] jArr = (long[]) bif0Var.b;
        int i2 = bif0Var.a;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    public final void c(LayoutNode layoutNode) {
        boolean z;
        boolean z2 = true;
        layoutNode.d = true;
        u470 u470Var = layoutNode.G;
        androidx.compose.ui.node.o oVar = u470Var.d;
        androidx.compose.ui.node.k kVar = layoutNode.H.p;
        int n0 = kVar.n0();
        float m0 = kVar.m0();
        oh50 oh50Var = this.k;
        oh50Var.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.c = n0;
        oh50Var.d = m0;
        while (true) {
            if (oVar == null) {
                break;
            }
            LayoutNode layoutNode2 = oVar.q;
            if (oVar == layoutNode2.G.d && !layoutNode2.d) {
                if (!h9x.b(b(layoutNode2), 9223372034707292159L)) {
                    oh50Var.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            m490 m490Var = oVar.P;
            if (m490Var != null) {
                float[] mo409getUnderlyingMatrixsQKQjiQ = m490Var.mo409getUnderlyingMatrixsQKQjiQ();
                if (!fco0.e(mo409getUnderlyingMatrixsQKQjiQ)) {
                    en10.d(mo409getUnderlyingMatrixsQKQjiQ, oh50Var);
                }
            }
            long j = oVar.D;
            oh50Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            oVar = oVar.u;
        }
        int i = (int) oh50Var.a;
        int i2 = (int) oh50Var.b;
        int i3 = (int) oh50Var.c;
        int i4 = (int) oh50Var.d;
        int i5 = layoutNode.c;
        boolean z3 = layoutNode.h;
        layoutNode.h = true;
        bif0 bif0Var = this.b;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) bif0Var.b;
            int i7 = bif0Var.a;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        LayoutNode I = layoutNode.I();
        bif0Var.a(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : I != null ? I.c : -1, u470Var.d(1024), u470Var.d(16), this.c.a.a(i5), -1);
        layoutNode.g = false;
        this.e = z;
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i10 = L.d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode3 = layoutNodeArr[i11];
            if (layoutNode3.g()) {
                c(layoutNode3);
            }
        }
    }

    public final void e(LayoutNode layoutNode) {
        long j;
        m490 m490Var;
        boolean g = layoutNode.g();
        u470 u470Var = layoutNode.G;
        if (g && layoutNode.g) {
            LayoutNode I = layoutNode.I();
            if (I == null || I.d) {
                j = I == null ? 0L : 9223372034707292159L;
            } else {
                if (I.f) {
                    I.f = false;
                    I.e = d(I);
                }
                j = I.e;
            }
            androidx.compose.ui.node.o oVar = u470Var.d;
            if (h9x.b(j, 9223372034707292159L) || !((m490Var = oVar.P) == null || fco0.e(m490Var.mo409getUnderlyingMatrixsQKQjiQ()))) {
                c(layoutNode);
            } else if (layoutNode.d) {
                c(layoutNode);
                g(layoutNode);
            } else {
                long d = h9x.d(j, oVar.D);
                androidx.compose.ui.node.k kVar = layoutNode.H.p;
                int n0 = kVar.n0();
                int m0 = kVar.m0();
                int i = layoutNode.c;
                boolean z = layoutNode.h;
                bif0 bif0Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    layoutNode.h = true;
                    boolean d2 = u470Var.d(1024);
                    boolean d3 = u470Var.d(16);
                    boolean a = this.c.a.a(i);
                    if (I != null) {
                        int i2 = I.c;
                        int i3 = (int) (d >> 32);
                        int i4 = (int) (d & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) bif0Var.b;
                        int i6 = bif0Var.a - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                bif0Var.a(i5, i7, i8, n0 + i7, i8 + m0, i2, d2, d3, a, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (d >> 32);
                        int i10 = (int) (d & 4294967295L);
                        bif0Var.a(i, i9, i10, i9 + n0, i10 + m0, (r22 & 32) != 0 ? -1 : 0, d2, d3, a, -1);
                    }
                } else if (I == null) {
                    int i11 = (int) (d >> 32);
                    int i12 = (int) (d & 4294967295L);
                    int i13 = n0 + i11;
                    int i14 = i12 + m0;
                    int i15 = i & 33554431;
                    long[] jArr2 = (long[]) bif0Var.b;
                    int i16 = bif0Var.a;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            jArr2[i17] = (i11 << 32) | (i12 & 4294967295L);
                            jArr2[i17 + 1] = (i14 & 4294967295L) | (i13 << 32);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i19 = i11 - ((int) (j5 >> 32));
                            int i20 = i12 - ((int) j5);
                            if ((i19 != 0) | (i20 != 0)) {
                                bif0Var.d(i19, i20, (cif0.b & j4) | (((i17 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i21 = I.c;
                    int i22 = (int) (d >> 32);
                    int i23 = (int) (d & 4294967295L);
                    int i24 = i & 33554431;
                    long[] jArr3 = (long[]) bif0Var.b;
                    int i25 = bif0Var.a;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= jArr3.length - 2 || i26 >= i25) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i26 + 2]) & 33554431) == i21) {
                            long j7 = jArr3[i26];
                            int i27 = ((int) (j7 >> 32)) + i22;
                            int i28 = ((int) j7) + i23;
                            int i29 = i27 + n0;
                            int i30 = i28 + m0;
                            i26 += 3;
                            while (i26 < jArr3.length - 2 && i26 < i25) {
                                int i31 = i26 + 2;
                                int i32 = i21;
                                int i33 = i22;
                                long j8 = jArr3[i31];
                                int i34 = i23;
                                if ((((int) j8) & 33554431) == i24) {
                                    long j9 = jArr3[i26];
                                    long[] jArr4 = jArr3;
                                    int i35 = i27 - ((int) (j9 >> 32));
                                    int i36 = i28 - ((int) j9);
                                    jArr4[i26] = (i28 & j6) | (i27 << 32);
                                    jArr4[i26 + 1] = (i29 << 32) | (i30 & j6);
                                    jArr4[i31] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i35 != 0 || i36 != 0) {
                                        bif0Var.d(i35, i36, (j8 & cif0.b) | (((i26 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i26 += 3;
                                    i21 = i32;
                                    i22 = i33;
                                    i23 = i34;
                                }
                            }
                        }
                        i26 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i21 = i21;
                        i22 = i22;
                        i23 = i23;
                    }
                }
            }
            layoutNode.g = false;
            this.e = true;
            h();
        }
    }

    public final void f(LayoutNode layoutNode) {
        if (layoutNode.h) {
            int i = layoutNode.c & 33554431;
            bif0 bif0Var = this.b;
            long[] jArr = (long[]) bif0Var.b;
            int i2 = bif0Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = cif0.c;
                    break;
                }
                i3 += 3;
            }
            layoutNode.h = false;
            layoutNode.g = true;
            this.e = true;
            this.g = true;
        }
    }

    public final void h() {
        Object obj = this.h;
        boolean z = obj != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            p52 p52Var = this.a;
            if (obj != null) {
                p52Var.X(obj);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.i = max;
            n52 n52Var = new n52(this.j, 0);
            p52Var.postDelayed(n52Var, max - currentTimeMillis);
            this.h = n52Var;
        }
    }
}
