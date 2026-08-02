package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: RatingContent.kt */
/* loaded from: classes18.dex */
public final class zxe0 {
    public final kg50 a;
    public final wh50 b;
    public final wh50 c;

    /* compiled from: RatingContent.kt */
    public static final class a {
        public static zxe0 a(float f, int i, int i2, androidx.compose.runtime.a aVar, String str) {
            boolean z = (i2 & 4) == 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2141507914, i, -1, "com.vk.ecomm.design.compose.tile.impl.description.RatingContent.Companion.invoke (RatingContent.kt:102)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new zxe0(f, str, z);
                aVar.R(x);
            }
            zxe0 zxe0Var = (zxe0) x;
            ((vak0) zxe0Var.a).g(f);
            ((zak0) zxe0Var.b).setValue(str);
            ((zak0) zxe0Var.c).setValue(Boolean.valueOf(z));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return zxe0Var;
        }
    }

    public zxe0(float f, String str, boolean z) {
        this.a = androidx.compose.runtime.d.a(f);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1142207049);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1142207049, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.RatingContent.Content (RatingContent.kt:44)");
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 1, q630Var);
            if (!((Boolean) ((zak0) this.c).getValue()).booleanValue()) {
                f = 1.0f;
            }
            q630 a2 = o19.a(F, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            k9q0.w(M, a3, cri.a.f);
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
            String N = d370.N(R.string.ecomm_good_rating_accessibility, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, N, null, ylu0Var.q().i, M, 8, 4);
            int i3 = (i2 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1136360669, i3, -1, "com.vk.ecomm.design.compose.tile.impl.description.RatingContent.buildRatingTitle (RatingContent.kt:67)");
            }
            us2.b b2 = xga0.b(1120913221, M);
            int m = b2.m(bkt0.c(new klv0(VkTypographyToken.Caption1Medium, VkColorToken.TextSubhead), M));
            try {
                b2.g(brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((vak0) this.a).getFloatValue())}, 1)), ".", StringUtils.COMMA));
                s3q0 s3q0Var = s3q0.a;
                b2.k(m);
                VkColorToken vkColorToken = VkColorToken.TextTertiary;
                VkTypographyToken vkTypographyToken = VkTypographyToken.Caption1;
                m = b2.m(bkt0.c(new klv0(vkTypographyToken, vkColorToken), M));
                try {
                    b2.g(" · ");
                    b2.k(m);
                    m = b2.m(bkt0.c(new klv0(vkTypographyToken, vkColorToken), M));
                    try {
                        b2.g((String) ((zak0) this.b).getValue());
                        b2.k(m);
                        us2 n = b2.n();
                        M.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2 = M;
                        yqv0.d(n, ahn.E(s200.H(q630.a.a, kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "product_review_rating"), 0L, 0, null, 0, false, 0, null, null, null, aVar2, 0, 0, 16380);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wbi(this, q630Var, i, 9);
        }
    }
}
