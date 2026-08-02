package xsna;

import androidx.compose.runtime.a;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dai;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;

/* compiled from: LargeVideoCardContentFactory.kt */
/* loaded from: classes7.dex */
public final class vly implements goj0 {
    @Override // xsna.goj0
    public final void a(foj0 foj0Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-190908136);
        int i3 = 4;
        int i4 = i | (M.J(foj0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-190908136, i4, -1, "com.vk.video.ui.discovery.minimizable.recycler.similar.ui.big.LargeVideoCardContentFactory.Content (LargeVideoCardContentFactory.kt:23)");
            }
            q630 H = s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7);
            M.K(1220920524);
            PreviewViewState b = PreviewViewState.a0.b(foj0Var.b, false, new PreviewViewState.DurationBadge(foj0Var.c, false, null, 6), null, null, null, null, null, null, null, VkColorToken.ImagePlaceholder, Z3.l);
            doj0 doj0Var = foj0Var.f;
            VideoCardViewState videoCardViewState = new VideoCardViewState(b, new VideoCardViewState.c(doj0Var.b, new VideoMetaViewState(new VideoMetaViewState.i(foj0Var.a, 2), new VideoMetaViewState.a(null, null, doj0Var.a, doj0Var.c, foj0Var.d, foj0Var.e, foj0Var.g, 0, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), i3), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions)));
            videoCardViewState.d().c(VideoCardViewState.Size.Sharp, M, 6);
            dai.c b2 = b.a.b();
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new mv7(izsVar, 2);
                M.R(x);
            }
            b2.c((gzs) x, M, 0);
            VideoCardViewState.c c = videoCardViewState.c();
            if (c != null) {
                M.K(2018463301);
                dai.c d = c.d();
                boolean z2 = i5 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new uly(izsVar, 0);
                    M.R(x2);
                }
                d.c((gzs) x2, M, 0);
                dai.c a = c.a();
                boolean z3 = i5 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new m4i(izsVar, 1);
                    M.R(x3);
                }
                a.c((gzs) x3, M, 0);
                VideoMetaViewState.a aVar2 = c.b.d;
                dai.c b3 = aVar2 != null ? aVar2.b() : null;
                if (b3 == null) {
                    M.K(2018705751);
                } else {
                    M.K(1866234858);
                    boolean z4 = i5 == 32;
                    Object x4 = M.x();
                    if (z4 || x4 == c0012a) {
                        x4 = new nac(izsVar, 2);
                        M.R(x4);
                    }
                    b3.c((gzs) x4, M, 0);
                }
                M.j();
                dai.c b4 = c.b();
                boolean z5 = i5 == 32;
                Object x5 = M.x();
                if (z5 || x5 == c0012a) {
                    x5 = new ee1(izsVar, 4);
                    M.R(x5);
                }
                i2 = 0;
                b4.c((gzs) x5, M, 0);
            } else {
                i2 = 0;
                M.K(2015819280);
            }
            M.j();
            M.j();
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, H, M, i2, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xce(i, 3, this, foj0Var, izsVar);
        }
    }
}
