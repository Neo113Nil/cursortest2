package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: LinkVKBidScreenEmpty.kt */
/* loaded from: classes18.dex */
public final class acz {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1145728549);
        int i2 = i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1145728549, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreenEmpty (LinkVKBidScreenEmpty.kt:25)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            t8p0 a = csa0.a(qzu0.q0(M), 0L, byc0.b(128, 110), null, null, M, 200072, 18);
            vl20 a2 = zra0.a.a(d370.N(R.string.empty_vk_bid_title, 0, M), null, d370.N(R.string.empty_vk_bid_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.create_vkbid_profile, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new j97(izsVar, 3);
                M.R(x);
            }
            r48 a3 = wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28032, 12582912, 131040);
            M = M;
            ldv0.d(q630.a.a, a, a2, wra0.b.a(a3, null, null, M, 14), null, null, false, M, 6, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yku(q630Var, izsVar, i, 2);
        }
    }
}
