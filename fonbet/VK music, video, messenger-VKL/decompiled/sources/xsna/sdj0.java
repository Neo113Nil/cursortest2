package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.common.ui.compose.TextHeight;
import xsna.q630;

/* compiled from: Shimmer.kt */
/* loaded from: classes18.dex */
public final class sdj0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-886321836);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-886321836, i, -1, "com.vk.ecomm.cart.impl.common.ui.compose.DividerSkeleton (Shimmer.kt:25)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), ylu0Var.p().a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fw9(q630Var, i, 4);
        }
    }

    public static final void b(final TextHeight textHeight, q630 q630Var, pco pcoVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 f;
        androidx.compose.runtime.a M = aVar.M(-351925674);
        if ((i & 6) == 0) {
            i3 = (M.o(textHeight.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(pcoVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (i5 != 0) {
                pcoVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-351925674, i3, -1, "com.vk.ecomm.cart.impl.common.ui.compose.TextSkeleton (Shimmer.kt:39)");
            }
            float f2 = textHeight == TextHeight.SMALL ? 2 : 4;
            q630 h = txj0.h(q630Var, textHeight.h());
            if (pcoVar == null || (f = txj0.v(h, pcoVar.b)) == null) {
                f = txj0.f(h, 1.0f);
            }
            q630 d = rte0.d(f, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().a, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        final pco pcoVar2 = pcoVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rdj0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sdj0.b(TextHeight.this, q630Var2, pcoVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 c(q630 q630Var) {
        return qri.a(q630Var, a5x.a, new pbi(4));
    }
}
