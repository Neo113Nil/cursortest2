package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.e0j;
import xsna.q630;

/* compiled from: ConfigureItemListContentView.kt */
/* loaded from: classes18.dex */
public final class rzi {
    public static final void a(e0j.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        izs izsVar2;
        izs izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(2005466334);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar3) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2005466334, i2, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.ConfigureItemListContentView (ConfigureItemListContentView.kt:33)");
            }
            wh50 d = jk50.d(aVar.a, new wow(EmptyList.b), M, 0);
            q630.a aVar3 = q630.a.a;
            q630 d2 = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 6;
            f9t.e(txj0.h(aVar3, f), M, 6);
            q630 f2 = txj0.f(aVar3, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d3 = defpackage.j0.d(1.0f, f2, true);
            int i3 = i2 & 112;
            boolean J = M.J(d) | (i3 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new d50(10, d, izsVar3);
                M.R(x);
            }
            q630.a aVar5 = aVar3;
            lqy.a(d3, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            f9t.e(txj0.h(aVar5, f), M, 6);
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f3 = txj0.f(aVar5, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            String N = d370.N(R.string.configure_item_list_add_button, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
            }
            lg90 b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                izsVar2 = izsVar;
                x2 = new dx(izsVar2, 2);
                M.R(x2);
            } else {
                izsVar2 = izsVar;
            }
            gzs gzsVar = (gzs) x2;
            izsVar3 = izsVar2;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, f3, null, false, false, b, null, null, N, null, null, null, null, false, null, null, null, M, 1073769904, 0, 0, 4189664);
            M = M;
            M.G();
            boolean c3 = xga0.c(aVar5, 12, M, 6);
            q630Var2 = aVar5;
            if (c3) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar5;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ex(aVar, izsVar3, q630Var2, i);
        }
    }
}
