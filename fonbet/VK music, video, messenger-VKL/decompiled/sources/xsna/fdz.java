package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LinkVkBidBottomBar.kt */
/* loaded from: classes18.dex */
public final class fdz {
    public static final void a(final boolean z, final boolean z2, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2073759073);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2073759073, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVkBidBottomBar (LinkVkBidBottomBar.kt:26)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            String str = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            boolean z3 = !z && z2;
            if (z) {
                M.K(1847679177);
                M.j();
            } else {
                str = zq.a(M, 1847722205, R.string.link_vkbid_profile, M, 0);
            }
            String str2 = str;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i3 = i2 & 7168;
            boolean z4 = i3 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                x = new u2(izsVar, 2);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, z, false, null, null, null, str2, null, null, null, null, z3, null, null, null, M, ((i2 << 21) & 29360128) | 28080, 0, 0, 4058976);
            f9t.e(txj0.h(aVar4, 12), M, 6);
            q630 f2 = txj0.f(aVar4, 1.0f);
            String N = d370.N(R.string.create_new_vkbid_profile, 0, M);
            ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
            boolean z5 = i3 == 2048;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new w2(izsVar, 5);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, f2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(z, z2, q630Var, izsVar, i) { // from class: xsna.edz
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    fdz.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
