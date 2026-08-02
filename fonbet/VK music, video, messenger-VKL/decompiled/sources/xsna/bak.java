package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;
import xsna.uxe0;

/* compiled from: CreateReviewInputRatingCell.kt */
/* loaded from: classes18.dex */
public final class bak {
    public static final void a(String str, int i, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(776870886);
        int i4 = (M.J(str) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(776870886, i4, -1, "com.vk.ecomm.design.compose.createreview.CreateReviewInputRatingCell (CreateReviewInputRatingCell.kt:31)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            b(str, null, M, i4 & 14);
            q630.a aVar3 = q630.a.a;
            if (a690.d(aVar3, 12, M, 6)) {
                androidx.compose.runtime.b.f(-1131013412, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite36> (VkSdkIcons.kt:860)");
            }
            lg90 b = or.b(M, -1949301, R.drawable.vk_icon_favorite_36, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i3 = i;
            rxe0.a(i3, b, izsVar, ahn.E(aVar3, "ratingView"), false, uxe0.a.a(M), M, ((i4 >> 3) & 14) | 64 | ((i4 >> 6) & 896), 16);
            izsVar2 = izsVar;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = i;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z9k(str, i3, q630Var, izsVar2, i2);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1983503408);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1983503408, i4, -1, "com.vk.ecomm.design.compose.createreview.RatingViewTitle (CreateReviewInputRatingCell.kt:46)");
            }
            us2.b b = xga0.b(-818700352, M);
            VkColorToken vkColorToken = VkColorToken.TextSubhead;
            VkTypographyToken vkTypographyToken = VkTypographyToken.SubheadNormal;
            int m = b.m(bkt0.c(new klv0(vkTypographyToken, vkColorToken), M));
            try {
                b.g(str);
                s3q0 s3q0Var = s3q0.a;
                b.k(m);
                m = b.m(bkt0.c(new klv0(vkTypographyToken, VkColorToken.TextNegative), M));
                try {
                    b.g(" *");
                    b.k(m);
                    us2 n = b.n();
                    M.j();
                    q630Var2 = q630.a.a;
                    yqv0.d(n, q630Var2, 0L, 0, null, 0, false, 0, null, null, null, M, i4 & 112, 0, 16380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i3 = 0;
                } finally {
                }
            } finally {
            }
        } else {
            i3 = 0;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aak(str, q630Var2, i, i3);
        }
    }
}
