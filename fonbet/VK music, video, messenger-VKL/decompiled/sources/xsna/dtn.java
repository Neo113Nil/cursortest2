package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import xsna.q630;

/* compiled from: Doc2DocBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class dtn {
    public static final void a(AboutVideoItem.l lVar, wzs wzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1115996248);
        int i2 = i | (M.J(lVar) ? 4 : 2) | (M.y(wzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1115996248, i2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.MetaChannelBanner (Doc2DocBannerDelegate.kt:76)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1027607441, new mq1(lVar, wzsVar), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 6, lVar, wzsVar, q630Var2);
        }
    }
}
