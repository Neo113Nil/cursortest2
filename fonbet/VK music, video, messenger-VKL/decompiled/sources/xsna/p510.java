package xsna;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.ldj0;
import xsna.q630;
import xsna.ty6;

/* compiled from: MarketItemsForReviewComposeLoadingScreen.kt */
/* loaded from: classes18.dex */
public final class p510 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1491163229);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1491163229, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeLoadingScreen (MarketItemsForReviewComposeLoadingScreen.kt:30)");
            }
            q630Var2 = q630.a.a;
            float f = 34;
            q630 a = wdj0.a(s200.H(txj0.f(q630Var2, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 40, 2), xx1.D(ldj0.b.a, tjv0.a((tjv0) M.r(ujv0.b), jq2.a(4, 0L, RepeatMode.Restart, jq2.d(900, 0, luo.d, 2)), 0, null, null, 100, 26), M, 64, 0));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f2 = txj0.f(q630Var2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = 16;
            q630 m = hr80.m(f2, ylu0Var.getBackground().B, vog0.b(f3));
            float f4 = (float) 0.33d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a3 = r18.a(f4, ylu0Var2.getImage().a, m, vog0.b(f3));
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, a3);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            f9t.e(txj0.h(q630Var2, 28), M, 6);
            b(128, 152, 10, M, 438, 0);
            f9t.e(txj0.h(q630Var2, 8), M, 6);
            float f5 = 12;
            b(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 54, 4);
            f9t.e(txj0.h(q630Var2, 2), M, 6);
            b(176, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 54, 4);
            f9t.e(txj0.h(q630Var2, 18), M, 6);
            rxe0.b(null, M, 0);
            f9t.e(txj0.h(q630Var2, 30), M, 6);
            b(130, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 54, 4);
            f9t.e(txj0.h(q630Var2, 24), M, 6);
            M.G();
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
            s.d = new com.vk.movika.tools.controls.seekbar.w(q630Var2, i, 12);
        }
    }

    public static final void b(final float f, final float f2, float f3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1389125285);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
        } else if ((i & 384) == 0) {
            i3 = (M.n(f3) ? 256 : 128) | i;
        } else {
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                f3 = 4;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1389125285, i3, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.SkeletonItem (MarketItemsForReviewComposeLoadingScreen.kt:88)");
            }
            q630 s = txj0.s(q630.a.a, f, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(s, ylu0Var.c().a, vog0.b(f3)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final float f4 = f3;
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.o510
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p510.b(f, f2, f4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
