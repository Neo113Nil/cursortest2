package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PlaylistTopBar.kt */
/* loaded from: classes3.dex */
public final class peb0 {
    public final wh50<Integer> a;
    public final mtk0<Boolean> b;
    public final mtk0<Boolean> c;
    public final mtk0<h9b0> d;
    public final String e;
    public final aab0 f;
    public final f9b0 g;
    public final gzs<s3q0> h;
    public final gzs<s3q0> i;
    public final gzs<s3q0> j;

    public peb0(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, String str, aab0 aab0Var, f9b0 f9b0Var, gzs gzsVar, gzs gzsVar2, mnc mncVar) {
        this.a = wh50Var;
        this.b = wh50Var2;
        this.c = wh50Var3;
        this.d = wh50Var4;
        this.e = str;
        this.f = aab0Var;
        this.g = f9b0Var;
        this.h = gzsVar;
        this.i = gzsVar2;
        this.j = mncVar;
    }

    public final void a(final szm szmVar, final zfe0 zfe0Var, final mtk0 mtk0Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1714690913);
        int i2 = (M.J(szmVar) ? 4 : 2) | i | (M.y(zfe0Var) ? 32 : 16) | (M.J(mtk0Var) ? 256 : 128) | 3072 | (M.J(this) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1714690913, i2, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistTopBar.Component (PlaylistTopBar.kt:50)");
            }
            final float j1 = ((azl) M.r(uvi.h)).j1(this.a.getValue().intValue());
            a8q.a(szmVar, kai.c(485397100, new wzs() { // from class: xsna.meb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(485397100, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistTopBar.Component.<anonymous> (PlaylistTopBar.kt:57)");
                        }
                        peb0 peb0Var = peb0.this;
                        peb0Var.b(mtk0Var, j1, peb0Var.d.getValue().b, peb0Var.c.getValue().booleanValue(), aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(1667629835, new wzs() { // from class: xsna.neb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1667629835, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistTopBar.Component.<anonymous> (PlaylistTopBar.kt:65)");
                        }
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630.a aVar3 = q630.a.a;
                        q630 c = qri.c(aVar2, aVar3);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        peb0 peb0Var = this;
                        h9b0 value = peb0Var.d.getValue();
                        aab0 aab0Var = peb0Var.f;
                        f9b0 f9b0Var = peb0Var.g;
                        String str = peb0Var.e;
                        gzs<s3q0> gzsVar = peb0Var.j;
                        float f = j1;
                        y9b0.e(f, value, aab0Var, f9b0Var, null, str, gzsVar, aVar2, 0);
                        vfe0.b(peb0Var.b.getValue().booleanValue(), zfe0Var, s200.H(ra8.a.b(aVar3, dt1.a.c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, 0L, aVar2, 64);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | X2.b.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(szmVar, zfe0Var, mtk0Var, q630Var2, i) { // from class: xsna.oeb0
                public final /* synthetic */ szm c;
                public final /* synthetic */ zfe0 d;
                public final /* synthetic */ mtk0 e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(65);
                    peb0.this.a(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(final mtk0<Float> mtk0Var, final float f, final String str, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var;
        int i2;
        int i3;
        int i4;
        a.C0011a.C0012a c0012a;
        TopBar$Before.e eVar;
        com.vk.core.compose.component.topbar.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1808439971);
        int i5 = i | (M.J(mtk0Var) ? 4 : 2) | (M.n(f) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(this) ? 16384 : 8192);
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1808439971, i5, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistTopBar.PinnedAppBar (PlaylistTopBar.kt:93)");
            }
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            k.a.C0761a c0761a = k.a.C0761a.a;
            boolean m = skd.m(M);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (m) {
                M.K(-834227221);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.music_talkback_go_back, 0, M);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new tcu(18);
                    M.R(x);
                }
                q630Var = H;
                i2 = i5;
                c0012a = c0012a2;
                i4 = 0;
                i3 = -1;
                TopBar$Before.e a = TopBar$Before.e.a.a(b, N, this.h, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 1572872, 24);
                M = M;
                M.j();
                eVar = a;
            } else {
                q630Var = H;
                i2 = i5;
                i3 = -1;
                i4 = 0;
                c0012a = c0012a2;
                M.K(-833802150);
                M.j();
                eVar = null;
            }
            androidx.compose.runtime.a aVar3 = M;
            androidx.compose.runtime.a aVar4 = aVar3;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, aVar3, ((i2 >> 6) & 14) | 196608, 30), null, null, null, aVar4, 14);
            TopBar$Middle.a aVar5 = TopBar$Middle.a.c;
            if (z) {
                aVar4.K(-833577523);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(950398620, i4, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_28, i4, aVar4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N2 = d370.N(R.string.music_talkback_playlist_options, i4, aVar4);
                Object x2 = aVar4.x();
                if (x2 == c0012a) {
                    x2 = new ehu(20);
                    aVar4.R(x2);
                }
                d.c.C0760d a4 = d.c.C0760d.a.a(a3, N2, this.i, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar4, 1572872, 24);
                aVar4 = aVar4;
                aVar2 = d.a.a(a4, null, null, null, aVar4, 24576, 14);
                aVar4.j();
            } else {
                aVar4.K(-833062118);
                aVar4.j();
                aVar2 = null;
            }
            androidx.compose.runtime.a aVar6 = aVar4;
            muv0.h(a2, q630Var, c0761a, aVar5, null, eVar, aVar2, null, false, 0L, mtk0Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, 3456, i2 & 14, 7056);
            M = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(mtk0Var, f, str, z, i) { // from class: xsna.leb0
                public final /* synthetic */ mtk0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    peb0.this.b(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
