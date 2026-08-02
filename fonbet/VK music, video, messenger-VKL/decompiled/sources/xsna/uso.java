package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: DzenArticleViewError.kt */
/* loaded from: classes18.dex */
public final class uso {
    public static final void a(izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-737350941);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-737350941, i2, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticleViewError (DzenArticleViewError.kt:19)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(564743164, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntenna120> (VkSdkIcons.kt:1080)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_illustration_antenna_120, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = false;
            t8p0 a2 = csa0.a(a, 0L, 0L, null, null, M, 199688, 22);
            vl20 a3 = zra0.a.a(d370.N(R.string.vk_placeholder_no_network_title, 0, M), null, d370.N(R.string.vk_placeholder_no_network_subtitle, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.vk_placeholder_no_network_retry_action, 0, M);
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new k74(izsVar, 5);
                M.R(x);
            }
            r48 a4 = wra0.a.C3954a.a(N, (gzs) x, null, buttonStyle, null, false, null, null, null, null, null, null, false, false, null, null, M, 3072, 12582912, 131060);
            M = M;
            ldv0.d(null, a2, a3, wra0.b.a(a4, null, null, M, 14), PlaceholderMode.Primary, null, true, M, 1597440, 33);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new npd(izsVar, i);
        }
    }
}
