package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.Z3;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.q630;

/* compiled from: SimilarVideoItemDelegate.kt */
/* loaded from: classes7.dex */
public final class moj0 {
    public static final void a(foj0 foj0Var, gzs<s3q0> gzsVar, int i, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-1838338277);
        int i3 = (M.J(foj0Var) ? 4 : 2) | i2 | (M.y(gzsVar) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1838338277, i3, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarVideoCardContent (SimilarVideoItemDelegate.kt:82)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = s200.E(txj0.v(aVar2, 232), 6, 4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            q630 v = txj0.v(ahn.E(aVar2, "video_card_" + i), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            M.K(1480932722);
            PreviewViewState b = PreviewViewState.a0.b(foj0Var.b, true, new PreviewViewState.DurationBadge(foj0Var.c, false, null, 6), null, null, null, null, null, null, null, VkColorToken.ImagePlaceholder, Z3.l);
            VideoMetaViewState.i iVar = new VideoMetaViewState.i(foj0Var.a, 1);
            doj0 doj0Var = foj0Var.f;
            VideoCardViewState videoCardViewState = new VideoCardViewState(b, new VideoCardViewState.c(null, new VideoMetaViewState(iVar, new VideoMetaViewState.a(null, null, doj0Var.a, doj0Var.c, null, null, null, 0, 243), 4), null, null));
            videoCardViewState.d().c(VideoCardViewState.Size.Medium, M, 6);
            dai.c b2 = b.a.b();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ihq(3, gzsVar);
                M.R(x);
            }
            b2.c((gzs) x, M, 0);
            VideoCardViewState.c c2 = videoCardViewState.c();
            if (c2 != null) {
                M.K(918167737);
                dai.c d = c2.d();
                boolean z2 = i4 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new ww20(1, gzsVar);
                    M.R(x2);
                }
                d.c((gzs) x2, M, 0);
                VideoMetaViewState.a aVar4 = c2.b.d;
                dai.c b3 = aVar4 != null ? aVar4.b() : null;
                if (b3 == null) {
                    M.K(-1601447813);
                } else {
                    M.K(918171718);
                    boolean z3 = i4 == 32;
                    Object x3 = M.x();
                    if (z3 || x3 == c0012a) {
                        x3 = new loj0(0, gzsVar);
                        M.R(x3);
                    }
                    b3.c((gzs) x3, M, 0);
                }
                M.j();
            } else {
                M.K(-1606445384);
            }
            M.j();
            M.j();
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, v, M, 0, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fjj(foj0Var, (gzs) gzsVar, i, i2);
        }
    }
}
