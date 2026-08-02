package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;

/* compiled from: GroupDetailsActionButtons.kt */
/* loaded from: classes5.dex */
public final class sju {
    public static final void a(loh0.b bVar, c1h c1hVar, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        List<loh0.a> list = bVar.a;
        androidx.compose.runtime.a M = aVar.M(1992916900);
        int i2 = 256;
        int i3 = (M.J(bVar) ? 4 : 2) | i | (M.J(c1hVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1992916900, i3, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.CommunityDetailsBottomActionButtons (GroupDetailsActionButtons.kt:31)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new m4g(c1hVar, 27);
                M.R(x);
            }
            q630 E = s200.E(sv1.z(f, (izs) x), 16, 12);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            M.K(-2104145189);
            for (loh0.a aVar3 : list) {
                boolean J = ((i3 & 896) == i2) | M.J(aVar3);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new s(12, izsVar, aVar3);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                b(aVar3, gzsVar, new xpy(1.0f, true), M, 0);
                i2 = 256;
            }
            M.j();
            if (bVar.b) {
                M.K(-803728134);
                c((i3 >> 3) & 112, M, izsVar, !list.isEmpty());
            } else {
                M.K(-805892926);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qet(bVar, c1hVar, izsVar, i);
        }
    }

    public static final void b(loh0.a aVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        gzs gzsVar2 = gzsVar;
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar2.M(1810915617);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | (M.J(q630Var2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1810915617, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.DetailsActionButton (GroupDetailsActionButtons.kt:61)");
            }
            ButtonStyle buttonStyle = aVar.c ? ButtonStyle.Primary : ButtonStyle.Secondary;
            if (aVar.e) {
                M.K(-96761407);
                arv.a(buttonStyle, gzsVar2, q630Var2, lgi.a, M, (i2 & 112) | 3072 | (i2 & 896), 0);
                M.j();
                gzsVar2 = gzsVar;
                q630Var2 = q630Var;
            } else {
                M.K(-96407077);
                gzsVar2 = gzsVar;
                bhu0.e(gzsVar2, ButtonSize.Medium, buttonStyle, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, d370.N(aVar.a, 0, M), aVar.d, null, null, null, false, null, null, null, M, ((i2 >> 3) & 14) | 3120 | ((i2 << 6) & 57344), 0, 0, 4181984);
                q630Var2 = q630Var;
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(aVar, gzsVar2, q630Var2, i);
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(1665521667);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1665521667, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.DetailsShowOnMapActionButton (GroupDetailsActionButtons.kt:93)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(2094441700);
                int i3 = i2;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                z2 = (i3 & 112) == 32;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new c97(izsVar, 4);
                    M.R(x);
                }
                arv.a(buttonStyle, (gzs) x, null, lgi.b, M, 3078, 4);
                aVar2 = M;
                aVar2.j();
            } else {
                M.K(2093966346);
                String N = d370.N(R.string.search_action_button_show_on_map, 0, M);
                qzu0.a.getClass();
                lg90 E0 = qzu0.E0(M);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                q630 f = txj0.f(q630.a.a, 1.0f);
                z2 = (i2 & 112) == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new y6h(izsVar, 2);
                    M.R(x2);
                }
                aVar2 = M;
                bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, f, null, false, false, null, null, null, N, null, E0, null, null, false, null, null, null, aVar2, 28080, 32768, 0, 4173792);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rju
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sju.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z);
                    return s3q0.a;
                }
            };
        }
    }
}
