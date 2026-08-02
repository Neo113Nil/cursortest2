package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import xsna.avw;
import xsna.q630;
import xsna.thy;

/* compiled from: ProgressIndicator.kt */
/* loaded from: classes11.dex */
public final class x2e0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final nkk d;

    static {
        float f = k2e0.a;
        a = k2e0.a;
        b = PsExtractor.VIDEO_STREAM_MASK;
        c = 40;
        new nkk(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, 1.0f);
        new nkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
        new nkk(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.65f, 1.0f);
        new nkk(0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.45f, 1.0f);
        d = new nkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final float f, float f2, final int i, final int i2, final long j, long j2, androidx.compose.runtime.a aVar, q630 q630Var) {
        q630 q630Var2;
        int i3;
        float f3;
        int i4;
        long j3;
        int i5;
        int i6;
        final q630 q630Var3;
        final long j4;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        final long j5;
        Object obj;
        int i7;
        androidx.compose.runtime.a M = aVar.M(1746618448);
        int i8 = (M.n(f) ? 4 : 2) | i;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i8 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i8 | (M.J(q630Var2) ? 32 : 16);
        }
        int i10 = i3 | (M.p(j) ? 256 : 128);
        int i11 = i2 & 8;
        if (i11 != 0) {
            i10 |= 3072;
        } else if ((i & 3072) == 0) {
            f3 = f2;
            i10 |= M.n(f3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i5 = i10 | 24576;
                j3 = j2;
            } else {
                j3 = j2;
                i5 = i10 | (M.p(j3) ? 16384 : 8192);
            }
            i6 = i5 | (((i2 & 32) == 0 || !M.o(0)) ? 65536 : 131072);
            boolean z = true;
            if (M.t(i6 & 1, (i6 & 74899) == 74898)) {
                M.h();
                q630Var3 = q630Var2;
                j4 = j3;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    if (i9 != 0) {
                        q630Var2 = q630.a.a;
                    }
                    if (i11 != 0) {
                        f3 = k2e0.a;
                    }
                    long j6 = i4 != 0 ? l5g.j : j3;
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                    }
                    q630Var4 = q630Var2;
                    j5 = j6;
                } else {
                    M.h();
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                    }
                    q630Var4 = q630Var2;
                    j5 = j3;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1746618448, i6, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                }
                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                final float f5 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f;
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                final frm0 frm0Var = new frm0(((azl) M.r(uvi.h)).I0(f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 26);
                Float valueOf = Float.valueOf(f5);
                if (Float.isNaN(f5)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    f4 = valueOf.floatValue();
                }
                q630 q = txj0.q(j3e0.a(q630Var4, f4), c);
                boolean n = M.n(f5) | ((57344 & i6) == 16384) | M.y(frm0Var);
                if ((((i6 & 896) ^ 384) <= 256 || !M.p(j)) && (i6 & 384) != 256) {
                    z = false;
                }
                boolean z2 = n | z;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    i7 = 0;
                    obj = new izs() { // from class: xsna.r2e0
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            oio oioVar = (oio) obj2;
                            float f6 = 360.0f * f5;
                            long j7 = j5;
                            frm0 frm0Var2 = frm0Var;
                            x2e0.d(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, j7, frm0Var2);
                            x2e0.d(oioVar, 270.0f, f6, j, frm0Var2);
                            return s3q0.a;
                        }
                    };
                    M.R(obj);
                } else {
                    obj = x;
                    i7 = 0;
                }
                xa4.i(i7, M, (izs) obj, q);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j4 = j5;
                q630Var3 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                final float f6 = f3;
                s.d = new wzs() { // from class: xsna.s2e0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int I = ne7.I(i | 1);
                        x2e0.a(f, f6, I, i2, j, j4, (androidx.compose.runtime.a) obj2, q630Var3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i6 = i5 | (((i2 & 32) == 0 || !M.o(0)) ? 65536 : 131072);
        boolean z3 = true;
        if (M.t(i6 & 1, (i6 & 74899) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q630 q630Var, final long j, float f, long j2, int i, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        float f2;
        int i5;
        long j3;
        int i6;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final int i7;
        final float f3;
        final long j4;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        int i8;
        float f4;
        long j5;
        int i9;
        long j6;
        Object x;
        a.C0011a.C0012a c0012a;
        Object x2;
        boolean z;
        Object x3;
        int i10;
        q630 q630Var5;
        final long j7;
        int i11;
        androidx.compose.runtime.a M = aVar.M(-1119119072);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            q630Var2 = q630Var;
        } else if ((i2 & 6) == 0) {
            q630Var2 = q630Var;
            i4 = (M.J(q630Var2) ? 4 : 2) | i2;
        } else {
            q630Var2 = q630Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.p(j) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= M.n(f2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                j3 = j2;
                i4 |= M.p(j3) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        if (M.o(i6)) {
                            i11 = 16384;
                            i4 |= i11;
                        }
                    } else {
                        i6 = i;
                    }
                    i11 = 8192;
                    i4 |= i11;
                } else {
                    i6 = i;
                }
                if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
                    M.V();
                    if ((i2 & 1) == 0 || M.i()) {
                        if (i12 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if (i13 != 0) {
                            f2 = k2e0.a;
                        }
                        if (i5 != 0) {
                            j3 = l5g.j;
                        }
                        if ((i3 & 16) != 0) {
                            q630Var4 = q630Var2;
                            i8 = i4 & (-57345);
                            f4 = f2;
                            j5 = j3;
                            i9 = 2;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1119119072, i8, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                            }
                            final frm0 frm0Var = new frm0(((azl) M.r(uvi.h)).I0(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9, 0, null, 26);
                            avw c2 = dvw.c(M);
                            jtp0 jtp0Var = rte0.f;
                            kuo kuoVar = luo.d;
                            final float f5 = f4;
                            j6 = j5;
                            final avw.a b2 = dvw.b(c2, 0, 5, jtp0Var, jq2.a(6, 0L, null, jq2.d(6660, 0, kuoVar, 2)), M, 33208, 16);
                            final avw.a a2 = dvw.a(c2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 286.0f, jq2.a(6, 0L, null, jq2.d(1332, 0, kuoVar, 2)), M);
                            x = M.x();
                            c0012a = a.C0011a.a;
                            if (x == c0012a) {
                                x = new d4r(21);
                                M.R(x);
                            }
                            thy.b bVar = new thy.b();
                            ((izs) x).invoke(bVar);
                            final avw.a a3 = dvw.a(c2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, jq2.a(6, 0L, null, new thy(bVar)), M);
                            x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = new av70(8);
                                M.R(x2);
                            }
                            thy.b bVar2 = new thy.b();
                            ((izs) x2).invoke(bVar2);
                            final avw.a a4 = dvw.a(c2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, jq2.a(6, 0L, null, new thy(bVar2)), M);
                            boolean z2 = true;
                            q630 q = txj0.q(egi0.b(q630Var4, true, new h3e0(0)), c);
                            boolean y = ((i8 & 7168) != 2048) | M.y(frm0Var) | M.J(b2) | M.J(a3) | M.J(a4) | M.J(a2) | ((i8 & 896) != 256);
                            if ((((i8 & 112) ^ 48) > 32 || !M.p(j)) && (i8 & 48) != 32) {
                                z2 = false;
                            }
                            z = y | z2;
                            x3 = M.x();
                            if (!z || x3 == c0012a) {
                                i10 = 0;
                                q630Var5 = q630Var4;
                                j7 = j6;
                                izs izsVar = new izs() { // from class: xsna.p2e0
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        float f6;
                                        oio oioVar = (oio) obj;
                                        long j8 = j7;
                                        frm0 frm0Var2 = frm0Var;
                                        x2e0.d(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, j8, frm0Var2);
                                        float floatValue = ((Number) a3.getValue()).floatValue();
                                        mtk0 mtk0Var = a4;
                                        float abs = Math.abs(floatValue - ((Number) mtk0Var.getValue()).floatValue());
                                        float floatValue2 = ((Number) mtk0Var.getValue()).floatValue() + ((Number) a2.getValue()).floatValue() + (((((Number) b2.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                                        if (frm0Var2.c == 0) {
                                            f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        } else {
                                            f6 = ((f5 / (x2e0.c / 2)) * 57.29578f) / 2.0f;
                                        }
                                        x2e0.d(oioVar, floatValue2 + f6, Math.max(abs, 0.1f), j, frm0Var2);
                                        return s3q0.a;
                                    }
                                };
                                M.R(izsVar);
                                x3 = izsVar;
                            } else {
                                j7 = j6;
                                q630Var5 = q630Var4;
                                i10 = 0;
                            }
                            xa4.i(i10, M, (izs) x3, q);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j4 = j7;
                            q630Var3 = q630Var5;
                            aVar2 = M;
                            f3 = f5;
                            i7 = i9;
                        }
                    } else {
                        M.h();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                    q630Var4 = q630Var2;
                    i8 = i4;
                    i9 = i6;
                    f4 = f2;
                    j5 = j3;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    final frm0 frm0Var2 = new frm0(((azl) M.r(uvi.h)).I0(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9, 0, null, 26);
                    avw c22 = dvw.c(M);
                    jtp0 jtp0Var2 = rte0.f;
                    kuo kuoVar2 = luo.d;
                    final float f52 = f4;
                    j6 = j5;
                    final avw.a b22 = dvw.b(c22, 0, 5, jtp0Var2, jq2.a(6, 0L, null, jq2.d(6660, 0, kuoVar2, 2)), M, 33208, 16);
                    final avw.a a22 = dvw.a(c22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 286.0f, jq2.a(6, 0L, null, jq2.d(1332, 0, kuoVar2, 2)), M);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (x == c0012a) {
                    }
                    thy.b bVar3 = new thy.b();
                    ((izs) x).invoke(bVar3);
                    final avw.a a32 = dvw.a(c22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, jq2.a(6, 0L, null, new thy(bVar3)), M);
                    x2 = M.x();
                    if (x2 == c0012a) {
                    }
                    thy.b bVar22 = new thy.b();
                    ((izs) x2).invoke(bVar22);
                    final avw.a a42 = dvw.a(c22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, jq2.a(6, 0L, null, new thy(bVar22)), M);
                    boolean z22 = true;
                    q630 q2 = txj0.q(egi0.b(q630Var4, true, new h3e0(0)), c);
                    boolean y2 = ((i8 & 7168) != 2048) | M.y(frm0Var2) | M.J(b22) | M.J(a32) | M.J(a42) | M.J(a22) | ((i8 & 896) != 256);
                    if (((i8 & 112) ^ 48) > 32) {
                    }
                    z22 = false;
                    z = y2 | z22;
                    x3 = M.x();
                    if (z) {
                    }
                    i10 = 0;
                    q630Var5 = q630Var4;
                    j7 = j6;
                    izs izsVar2 = new izs() { // from class: xsna.p2e0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            float f6;
                            oio oioVar = (oio) obj;
                            long j8 = j7;
                            frm0 frm0Var22 = frm0Var2;
                            x2e0.d(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, j8, frm0Var22);
                            float floatValue = ((Number) a32.getValue()).floatValue();
                            mtk0 mtk0Var = a42;
                            float abs = Math.abs(floatValue - ((Number) mtk0Var.getValue()).floatValue());
                            float floatValue2 = ((Number) mtk0Var.getValue()).floatValue() + ((Number) a22.getValue()).floatValue() + (((((Number) b22.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                            if (frm0Var22.c == 0) {
                                f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            } else {
                                f6 = ((f52 / (x2e0.c / 2)) * 57.29578f) / 2.0f;
                            }
                            x2e0.d(oioVar, floatValue2 + f6, Math.max(abs, 0.1f), j, frm0Var22);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar2);
                    x3 = izsVar2;
                    xa4.i(i10, M, (izs) x3, q2);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    j4 = j7;
                    q630Var3 = q630Var5;
                    aVar2 = M;
                    f3 = f52;
                    i7 = i9;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                    i7 = i6;
                    f3 = f2;
                    j4 = j3;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.q2e0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            x2e0.b(q630.this, j, f3, j4, i7, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            j3 = j2;
            if ((i2 & 24576) == 0) {
            }
            if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        j3 = j2;
        if ((i2 & 24576) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void c(final float f, final q630 q630Var, final long j, final long j2, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-531984864);
        if ((i2 & 6) == 0) {
            i3 = (M.n(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.p(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.p(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(i) ? 16384 : 8192;
        }
        boolean z = true;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-531984864, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
            }
            float f2 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            final float f3 = 10;
            q630 b2 = egi0.b(dd80.i(q630Var, new yzs() { // from class: xsna.v2e0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ep10 ep10Var = (ep10) obj;
                    int r0 = ep10Var.r0(f3);
                    long j3 = ((o6j) obj3).a;
                    int i4 = r0 * 2;
                    tra0 N = ((zo10) obj2).N(s6j.i(0, i4, j3));
                    int i5 = N.c - i4;
                    return ep10Var.Q(N.b, i5, jgp.b, new cef(N, r0, 1));
                }
            }), true, new oqu(29));
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, b2);
            Float valueOf = Float.valueOf(f2);
            if (Float.isNaN(f2)) {
                valueOf = null;
            }
            if (valueOf != null) {
                f4 = valueOf.floatValue();
            }
            q630 s = txj0.s(j3e0.a(F, f4), b, a);
            boolean n = ((((i3 & 7168) ^ 3072) > 2048 && M.p(j2)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && M.o(i)) || (i3 & 24576) == 16384) | M.n(f2);
            if ((((i3 & 896) ^ 384) <= 256 || !M.p(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z2 = n | z;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                final float f5 = f2;
                izs izsVar = new izs() { // from class: xsna.t2e0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
                        long j3 = j2;
                        int i4 = i;
                        x2e0.e(oioVar, 1.0f, j3, intBitsToFloat, i4);
                        x2e0.e(oioVar, f5, j, intBitsToFloat, i4);
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x = izsVar;
            }
            xa4.i(0, M, (izs) x, s);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.u2e0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x2e0.c(f, q630Var, j, j2, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(oio oioVar, float f, float f2, long j, frm0 frm0Var) {
        float f3 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - (f3 * (frm0Var.a / f3));
        oio.X0(oioVar, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, 832);
    }

    public static final void e(oio oioVar, float f, long j, float f2, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
        float f3 = 2;
        float f4 = intBitsToFloat2 / f3;
        boolean z = oioVar.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? 0.0f : 1.0f - f) * intBitsToFloat;
        float f6 = (z ? f : 1.0f) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            oioVar.b1(f2, (r20 & 16) != 0 ? 0 : 0, 3, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            return;
        }
        float f7 = f2 / f3;
        awf awfVar = new awf(f7, intBitsToFloat - f7);
        float floatValue = ((Number) swe0.k(Float.valueOf(f5), awfVar)).floatValue();
        float floatValue2 = ((Number) swe0.k(Float.valueOf(f6), awfVar)).floatValue();
        if (Math.abs(f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            oioVar.b1(f2, (r20 & 16) != 0 ? 0 : i, 3, j, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        }
    }
}
