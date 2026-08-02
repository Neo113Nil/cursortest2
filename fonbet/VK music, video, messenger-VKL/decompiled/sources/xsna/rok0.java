package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.fullscreenvideo.design.view.bottom.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: StackedImages.kt */
/* loaded from: classes16.dex */
public final class rok0 {
    public static final void a(final float f, final int i, androidx.compose.runtime.a aVar, final q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1294143416);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1294143416, i, -1, "com.vk.fullscreenvideo.bottom.BackgroundBorderItem (StackedImages.kt:45)");
            }
            float f2 = 8;
            q630 d = rte0.d(txj0.h(q630Var, 1.6f), vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, l5g.c(14, ylu0Var.m().c, f), androidx.compose.ui.graphics.e.a), M, 0);
            if (a690.d(q630.a.a, 1.4f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, i, q630Var) { // from class: xsna.qok0
                public final /* synthetic */ float b;
                public final /* synthetic */ q630 c;

                {
                    this.c = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    rok0.a(this.b, I, (androidx.compose.runtime.a) obj, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1205159056);
        int i2 = (M.J(str) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1205159056, i2, -1, "com.vk.fullscreenvideo.bottom.StackedImage (StackedImages.kt:64)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            a(0.3f, 54, M, txj0.v(aVar2, 16.0f));
            a(0.6f, 54, M, txj0.v(aVar2, 30.0f));
            lg90 l = fwu0.l(null, str, null, null, M, (i2 << 3) & 112, 61);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.m().c;
            float f = 8;
            q630 h = txj0.h(txj0.v(r18.a(1.6f, j, aVar2, vog0.b(f)), 50), 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d = rte0.d(hr80.m(h, ylu0Var2.getImage().b, vog0.b(f)), vog0.b(f));
            q630Var2 = aVar2;
            r0v0.a(l, d, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12582920, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wja(str, q630Var2, i, 9);
        }
    }

    public static final void c(xow xowVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> z7dVar;
        androidx.compose.runtime.a M = aVar.M(477518818);
        int c = M.c();
        if ((i & 6) == 0) {
            i2 = (M.J(xowVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(477518818, i2, -1, "com.vk.fullscreenvideo.bottom.StackedImages (StackedImages.kt:26)");
            }
            if (xowVar.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s == null) {
                    return;
                } else {
                    z7dVar = new jnc(xowVar, q630Var, i, 2);
                }
            } else {
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.i;
                q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 5);
                cp10 d = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, H);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                M.K(439469963);
                a.C1075a c1075a = (a.C1075a) j5g.a0(xowVar);
                String str = c1075a != null ? c1075a.a : null;
                if (str == null) {
                    M.C(c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s == null) {
                        return;
                    } else {
                        z7dVar = new knc(xowVar, q630Var, i, 5);
                    }
                } else {
                    b(str, null, M, 0);
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            s.d = z7dVar;
        }
        M.h();
        s = M.s();
        if (s != null) {
            z7dVar = new z7d(xowVar, q630Var, i, 4);
            s.d = z7dVar;
        }
    }
}
