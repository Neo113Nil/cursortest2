package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.actionlink.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* compiled from: ActionLinkDataMapperImpl.kt */
/* loaded from: classes3.dex */
public final class a20 implements z10 {
    public final VideoFile a;
    public final boolean b;

    public a20(VideoFile videoFile, boolean z) {
        this.a = videoFile;
        this.b = z;
    }

    @Override // xsna.z10
    public final com.vk.libvideo.design.view.actionlink.b c() {
        b.C1229b.a aVar;
        String str;
        String str2;
        Float f;
        String str3;
        VideoFile videoFile = this.a;
        ActionLink m1 = videoFile.m1();
        if (m1 != null) {
            if (g620.f().d(videoFile)) {
                m1 = null;
            }
            if (m1 != null) {
                ActionLinkSnippet actionLinkSnippet = m1.f;
                Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
                boolean d = com.vk.libvideo.api.minimizable.a.d(rts0.b.a().P0());
                String str4 = m1.c;
                String str5 = "";
                if (epx.f(str4, "poll")) {
                    aVar = b.C1229b.a.f.c;
                } else if (epx.f(str4, "product") && fxc0.B().J().z0() && good != null && d) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5 e = b.C1208b.a().e(videoFile, null);
                    VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                    long j = good.b;
                    String str6 = good.d;
                    MarketItemRating marketItemRating = good.t;
                    if (marketItemRating != null && (f = marketItemRating.b) != null) {
                        Float f2 = f.floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f : null;
                        if (f2 != null) {
                            str = brm0.y(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2.floatValue())}, 1)), StringUtils.COMMA, ".");
                            aVar = new b.C1229b.a.j(j, str6, str, good.h.e, good.n, (videoAutoPlay != null || (str2 = videoAutoPlay.K) == null) ? "" : str2, videoFile.getType(), videoFile.o0(), videoFile.I0().b);
                        }
                    }
                    str = "";
                    aVar = new b.C1229b.a.j(j, str6, str, good.h.e, good.n, (videoAutoPlay != null || (str2 = videoAutoPlay.K) == null) ? "" : str2, videoFile.getType(), videoFile.o0(), videoFile.I0().b);
                } else {
                    aVar = epx.f(str4, "product") ? b.C1229b.a.i.c : epx.f(str4, "user") ? b.C1229b.a.k.c : epx.f(str4, "link") ? b.C1229b.a.e.c : epx.f(str4, "post") ? b.C1229b.a.g.c : epx.f(str4, "group") ? b.C1229b.a.d.c : epx.f(str4, MBridgeConstans.DYNAMIC_VIEW_WX_APP) ? b.C1229b.a.C1230a.c : epx.f(str4, "article") ? b.C1229b.a.C1231b.c : epx.f(str4, "video_postcard_gift") ? b.C1229b.a.h.c : epx.f(str4, "video") ? b.C1229b.a.l.c : b.C1229b.a.c.c;
                }
                if (actionLinkSnippet != null && (str3 = actionLinkSnippet.e) != null) {
                    str5 = str3;
                }
                return new b.C1229b(this.b, aVar, str5);
            }
        }
        return b.a.a;
    }
}
