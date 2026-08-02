package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkDropdown.kt */
/* loaded from: classes17.dex */
public final class oqu0 {
    public static final void a(final int i, long j, androidx.compose.runtime.a aVar, jai jaiVar, final gzs gzsVar, final izs izsVar, final q630 q630Var, gxb0 gxb0Var, final uog0 uog0Var, final boolean z) {
        jai jaiVar2;
        final long j2;
        final gxb0 gxb0Var2;
        long floatToRawIntBits;
        gxb0 gxb0Var3;
        androidx.compose.runtime.a M = aVar.M(-2062271405);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 221184 | (M.J(uog0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f = 0;
                floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f));
                gxb0Var3 = new gxb0(false, false, 30);
            } else {
                M.h();
                floatToRawIntBits = j;
                gxb0Var3 = gxb0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2062271405, i2, -1, "com.vk.core.compose.component.VkDropdown (VkDropdown.kt:38)");
            }
            jaiVar2 = jaiVar;
            rgx.f(100663296 | (i2 & 14) | 805306368 | (i2 & 112) | (i2 & 896) | 1600512 | ((i2 << 3) & 29360128), floatToRawIntBits, M, kai.c(616575615, new hhk0(jaiVar2, 1), M), gzsVar, izsVar, q630Var, gxb0Var3, uog0Var, z);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = floatToRawIntBits;
            gxb0Var2 = gxb0Var3;
        } else {
            jaiVar2 = jaiVar;
            M.h();
            j2 = j;
            gxb0Var2 = gxb0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            s.d = new wzs(i, j2, jaiVar3, gzsVar, izsVar, q630Var, gxb0Var2, uog0Var, z) { // from class: xsna.mqu0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ long f;
                public final /* synthetic */ gxb0 g;
                public final /* synthetic */ uog0 h;
                public final /* synthetic */ jai i;

                {
                    this.b = z;
                    this.c = gzsVar;
                    this.d = q630Var;
                    this.e = izsVar;
                    this.f = j2;
                    this.g = gxb0Var2;
                    this.h = uog0Var;
                    this.i = jaiVar3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oqu0.a(ne7.I(100666369), this.f, (androidx.compose.runtime.a) obj, this.i, this.c, this.e, this.d, this.g, this.h, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final boolean z, final gzs gzsVar, q630 q630Var, final dt1 dt1Var, long j, gxb0 gxb0Var, r5j0 r5j0Var, boolean z2, yzs yzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        dt1 dt1Var2;
        int i5;
        long j2;
        int i6;
        gxb0 gxb0Var2;
        char c;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final yzs yzsVar2;
        final gxb0 gxb0Var3;
        final q630 q630Var3;
        final r5j0 r5j0Var2;
        final long j3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        r5j0 r5j0Var3;
        int i12;
        gxb0 gxb0Var4;
        yzs yzsVar3;
        boolean z4;
        r5j0 r5j0Var4;
        long j4;
        androidx.compose.runtime.a M = aVar.M(-1809247515);
        if ((i & 6) == 0) {
            i4 = (M.l(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.y(gzsVar) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                dt1Var2 = dt1Var;
                i4 |= M.J(dt1Var2) ? 2048 : 1024;
            } else {
                dt1Var2 = dt1Var;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 24576) == 0) {
                    i4 |= M.p(j2) ? 16384 : 8192;
                }
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
                gxb0Var2 = gxb0Var;
            } else {
                gxb0Var2 = gxb0Var;
                if ((i & 196608) == 0) {
                    c = ' ';
                    i4 |= M.J(gxb0Var2) ? 131072 : 65536;
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && M.J(r5j0Var)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= M.l(false) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= M.l(z2) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= M.y(yzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        if ((i2 & 6) != 0) {
                            i10 = i2 | (M.y(jaiVar) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        i11 = i4;
                        if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                            aVar2 = M;
                            aVar2.h();
                            z3 = z2;
                            yzsVar2 = yzsVar;
                            gxb0Var3 = gxb0Var2;
                            q630Var3 = q630Var2;
                            r5j0Var2 = r5j0Var;
                            j3 = j2;
                        } else {
                            M.V();
                            if ((i & 1) == 0 || M.i()) {
                                q630Var4 = i13 != 0 ? q630.a.a : q630Var2;
                                if (i5 != 0) {
                                    float f = 0;
                                    j2 = (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                                }
                                if (i6 != 0) {
                                    gxb0Var2 = new gxb0(false, false, 30);
                                }
                                if ((i3 & 64) != 0) {
                                    r5j0Var3 = lqu0.a();
                                    i12 = i11 & (-3670017);
                                } else {
                                    r5j0Var3 = r5j0Var;
                                    i12 = i11;
                                }
                                boolean z5 = i7 == 0 ? z2 : true;
                                if (i9 != 0) {
                                    gxb0Var4 = gxb0Var2;
                                    boolean z6 = z5;
                                    r5j0Var4 = r5j0Var3;
                                    j4 = 4294967295L;
                                    yzsVar3 = sni.c;
                                    z4 = z6;
                                } else {
                                    gxb0Var4 = gxb0Var2;
                                    yzsVar3 = yzsVar;
                                    z4 = z5;
                                    r5j0Var4 = r5j0Var3;
                                    j4 = 4294967295L;
                                }
                            } else {
                                M.h();
                                if ((i3 & 64) != 0) {
                                    r5j0Var4 = r5j0Var;
                                    i12 = i11 & (-3670017);
                                } else {
                                    r5j0Var4 = r5j0Var;
                                    i12 = i11;
                                }
                                gxb0Var4 = gxb0Var2;
                                q630Var4 = q630Var2;
                                j4 = 4294967295L;
                                z4 = z2;
                                yzsVar3 = yzsVar;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1809247515, i12, i10, "com.vk.core.compose.component.VkDropdown (VkDropdown.kt:77)");
                            }
                            azl azlVar = (azl) M.r(uvi.h);
                            long j5 = j2;
                            int i14 = i12 << 6;
                            int i15 = i12 >> 24;
                            aVar2 = M;
                            q630 q630Var5 = q630Var4;
                            rgx.g(z, gzsVar, q630Var5, dt1Var2, (azlVar.r0(rco.a(j2)) << c) | (azlVar.r0(rco.b(j2)) & j4), gxb0Var4, r5j0Var4, z4, yzsVar3, kai.c(1447370209, new zrt(jaiVar, 3), M), aVar2, (i12 & 8190) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i15 & 14) | 384 | (i15 & 112));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = j5;
                            q630Var3 = q630Var5;
                            gxb0Var3 = gxb0Var4;
                            r5j0Var2 = r5j0Var4;
                            z3 = z4;
                            yzsVar2 = yzsVar3;
                        }
                        s = aVar2.s();
                        if (s == null) {
                            s.d = new wzs() { // from class: xsna.nqu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i | 1);
                                    int I2 = ne7.I(i2);
                                    oqu0.b(z, gzsVar, q630Var3, dt1Var, j3, gxb0Var3, r5j0Var2, z3, yzsVar2, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & 6) != 0) {
                    }
                    i11 = i4;
                    if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
            }
            c = ' ';
            if ((i & 1572864) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i2 & 6) != 0) {
            }
            i11 = i4;
            if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i10 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        c = ' ';
        if ((i & 1572864) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i2 & 6) != 0) {
        }
        i11 = i4;
        if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
