package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.toggle.features.VideoFeatures;
import java.util.Collections;
import java.util.List;
import one.video.player.model.VideoContentType;

/* compiled from: LivePlaybackInfoFactory.kt */
/* loaded from: classes3.dex */
public final class gkz {
    public final VideoUrlStorage a;
    public final LivePlayBackSettings b;

    /* compiled from: LivePlaybackInfoFactory.kt */
    public static final class a {
        public final VideoUrl a;
        public final VideoUrl b;

        public a(VideoUrl videoUrl, VideoUrl videoUrl2) {
            this.a = videoUrl;
            this.b = videoUrl2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UrlPair(originalUrlType=" + this.a + ", playBackUrlType=" + this.b + ')';
        }
    }

    public gkz(VideoUrlStorage videoUrlStorage, LivePlayBackSettings livePlayBackSettings) {
        this.a = videoUrlStorage;
        this.b = livePlayBackSettings;
    }

    public final fkz a(VideoContentType videoContentType, List<a> list) {
        LivePlayBackSettings livePlayBackSettings = this.b;
        if (livePlayBackSettings != null && livePlayBackSettings.c) {
            for (a aVar : list) {
                VideoUrl videoUrl = aVar.a;
                VideoUrlStorage videoUrlStorage = this.a;
                String Ab = videoUrlStorage.Ab(videoUrl);
                if (Ab == null || fxc0.B().i().c().contains(videoUrl)) {
                    Ab = null;
                }
                VideoUrl videoUrl2 = aVar.b;
                String Ab2 = videoUrlStorage.Ab(videoUrl2);
                if (Ab2 == null || fxc0.B().i().c().contains(videoUrl2)) {
                    Ab2 = null;
                }
                if (Ab != null && Ab2 != null) {
                    return new fkz(videoContentType, Uri.parse(Ab), Uri.parse(Ab2), livePlayBackSettings.e);
                }
                videoContentType = videoContentType;
            }
        }
        return null;
    }

    public final fkz b() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            return null;
        }
        VideoContentType videoContentType = VideoContentType.DASH;
        VideoUrl videoUrl = VideoUrl.DASH_LIVE_ON_DEMAND_URL;
        return a(videoContentType, Collections.singletonList(new a(videoUrl, videoUrl)));
    }

    public final fkz c() {
        fkz b = b();
        VideoContentType videoContentType = VideoContentType.HLS;
        a aVar = new a(VideoUrl.HLS_LIVE, VideoUrl.HLS_LIVE_PAYBACK_URL);
        VideoUrl videoUrl = VideoUrl.HLS_ONDEMAND_LIVE_URL;
        fkz fkzVar = (fkz) j5g.a0(rl3.I(new fkz[]{b, a(videoContentType, e43.l(aVar, new a(videoUrl, videoUrl)))}));
        if (fkzVar == null || fkzVar.d <= 0) {
            return null;
        }
        return fkzVar;
    }

    public gkz(VideoFile videoFile) {
        this(videoFile.w9(), videoFile.K1());
    }
}
