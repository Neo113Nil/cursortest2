package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: MusicPlaylistLoading.kt */
/* loaded from: classes3.dex */
public final class u150 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(485450481);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(485450481, i2, -1, "com.vk.music.playlist.display.presentation.EmptyPlaylistShimmer (MusicPlaylistLoading.kt:101)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 20;
            q630 d = rte0.d(txj0.d(aVar2, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = m(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a)));
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar2, 50), M, 6);
            k(12, null, new pco(256), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ib5(q630Var, i, 1);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-373161693);
        int i2 = (M.l(z) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-373161693, i2, -1, "com.vk.music.playlist.display.presentation.HeaderShimmer (MusicPlaylistLoading.kt:120)");
            }
            float f = 20;
            uog0 d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3);
            q630Var = q630.a.a;
            q630 d2 = rte0.d(q630Var, d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ua8.a(s200.H(hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, false, kai.c(1073950969, new yzs() { // from class: xsna.r150
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1073950969, intValue, -1, "com.vk.music.playlist.display.presentation.HeaderShimmer.<anonymous> (MusicPlaylistLoading.kt:127)");
                        }
                        if (pco.a(va8Var.j(), 600) > 0) {
                            aVar2.K(861967045);
                            aVar2.j();
                        } else {
                            aVar2.K(1274732454);
                            r4 = ((Configuration) aVar2.r(AndroidCompositionLocals_androidKt.a)).orientation == 2;
                            aVar2.j();
                        }
                        boolean z2 = z;
                        if (r4) {
                            aVar2.K(862110617);
                            u150.c(0, aVar2, null, z2);
                            aVar2.j();
                        } else {
                            aVar2.K(862164154);
                            u150.h(0, aVar2, null, z2);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, q630Var, z) { // from class: xsna.s150
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;

                {
                    this.b = z;
                    this.c = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.b(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, q630 q630Var, final boolean z) {
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1623929065);
        int i3 = (M.l(z) ? 4 : 2) | i | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1623929065, i3, -1, "com.vk.music.playlist.display.presentation.LandscapeHeader (MusicPlaylistLoading.kt:139)");
            }
            q630Var2 = q630.a.a;
            float f = 16;
            q630 m = m(txj0.z(s200.H(txj0.f(q630Var2, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2), null, 3));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            float f2 = y9b0.b;
            q630 d = rte0.d(txj0.q(q630Var2, f2), vog0.b(y9b0.a));
            if (androidx.compose.runtime.b.d()) {
                i2 = i3;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i2 = i3;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f3 = 20;
            q630 H = s200.H(txj0.h(new xpy(1.0f, true), f2), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar2, aVar3, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            f9t.e(txj0.h(q630Var2, 6), M, 6);
            i(z, aVar3, null, M, (i2 & 14) | 48);
            f9t.e(txj0.h(q630Var2, 24), M, 6);
            k(32, null, new pco(380), 10, M, 3462, 2);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, q630Var2, z) { // from class: xsna.l150
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;

                {
                    this.b = z;
                    this.c = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.c(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1718966724);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1718966724, i2, -1, "com.vk.music.playlist.display.presentation.MorePlaylistsShimmer (MusicPlaylistLoading.kt:300)");
            }
            q630Var2 = q630.a.a;
            float f = 20;
            q630 d = rte0.d(txj0.f(q630Var2, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            float f2 = 16;
            q630 m2 = m(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, m));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m2);
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
            k(f2, s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, 5), new pco(130), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, q630Var2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(141359824);
            for (int i3 = 0; i3 < 3; i3++) {
                f(null, M, 0);
                f9t.e(txj0.v(q630Var2, 12), M, 6);
            }
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ncb(q630Var2, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final izs izsVar, final wh50 wh50Var, q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        wh50 wh50Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(390389304);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            wh50Var2 = wh50Var;
            i2 |= M.J(wh50Var2) ? 32 : 16;
        } else {
            wh50Var2 = wh50Var;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.l(z2) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(390389304, i3, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistLoading (MusicPlaylistLoading.kt:56)");
            }
            final float j1 = ((azl) M.r(uvi.h)).j1(((Number) wh50Var2.getValue()).intValue());
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            phv0.b(aVar3, kai.c(-1005158063, new wzs() { // from class: xsna.o150
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    TopBar$Before.e eVar;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1005158063, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistLoading.<anonymous> (MusicPlaylistLoading.kt:63)");
                        }
                        q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        if (skd.m(aVar4)) {
                            aVar4.K(-151711127);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                            }
                            lg90 b = or.b(aVar4, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar4, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            String N = d370.N(R.string.music_talkback_go_back, 0, aVar4);
                            izs izsVar2 = izsVar;
                            boolean J = aVar4.J(izsVar2);
                            Object x = aVar4.x();
                            if (J || x == a.C0011a.a) {
                                x = new cc1(izsVar2, 6);
                                aVar4.R(x);
                            }
                            eVar = TopBar$Before.e.a.a(b, N, (gzs) x, null, null, null, aVar4, 1572872, 56);
                            aVar4.j();
                        } else {
                            aVar4.K(-151328340);
                            aVar4.j();
                            eVar = null;
                        }
                        muv0.h(TopBar$Middle.a.c, H, null, null, null, eVar, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 6, 0, 8156);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), null, null, null, 0, 0L, 0L, kai.c(-1880086436, new yzs() { // from class: xsna.p150
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1880086436, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistLoading.<anonymous> (MusicPlaylistLoading.kt:79)");
                        }
                        q630 C = s200.C(txj0.f(q630.a.a, 1.0f), s890Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(C, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
                        a.j g = androidx.compose.foundation.layout.a.g(8);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar4, 6);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a, cri.a.f);
                        k9q0.w(aVar4, D, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c, cri.a.d);
                        boolean z3 = z;
                        u150.b(0, aVar4, null, z3);
                        if (z2) {
                            aVar4.K(-2095770522);
                            u150.a(null, aVar4, 0);
                            aVar4.j();
                        } else {
                            aVar4.K(-2095706755);
                            u150.j(null, aVar4, 0);
                            u150.g(0, aVar4, null, z3);
                            if (z3) {
                                aVar4.K(-2095596674);
                                u150.d(null, aVar4, 0);
                            } else {
                                aVar4.K(-2099439620);
                            }
                            aVar4.j();
                            aVar4.j();
                        }
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 6) & 14) | 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q150
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.e(izs.this, wh50Var, q630Var2, z, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1313773196);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1313773196, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistItem (MusicPlaylistLoading.kt:320)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 156;
            float f2 = 12;
            q630 d = rte0.d(txj0.q(aVar2, f), vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            k(f2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), new pco(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            float f3 = 8;
            float f4 = 102;
            k(f3, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            k(f3, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            if (xga0.c(aVar2, 24, M, 6)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkg(q630Var, i, 8);
        }
    }

    public static final void g(final int i, androidx.compose.runtime.a aVar, q630 q630Var, final boolean z) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(22060798);
        int i2 = (M.l(z) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(22060798, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistShimmer (MusicPlaylistLoading.kt:248)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(txj0.f(aVar2, 1.0f), vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            float f = 16;
            q630 m2 = m(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, m));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            k(f, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, 5), new pco(130), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            M.K(1346960853);
            for (int i3 = 0; i3 < 5; i3++) {
                l(i2 & 14, M, null, z);
            }
            M.j();
            float f2 = 8;
            f9t.e(txj0.h(aVar2, f2), M, 6);
            float f3 = 12;
            float f4 = 188;
            k(f3, null, new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            if (z) {
                M.K(-1193707552);
                f9t.e(txj0.h(aVar2, f2), M, 6);
                k(f3, null, new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            } else {
                M.K(-1202801650);
            }
            M.j();
            boolean c2 = xga0.c(aVar2, 34, M, 6);
            q630Var2 = aVar2;
            if (c2) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar2;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, q630Var2, z) { // from class: xsna.t150
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;

                {
                    this.b = z;
                    this.c = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.g(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(805218195);
        int i2 = (M.l(z) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(805218195, i2, -1, "com.vk.music.playlist.display.presentation.PortraitHeader (MusicPlaylistLoading.kt:178)");
            }
            q630.a aVar2 = q630.a.a;
            q630 m = m(txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.o;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar3, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d = rte0.d(txj0.q(aVar2, y9b0.b), vog0.b(y9b0.a));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            f9t.e(txj0.h(aVar2, 23), M, 6);
            i(z, aVar3, null, M, (i2 & 14) | 48);
            f9t.e(txj0.h(aVar2, 8), M, 6);
            k(32, s200.D(aVar2, 16), null, 10, M, 3126, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, q630Var, z) { // from class: xsna.m150
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;

                {
                    this.b = z;
                    this.c = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.h(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(boolean z, dt1.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2142909215);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2142909215, i3, -1, "com.vk.music.playlist.display.presentation.ShimmerInfoBlock (MusicPlaylistLoading.kt:203)");
            }
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(10), bVar, M, (((((i3 << 3) & 896) | (((i3 >> 6) & 14) | 48)) >> 3) & 112) | 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c = qri.c(M, q630Var2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 16;
            k(f, null, new pco(206), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, q630Var2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (z) {
                M.K(-990743449);
            } else {
                M.K(-983303759);
                q630 d = rte0.d(txj0.q(q630Var2, f), vog0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            }
            M.j();
            float f2 = 12;
            k(f2, s200.H(q630Var2, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), new pco(120), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 438, 8);
            M.G();
            k(f2, null, new pco(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new txn(z, bVar, q630Var2, i);
        }
    }

    public static final void j(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1093862634);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1093862634, i2, -1, "com.vk.music.playlist.display.presentation.SummaryShimmer (MusicPlaylistLoading.kt:228)");
            }
            q630Var2 = q630.a.a;
            q630 d = rte0.d(txj0.f(q630Var2, 1.0f), vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = m(s200.D(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), 16));
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            float f = 12;
            k(f, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            k(f, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, q630Var2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            k(f, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 12);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 0);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.base.ui.q0(q630Var2, i, 7);
        }
    }

    public static final void k(final float f, q630 q630Var, pco pcoVar, float f2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 f3;
        androidx.compose.runtime.a M = aVar.M(30273225);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(pcoVar) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= M.n(f2) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (i5 != 0) {
                pcoVar = null;
            }
            if (i6 != 0) {
                f2 = 4;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(30273225, i3, -1, "com.vk.music.playlist.display.presentation.TextSkeleton (MusicPlaylistLoading.kt:341)");
            }
            q630 h = txj0.h(q630Var, f);
            if (pcoVar == null || (f3 = txj0.v(h, pcoVar.b)) == null) {
                f3 = txj0.f(h, 1.0f);
            }
            q630 d = rte0.d(f3, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        final pco pcoVar2 = pcoVar;
        final float f4 = f2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n150
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u150.k(f, q630Var2, pcoVar2, f4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void l(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        int i2;
        q630 q630Var2;
        cri.a.d dVar;
        androidx.compose.runtime.a M = aVar.M(-2048149823);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2048149823, i3, -1, "com.vk.music.playlist.display.presentation.TrackShimmer (MusicPlaylistLoading.kt:276)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            if (z) {
                dVar = dVar2;
                M.K(2003599717);
                M.j();
            } else {
                M.K(2013008837);
                float f = 6;
                q630 d = rte0.d(txj0.q(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar2), 48), vog0.b(f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                dVar = dVar2;
                ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
                mq.d(aVar2, 12, M, 6);
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, 1, aVar2);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f2 = 12;
            k(f2, null, new pco(256), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            f9t.e(txj0.h(aVar2, 10), M, 6);
            k(f2, null, new pco(188), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            q630Var2 = aVar2;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar2;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wxn(i, q630Var2, z);
        }
    }

    public static final q630 m(q630 q630Var) {
        return qri.a(q630Var, a5x.a, new smi(2));
    }
}
