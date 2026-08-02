package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.gl.tf.Tensorflow;
import xsna.lj40;
import xsna.q630;

/* compiled from: MusicDownloadsSettingsView.kt */
/* loaded from: classes3.dex */
public final class kj40 {
    public static final void a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(544546244);
        int i2 = (M.y(gzsVar2) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(544546244, i2, -1, "com.vk.music.offline.ui.presentation.ClearDownloadsAlert (MusicDownloadsSettingsView.kt:207)");
            }
            String N = d370.N(R.string.downloads_clear_dialog_title, 0, M);
            String N2 = d370.N(R.string.downloads_clear_dialog_subtitle, 0, M);
            String N3 = d370.N(R.string.downloads_clear_dialog_action_positive, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new h4(10, gzsVar2, gzsVar);
                M.R(x);
            }
            gzs gzsVar3 = (gzs) x;
            Alert$Button.Style style = Alert$Button.Style.Negative;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ulz(8);
                M.R(x2);
            }
            Alert$Button alert$Button = new Alert$Button(N3, gzsVar3, style, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3));
            String N4 = d370.N(R.string.downloads_clear_dialog_action_cancel, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new s6y(gzsVar, 10);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N4, (gzs) x3, Alert$Button.Style.Neutral, null);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new hj40(0, gzsVar);
                M.R(x4);
            }
            t7u0.d(384, 336, M, alert$Button, alert$Button2, null, null, N, N2, null, (izs) x4, q630.a.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yf4(gzsVar, gzsVar2, i, 5);
        }
    }

    public static final void b(lj40.a aVar, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        String f;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        q630 j;
        androidx.compose.runtime.a M = aVar2.M(958199662);
        int i2 = (M.J(aVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958199662, i2, -1, "com.vk.music.offline.ui.presentation.ClearDownloadsOption (MusicDownloadsSettingsView.kt:175)");
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(d370.N(aVar.d(), 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            Integer b = aVar.b();
            String str = null;
            if (b == null) {
                M.K(1373838361);
                M.j();
                f = null;
            } else {
                f = l4.f(M, 1373838362, b, M, 0);
            }
            if (f == null) {
                M.K(1373867532);
                M.j();
                h1Var = null;
            } else {
                M.K(1373867533);
                com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(f, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                h1Var = b2;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new u620(6);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, h1Var, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 12);
            M.K(1706894934);
            String a3 = aVar.a();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new gzn(20);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.s0 a4 = com.vk.core.compose.component.cell.content.m.a(a3, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 384, 0);
            M.j();
            M.K(1706903652);
            Integer b3 = aVar.b();
            if (b3 == null) {
                M.K(-651073858);
                M.j();
            } else {
                str = l4.f(M, -651073857, b3, M, 0);
            }
            q630Var = q630.a.a;
            q630 q630Var2 = (str == null || (j = txj0.j((float) 58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var)) == null) ? q630Var : j;
            M.j();
            wiu0.b(ojc.c(q630Var2, aVar.c(), null, null, gzsVar, 14), false, null, a2, a4, null, null, M, 0, 102);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new jj40(aVar, q630Var, gzsVar, i);
        }
    }

    public static final void c(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-499588120);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-499588120, i2, -1, "com.vk.music.offline.ui.presentation.GroupHeader (MusicDownloadsSettingsView.kt:120)");
            }
            com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, M, (i2 & 14) | 805306368, 510), q630Var, b.d.a, null, null, null, false, M, Tensorflow.FRAME_WIDTH, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vfr(str, q630Var, i, 1);
        }
    }

    public static final void d(final int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, boolean z) {
        final gzs gzsVar2;
        final boolean z2;
        final q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(302998172);
        int i4 = (M.l(z) ? 4 : 2) | i | 48 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(302998172, i4, -1, "com.vk.music.offline.ui.presentation.MobileNetworkDownloadOption (MusicDownloadsSettingsView.kt:134)");
            }
            if (z) {
                i2 = -1402522310;
                i3 = R.string.downloads_on_accessibility;
            } else {
                i2 = -1402440935;
                i3 = R.string.downloads_off_accessibility;
            }
            String a = zq.a(M, i2, i3, M, 0);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(d370.N(R.string.downloads_by_network_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(d370.N(R.string.downloads_by_network_subtitle, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pqz(6);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, b, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 12);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new svz(8);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.t0 a4 = com.vk.core.compose.component.cell.content.n.a(z, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, (i4 & 14) | 24576, 6);
            z2 = z;
            boolean J = M.J(a);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new x43(a, 3);
                M.R(x3);
            }
            q630Var2 = q630.a.a;
            q630 b2 = egi0.b(q630Var2, false, (izs) x3);
            txj0.j(74, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, b2);
            q630 c = ojc.c(b2, false, null, null, gzsVar, 15);
            gzsVar2 = gzsVar;
            wiu0.b(c, false, null, a3, a4, null, null, M, 0, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            z2 = z;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar2, q630Var2, z2) { // from class: xsna.ij40
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;

                {
                    this.b = z2;
                    this.c = q630Var2;
                    this.d = gzsVar2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kj40.d(ne7.I(1), (androidx.compose.runtime.a) obj, this.d, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(lj40 lj40Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(660692276);
        if ((i & 6) == 0) {
            i2 = (M.J(lj40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(660692276, i3, -1, "com.vk.music.offline.ui.presentation.MusicSettingsView (MusicDownloadsSettingsView.kt:56)");
            }
            rrv0.d(null, null, null, null, kai.c(1312738393, new e7c(lj40Var, izsVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bg4(lj40Var, izsVar, q630Var2, i, 4);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-352458329);
        int i2 = i | (M.J(str) ? 4 : 2) | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-352458329, i2, -1, "com.vk.music.offline.ui.presentation.ToolbarView (MusicDownloadsSettingsView.kt:98)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bws(5);
                M.R(x);
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, (i2 & 14) | 196608, 14), null, null, null, M, 14);
            String N = d370.N(R.string.vk_back, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new q520(3);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            boolean z = (i2 & 896) == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new zn1(izsVar, 7);
                M.R(x3);
            }
            TopBar$Before.e a3 = e.a.a((gzs) x3, N, null, null, a2, M, 196608, 12);
            q630.a aVar2 = q630.a.a;
            muv0.h(a, ahn.E(aVar2, "downloads_settings_appbar"), null, null, a3, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tnc(i, 4, str, q630Var2, izsVar);
        }
    }
}
