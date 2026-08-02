package xsna;

import androidx.compose.runtime.a;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dai;
import xsna.q630;
import xsna.rmw;

/* compiled from: CompactVideoCellContentFactory.kt */
/* loaded from: classes7.dex */
public final class h6i implements goj0 {
    @Override // xsna.goj0
    public final void a(foj0 foj0Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        VideoMetaViewState.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-580237362);
        int i3 = 4;
        int i4 = i | (M.J(foj0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-580237362, i4, -1, "com.vk.video.ui.discovery.minimizable.recycler.similar.ui.compat.CompactVideoCellContentFactory.Content (CompactVideoCellContentFactory.kt:23)");
            }
            float f = 12;
            q630 H = s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            M.K(737686328);
            PreviewViewState b = PreviewViewState.a0.b(foj0Var.b, false, new PreviewViewState.DurationBadge(foj0Var.c, false, null, 6), null, null, null, null, null, null, null, VkColorToken.ImagePlaceholder, Z3.l);
            VideoMetaViewState.i iVar = new VideoMetaViewState.i(foj0Var.a, 2);
            doj0 doj0Var = foj0Var.f;
            VideoCellViewState videoCellViewState = new VideoCellViewState(b, new VideoCellViewState.g(new VideoMetaViewState(iVar, new VideoMetaViewState.a(null, null, doj0Var.a, doj0Var.c, foj0Var.d, foj0Var.e, foj0Var.g, 0, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), i3)), new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_more_vertical_24)), null, null, 24);
            videoCellViewState.f().c(VideoCellViewState.Size.Small, M, 6);
            dai.c b2 = b.a.b();
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new oq5(izsVar, 2);
                M.R(x);
            }
            b2.c((gzs) x, M, 0);
            dai.c d = videoCellViewState.d();
            boolean z2 = i5 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new v78(izsVar, 2);
                M.R(x2);
            }
            d.c((gzs) x2, M, 0);
            VideoMetaViewState c = videoCellViewState.c();
            dai.c b3 = (c == null || (aVar2 = c.d) == null) ? null : aVar2.b();
            if (b3 == null) {
                M.K(369856002);
            } else {
                M.K(289025503);
                boolean z3 = i5 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new qq5(izsVar, 3);
                    M.R(x3);
                }
                b3.c((gzs) x3, M, 0);
            }
            M.j();
            VideoCellViewState.c a = videoCellViewState.a();
            dai.c a2 = a != null ? a.a() : null;
            if (a2 == null) {
                M.K(369958178);
                M.j();
                i2 = 0;
            } else {
                M.K(289028799);
                boolean z4 = i5 == 32;
                Object x4 = M.x();
                if (z4 || x4 == c0012a) {
                    x4 = new gr7(izsVar, 3);
                    M.R(x4);
                }
                i2 = 0;
                a2.c((gzs) x4, M, 0);
                M.j();
            }
            M.j();
            com.vk.libvideo.design.compose.video.videocell.a.g(videoCellViewState, H, M, i2, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g6i(i, 0, this, foj0Var, izsVar);
        }
    }
}
