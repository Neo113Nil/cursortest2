package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: TemplateDetailsToolbar.kt */
/* loaded from: classes3.dex */
public final class s8o0 {
    public static final void a(c8p0 c8p0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-144290122);
        int i4 = (M.J(c8p0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-144290122, i4, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsToolbar (TemplateDetailsToolbar.kt:17)");
            }
            if (c8p0Var.a) {
                i2 = -1223844342;
                i3 = R.string.template_details_title_edit;
            } else {
                i2 = -1223841975;
                i3 = R.string.template_details_title_new;
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(zq.a(M, i2, i3, M, 0), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.vk_back, 0, M);
            boolean z = (i4 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new to0(izsVar, 4);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, N, null, null, null, M, 196608, 28);
            q630Var2 = q630.a.a;
            muv0.h(a, q630Var2, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xwl(c8p0Var, izsVar, q630Var2, i);
        }
    }
}
