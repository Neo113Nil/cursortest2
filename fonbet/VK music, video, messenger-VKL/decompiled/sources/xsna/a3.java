package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.q630;

/* compiled from: AboutAppStateContentView.kt */
/* loaded from: classes6.dex */
public final class a3 {
    public static final void a(y0 y0Var, izs<? super u0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 m;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(634061143);
        int i3 = (M.J(y0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(634061143, i3, -1, "com.vk.superapp.presentation.about.compose.ContentScreen (AboutAppStateContentView.kt:141)");
            }
            List<z3> list = y0Var.d;
            List<z3> list2 = y0Var.d;
            boolean isEmpty = list.isEmpty();
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            if (isEmpty) {
                i2 = i3;
                M.K(49712114);
                q630 f = txj0.f(aVar3, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                m = hr80.m(f, ylu0Var.getBackground().g, aVar2);
                M.j();
            } else {
                M.K(49522704);
                q630 f2 = txj0.f(aVar3, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i3;
                q630 m2 = hr80.m(f2, ylu0Var2.getBackground().x, aVar2);
                float f3 = 0;
                float f4 = 20;
                m = rte0.d(m2, vog0.c(f3, f3, f4, f4));
                M.j();
            }
            v1.a(y0Var.a, y0Var.b, y0Var.c, m, M, 0);
            if (list2.isEmpty()) {
                M.K(44463659);
            } else {
                M.K(50060864);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 f5 = txj0.f(s200.H(hr80.m(aVar3, ylu0Var3.getBackground().x, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                float f6 = 20;
                float f7 = 0;
                q630 d = rte0.d(f5, vog0.c(f6, f6, f7, f7));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                n2.a(i2 & 112, M, list2, izsVar, s200.H(hr80.m(d, ylu0Var4.getBackground().g, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 7));
            }
            M.j();
            if (y0Var.e) {
                M.K(50578812);
                String str = y0Var.g;
                String str2 = y0Var.h;
                boolean z2 = y0Var.j;
                String str3 = y0Var.i;
                q630 d2 = txj0.d(aVar3, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    z = false;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    z = false;
                }
                ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m3 = hr80.m(d2, ylu0Var5.getBackground().g, aVar2);
                boolean z3 = (i2 & 112) == 32 ? true : z;
                Object x = M.x();
                if (z3 || x == a.C0011a.a) {
                    x = new w2(izsVar, 0);
                    M.R(x);
                }
                w0.a(str, str2, str3, z2, (gzs) x, m3, M, 0);
                M = M;
            } else {
                M.K(44463659);
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
            s.d = new x2(y0Var, izsVar, i, 0);
        }
    }

    public static final void b(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1918669854);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1918669854, i2, -1, "com.vk.superapp.presentation.about.compose.ErrorScreen (AboutAppStateContentView.kt:99)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            long j = wlb0.h(M).getBackground().x;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(f, j, aVar3);
            float f2 = 0;
            float f3 = 20;
            x1.a(rte0.d(m, vog0.c(f2, f2, f3, f3)), M, 0);
            a1.a((i2 << 3) & 112, M, gzsVar, hr80.m(rte0.d(txj0.d(s200.H(hr80.m(aVar2, wlb0.h(M).getBackground().x, aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), vog0.c(f3, f3, f2, f2)), wlb0.h(M).getBackground().g, aVar3));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y2(gzsVar, i, 0);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1034694134);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1034694134, i, -1, "com.vk.superapp.presentation.about.compose.LoadingScreen (AboutAppStateContentView.kt:118)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            long j = wlb0.h(M).getBackground().x;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(f, j, aVar3);
            float f2 = 0;
            float f3 = 20;
            x1.a(wdj0.a(rte0.d(m, vog0.c(f2, f2, f3, f3)), null), M, 0);
            c1.a(wdj0.a(hr80.m(rte0.d(txj0.d(s200.H(hr80.m(aVar2, wlb0.h(M).getBackground().x, aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), vog0.c(f3, f3, f2, f2)), wlb0.h(M).getBackground().g, aVar3), null), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z2(i, 0);
        }
    }
}
