package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkHintBanner.kt */
/* loaded from: classes5.dex */
public final class nyu0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(-448430160);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-448430160, i2, -1, "com.vk.profile.design.compose.onboarding.CloseIcon (VkHintBanner.kt:98)");
            }
            if (z) {
                M.K(-1834430135);
                nzu0.e(gzsVar, q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, tni.c, M, ((i2 >> 6) & 14) | 100663296 | ((i2 << 3) & 112), 252);
            } else {
                M.K(-1837610766);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pku(i, gzsVar, q630Var, z);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, q630 q630Var, lg90 lg90Var) {
        androidx.compose.runtime.a M = aVar.M(-618872451);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-618872451, i2, -1, "com.vk.profile.design.compose.onboarding.Icon (VkHintBanner.kt:130)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(q630Var, vog0.b(8), ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1292798853, new o4e(lg90Var, 14), M), M, (i2 & 14) | 1572864, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fd1(q630Var, lg90Var, i, 11);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        String str3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1822826608);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1822826608, i2, -1, "com.vk.profile.design.compose.onboarding.Text (VkHintBanner.kt:114)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            yqv0.c(str, null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).h0, aVar2, (i2 >> 3) & 14, 0, 8186);
            str3 = str2;
            yqv0.c(str3, null, wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).m0, aVar2, (i2 >> 6) & 14, 0, 8186);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str3 = str2;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vb5(q630Var, str, str3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(q630 q630Var, final lg90 lg90Var, final String str, final String str2, boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        int i4;
        String str3;
        String str4;
        boolean z2;
        gzs<s3q0> gzsVar3;
        final q630 q630Var3;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-641181992);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i5;
            i4 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i4 = (M.J(q630Var2) ? 4 : 2) | i;
            i3 = i5;
        } else {
            q630Var2 = q630Var;
            i3 = i5;
            i4 = i;
        }
        int i6 = i4 | (M.y(lg90Var) ? 32 : 16);
        if ((i & 384) == 0) {
            str3 = str;
            i6 |= M.J(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i6 |= M.J(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i6 |= M.l(z2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                gzsVar3 = gzsVar;
                i6 |= M.y(gzsVar3) ? 131072 : 65536;
            } else {
                gzsVar3 = gzsVar;
            }
            if ((1572864 & i) == 0) {
                i6 |= M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                M.h();
                q630Var3 = q630Var2;
                z3 = z2;
            } else {
                if (i3 != 0) {
                    q630Var2 = q630.a.a;
                }
                boolean z4 = i7 != 0 ? true : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-641181992, i6, -1, "com.vk.profile.design.compose.onboarding.VkHintBanner (VkHintBanner.kt:43)");
                }
                q630 d = rte0.d(q630Var2, vog0.b(8));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 c = ojc.c(hr80.m(d, ylu0Var.getWrite().b, androidx.compose.ui.graphics.e.a), false, null, null, gzsVar3, 15);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, c);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                int i8 = i6 >> 3;
                q630 q630Var4 = q630Var2;
                e(lg90Var, str3, str4, z4, gzsVar2, M, 8 | (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i6 >> 6) & 57344));
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
                z3 = z4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.kyu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nyu0.d(q630.this, lg90Var, str, str2, z3, gzsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (M.t(i6 & 1, (599187 & i6) == 599186)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void e(lg90 lg90Var, final String str, final String str2, final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1643260938);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1643260938, i2, -1, "com.vk.profile.design.compose.onboarding.VkHintBannerInternal (VkHintBanner.kt:61)");
            }
            q630 D = s200.D(q630.a.a, 12);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new l5r0(8);
                M.R(x);
            }
            ena.a(egi0.b(D, true, (izs) x), kai.c(-33838258, new u9a(lg90Var, 4), M), kai.c(931724559, new yzs() { // from class: xsna.lyu0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    spg0 spg0Var = (spg0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(spg0Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(931724559, intValue, -1, "com.vk.profile.design.compose.onboarding.VkHintBannerInternal.<anonymous> (VkHintBanner.kt:75)");
                        }
                        nyu0.c(0, aVar2, str, str2, s200.H(spg0Var.b(1.0f, q630.a.a, true), 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(1897287376, new yzs() { // from class: xsna.myu0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    spg0 spg0Var = (spg0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(spg0Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1897287376, intValue, -1, "com.vk.profile.design.compose.onboarding.VkHintBannerInternal.<anonymous> (VkHintBanner.kt:84)");
                        }
                        q630 d = rte0.d(s200.H(q630.a.a, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), vog0.a);
                        dt1.a.getClass();
                        nyu0.a(0, aVar2, gzsVar, spg0Var.a(d, dt1.a.k), z);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, X2.b.f, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aud0(lg90Var, str, str2, z, gzsVar, i, 1);
        }
    }
}
