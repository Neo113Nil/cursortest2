package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.toggle.features.VideoFeatures;
import java.util.List;
import kotlin.Result;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import xsna.n640;
import xsna.xds0;

/* compiled from: VideoFileExt.kt */
/* loaded from: classes2.dex */
public final class els0 {
    public static final n640.a a(VideoFile videoFile, VideoUrl videoUrl, FrameSize frameSize) {
        Uri b = b(videoFile.w9().Ab(videoUrl));
        if (b != null) {
            return new n640.a(b, frameSize);
        }
        return null;
    }

    public static final Uri b(String str) {
        Object failure;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Uri) (failure instanceof Result.Failure ? null : failure);
    }

    public static final xds0 c(VideoFile videoFile, nzf nzfVar) {
        xds0.a aVar = new xds0.a();
        String K5 = videoFile.K5();
        if (K5 != null) {
            aVar.b = K5;
        }
        if (videoFile.v()) {
            Uri b = b(videoFile.w9().Ab(VideoUrl.RTMP_URL));
            if (b != null) {
                aVar.a(new sqg0(b));
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                Uri b2 = b(videoFile.w9().Ab(VideoUrl.DASH_LIVE_ON_DEMAND_URL));
                if (b2 != null) {
                    aVar.a(new qsk(b2, new fkz(VideoContentType.DASH, b2, b2, 0L)));
                }
            }
            Uri b3 = b(videoFile.w9().Ab(VideoUrl.HLS_LIVE));
            if (b3 != null) {
                Uri b4 = b(videoFile.w9().Ab(VideoUrl.HLS_LIVE_PAYBACK_URL));
                aVar.a(new f9v(b3, b4 != null ? new fkz(VideoContentType.HLS, b3, b4, 0L) : null));
            }
            Uri b5 = b(videoFile.w9().Ab(VideoUrl.HLS_ONDEMAND_LIVE_URL));
            if (b5 != null) {
                aVar.a(new f9v(b5, new fkz(VideoContentType.HLS, b5, b5, 0L)));
            }
        } else {
            Uri b6 = b(videoFile.w9().Ab(VideoUrl.DASH_STREAMS));
            if (b6 != null) {
                aVar.a(new ftk(b6));
            }
            if (nzfVar.b()) {
                Uri b7 = b(videoFile.w9().Ab(VideoUrl.DASH_AV1));
                if (b7 != null) {
                    aVar.a(new ftk(b7));
                }
            }
            if (nzfVar.a()) {
                Uri b8 = b(videoFile.w9().Ab(VideoUrl.DASH_WEBM_URL));
                if (b8 != null) {
                    aVar.a(new ftk(b8));
                }
            }
            Uri b9 = b(videoFile.w9().Ab(VideoUrl.DASH_URL));
            if (b9 != null) {
                aVar.a(new ftk(b9));
            }
            Uri b10 = b(videoFile.w9().Ab(VideoUrl.DASH_ONDEMAND_URL));
            if (b10 != null) {
                aVar.a(new ftk(b10));
            }
            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_HLS_FMP4;
            videoFeatures2.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures2)) {
                Uri b11 = b(videoFile.w9().Ab(VideoUrl.FMP4_HLS));
                if (b11 != null) {
                    aVar.a(new x9v(b11));
                }
            }
            Uri b12 = b(videoFile.w9().Ab(VideoUrl.HLS_URL));
            if (b12 != null) {
                aVar.a(new x9v(b12));
            }
            Uri b13 = b(videoFile.w9().Ab(VideoUrl.HLS_ONDEMAND_URL));
            if (b13 != null) {
                aVar.a(new x9v(b13));
            }
            List I = rl3.I(new n640.a[]{a(videoFile, VideoUrl.URL_2160, FrameSize._2160p), a(videoFile, VideoUrl.URL_1440, FrameSize._1440p), a(videoFile, VideoUrl.URL_1080, FrameSize._1080p), a(videoFile, VideoUrl.URL_720, FrameSize._720p), a(videoFile, VideoUrl.URL_480, FrameSize._480p), a(videoFile, VideoUrl.URL_360, FrameSize._360p), a(videoFile, VideoUrl.URL_240, FrameSize._240p)});
            List list = I.isEmpty() ? null : I;
            if (list != null) {
                aVar.a(list.size() == 1 ? new ag30(((n640.a) list.get(0)).b) : new n640(list, ((n640.a) list.get(0)).a));
            }
        }
        return new xds0(j5g.O0(aVar.a), aVar.b);
    }
}
