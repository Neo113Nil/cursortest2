package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.kbb0;
import xsna.q630;

/* compiled from: PlaylistTracksFooter.kt */
/* loaded from: classes3.dex */
public final class teb0 {
    public static final void a(final kbb0 kbb0Var, final long j, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        int i2;
        q630.a aVar2;
        int i3;
        String str;
        androidx.compose.runtime.a M = aVar.M(-1643790581);
        int i4 = i | (M.J(kbb0Var) ? 4 : 2) | (M.p(j) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1643790581, i4, -1, "com.vk.music.playlist.framework.presentation.PlaylistTracksFooter (PlaylistTracksFooter.kt:29)");
            }
            float f = 20;
            float f2 = 16;
            q630 G = s200.G(hr80.m(rte0.d(txj0.f(q630Var, 1.0f), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3)), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a), f2, 8, f2, f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            boolean z2 = kbb0Var instanceof kbb0.a;
            q630.a aVar4 = q630.a.a;
            if (z2) {
                M.K(1529653446);
                i2 = i4;
                aVar2 = aVar4;
                z = z2;
                i3 = -1;
                yqv0.c(((kbb0.a) kbb0Var).e, ahn.E(aVar4, "playlistTracksFooterGenre"), wlb0.h(M).getText().p, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(M).c0, M, 48, 0, 8120);
                M = M;
            } else {
                z = z2;
                i2 = i4;
                aVar2 = aVar4;
                i3 = -1;
                M.K(1528060077);
            }
            M.j();
            int i5 = (i2 & 14) | 384 | (i2 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(52912419, i5, i3, "com.vk.music.playlist.framework.presentation.PlaylistMetadataFormatter.formatPlaylistFooter (PlaylistMetadataFormatter.kt:33)");
            }
            if (kbb0Var instanceof kbb0.g) {
                M.K(-690767002);
                str = lbb0.d(lbb0.a((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, j, M), lbb0.c(48, ((kbb0.g) kbb0Var).a, M), M, 384);
                M.j();
            } else if (kbb0Var instanceof kbb0.f) {
                M.K(-690760340);
                str = lbb0.d(lbb0.a((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, j, M), lbb0.b(((kbb0.f) kbb0Var).a, 48, M), M, 384);
                M.j();
            } else if (kbb0Var instanceof kbb0.c) {
                M.K(-690753364);
                str = lbb0.d(lbb0.a((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, j, M), lbb0.b(((kbb0.c) kbb0Var).a, 48, M), M, 384);
                M.j();
            } else if (z) {
                M.K(-690746612);
                str = lbb0.d(lbb0.a((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, j, M), lbb0.b(((kbb0.a) kbb0Var).b, 48, M), M, 384);
                M.j();
            } else {
                if (!kbb0Var.equals(kbb0.d.a)) {
                    throw alb0.c(-690768447, M);
                }
                M.K(61892667);
                M.j();
                str = "";
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar5 = M;
            yqv0.c(str, ahn.E(aVar2, "playlistTracksFooterDuration"), wlb0.h(M).getText().p, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(M).c0, aVar5, 48, 0, 8120);
            M = aVar5;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, q630Var, i) { // from class: xsna.seb0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    teb0.a(kbb0.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
