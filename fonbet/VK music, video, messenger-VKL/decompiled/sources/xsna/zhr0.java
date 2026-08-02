package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.cast.model.VideoType;

/* compiled from: VKVideoCastHelper.kt */
/* loaded from: classes2.dex */
public final class zhr0 {
    public static final List<VideoUrl> a;

    /* compiled from: VKVideoCastHelper.kt */
    public static final class a {
        public final String a;
        public final VideoType b;

        public a(String str, VideoType videoType) {
            this.a = str;
            this.b = videoType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CastInfo(url=" + this.a + ", videoType=" + this.b + ')';
        }
    }

    /* compiled from: VKVideoCastHelper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaRouteConnectStatus.values().length];
            try {
                iArr[MediaRouteConnectStatus.NO_DEVICES_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaRouteConnectStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        VideoUrl videoUrl = VideoUrl.DASH_URL;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_HLS_FMP4;
        videoFeatures.getClass();
        a = rl3.I(new VideoUrl[]{videoUrl, com.vk.toggle.b.A.a(videoFeatures) ? VideoUrl.FMP4_HLS : null, VideoUrl.HLS_URL, VideoUrl.URL_2160, VideoUrl.URL_1440, VideoUrl.URL_1080, VideoUrl.URL_720, VideoUrl.URL_480, VideoUrl.URL_360, VideoUrl.URL_240});
    }

    public static ArrayList a(VideoFile videoFile) {
        ArrayList u0 = j5g.u0(a, Collections.singletonList(VideoUrl.HLS_LIVE));
        wir0 wir0Var = new wir0(videoFile);
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (wir0Var.a((VideoUrl) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
