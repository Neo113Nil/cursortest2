package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: MusicErrorWithOfflineOpening.kt */
/* loaded from: classes3.dex */
public final class xj40 {
    public static final void a(final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final q630 q630Var, boolean z, Integer num, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        Integer num2;
        int i4;
        final boolean z3;
        final Integer num3;
        androidx.compose.runtime.a M = aVar.M(1663837613);
        int i5 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= M.J(q630Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (M.l(z2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            num2 = num;
        } else {
            num2 = num;
            i4 = i3 | (M.J(num2) ? 16384 : 8192);
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z4 = i6 != 0 ? true : z2;
            Integer num4 = i7 != 0 ? null : num2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1663837613, i4, -1, "com.vk.music.playlist.display.presentation.MusicErrorWithOfflineOpening (MusicErrorWithOfflineOpening.kt:38)");
            }
            M.K(1220119971);
            float f = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            M.j();
            q630 m = hr80.m(q630Var, wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(txj0.h(kci.m(-20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 144), 1.0f);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-555009342, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationEndOfSubscriptionMusic144H> (VkIcons.kt:3796)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_end_of_subscription_music_144h, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vjw.a(a2, null, f2, null, f >= 600.0f ? wkj.a.c : wkj.a.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 104);
            float f3 = 32;
            yqv0.c(d370.N(num4 != null ? num4.intValue() : R.string.music_offline_mode_error_description, 0, M), s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 2, 0, null, wlb0.l(M).J, M, 48, 6, 7096);
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Accent, s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), null, false, false, null, null, null, d370.N(R.string.music_offline_mode_open_downloads, 0, M), null, null, null, null, false, null, null, null, M, (i4 & 14) | 28080, 0, 0, 4190176);
            M = M;
            if (z4) {
                M.K(316003446);
                q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                boolean z5 = (i4 & 112) == 32;
                Object x = M.x();
                if (z5 || x == a.C0011a.a) {
                    x = new i030(1, gzsVar2);
                    M.R(x);
                }
                yqv0.c(d370.N(R.string.music_offline_mode_update_page, 0, M), ojc.c(F, false, null, null, (gzs) x, 15), wlb0.h(M).getText().c, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).O, M, 0, 0, 8120);
                M = M;
            } else {
                M.K(312869067);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z3 = z4;
            num3 = num4;
        } else {
            M.h();
            z3 = z2;
            num3 = num2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wj40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xj40.a(gzs.this, gzsVar2, q630Var, z3, num3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
