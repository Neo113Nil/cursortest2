package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.jpl0;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: StorefrontBlocked.kt */
/* loaded from: classes18.dex */
public final class fll0 {
    public static final void a(jpl0.a.b bVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        String f;
        androidx.compose.runtime.a M = aVar.M(-1561118690);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1561118690, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontBlockedContent (StorefrontBlocked.kt:19)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(bVar.a, null, null, null, M, 196608, 30);
            Integer num = bVar.b;
            if (num == null) {
                M.K(1868343978);
                M.j();
                f = null;
            } else {
                f = l4.f(M, 1868343979, num, M, 0);
            }
            if (f == null) {
                f = "";
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zyf(izsVar, 6);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(null, null, a, wra0.b.a(wra0.a.C3954a.a(f, (gzs) x, null, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, aVar2, 27648, 12582912, 131044), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
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
            s.d = new rv7(bVar, izsVar, i, 8);
        }
    }
}
