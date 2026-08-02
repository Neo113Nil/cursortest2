package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GroupedNotificationListAppBar.kt */
/* loaded from: classes4.dex */
public final class xmu {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(-310387382);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-310387382, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListAppBar (GroupedNotificationListAppBar.kt:23)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            com.vk.core.compose.component.topbar.a aVar3 = null;
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a3 = TopBar$Before.e.a.a(b, d370.N(R.string.accessibility_back, 0, M), gzsVar, null, null, null, M, 1572872 | (i2 & 896), 56);
            androidx.compose.runtime.a aVar4 = M;
            if (z) {
                aVar4.K(1439269366);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, aVar4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                d.c.C0760d a5 = d.c.C0760d.a.a(a4, d370.N(R.string.accessibility_actions, 0, aVar4), gzsVar2, null, null, null, aVar4, 1572872 | ((i2 >> 3) & 896), 56);
                aVar4 = aVar4;
                aVar3 = d.a.a(a5, null, null, null, aVar4, 24576, 14);
                aVar4.j();
            } else {
                aVar4.K(1439607018);
                aVar4.j();
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            muv0.h(a2, null, null, null, null, a3, aVar3, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 0, 0, 8094);
            jqu0.a(txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), 1.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 6, 14);
            M = aVar5;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wmu(i, str, gzsVar, gzsVar2, q630Var, z);
        }
    }
}
