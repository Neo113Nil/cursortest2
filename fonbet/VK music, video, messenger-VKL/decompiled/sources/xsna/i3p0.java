package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: Toolbar.kt */
/* loaded from: classes7.dex */
public final class i3p0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(654664121);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(654664121, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.toolbar.Toolbar (Toolbar.kt:17)");
            }
            String N = d370.N(R.string.video_add_to_playlist, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new uuz(29);
                M.R(x);
            }
            com.vk.core.compose.component.topbar.a aVar2 = null;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(N, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14), null, null, null, M, 14);
            androidx.compose.runtime.a aVar3 = M;
            Object x2 = aVar3.x();
            if (x2 == c0012a) {
                x2 = new hyu(25);
                aVar3.R(x2);
            }
            TopBar$Before.e a2 = e.a.a(gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar3, (i3 & 14) | 196608, 14);
            if (gzsVar2 != null) {
                aVar3.K(-346900319);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                }
                lg90 b = or.b(aVar3, -1058716730, R.drawable.vk_icon_add_24, aVar3, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                d.c.C0760d a3 = d.c.C0760d.a.a(b, null, gzsVar2, null, null, null, aVar3, 1572872 | ((i3 << 3) & 896), 58);
                aVar3 = aVar3;
                aVar2 = d.a.a(a3, null, null, null, aVar3, 24576, 14);
                aVar3.j();
            } else {
                aVar3.K(-346701299);
                aVar3.j();
            }
            com.vk.core.compose.component.topbar.a aVar4 = aVar2;
            q630.a aVar5 = q630.a.a;
            androidx.compose.runtime.a aVar6 = aVar3;
            muv0.h(a, aVar5, null, null, a2, null, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, 48, 0, 8108);
            M = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar5;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq2(i, 4, gzsVar, gzsVar2, q630Var2);
        }
    }
}
