package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.p;
import androidx.compose.ui.node.s;
import defpackage.a0z0;
import defpackage.aji0;
import defpackage.b0z0;
import defpackage.bji0;
import defpackage.d1y;
import defpackage.gz40;
import defpackage.iko;
import defpackage.j390;
import defpackage.n810;
import defpackage.ooc;
import defpackage.qje;
import defpackage.sls;
import defpackage.t300;
import defpackage.vvb1;
import defpackage.wx40;
import defpackage.wz40;
import defpackage.xy40;
import defpackage.y5w;
import defpackage.z5w;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class a {
    public final iko a;
    public final aji0 b;
    public final b0z0 c;
    public final xy40 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Object h;
    public long i;
    public final sls j;
    public final gz40 k;

    public a(iko ikoVar) {
        this.a = ikoVar;
        this.b = new aji0();
        this.c = new b0z0();
        this.d = new xy40((Object) null);
        this.i = -1L;
        this.j = new sls() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                a aVar = a.this;
                aVar.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return zy11.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        };
        this.k = new gz40();
    }

    public static long d(LayoutNode layoutNode) {
        t300 t300Var = layoutNode.a0;
        s sVar = (s) t300Var.e;
        long j = 0;
        for (s sVar2 = (f) t300Var.d; sVar2 != null && sVar2 != sVar; sVar2 = sVar2.K) {
            j390 j390Var = sVar2.h0;
            if (j390Var != null && !ooc.s(j390Var.mo78getUnderlyingMatrixsQKQjiQ())) {
                return 9223372034707292159L;
            }
            j = z5w.c(j, sVar2.T);
        }
        return j;
    }

    public static void g(LayoutNode layoutNode) {
        if (layoutNode.c) {
            j390 j390Var = ((s) layoutNode.a0.e).h0;
            if (j390Var == null || ooc.s(j390Var.mo78getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.c = false;
                if (layoutNode.x) {
                    layoutNode.w = d(layoutNode);
                    layoutNode.x = false;
                }
                if (z5w.a(layoutNode.w, 9223372034707292159L)) {
                    return;
                }
                wz40 x = layoutNode.x();
                Object[] objArr = x.a;
                int i = x.c;
                for (int i2 = 0; i2 < i; i2++) {
                    g((LayoutNode) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        aji0 aji0Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        Object obj = this.h;
        if (obj != null) {
            this.a.removeDelayedExecution(obj);
            this.h = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        aji0 aji0Var2 = this.b;
        boolean z4 = true;
        b0z0 b0z0Var = this.c;
        if (z2) {
            this.e = false;
            xy40 xy40Var = this.d;
            Object[] objArr = xy40Var.a;
            int i3 = xy40Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((sls) objArr[i4]).invoke();
            }
            long[] jArr2 = aji0Var2.a;
            int i5 = aji0Var2.c;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    a0z0 a0z0Var = (a0z0) b0z0Var.a.b(((int) j6) & 33554431);
                    while (a0z0Var != null) {
                        a0z0 a0z0Var2 = a0z0Var.d;
                        boolean z6 = z3;
                        long j9 = a0z0Var.g;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        a0z0Var.e = j7;
                        a0z0Var.f = j8;
                        if (z7) {
                            a0z0Var.g = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            a0z0Var.a(j4, j5, b0z0Var.d, b0z0Var.e, b0z0Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        a0z0Var = a0z0Var2;
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
            long[] jArr3 = aji0Var2.a;
            int i8 = aji0Var2.c;
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
            long j10 = b0z0Var.d;
            long j11 = b0z0Var.e;
            float[] fArr = b0z0Var.g;
            wx40 wx40Var = b0z0Var.a;
            j2 = 128;
            Object[] objArr2 = wx40Var.c;
            long[] jArr4 = wx40Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    aji0Var = aji0Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                a0z0 a0z0Var3 = (a0z0) objArr2[(i11 << 3) + i15];
                                while (a0z0Var3 != null) {
                                    b0z0Var.a(a0z0Var3, j12, j11, fArr, currentTimeMillis);
                                    a0z0Var3 = a0z0Var3.d;
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
                    aji0Var2 = aji0Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = b0z0Var.d;
                    long j16 = b0z0Var.e;
                    float[] fArr2 = b0z0Var.g;
                    a0z0 a0z0Var4 = b0z0Var.b;
                    if (a0z0Var4 != null) {
                        while (a0z0Var4 != null) {
                            LayoutNode P = qje.P(a0z0Var4.b);
                            a0z0Var4.e = d1y.a(P).getRectManager().b(P);
                            a0z0Var4.f = ((P.v() + ((int) (r12 >> 32))) << 32) | ((P.m() + ((int) (r12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            b0z0Var.a(a0z0Var4, j15, j16, fArr2, currentTimeMillis);
                            a0z0Var4 = a0z0Var4.d;
                        }
                    }
                }
                if (this.g) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.g = false;
                    aji0 aji0Var3 = aji0Var;
                    long[] jArr6 = aji0Var3.a;
                    int i17 = aji0Var3.c;
                    long[] jArr7 = aji0Var3.b;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != bji0.a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    aji0Var3.c = i18;
                    aji0Var3.a = jArr7;
                    aji0Var3.b = jArr6;
                }
                if (b0z0Var.c <= currentTimeMillis) {
                    wx40 wx40Var2 = b0z0Var.a;
                    Object[] objArr3 = wx40Var2.c;
                    long[] jArr8 = wx40Var2.a;
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
                                        for (a0z0 a0z0Var5 = (a0z0) objArr3[(i21 << 3) + i23]; a0z0Var5 != null; a0z0Var5 = a0z0Var5.d) {
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
                    a0z0 a0z0Var6 = b0z0Var.b;
                    if (a0z0Var6 != null) {
                        while (a0z0Var6 != null) {
                            a0z0Var6 = a0z0Var6.d;
                        }
                    }
                    b0z0Var.c = -1L;
                }
                if (b0z0Var.c <= j) {
                    h();
                    return;
                }
                return;
            }
            aji0Var = aji0Var2;
            i = 8;
        } else {
            aji0Var = aji0Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.g) {
        }
        if (b0z0Var.c <= currentTimeMillis) {
        }
        if (b0z0Var.c <= j) {
        }
    }

    public final long b(LayoutNode layoutNode) {
        long j;
        int i = layoutNode.b & 33554431;
        aji0 aji0Var = this.b;
        long[] jArr = aji0Var.a;
        int i2 = aji0Var.c;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return 9223372034707292159L;
        }
        return (((int) j) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (j >> 32)) << 32);
    }

    public final void c(LayoutNode layoutNode) {
        char c;
        boolean z;
        boolean z2 = true;
        layoutNode.c = true;
        t300 t300Var = layoutNode.a0;
        s sVar = (s) t300Var.e;
        p pVar = layoutNode.b0.p;
        int n0 = pVar.n0();
        float m0 = pVar.m0();
        gz40 gz40Var = this.k;
        gz40Var.c(0.0f, 0.0f, n0, m0);
        while (true) {
            c = HexString.CHAR_SPACE;
            if (sVar == null) {
                break;
            }
            LayoutNode layoutNode2 = sVar.I;
            if (sVar == ((s) layoutNode2.a0.e) && !layoutNode2.c) {
                if (!z5w.a(b(layoutNode2), 9223372034707292159L)) {
                    gz40Var.d((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    break;
                }
            }
            j390 j390Var = sVar.h0;
            if (j390Var != null) {
                float[] mo78getUnderlyingMatrixsQKQjiQ = j390Var.mo78getUnderlyingMatrixsQKQjiQ();
                if (!ooc.s(mo78getUnderlyingMatrixsQKQjiQ)) {
                    n810.c(mo78getUnderlyingMatrixsQKQjiQ, gz40Var);
                }
            }
            float f = (int) (sVar.T >> 32);
            gz40Var.d((_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits((int) (r9 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) | (Float.floatToRawIntBits(f) << 32));
            sVar = sVar.K;
        }
        int i = (int) gz40Var.a;
        int i2 = (int) gz40Var.b;
        int i3 = (int) gz40Var.c;
        int i4 = (int) gz40Var.d;
        int i5 = layoutNode.b;
        boolean z3 = layoutNode.z;
        layoutNode.z = true;
        if (z3) {
            int i6 = i5 & 33554431;
            aji0 aji0Var = this.b;
            long[] jArr = aji0Var.a;
            int i7 = aji0Var.c;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                long j = jArr[i9];
                z = z2;
                if ((((int) j) & 33554431) == i6) {
                    jArr[i8] = (i << c2) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    jArr[i8 + 1] = (i3 << c2) | (i4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    jArr[i9] = (((j >> 63) & 1) << 60) | j;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    z2 = z;
                }
            }
        }
        z = z2;
        LayoutNode s = layoutNode.s();
        this.b.a(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : s != null ? s.b : -1, t300Var.e(1024), t300Var.e(16), this.c.a.a(i5), -1);
        layoutNode.y = false;
        this.e = z;
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i10 = x.c;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode3 = (LayoutNode) objArr[i11];
            if (layoutNode3.G()) {
                c(layoutNode3);
            }
        }
    }

    public final void e(LayoutNode layoutNode) {
        long j;
        j390 j390Var;
        int i;
        int i2;
        char c;
        boolean G = layoutNode.G();
        t300 t300Var = layoutNode.a0;
        if (G && layoutNode.y) {
            LayoutNode s = layoutNode.s();
            if (s == null || s.c) {
                j = s == null ? 0L : 9223372034707292159L;
            } else {
                if (s.x) {
                    s.x = false;
                    s.w = d(s);
                }
                j = s.w;
            }
            s sVar = (s) t300Var.e;
            if (z5w.a(j, 9223372034707292159L) || !((j390Var = sVar.h0) == null || ooc.s(j390Var.mo78getUnderlyingMatrixsQKQjiQ()))) {
                c(layoutNode);
            } else if (layoutNode.c) {
                c(layoutNode);
                g(layoutNode);
            } else {
                long c2 = z5w.c(j, sVar.T);
                p pVar = layoutNode.b0.p;
                int n0 = pVar.n0();
                int m0 = pVar.m0();
                int i3 = layoutNode.b;
                boolean z = layoutNode.z;
                char c3 = HexString.CHAR_SPACE;
                if (z) {
                    aji0 aji0Var = this.b;
                    if (s == null) {
                        int i4 = (int) (c2 >> 32);
                        int i5 = (int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        int i6 = i4 + n0;
                        int i7 = m0 + i5;
                        int i8 = i3 & 33554431;
                        long[] jArr = aji0Var.a;
                        int i9 = aji0Var.c;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= jArr.length - 2 || i10 >= i9) {
                                break;
                            }
                            int i11 = i10 + 2;
                            long j2 = jArr[i11];
                            if ((((int) j2) & 33554431) == i8) {
                                long j3 = jArr[i10];
                                jArr[i10] = (i4 << 32) | (i5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                jArr[i10 + 1] = (i7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i6 << 32);
                                jArr[i11] = (((j2 >> 63) & 1) << 60) | j2;
                                int i12 = i4 - ((int) (j3 >> 32));
                                int i13 = i5 - ((int) j3);
                                if ((i12 != 0) | (i13 != 0)) {
                                    int i14 = bji0.b;
                                    aji0Var.d(i12, i13, (j2 & (-1125899873288193L)) | (((i10 + 3) & 33554431) << 25));
                                }
                            } else {
                                i10 += 3;
                            }
                        }
                    } else {
                        int i15 = s.b;
                        int i16 = (int) (c2 >> 32);
                        int i17 = (int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        int i18 = i3 & 33554431;
                        long[] jArr2 = aji0Var.a;
                        int i19 = aji0Var.c;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= jArr2.length - 2 || i20 >= i19) {
                                break;
                            }
                            int i21 = i17;
                            if ((((int) jArr2[i20 + 2]) & 33554431) == i15) {
                                long j4 = jArr2[i20];
                                i2 = n0;
                                int i22 = ((int) (j4 >> c3)) + i16;
                                int i23 = ((int) j4) + i21;
                                int i24 = i22 + i2;
                                int i25 = i23 + m0;
                                i20 += 3;
                                c = c3;
                                while (i20 < jArr2.length - 2 && i20 < i19) {
                                    int i26 = i20 + 2;
                                    int i27 = i23;
                                    long j5 = jArr2[i26];
                                    int i28 = i15;
                                    if ((((int) j5) & 33554431) == i18) {
                                        long j6 = jArr2[i20];
                                        int i29 = i22 - ((int) (j6 >> c));
                                        int i30 = i27 - ((int) j6);
                                        jArr2[i20] = (i22 << c) | (i27 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        jArr2[i20 + 1] = (i24 << c) | (i25 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        jArr2[i26] = j5 | (((j5 >> 63) & 1) << 60);
                                        if (i29 != 0 || i30 != 0) {
                                            int i31 = bji0.b;
                                            aji0Var.d(i29, i30, (j5 & (-1125899873288193L)) | (((i20 + 3) & 33554431) << 25));
                                        }
                                    } else {
                                        i20 += 3;
                                        i23 = i27;
                                        i15 = i28;
                                    }
                                }
                                i = i15;
                            } else {
                                i = i15;
                                i2 = n0;
                                c = c3;
                            }
                            i20 += 3;
                            i17 = i21;
                            n0 = i2;
                            c3 = c;
                            i15 = i;
                        }
                    }
                } else {
                    layoutNode.z = true;
                    boolean e = t300Var.e(1024);
                    boolean e2 = t300Var.e(16);
                    boolean a = this.c.a.a(i3);
                    aji0 aji0Var2 = this.b;
                    if (s != null) {
                        int i32 = s.b;
                        int i33 = (int) (c2 >> 32);
                        int i34 = (int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        int i35 = i3 & 33554431;
                        long[] jArr3 = aji0Var2.a;
                        int i36 = aji0Var2.c - 3;
                        while (true) {
                            if (i36 < 0) {
                                break;
                            }
                            if ((((int) jArr3[i36 + 2]) & 33554431) == i32) {
                                long j7 = jArr3[i36];
                                int i37 = ((int) (j7 >> 32)) + i33;
                                int i38 = ((int) j7) + i34;
                                aji0Var2.a(i35, i37, i38, i37 + n0, i38 + m0, i32, e, e2, a, i36);
                                break;
                            }
                            i36 -= 3;
                        }
                    } else {
                        int i39 = (int) (c2 >> 32);
                        int i40 = (int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        aji0Var2.a(i3, i39, i40, i39 + n0, i40 + m0, (r22 & 32) != 0 ? -1 : 0, e, e2, a, -1);
                    }
                }
            }
            layoutNode.y = false;
            this.e = true;
            h();
        }
    }

    public final void f(LayoutNode layoutNode) {
        if (layoutNode.z) {
            int i = layoutNode.b & 33554431;
            aji0 aji0Var = this.b;
            long[] jArr = aji0Var.a;
            int i2 = aji0Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = bji0.a;
                    break;
                }
                i3 += 3;
            }
            layoutNode.z = false;
            layoutNode.y = true;
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
            iko ikoVar = this.a;
            if (obj != null) {
                ikoVar.removeDelayedExecution(obj);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.i = max;
            this.h = ikoVar.executeDelayed(max - currentTimeMillis, this.j);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a() {
        this(vvb1.C);
        wx40 wx40Var = y5w.a;
    }
}
