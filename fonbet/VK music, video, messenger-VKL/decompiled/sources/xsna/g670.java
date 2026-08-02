package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;

/* compiled from: NonProfitOrganizationContent.kt */
/* loaded from: classes5.dex */
public final class g670 {

    /* compiled from: NonProfitOrganizationContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrganizationModalVariant.values().length];
            try {
                iArr[OrganizationModalVariant.NON_PROFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrganizationModalVariant.VERIFIED_NON_PROFIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(OrganizationModalVariant organizationModalVariant, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        long j;
        int i2;
        androidx.compose.runtime.a M = aVar.M(392669039);
        int i3 = i | (M.o(organizationModalVariant.ordinal()) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(392669039, i3, -1, "com.vk.profile.core.npo.NonProfitOrganizationContent (NonProfitOrganizationContent.kt:74)");
            }
            int i4 = ((i3 << 3) & 112) | 6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1217064427, i4, -1, "com.vk.profile.core.npo.getModalConfig (NonProfitOrganizationContent.kt:109)");
            }
            int[] iArr = a.$EnumSwitchMapping$0;
            int i5 = iArr[organizationModalVariant.ordinal()];
            if (i5 == 1) {
                M.K(1367815965);
                M.K(1367818104);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().l;
                M.j();
                M.j();
            } else {
                if (i5 != 2) {
                    throw alb0.c(1367814074, M);
                }
                M.K(1367820981);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().a;
                M.j();
            }
            int i6 = iArr[organizationModalVariant.ordinal()];
            if (i6 == 1) {
                i2 = R.string.non_profit_organization_verification_status_description;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.verified_and_non_profit_organization_verification_status_description;
            }
            int i7 = i2;
            int i8 = iArr[organizationModalVariant.ordinal()];
            if (i8 != 1 && i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bz20 bz20Var = new bz20(j, i7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_check_circle_outline_56, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            boolean J = M.J(bz20Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new q8w(bz20Var, 9);
                M.R(x);
            }
            vy20 a3 = qy20.c.a.a(a2, j, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2), M, 0);
            us2 us2Var = new us2(d370.N(R.string.non_profit_organization_verification_status_title, 0, M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1374287348, 6, -1, "com.vk.profile.core.npo.nonProfitModalDescription (NonProfitOrganizationContent.kt:131)");
            }
            String N = d370.N(i7, 0, M);
            M.K(-1765743663);
            M.j();
            us2 us2Var2 = new us2(N);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xy20 b = py20.a.b(us2Var, us2Var2, M, 384);
            ty20 a4 = oy20.b.a(oy20.a.C3478a.a(d370.N(R.string.profile_more_info, 0, M), gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, null, M, (i3 & 112) | 28032, 8160), null, false, M, 6);
            int i9 = (i3 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            q630.a aVar2 = q630.a.a;
            e5v0.a(gzsVar2, aVar2, a3, b, null, a4, false, false, null, M, i9, 464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f670(organizationModalVariant, gzsVar, gzsVar2, q630Var2, i);
        }
    }
}
