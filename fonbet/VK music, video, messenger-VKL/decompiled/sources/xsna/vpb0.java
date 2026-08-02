package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;

/* compiled from: PollEditorToolbar.kt */
/* loaded from: classes4.dex */
public final class vpb0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1642072153);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1642072153, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorToolbar (PollEditorToolbar.kt:20)");
            }
            boolean z = gzsVar != null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2103490279, 0, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.getSaveButtonDescription (PollEditorToolbar.kt:56)");
            }
            String N = d370.N(z ? R.string.poll_editor_toolbar_ready_button_accessibility : R.string.poll_editor_toolbar_ready_button_disabled_accessibility, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 f = txj0.f(q630Var, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new f1s(19);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            String N2 = d370.N(R.string.poll_editor_toolbar_accessibility_close, 0, M);
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new upb0(0, gzsVar2);
                M.R(x2);
            }
            TopBar$Before.d a2 = TopBar$Before.d.a.a(N2, (gzs) x2, null, a, M, 24576, 4);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.poll_editor_toolbar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            qzu0.a.getClass();
            lg90 G = qzu0.G(M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new x620(14);
                M.R(x3);
            }
            muv0.h(a3, f, null, null, null, a2, d.a.a(d.c.C0760d.a.a(G, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 1572872 | ((i2 << 6) & 896), 24), null, null, null, M, 24576, 14), null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 100663296, 0, 7836);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g6i(i, 2, gzsVar, gzsVar2, q630Var);
        }
    }
}
