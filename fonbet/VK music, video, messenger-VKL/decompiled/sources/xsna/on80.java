package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoContentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import one.video.player.model.FrameSize;
import xsna.gkz;
import xsna.n640;

/* compiled from: OneVideoSourceFactory.kt */
/* loaded from: classes3.dex */
public final class on80 {
    public final VideoUrlStorage a;
    public final wir0 b;
    public final izs<Uri, Uri> c;
    public final gkz d;

    /* JADX WARN: Multi-variable type inference failed */
    public on80(VideoUrlStorage videoUrlStorage, wir0 wir0Var, LivePlayBackSettings livePlayBackSettings, izs<? super Uri, ? extends Uri> izsVar) {
        this.a = videoUrlStorage;
        this.b = wir0Var;
        this.c = izsVar;
        this.d = new gkz(videoUrlStorage, livePlayBackSettings);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<sht0, VideoUrl> a(List<? extends VideoUrl> list) {
        boolean z;
        n640.a aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.a((VideoUrl) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((VideoUrl) it.next()).j() != VideoContentType.MP4) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        VideoUrl videoUrl = (VideoUrl) j5g.a0(arrayList);
        if (!z || arrayList.size() <= 1) {
            return videoUrl != null ? b(videoUrl) : b(VideoUrl.EXTERNAL_URL);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VideoUrl videoUrl2 = (VideoUrl) it2.next();
            String Db = this.a.Db(Collections.singletonList(videoUrl2));
            if (Db != null) {
                if (drm0.N(Db)) {
                    Db = null;
                }
                if (Db != null) {
                    int m = videoUrl2.m();
                    FrameSize frameSize = m != 144 ? m != 240 ? m != 360 ? m != 480 ? m != 720 ? m != 1080 ? m != 1440 ? m != 2160 ? m != 4320 ? null : FrameSize._4320p : FrameSize._2160p : FrameSize._1440p : FrameSize._1080p : FrameSize._720p : FrameSize._480p : FrameSize._360p : FrameSize._240p : FrameSize._144p;
                    if (frameSize != null) {
                        aVar = new n640.a(Uri.parse(Db), frameSize);
                        if (aVar == null) {
                            arrayList2.add(aVar);
                        }
                    }
                }
            }
            aVar = null;
            if (aVar == null) {
            }
        }
        VideoUrl videoUrl3 = (VideoUrl) j5g.Y(arrayList);
        int m2 = videoUrl3.m();
        FrameSize frameSize2 = m2 != 144 ? m2 != 240 ? m2 != 360 ? m2 != 480 ? m2 != 720 ? m2 != 1080 ? m2 != 1440 ? m2 != 2160 ? m2 != 4320 ? null : FrameSize._4320p : FrameSize._2160p : FrameSize._1440p : FrameSize._1080p : FrameSize._720p : FrameSize._480p : FrameSize._360p : FrameSize._240p : FrameSize._144p;
        if (frameSize2 == null) {
            return null;
        }
        return new Pair<>(new n640(arrayList2, frameSize2), videoUrl3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<sht0, VideoUrl> b(VideoUrl videoUrl) {
        Uri parse;
        Object sqg0Var;
        VideoUrlStorage videoUrlStorage = this.a;
        String Ab = videoUrlStorage.Ab(videoUrl);
        if (Ab != null) {
            izs<Uri, Uri> izsVar = this.c;
            if (izsVar == null || (parse = izsVar.invoke(Uri.parse(Ab))) == null) {
                parse = Uri.parse(Ab);
            }
            if (parse != null) {
                int m = videoUrl.m();
                if (m != -5) {
                    gkz gkzVar = this.d;
                    if (m == -4) {
                        if (videoUrl.p()) {
                            sqg0Var = new qsk(parse, gkzVar.b());
                        } else {
                            VideoUrlInfo Eb = videoUrlStorage.Eb(parse.toString());
                            if (Eb != null) {
                                boolean z = Eb.d;
                                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MULTIPLE_BASEURL_STAGE1;
                                videoFeatures.getClass();
                                sqg0Var = (!com.vk.toggle.b.A.a(videoFeatures) || z) ? new ftk(parse) : new psk(parse);
                            }
                            sqg0Var = null;
                        }
                        if (sqg0Var != null) {
                        }
                    } else if (m != -3) {
                        if (m != -2) {
                            if (m != -1) {
                                sqg0Var = new ag30(parse);
                            } else {
                                if (videoUrl == VideoUrl.EXTERNAL_URL) {
                                    sqg0Var = new ag30(parse);
                                }
                                sqg0Var = null;
                            }
                        } else if (videoUrl.p()) {
                            gkzVar.getClass();
                            one.video.player.model.VideoContentType videoContentType = one.video.player.model.VideoContentType.HLS;
                            gkz.a aVar = new gkz.a(VideoUrl.HLS_LIVE, VideoUrl.HLS_LIVE_PAYBACK_URL);
                            VideoUrl videoUrl2 = VideoUrl.HLS_ONDEMAND_LIVE_URL;
                            sqg0Var = new f9v(parse, gkzVar.a(videoContentType, e43.l(aVar, new gkz.a(videoUrl2, videoUrl2))));
                        } else {
                            sqg0Var = new x9v(parse);
                        }
                        if (sqg0Var != null) {
                            return new Pair<>(sqg0Var, videoUrl);
                        }
                    }
                }
                sqg0Var = new sqg0(parse);
                if (sqg0Var != null) {
                }
            }
        }
        return null;
    }

    public on80(VideoFile videoFile) {
        this(videoFile.w9(), new wir0(videoFile), videoFile.K1(), null);
    }
}
