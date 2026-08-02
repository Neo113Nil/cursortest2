package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.hsk;
import xsna.mr3;
import xsna.q630;
import xsna.ty6;
import xsna.v5g;

/* compiled from: ArtistListView.kt */
/* loaded from: classes3.dex */
public final class xr3 {

    /* compiled from: ArtistListView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingState.LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(LoadingState loadingState, yq3 yq3Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar.M(-92799887);
        if ((i & 6) == 0) {
            i2 = (M.o(loadingState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(yq3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-92799887, i2, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistAvatar (ArtistListView.kt:135)");
            }
            int i3 = a.$EnumSwitchMapping$0[loadingState.ordinal()];
            if (i3 == 1) {
                M.K(1013627876);
                c((i2 >> 6) & 14, 0, M, q630Var);
                M.j();
            } else if (i3 == 2) {
                M.K(1013629542);
                d((i2 >> 6) & 14, 0, M, q630Var);
                M.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(1013626882, M);
                }
                M.K(1013631743);
                Image image = yq3Var.c;
                fwu0.c(q630Var, null, (image == null || (Cb = image.Cb(48, true, false)) == null) ? null : Cb.d.d, null, null, null, null, xai.a, M, ((i2 >> 6) & 14) | 100663296, 250);
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
            s.d = new or3(i, 0, loadingState, yq3Var, q630Var);
        }
    }

    public static final void b(mr3.a.C3368a c3368a, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1879928876);
        if ((i & 6) == 0) {
            i2 = (M.J(c3368a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1879928876, i4, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListView (ArtistListView.kt:56)");
            }
            wh50 c = jk50.c(c3368a.a, M);
            wh50 c2 = jk50.c(c3368a.b, M);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            long j = wlb0.h(M).getBackground().r;
            wlb0.i(M).getClass();
            float f2 = tqu0.e;
            wlb0.i(M).getClass();
            q630 m = hr80.m(f, j, vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, m);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            ty6.b bVar2 = dt1.a.l;
            q630 h = txj0.h(aVar2, 56);
            wlb0.i(M).getClass();
            q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, h);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar2, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, F);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            } else {
                i3 = 0;
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_dismiss_24, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_artist_list_bottomsheet_close, i3, M);
            long j2 = wlb0.h(M).getIcon().f;
            q630 k = hr80.k(0.12f, new rek0(wlb0.h(M).getIcon().f), txj0.q(aVar2, 28), vog0.a);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new zn1(izsVar, 1);
                M.R(x);
            }
            pzu0.b(a4, N, ojc.c(k, false, null, null, (gzs) x, 15), j2, M, 8, 0);
            String N2 = d370.N(R.string.music_artist_list_bottomsheet_header_artists, 0, M);
            frv0 frv0Var = wlb0.l(M).g;
            long j3 = wlb0.h(M).getText().m;
            wlb0.i(M).getClass();
            q630Var2 = aVar2;
            yqv0.c(N2, s200.H(aVar2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), j3, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            M.G();
            float f3 = 6;
            a.j g = androidx.compose.foundation.layout.a.g(f3);
            q630 H = s200.H(ahn.E(q630Var2, "artistBottomList"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
            boolean J = M.J(c) | M.J(c2) | (i5 == 256);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new rr3(izsVar, c, c2);
                M.R(x2);
            }
            lqy.a(H, null, null, g, null, null, false, null, (izs) x2, M, 24582, 494);
            M = M;
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
            s.d = new sr3(i, 0, c3368a, q630Var2, izsVar);
        }
    }

    public static final void c(final int i, final int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        final q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-958116207);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-958116207, i3, -1, "com.vk.music.bottomsheets.artistlist.presentation.ErrorIcon (ArtistListView.kt:179)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            v5g a2 = v5g.a.a(ylu0Var.getBackground().z, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(159855138, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MusicMic20> (VkIcons.kt:7804)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_music_mic_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            ldu0.b(a2, 48, q630Var2, null, null, false, hsk.a.a(a3, ylu0Var2.getIcon().n, M, 3080, 4), null, null, M, ((i3 << 6) & 896) | 48, 440);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qr3
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xr3.c(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final int i, final int i2, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1348575480);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            q630.a aVar2 = q630.a.a;
            if (i4 != 0) {
                q630Var = aVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1348575480, i3, -1, "com.vk.music.bottomsheets.artistlist.presentation.ShimmerIcon (ArtistListView.kt:161)");
            }
            q630 a2 = wdj0.a(q630Var, null);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(txj0.q(hr80.m(aVar2, ylu0Var.getBackground().m, vog0.a), 48), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pr3
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xr3.d(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }
}
