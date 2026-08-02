package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.notifications.core.item.a;
import xsna.q630;

/* compiled from: NotificationBubbleContent.kt */
/* loaded from: classes4.dex */
public final class c870 {
    public static final void a(a.C1441a c1441a, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1013752255);
        if ((i & 6) == 0) {
            i2 = i | (M.J(c1441a) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1013752255, i3, -1, "com.vk.notifications.design.compose.list.common.NotificationBubbleContent (NotificationBubbleContent.kt:27)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().x;
            float f = 18;
            uog0 b = vog0.b(f);
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(aVar3, b);
            uog0 b2 = vog0.b(f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new k4(14, c1441a, izsVar);
                M.R(x);
            }
            aVar2 = M;
            uov0.b((gzs) x, d, b2, j, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, kai.c(2022087402, new com.vk.movika.tools.controls.seekbar.r(c1441a, 7), M), aVar2, 0, 48, 2032);
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
            s.d = new uq7(c1441a, izsVar, q630Var2, i, 1);
        }
    }
}
