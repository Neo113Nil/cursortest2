package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import org.chromium.net.NetError;
import ru.ok.gl.tf.Tensorflow;
import xsna.aa90;
import xsna.dt1;
import xsna.q630;
import xsna.x9k0;

/* compiled from: Pager.kt */
/* loaded from: classes11.dex */
public final class nb90 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final mc90 mc90Var, q630 q630Var, s890 s890Var, aa90 aa90Var, int i, float f, dt1.c cVar, h4o0 h4o0Var, boolean z, izs izsVar, d160 d160Var, x9k0 x9k0Var, e490 e490Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        int i6;
        s890 s890Var2;
        int i7;
        aa90 aa90Var2;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        final h4o0 h4o0Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.a aVar2;
        final boolean z2;
        final d160 d160Var2;
        final aa90 aa90Var3;
        final q630 q630Var3;
        final int i20;
        final float f3;
        final s890 s890Var3;
        final dt1.c cVar2;
        final izs izsVar2;
        final x9k0 x9k0Var2;
        final e490 e490Var2;
        androidx.compose.runtime.f s;
        dt1.c cVar3;
        int i21;
        int i22;
        aa90 aa90Var4;
        q630 q630Var4;
        int i23;
        boolean z3;
        int i24;
        izs izsVar3;
        int i25;
        h4o0 h4o0Var3;
        float f4;
        dt1.c cVar4;
        aa90 aa90Var5;
        d160 d160Var3;
        s890 s890Var4;
        x9k0 x9k0Var3;
        e490 e490Var3;
        int i26;
        androidx.compose.runtime.a M = aVar.M(1860873769);
        if ((i2 & 6) == 0) {
            i5 = (M.J(mc90Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                s890Var2 = s890Var;
                i5 |= M.J(s890Var2) ? 256 : 128;
                i7 = i4 & 8;
                int i28 = 1024;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    aa90Var2 = aa90Var;
                    i5 |= M.J(aa90Var2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= M.o(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= M.n(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= M.J(cVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                h4o0Var2 = h4o0Var;
                                if (M.J(h4o0Var2)) {
                                    i26 = 8388608;
                                    i5 |= i26;
                                }
                            } else {
                                h4o0Var2 = h4o0Var;
                            }
                            i26 = 4194304;
                            i5 |= i26;
                        } else {
                            h4o0Var2 = h4o0Var;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i13 = i12;
                            i5 |= M.l(z) ? 67108864 : 33554432;
                            i14 = i5 | 805306368;
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else {
                                i16 = i15;
                                i17 = i3 | (M.y(izsVar) ? 4 : 2);
                            }
                            int i29 = i17;
                            int i30 = i29 | 16;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i30 = i29 | 400;
                            } else if ((i3 & 384) == 0) {
                                i30 |= M.J(x9k0Var) ? 256 : 128;
                                if ((i3 & 3072) == 0) {
                                    if ((i4 & 8192) == 0 && M.J(e490Var)) {
                                        i28 = 2048;
                                    }
                                    i30 |= i28;
                                }
                                i19 = i30;
                                boolean z4 = true;
                                if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                                    M.V();
                                    if ((i2 & 1) == 0 || M.i()) {
                                        q630 q630Var5 = i27 != 0 ? q630.a.a : q630Var2;
                                        if (i6 != 0) {
                                            float f5 = 0;
                                            s890Var2 = new u890(f5, f5, f5, f5);
                                        }
                                        if (i7 != 0) {
                                            aa90Var2 = aa90.a.a;
                                        }
                                        if (i8 != 0) {
                                            i9 = 0;
                                        }
                                        float f6 = i10 != 0 ? 0 : f2;
                                        if (i11 != 0) {
                                            dt1.a.getClass();
                                            cVar3 = dt1.a.l;
                                        } else {
                                            cVar3 = cVar;
                                        }
                                        if ((i4 & 128) != 0) {
                                            h4o0Var2 = x19.A(mc90Var, null, M, (i14 & 14) | 196608, 30);
                                            i21 = i14 & (-29360129);
                                        } else {
                                            i21 = i14;
                                        }
                                        boolean z5 = i13 != 0 ? true : z;
                                        izs izsVar4 = i16 == 0 ? izsVar : null;
                                        Orientation orientation = Orientation.Horizontal;
                                        int i31 = (i21 & 14) | Tensorflow.FRAME_WIDTH;
                                        q630 q630Var6 = q630Var5;
                                        if (androidx.compose.runtime.b.d()) {
                                            i22 = i21;
                                            aa90Var4 = aa90Var2;
                                            androidx.compose.runtime.b.f(877583120, i31, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:435)");
                                        } else {
                                            i22 = i21;
                                            aa90Var4 = aa90Var2;
                                        }
                                        if ((((i31 & 14) ^ 6) <= 4 || !M.J(mc90Var)) && (i31 & 6) != 4) {
                                            z4 = false;
                                        }
                                        Object x = M.x();
                                        if (z4 || x == a.C0011a.a) {
                                            x = new xjl(mc90Var, orientation);
                                            M.R(x);
                                        }
                                        xjl xjlVar = (xjl) x;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        int i32 = i19 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        x9k0 x9k0Var4 = i18 != 0 ? x9k0.b.a : x9k0Var;
                                        if ((i4 & 8192) != 0) {
                                            e490 a = g490.a(M);
                                            i23 = i22;
                                            aVar2 = M;
                                            z3 = z5;
                                            i24 = i9;
                                            izsVar3 = izsVar4;
                                            i25 = i19 & (-7281);
                                            cVar4 = cVar3;
                                            q630Var4 = q630Var6;
                                            d160Var3 = xjlVar;
                                            s890Var4 = s890Var2;
                                            x9k0Var3 = x9k0Var4;
                                            e490Var3 = a;
                                            h4o0Var3 = h4o0Var2;
                                            f4 = f6;
                                            aa90Var5 = aa90Var4;
                                        } else {
                                            q630Var4 = q630Var6;
                                            i23 = i22;
                                            aVar2 = M;
                                            z3 = z5;
                                            i24 = i9;
                                            izsVar3 = izsVar4;
                                            i25 = i32;
                                            h4o0Var3 = h4o0Var2;
                                            f4 = f6;
                                            cVar4 = cVar3;
                                            aa90Var5 = aa90Var4;
                                            d160Var3 = xjlVar;
                                            s890Var4 = s890Var2;
                                            x9k0Var3 = x9k0Var4;
                                            e490Var3 = e490Var;
                                        }
                                    } else {
                                        M.h();
                                        int i33 = (i4 & 128) != 0 ? i14 & (-29360129) : i14;
                                        int i34 = i19 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        if ((i4 & 8192) != 0) {
                                            i34 = i19 & (-7281);
                                        }
                                        izsVar3 = izsVar;
                                        aVar2 = M;
                                        i23 = i33;
                                        aa90Var5 = aa90Var2;
                                        h4o0Var3 = h4o0Var2;
                                        q630Var4 = q630Var2;
                                        i24 = i9;
                                        f4 = f2;
                                        cVar4 = cVar;
                                        z3 = z;
                                        d160Var3 = d160Var;
                                        e490Var3 = e490Var;
                                        i25 = i34;
                                        s890Var4 = s890Var2;
                                        x9k0Var3 = x9k0Var;
                                    }
                                    aVar2.S();
                                    q630 q630Var7 = q630Var4;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1860873769, i23, i25, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                                    }
                                    Orientation orientation2 = Orientation.Horizontal;
                                    dt1.a.getClass();
                                    int i35 = i25;
                                    int i36 = i23 >> 6;
                                    int i37 = i23 << 12;
                                    xty.a(q630Var7, mc90Var, s890Var4, orientation2, h4o0Var3, z3, e490Var3, i24, f4, aa90Var5, d160Var3, izsVar3, dt1.a.o, cVar4, x9k0Var3, jaiVar, aVar2, (i23 & 896) | ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | ((i23 >> 18) & 7168) | (i36 & 458752) | (i36 & 3670016) | ((i35 << 12) & 29360128) | (i37 & 234881024) | (i37 & 1879048192), ((i35 << 6) & 896) | ((i23 >> 9) & 14) | 3072 | (i36 & 57344) | ((i35 << 9) & 458752) | 1572864);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    float f7 = f4;
                                    h4o0Var2 = h4o0Var3;
                                    aa90Var3 = aa90Var5;
                                    z2 = z3;
                                    i20 = i24;
                                    cVar2 = cVar4;
                                    e490Var2 = e490Var3;
                                    f3 = f7;
                                    izs izsVar5 = izsVar3;
                                    d160Var2 = d160Var3;
                                    izsVar2 = izsVar5;
                                    s890Var3 = s890Var4;
                                    x9k0Var2 = x9k0Var3;
                                    q630Var3 = q630Var7;
                                } else {
                                    aVar2 = M;
                                    aVar2.h();
                                    z2 = z;
                                    d160Var2 = d160Var;
                                    aa90Var3 = aa90Var2;
                                    q630Var3 = q630Var2;
                                    i20 = i9;
                                    f3 = f2;
                                    s890Var3 = s890Var2;
                                    cVar2 = cVar;
                                    izsVar2 = izsVar;
                                    x9k0Var2 = x9k0Var;
                                    e490Var2 = e490Var;
                                }
                                s = aVar2.s();
                                if (s != null) {
                                    s.d = new wzs() { // from class: xsna.kb90
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int I = ne7.I(i2 | 1);
                                            int I2 = ne7.I(i3);
                                            nb90.a(mc90.this, q630Var3, s890Var3, aa90Var3, i20, f3, cVar2, h4o0Var2, z2, izsVar2, d160Var2, x9k0Var2, e490Var2, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i4);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            i19 = i30;
                            boolean z42 = true;
                            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                            }
                            s = aVar2.s();
                            if (s != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 | 805306368;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        int i292 = i17;
                        int i302 = i292 | 16;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i19 = i302;
                        boolean z422 = true;
                        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                        }
                        s = aVar2.s();
                        if (s != null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 | 805306368;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    int i2922 = i17;
                    int i3022 = i2922 | 16;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i19 = i3022;
                    boolean z4222 = true;
                    if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                aa90Var2 = aa90Var;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 | 805306368;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                int i29222 = i17;
                int i30222 = i29222 | 16;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i19 = i30222;
                boolean z42222 = true;
                if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            s890Var2 = s890Var;
            i7 = i4 & 8;
            int i282 = 1024;
            if (i7 != 0) {
            }
            aa90Var2 = aa90Var;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 | 805306368;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            int i292222 = i17;
            int i302222 = i292222 | 16;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i19 = i302222;
            boolean z422222 = true;
            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        s890Var2 = s890Var;
        i7 = i4 & 8;
        int i2822 = 1024;
        if (i7 != 0) {
        }
        aa90Var2 = aa90Var;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 | 805306368;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        int i2922222 = i17;
        int i3022222 = i2922222 | 16;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i19 = i3022222;
        boolean z4222222 = true;
        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
