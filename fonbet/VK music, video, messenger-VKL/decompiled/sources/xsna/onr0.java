package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: VerificationStatusFragment.kt */
/* loaded from: classes18.dex */
public final class onr0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, final boolean z) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        lg90 b;
        oe7 oe7Var;
        ColorFilter porterDuffColorFilter;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ColorFilter porterDuffColorFilter2;
        final gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(-123076213);
        int i7 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16) | 384;
        if (M.t(i7 & 1, (i7 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-123076213, i7, -1, "com.vk.ecomm.verifiedseller.impl.screens.status.VerificationStatusContent (VerificationStatusFragment.kt:136)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z) {
                M.K(-1746608357);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1620945376, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CrownVerified56> (VkSdkIcons.kt:602)");
                }
                b = pg90.a(R.drawable.vk_icon_crown_verified_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1746552650);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
                }
                b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (z) {
                M.K(-1746454907);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().a;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter2 = re7.b(f870.H(j), z42.a(5));
                } else {
                    porterDuffColorFilter2 = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                }
                oe7Var = new oe7(j, 5, porterDuffColorFilter2);
                M.j();
            } else {
                M.K(-1746377438);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().l;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
                }
                oe7Var = new oe7(j2, 5, porterDuffColorFilter);
                M.j();
            }
            vjw.a(b, null, lr.c(dt1.a.o, txj0.v(aVar3, 56)), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, M, 24632, 40);
            int i8 = mnr0.j1;
            float f2 = 8;
            q630 f3 = txj0.f(s200.H(ahn.E(aVar3, "verification_status_title"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            if (z) {
                i2 = -1745729042;
                i3 = R.string.verification_status_premium_title;
            } else {
                i2 = -1745628788;
                i3 = R.string.verification_status_confirmed_title;
            }
            yqv0.c(zq.a(M, i2, i3, M, 0), f3, wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 48, 0, 8120);
            float f4 = 16;
            q630 f5 = txj0.f(s200.H(ahn.E(aVar3, "verification_status_description"), f4, f2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f);
            if (z) {
                i5 = -1745111832;
                i6 = R.string.verification_status_premium_description;
                i4 = 0;
            } else {
                i4 = 0;
                i5 = -1745005626;
                i6 = R.string.verification_status_confirmed_description;
            }
            yqv0.c(zq.a(M, i5, i6, M, i4), f5, wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 3, null, wlb0.l(M).m0, M, 0, 48, 6072);
            gzsVar2 = gzsVar;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(s200.H(ahn.E(aVar3, "verification_status_button"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), null, false, false, null, null, null, d370.N(R.string.verification_status_button, i4, M), null, null, null, null, false, null, null, null, M, ((i7 >> 3) & 14) | 28080, 0, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar2, q630Var2, z) { // from class: xsna.nnr0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ q630 d;

                {
                    this.b = z;
                    this.c = gzsVar2;
                    this.d = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    onr0.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.d, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
