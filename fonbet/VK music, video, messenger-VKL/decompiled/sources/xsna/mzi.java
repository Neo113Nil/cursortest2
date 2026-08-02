package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.q630;

/* compiled from: ConfigureItemListComposeView.kt */
/* loaded from: classes18.dex */
public final class mzi {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        TopBar$Before.e eVar;
        androidx.compose.runtime.a M = aVar.M(1067647615);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1067647615, i2, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.Toolbar (ConfigureItemListComposeView.kt:86)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1043637078, 0, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.rememberIsMobileUI (ConfigureItemListComposeView.kt:102)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                HashSet hashSet = iah0.a;
                x = Boolean.valueOf(fnj.c(context));
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (booleanValue) {
                M.K(2057485270);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_accessibility_back, 0, M);
                boolean z = (i2 & 112) == 32;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new i74(izsVar, 1);
                    M.R(x2);
                }
                eVar = TopBar$Before.e.a.a(b, N, (gzs) x2, null, null, null, M, 1572872, 56);
                M.j();
            } else {
                M.K(2057780606);
                M.j();
                eVar = null;
            }
            TopBar$Before.e eVar2 = eVar;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M = M;
            muv0.h(a, q630.a.a, null, null, null, eVar2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cx(str, izsVar, i, 5);
        }
    }
}
