package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InfoSettings.kt */
/* loaded from: classes5.dex */
public final class jww {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-150719061);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-150719061, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.InfoSettings (InfoSettings.kt:28)");
            }
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(rte0.d(s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7), vog0.b(20)), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            float f = 16;
            yqv0.c(d370.N(R.string.user_profile_information, 0, M), lr.c(dt1.a.o, s200.G(txj0.f(aVar3, 1.0f), f, 15, f, 9)), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).M, M, 0, 0, 8184);
            M.K(-328507537);
            ProfileSettingType[] values = ProfileSettingType.values();
            int length = values.length;
            int i4 = 0;
            while (i4 < length) {
                b(values[i4], izsVar, gzsVar, null, M, (i3 << 3) & 1008);
                i4++;
                aVar3 = aVar3;
            }
            q630Var2 = aVar3;
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qy9(izsVar, gzsVar, q630Var2, i);
        }
    }

    public static final void b(ProfileSettingType profileSettingType, izs izsVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        float r;
        androidx.compose.runtime.a M = aVar.M(-1184551718);
        if ((i & 6) == 0) {
            i2 = (M.o(profileSettingType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1184551718, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.SettingItem (InfoSettings.kt:57)");
            }
            if (((Boolean) gzsVar2.invoke()).booleanValue()) {
                M.K(-187859362);
                r = fsk.s(0, M);
            } else {
                M.K(-187858622);
                r = fsk.r(0, M);
            }
            M.j();
            String N = d370.N(profileSettingType.h(), 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long c = l5g.c(14, ylu0Var.getText().m, r);
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            boolean booleanValue = ((Boolean) gzsVar2.invoke()).booleanValue();
            plg0 plg0Var = new plg0(0);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ss3(10, izsVar, profileSettingType);
                M.R(x);
            }
            aVar2 = M;
            yqv0.c(N, s200.E(ojc.c(f, booleanValue, null, plg0Var, (gzs) x, 10), 16, 14), c, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
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
            s.d = new iww(profileSettingType, izsVar, gzsVar, q630Var2, i);
        }
    }
}
