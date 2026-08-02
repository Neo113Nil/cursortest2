package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityReviewsRatingSnippetCell.kt */
/* loaded from: classes18.dex */
public final class nzh {
    public static final void a(xig0 xig0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(303516028);
        int i3 = (M.J(xig0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(303516028, i3, -1, "com.vk.ecomm.design.compose.ratingsnippet.CommunityReviewsRatingSnippetCell (CommunityReviewsRatingSnippetCell.kt:34)");
            }
            String N = d370.N(R.string.community_reviews_rating_snippet_review_count_accessibility, 0, M);
            boolean J = ((i3 & 14) == 4) | M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new nk0(10, N, xig0Var);
                M.R(x);
            }
            egi0.b(q630Var, false, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1364245404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite12> (VkSdkIcons.kt:830)");
            }
            lg90 b = or.b(M, -1040521013, R.drawable.vk_icon_favorite_12, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, ylu0Var.q().i, M, 56, 4);
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.v(aVar4, 4), M, 6);
            M.K(-2123099022);
            s8u0 s8u0Var = new s8u0(0);
            VkColorToken vkColorToken = VkColorToken.TextPrimary;
            VkTypographyToken vkTypographyToken = VkTypographyToken.Footnote;
            int i4 = s8u0Var.i(new klv0(vkTypographyToken, vkColorToken));
            try {
                s8u0Var.e(brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(xig0Var.a)}, 1)), ".", StringUtils.COMMA));
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i4);
                M.K(-2123088430);
                i4 = s8u0Var.i(new klv0(vkTypographyToken, VkColorToken.TextSecondary));
                try {
                    s8u0Var.e(" · ");
                    int i5 = xig0Var.b;
                    s8u0Var.e(d370.F(R.plurals.community_reviews_rating_snippet_review_count, i5, new Object[]{Integer.valueOf(i5)}, M, 0));
                    s8u0Var.f(i4);
                    M.j();
                    M.j();
                    aVar2 = M;
                    yqv0.d(s8u0Var.j(8, M), txj0.f(aVar4, 1.0f), 0L, 0, null, 2, false, 1, null, null, null, aVar2, 100663344, 6, 15100);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i2 = 2;
                } finally {
                }
            } finally {
            }
        } else {
            aVar2 = M;
            i2 = 2;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new z85(xig0Var, q630Var, i, i2);
        }
    }
}
