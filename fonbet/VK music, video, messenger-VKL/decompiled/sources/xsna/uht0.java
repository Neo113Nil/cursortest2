package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.toggle.features.VideoFeatures;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import xsna.n640;

/* compiled from: VideoSourcesRotator.kt */
/* loaded from: classes2.dex */
public final class uht0 {
    public final VideoFile a;
    public final AbstractList b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v64, types: [xsna.ag30] */
    public uht0(VideoFile videoFile, nzf nzfVar) {
        this.a = videoFile;
        boolean v = videoFile.v();
        ListBuilder e = e43.e();
        if (v) {
            Uri b = vht0.b(videoFile.w9().Ab(VideoUrl.RTMP_URL));
            if (b != null) {
                e.add(new sqg0(b));
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                Uri b2 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_LIVE_ON_DEMAND_URL));
                if (b2 != null) {
                    e.add(new qsk(b2, new fkz(VideoContentType.DASH, b2, b2, 0L)));
                }
            }
            Uri b3 = vht0.b(videoFile.w9().Ab(VideoUrl.HLS_LIVE));
            if (b3 != null) {
                Uri b4 = vht0.b(videoFile.w9().Ab(VideoUrl.HLS_LIVE_PAYBACK_URL));
                e.add(new f9v(b3, b4 != null ? new fkz(VideoContentType.HLS, b3, b4, 0L) : null));
            }
            Uri b5 = vht0.b(videoFile.w9().Ab(VideoUrl.HLS_ONDEMAND_LIVE_URL));
            if (b5 != null) {
                e.add(new f9v(b5, new fkz(VideoContentType.HLS, b5, b5, 0L)));
            }
        } else {
            Uri b6 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_STREAMS));
            if (b6 != null) {
                e.add(new ftk(b6));
            }
            if (nzfVar.b()) {
                Uri b7 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_AV1));
                if (b7 != null) {
                    e.add(new ftk(b7));
                }
            }
            if (nzfVar.a()) {
                Uri b8 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_WEBM_URL));
                if (b8 != null) {
                    e.add(new ftk(b8));
                }
            }
            Uri b9 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_URL));
            if (b9 != null) {
                e.add(new ftk(b9));
            }
            Uri b10 = vht0.b(videoFile.w9().Ab(VideoUrl.DASH_ONDEMAND_URL));
            if (b10 != null) {
                e.add(new ftk(b10));
            }
            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_HLS_FMP4;
            videoFeatures2.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                Uri b11 = vht0.b(videoFile.w9().Ab(VideoUrl.FMP4_HLS));
                if (b11 != null) {
                    e.add(new x9v(b11));
                }
            }
            Uri b12 = vht0.b(videoFile.w9().Ab(VideoUrl.HLS_URL));
            if (b12 != null) {
                e.add(new x9v(b12));
            }
            Uri b13 = vht0.b(videoFile.w9().Ab(VideoUrl.HLS_ONDEMAND_URL));
            if (b13 != null) {
                e.add(new x9v(b13));
            }
            List I = rl3.I(new n640.a[]{vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_2160)), FrameSize._2160p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_1440)), FrameSize._1440p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_1080)), FrameSize._1080p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_720)), FrameSize._720p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_480)), FrameSize._480p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_360)), FrameSize._360p), vht0.a(vht0.b(videoFile.w9().Ab(VideoUrl.URL_240)), FrameSize._240p)});
            List list = I.isEmpty() ? null : I;
            if (list != null) {
                e.add(list.size() == 1 ? new ag30(((n640.a) list.get(0)).b) : new n640(list, ((n640.a) list.get(0)).a));
            }
        }
        ListBuilder g = e.g();
        String K5 = videoFile.K5();
        AbstractList abstractList = g;
        if (K5 != null) {
            ArrayList arrayList = new ArrayList(c5g.u(g, 10));
            ListIterator listIterator = g.listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                } else {
                    arrayList.add(((sht0) aVar.next()).d(K5));
                }
            }
            abstractList = j5g.u0(arrayList, g);
        }
        this.b = abstractList;
    }
}
