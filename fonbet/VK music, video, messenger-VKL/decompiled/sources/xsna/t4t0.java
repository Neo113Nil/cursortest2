package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: VideoPlaylistCoverView.kt */
/* loaded from: classes16.dex */
public final class t4t0 {
    public static final void a(final q4t0 q4t0Var, q630 q630Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(284173733);
        int i2 = (M.J(q4t0Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(284173733, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.PlaylistCover (VideoPlaylistCoverView.kt:103)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new emh0(q4t0Var, 19);
                M.R(x);
            }
            q630 a = rdu.a(f, (izs) x);
            boolean z3 = q4t0Var.d;
            q630 h = txj0.h(a, r490.d(z3 ? R.dimen.video_catalog_playlist_cover_height : R.dimen.video_catalog_playlist_cover_height_horizontal, M));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            r0v0.a(pg90.a(R.drawable.empty_playlist_cover, 0, M), s200.H(txj0.d(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r490.d(z3 ? R.dimen.video_catalog_playlist_cover_padding_top : R.dimen.video_catalog_playlist_cover_padding_top_horizontal, M), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r490.d(z3 ? R.dimen.video_catalog_playlist_cover_padding_bottom : R.dimen.video_catalog_playlist_cover_padding_bottom_horizontal, M), 5), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12582920, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            lg90 l = fwu0.l(null, q4t0Var.b, null, q4t0Var.c ? new qow(new jwx(2, 30)) : null, M, 0, 29);
            wkj wkjVar = z3 ? wkj.a.b : wkj.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new wo40(24);
                M.R(x2);
            }
            r0v0.a(l, bu00.f(f2, (izs) x2), null, wkjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12582920, 116);
            q630 b = ra8.a.b(txj0.f(s200.E(aVar2, 16, 12), 1.0f), dt1.a.h);
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new jan0(q4t0Var, 9);
                M.R(x3);
            }
            q630Var2 = aVar2;
            v7b0.c(q4t0Var, z, b, (izs) x3, M, i3 | 48);
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
            s.d = new wzs(q630Var2, z, i) { // from class: xsna.s4t0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    t4t0.a(q4t0.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
