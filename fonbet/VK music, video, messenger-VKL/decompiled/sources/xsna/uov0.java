package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkSurface.kt */
/* loaded from: classes17.dex */
public final class uov0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, r5j0 r5j0Var, long j, long j2, y18 y18Var, float f, final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        r5j0 r5j0Var2;
        long j3;
        long j4;
        int i4;
        y18 y18Var2;
        int i5;
        float f2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final r5j0 r5j0Var3;
        final long j5;
        final long j6;
        final y18 y18Var3;
        final float f3;
        androidx.compose.runtime.f s;
        long j7;
        y18 y18Var4;
        float f4;
        long j8;
        long j9;
        q630 q630Var3;
        r5j0 r5j0Var4;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(1161906461);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            r5j0Var2 = r5j0Var;
            i3 |= M.J(r5j0Var2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (M.p(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && M.p(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                y18Var2 = y18Var;
                i3 |= M.J(y18Var2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= M.n(f2) ? 131072 : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var2 = q630Var;
                        r5j0Var3 = r5j0Var2;
                        j5 = j3;
                        j6 = j4;
                        y18Var3 = y18Var2;
                        f3 = f2;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var;
                            r5j0 r5j0Var5 = i9 != 0 ? androidx.compose.ui.graphics.e.a : r5j0Var2;
                            if ((i2 & 4) != 0) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j7 = ylu0Var.getBackground().a;
                                i3 &= -897;
                            } else {
                                j7 = j3;
                            }
                            if ((i2 & 8) != 0) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                i3 &= -7169;
                                j4 = ylu0Var2.getText().m;
                            }
                            if (i4 != 0) {
                                y18Var2 = null;
                            }
                            if (i5 != 0) {
                                f4 = 0;
                                j9 = j4;
                                y18Var4 = y18Var2;
                                q630Var3 = q630Var4;
                                r5j0Var4 = r5j0Var5;
                                j8 = j7;
                            } else {
                                y18Var4 = y18Var2;
                                f4 = f2;
                                j8 = j7;
                                j9 = j4;
                                q630Var3 = q630Var4;
                                r5j0Var4 = r5j0Var5;
                            }
                            i6 = 1161906461;
                        } else {
                            M.h();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            y18Var4 = y18Var2;
                            f4 = f2;
                            i6 = 1161906461;
                            j8 = j3;
                            j9 = j4;
                            q630Var3 = q630Var;
                            r5j0Var4 = r5j0Var2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(i6, i3, -1, "com.vk.core.compose.component.VkSurface (VkSurface.kt:29)");
                        }
                        aVar2 = M;
                        vmx.b(q630Var3, r5j0Var4, j8, j9, y18Var4, f4, wzsVar, aVar2, i3 & 4194302);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var2 = q630Var3;
                        r5j0Var3 = r5j0Var4;
                        j5 = j8;
                        j6 = j9;
                        y18Var3 = y18Var4;
                        f3 = f4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.sov0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                uov0.a(q630.this, r5j0Var3, j5, j6, y18Var3, f3, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((i & 1572864) == 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            y18Var2 = y18Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 1572864) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        r5j0Var2 = r5j0Var;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        y18Var2 = y18Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 1572864) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final gzs gzsVar, final q630 q630Var, final r5j0 r5j0Var, final long j, long j2, y18 y18Var, float f, sg50 sg50Var, buw buwVar, boolean z, String str, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        r5j0 r5j0Var2;
        long j3;
        long j4;
        float f2;
        sg50 sg50Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final y18 y18Var2;
        final buw buwVar2;
        final boolean z2;
        final sg50 sg50Var3;
        final long j5;
        final String str2;
        final float f3;
        androidx.compose.runtime.f s;
        sg50 sg50Var4;
        y18 y18Var3;
        buw buwVar3;
        boolean z3;
        y18 y18Var4;
        String str3;
        buw buwVar4;
        float f4;
        sg50 sg50Var5;
        long j6;
        int i11;
        androidx.compose.runtime.a M = aVar.M(-619888219);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            r5j0Var2 = r5j0Var;
            i4 |= M.J(r5j0Var2) ? 256 : 128;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i4 |= M.p(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                j4 = j2;
                if (M.p(j4)) {
                    i11 = 16384;
                    i4 |= i11;
                }
            } else {
                j4 = j2;
            }
            i11 = 8192;
            i4 |= i11;
        } else {
            j4 = j2;
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= M.J(y18Var) ? 131072 : 65536;
        }
        int i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 1572864) == 0) {
                i4 |= M.n(f2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i14 = i3 & 128;
        if (i14 != 0) {
            i4 |= 12582912;
            sg50Var2 = sg50Var;
        } else {
            sg50Var2 = sg50Var;
            if ((i & 12582912) == 0) {
                i4 |= M.J(sg50Var2) ? 8388608 : 4194304;
            }
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 = i15;
            i4 |= M.J(buwVar) ? 67108864 : 33554432;
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i4 |= M.l(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i9 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i9 = i2 | (M.J(str) ? 4 : 2);
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    i9 |= M.y(jaiVar) ? 32 : 16;
                }
                i10 = i9;
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i10 & 19) != 18)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if ((i3 & 16) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j4 = ylu0Var.getText().m;
                            i4 &= -57345;
                        }
                        y18 y18Var5 = i12 != 0 ? null : y18Var;
                        if (i13 != 0) {
                            f2 = 0;
                        }
                        if (i14 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = ir.h(M);
                            }
                            sg50Var4 = (sg50) x;
                        } else {
                            sg50Var4 = sg50Var2;
                        }
                        aVar2 = M;
                        if (i5 != 0) {
                            y18Var3 = y18Var5;
                            buwVar3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                        } else {
                            y18Var3 = y18Var5;
                            buwVar3 = buwVar;
                        }
                        z3 = i7 == 0 ? z : true;
                        y18Var4 = y18Var3;
                        if (i8 != 0) {
                            buwVar4 = buwVar3;
                            f4 = f2;
                            sg50Var5 = sg50Var4;
                            j6 = j4;
                            str3 = null;
                            aVar2.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-619888219, i4, i10, "com.vk.core.compose.component.VkSurface (VkSurface.kt:58)");
                            }
                            int i16 = i4 << 3;
                            vmx.a(gzsVar, q630Var2, z3, r5j0Var2, j3, j6, y18Var4, f4, sg50Var5, buwVar4, str3, jaiVar, aVar2, (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 21) & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), i10 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            z2 = z3;
                            j5 = j6;
                            y18Var2 = y18Var4;
                            f3 = f4;
                            sg50Var3 = sg50Var5;
                            buwVar2 = buwVar4;
                            str2 = str3;
                        } else {
                            str3 = str;
                            buwVar4 = buwVar3;
                            f4 = f2;
                            sg50Var5 = sg50Var4;
                        }
                    } else {
                        M.h();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        y18Var4 = y18Var;
                        buwVar4 = buwVar;
                        z3 = z;
                        str3 = str;
                        aVar2 = M;
                        f4 = f2;
                        sg50Var5 = sg50Var2;
                    }
                    j6 = j4;
                    aVar2.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    int i162 = i4 << 3;
                    vmx.a(gzsVar, q630Var2, z3, r5j0Var2, j3, j6, y18Var4, f4, sg50Var5, buwVar4, str3, jaiVar, aVar2, (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 21) & 896) | (i162 & 7168) | (57344 & i162) | (458752 & i162) | (3670016 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), i10 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    z2 = z3;
                    j5 = j6;
                    y18Var2 = y18Var4;
                    f3 = f4;
                    sg50Var3 = sg50Var5;
                    buwVar2 = buwVar4;
                    str2 = str3;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    y18Var2 = y18Var;
                    buwVar2 = buwVar;
                    z2 = z;
                    sg50Var3 = sg50Var2;
                    j5 = j4;
                    str2 = str;
                    f3 = f2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tov0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            uov0.b(gzs.this, q630Var, r5j0Var, j, j5, y18Var2, f3, sg50Var3, buwVar2, z2, str2, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i7 = i6;
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i10 = i9;
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i10 & 19) != 18)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i5 = i15;
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i10 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
