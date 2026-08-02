package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DraftsListScreen.kt */
/* loaded from: classes18.dex */
public final class jeo {
    public static final void a(dlv0 dlv0Var, izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1561730283);
        int i2 = i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1561730283, i2, -1, "com.vk.draftslist.impl.ui.view.DraftsListScreen (DraftsListScreen.kt:29)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d2 = txj0.d(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d2, kai.c(-2031158988, new vp4(izsVar, 3), M), null, kai.c(-1747173450, new jb5(dlv0Var, 7), M), null, 0, ylu0Var.getBackground().g, 0L, jaiVar, aVar2, 805309494, 372);
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
            s.d = new heo(i, 0, dlv0Var, izsVar, jaiVar);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1390422422);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1390422422, i, -1, "com.vk.draftslist.impl.ui.view.LoadingErrorSnackbar (DraftsListScreen.kt:82)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(797276564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircle24> (VkSdkIcons.kt:796)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_error_circle_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            okv0.b(wlb0.m(d370.N(R.string.loading_error, 0, M), null, null, M, 6), null, s200.z(a, ylu0Var.getIcon().h, M), null, null, M, 0, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new log(i, 4);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1650177399);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1650177399, i2, -1, "com.vk.draftslist.impl.ui.view.Toolbar (DraftsListScreen.kt:56)");
            }
            String N = d370.N(R.string.talkback_ic_back, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new jr3(14);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new lq0(izsVar, 4);
                M.R(x2);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x2, N, null, null, a, M, 196608, 12);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new v7(27);
                M.R(x3);
            }
            int i3 = i2 & 14;
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(str, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, i3 | 196608, 14);
            boolean z2 = i3 == 4;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new ieo(str, 0);
                M.R(x4);
            }
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), M, 6);
            q630Var2 = q630.a.a;
            muv0.h(a4, q630Var2, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
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
            s.d = new oq0(i, str, izsVar, q630Var2);
        }
    }
}
