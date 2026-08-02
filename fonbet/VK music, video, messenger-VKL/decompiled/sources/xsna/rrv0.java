package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.theme.VkAppTheme;

/* compiled from: VkTheme.kt */
/* loaded from: classes17.dex */
public final class rrv0 {
    public static final iyk0 a = new iyk0(new y8p0(6));
    public static final iyk0 b = new iyk0(new w5k0(12));
    public static final iyk0 c = new iyk0(new a8j0(12));
    public static final iyk0 d = new iyk0(new sqf0(15));
    public static final iyk0 e = new iyk0(new q0s0(5));
    public static final iyk0 f = new iyk0(new g9l0(9));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(squ0 squ0Var, final buw buwVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1274350353);
        final ylu0 ylu0Var = null;
        Object[] objArr = 0;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(null) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(null) ? 32 : 16;
        }
        int i4 = i3 | 384;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            i4 |= M.J(buwVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            squ0Var = tqu0.a;
            if (i5 != 0) {
                buwVar = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1274350353, i4, -1, "com.vk.core.compose.theme.LegoSupportedVkTheme (VkTheme.kt:111)");
            }
            h6v0 h6v0Var = h6v0.a;
            Boolean bool = (Boolean) ((zak0) h6v0.c).getValue();
            bool.getClass();
            c9e0 b2 = f.b(bool);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            rvi.a(b2, kai.c(113491921, new wzs() { // from class: xsna.orv0
                {
                    tqu0 tqu0Var = tqu0.a;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    tqu0 tqu0Var = tqu0.a;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(113491921, intValue, -1, "com.vk.core.compose.theme.LegoSupportedVkTheme.<anonymous> (VkTheme.kt:113)");
                        }
                        rrv0.d(ylu0Var, objArr2, tqu0Var, buwVar, jaiVar, aVar2, 0, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final squ0 squ0Var2 = squ0Var;
        final buw buwVar2 = buwVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.prv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rrv0.a(squ0.this, buwVar2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, squ0 squ0Var, buw buwVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1616973906);
        int i2 = (M.l(z) ? 4 : 2) | i | 224688;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                squ0Var = tqu0.a;
                buwVar = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1616973906, i2, -1, "com.vk.core.compose.theme.LegoSupportedVkTheme (VkTheme.kt:133)");
            }
            h6v0 h6v0Var = h6v0.a;
            Boolean bool = (Boolean) ((zak0) h6v0.c).getValue();
            bool.getClass();
            rvi.a(f.b(bool), kai.c(-1327393682, new jr8(z, squ0Var, buwVar, jaiVar), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final squ0 squ0Var2 = squ0Var;
        final buw buwVar2 = buwVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, squ0Var2, buwVar2, jaiVar, i) { // from class: xsna.qrv0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ squ0 c;
                public final /* synthetic */ buw d;
                public final /* synthetic */ jai e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1572865);
                    rrv0.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(ylu0 ylu0Var, wuv0 wuv0Var, squ0 squ0Var, buw buwVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        ylu0 ylu0Var2;
        wuv0 wuv0Var2;
        squ0 squ0Var2;
        buw buwVar2;
        int i2;
        squ0 squ0Var3;
        wuv0 wuv0Var3;
        buw buwVar3;
        androidx.compose.runtime.a M = aVar.M(-1555182198);
        int i3 = i | 1170;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0Var = (ylu0) M.r(a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var4 = (wuv0) M.r(c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1412929589, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                }
                squ0 squ0Var4 = (squ0) M.r(b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i3 & (-8191);
                squ0Var3 = squ0Var4;
                wuv0Var3 = wuv0Var4;
                buwVar3 = (buw) M.r(cuw.a);
            } else {
                M.h();
                i2 = i3 & (-8191);
                wuv0Var3 = wuv0Var;
                squ0Var3 = squ0Var;
                buwVar3 = buwVar;
            }
            ylu0 ylu0Var3 = ylu0Var;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1555182198, i2, -1, "com.vk.core.compose.theme.VkOverlayTheme (VkTheme.kt:55)");
            }
            d(ylu0Var3, wuv0Var3, squ0Var3, buwVar3, jaiVar, M, 24576, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ylu0Var2 = ylu0Var3;
            wuv0Var2 = wuv0Var3;
            squ0Var2 = squ0Var3;
            buwVar2 = buwVar3;
        } else {
            M.h();
            ylu0Var2 = ylu0Var;
            wuv0Var2 = wuv0Var;
            squ0Var2 = squ0Var;
            buwVar2 = buwVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ors0(ylu0Var2, wuv0Var2, squ0Var2, buwVar2, jaiVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(ylu0 ylu0Var, wuv0 wuv0Var, squ0 squ0Var, buw buwVar, final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        ylu0 ylu0Var2;
        int i3;
        wuv0 wuv0Var2;
        int i4;
        int i5;
        buw buwVar2;
        androidx.compose.runtime.f s;
        ylu0 ylu0Var3;
        wuv0 wuv0Var3;
        squ0 squ0Var2 = squ0Var;
        androidx.compose.runtime.a M = aVar.M(-1200738304);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            ylu0Var2 = ylu0Var;
        } else if ((i & 6) == 0) {
            ylu0Var2 = ylu0Var;
            i3 = (M.J(ylu0Var2) ? 4 : 2) | i;
        } else {
            ylu0Var2 = ylu0Var;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            wuv0Var2 = wuv0Var;
            i3 |= M.J(wuv0Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? M.J(squ0Var2) : M.y(squ0Var2) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                buwVar2 = buwVar;
                i3 |= M.J(buwVar2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= M.y(wzsVar) ? 16384 : 8192;
                }
                if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i6 != 0) {
                        ylu0Var2 = null;
                    }
                    if (i7 != 0) {
                        wuv0Var2 = null;
                    }
                    if (i4 != 0) {
                        squ0Var2 = tqu0.a;
                    }
                    if (i5 != 0) {
                        buwVar2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1200738304, i3, -1, "com.vk.core.compose.theme.VkTheme (VkTheme.kt:28)");
                    }
                    boolean booleanValue = ((Boolean) M.r(f)).booleanValue();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (ylu0Var2 == null) {
                        M.K(1588160218);
                        boolean l = M.l(bqi.a().getValue().booleanValue()) | M.l(booleanValue);
                        Object x = M.x();
                        if (l || x == c0012a) {
                            x = i35.f(booleanValue).h();
                            M.R(x);
                        }
                        ylu0Var3 = (ylu0) x;
                        M.j();
                    } else {
                        M.K(1436703986);
                        M.j();
                        ylu0Var3 = ylu0Var2;
                    }
                    if (wuv0Var2 == null) {
                        M.K(1588276530);
                        boolean l2 = M.l(booleanValue);
                        Object x2 = M.x();
                        if (l2 || x2 == c0012a) {
                            x2 = i35.f(booleanValue).i();
                            M.R(x2);
                        }
                        wuv0Var3 = (wuv0) x2;
                        M.j();
                    } else {
                        M.K(1436707614);
                        M.j();
                        wuv0Var3 = wuv0Var2;
                    }
                    rvi.b(new c9e0[]{a.b(ylu0Var3), cuw.a.b(buwVar2), c.b(wuv0Var3), b.b(squ0Var2), ujv0.b.b(ujv0.a), d.b(ojv0.a), rlo0.a.b(f(ylu0Var3, M))}, wzsVar, M, ((i3 >> 9) & 112) | 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                final squ0 squ0Var3 = squ0Var2;
                final ylu0 ylu0Var4 = ylu0Var2;
                final wuv0 wuv0Var4 = wuv0Var2;
                final buw buwVar3 = buwVar2;
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.mrv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rrv0.d(ylu0.this, wuv0Var4, squ0Var3, buwVar3, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            buwVar2 = buwVar;
            if ((i & 24576) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            }
            final squ0 squ0Var32 = squ0Var2;
            final ylu0 ylu0Var42 = ylu0Var2;
            final wuv0 wuv0Var42 = wuv0Var2;
            final buw buwVar32 = buwVar2;
            s = M.s();
            if (s != null) {
            }
        }
        wuv0Var2 = wuv0Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        buwVar2 = buwVar;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
        }
        final squ0 squ0Var322 = squ0Var2;
        final ylu0 ylu0Var422 = ylu0Var2;
        final wuv0 wuv0Var422 = wuv0Var2;
        final buw buwVar322 = buwVar2;
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(boolean z, ylu0 ylu0Var, ylu0 ylu0Var2, wuv0 wuv0Var, squ0 squ0Var, buw buwVar, final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        ylu0 ylu0Var3;
        int i4;
        ylu0 ylu0Var4;
        int i5;
        wuv0 wuv0Var2;
        int i6;
        int i7;
        buw buwVar2;
        final squ0 squ0Var2;
        final boolean z3;
        androidx.compose.runtime.f s;
        squ0 squ0Var3;
        wuv0 wuv0Var3;
        int i8;
        androidx.compose.runtime.a M = aVar.M(-1187829923);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                z2 = z;
                if (M.l(z2)) {
                    i8 = 4;
                    i3 = i8 | i;
                }
            } else {
                z2 = z;
            }
            i8 = 2;
            i3 = i8 | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            ylu0Var3 = ylu0Var;
            i3 |= M.J(ylu0Var3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                ylu0Var4 = ylu0Var2;
                i3 |= M.J(ylu0Var4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    wuv0Var2 = wuv0Var;
                    i3 |= M.J(wuv0Var2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= (32768 & i) == 0 ? M.J(squ0Var) : M.y(squ0Var) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                        buwVar2 = buwVar;
                    } else {
                        buwVar2 = buwVar;
                        if ((i & 196608) == 0) {
                            i3 |= M.J(buwVar2) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        M.h();
                        squ0Var2 = squ0Var;
                        z3 = z2;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            if ((i2 & 1) != 0) {
                                z3 = bqi.a().getValue().booleanValue();
                                i3 &= -15;
                            } else {
                                z3 = z2;
                            }
                            if (i9 != 0) {
                                ylu0Var3 = null;
                            }
                            if (i4 != 0) {
                                ylu0Var4 = null;
                            }
                            if (i5 != 0) {
                                wuv0Var2 = null;
                            }
                            squ0Var3 = i6 != 0 ? tqu0.a : squ0Var;
                            if (i7 != 0) {
                                buwVar2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                            }
                        } else {
                            M.h();
                            if ((i2 & 1) != 0) {
                                i3 &= -15;
                            }
                            z3 = z2;
                            squ0Var3 = squ0Var;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1187829923, i3, -1, "com.vk.core.compose.theme.VkTheme (VkTheme.kt:75)");
                        }
                        boolean booleanValue = ((Boolean) M.r(f)).booleanValue();
                        boolean l = ((i3 & 896) == 256) | M.l(booleanValue) | ((((i3 & 14) ^ 6) > 4 && M.l(z3)) || (i3 & 6) == 4) | ((i3 & 112) == 32);
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (l || x == c0012a) {
                            ylu0 h = ((booleanValue || !z3) ? !booleanValue ? VkAppTheme.VkontakteAndroid : z3 ? VkAppTheme.LegoAndroidDark : VkAppTheme.LegoAndroid : VkAppTheme.VkontakteAndroidDark).h();
                            if (z3) {
                                if (ylu0Var4 != null) {
                                    x = ylu0Var4;
                                    M.R(x);
                                }
                                x = h;
                                M.R(x);
                            } else {
                                if (ylu0Var3 != null) {
                                    x = ylu0Var3;
                                    M.R(x);
                                }
                                x = h;
                                M.R(x);
                            }
                        }
                        ylu0 ylu0Var5 = (ylu0) x;
                        if (wuv0Var2 == null) {
                            M.K(-404852555);
                            boolean l2 = M.l(booleanValue);
                            Object x2 = M.x();
                            if (l2 || x2 == c0012a) {
                                x2 = i35.f(booleanValue).i();
                                M.R(x2);
                            }
                            wuv0Var3 = (wuv0) x2;
                            M.j();
                        } else {
                            M.K(956771131);
                            M.j();
                            wuv0Var3 = wuv0Var2;
                        }
                        rvi.b(new c9e0[]{a.b(ylu0Var5), cuw.a.b(buwVar2), c.b(wuv0Var3), b.b(squ0Var3), ujv0.b.b(ujv0.a), d.b(ojv0.a), rlo0.a.b(f(ylu0Var5, M))}, wzsVar, M, ((i3 >> 15) & 112) | 8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        squ0Var2 = squ0Var3;
                    }
                    final buw buwVar3 = buwVar2;
                    final ylu0 ylu0Var6 = ylu0Var3;
                    final ylu0 ylu0Var7 = ylu0Var4;
                    final wuv0 wuv0Var4 = wuv0Var2;
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.nrv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                rrv0.e(z3, ylu0Var6, ylu0Var7, wuv0Var4, squ0Var2, buwVar3, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                wuv0Var2 = wuv0Var;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                final buw buwVar32 = buwVar2;
                final ylu0 ylu0Var62 = ylu0Var3;
                final ylu0 ylu0Var72 = ylu0Var4;
                final wuv0 wuv0Var42 = wuv0Var2;
                s = M.s();
                if (s == null) {
                }
            }
            ylu0Var4 = ylu0Var2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            wuv0Var2 = wuv0Var;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            final buw buwVar322 = buwVar2;
            final ylu0 ylu0Var622 = ylu0Var3;
            final ylu0 ylu0Var722 = ylu0Var4;
            final wuv0 wuv0Var422 = wuv0Var2;
            s = M.s();
            if (s == null) {
            }
        }
        ylu0Var3 = ylu0Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        ylu0Var4 = ylu0Var2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        wuv0Var2 = wuv0Var;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        final buw buwVar3222 = buwVar2;
        final ylu0 ylu0Var6222 = ylu0Var3;
        final ylu0 ylu0Var7222 = ylu0Var4;
        final wuv0 wuv0Var4222 = wuv0Var2;
        s = M.s();
        if (s == null) {
        }
    }

    public static final qlo0 f(ylu0 ylu0Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1432438340, 0, -1, "com.vk.core.compose.theme.rememberTextSelectionColors (VkTheme.kt:149)");
        }
        boolean p = aVar.p(ylu0Var.m().a);
        Object x = aVar.x();
        if (p || x == a.C0011a.a) {
            x = new qlo0(ylu0Var.m().a, l5g.c(14, ylu0Var.m().a, 0.4f));
            aVar.R(x);
        }
        qlo0 qlo0Var = (qlo0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return qlo0Var;
    }
}
