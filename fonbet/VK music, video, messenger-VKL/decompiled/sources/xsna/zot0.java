package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.VideoUrl;
import com.vk.toggle.features.VideoFeatures;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: VideoUrls.kt */
/* loaded from: classes3.dex */
public final class zot0 {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((VideoUrl) t2).m()), Integer.valueOf(((VideoUrl) t).m()));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m = ((VideoUrl) t).m();
            int i = this.b;
            return jw5.b(Integer.valueOf(Math.abs(i - m)), Integer.valueOf(Math.abs(i - ((VideoUrl) t2).m())));
        }
    }

    public static ListBuilder a() {
        ListBuilder e = e43.e();
        e.add(VideoUrl.OKMP_URL);
        e.add(VideoUrl.RTMP_URL);
        e.addAll(c());
        e.addAll(d());
        e.addAll(f());
        e.add(VideoUrl.EXTERNAL_URL);
        return e.g();
    }

    public static ListBuilder c() {
        ListBuilder e = e43.e();
        e.add(VideoUrl.DASH_STREAMS);
        e.add(VideoUrl.DASH_AV1);
        e.add(VideoUrl.DASH_WEBM_URL);
        e.add(VideoUrl.DASH_URL);
        e.add(VideoUrl.DASH_ONDEMAND_URL);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            e.add(VideoUrl.DASH_LIVE_ON_DEMAND_URL);
        }
        return e.g();
    }

    public static List d() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_HLS_FMP4;
        videoFeatures.getClass();
        return rl3.I(new VideoUrl[]{com.vk.toggle.b.A.a(videoFeatures) ? VideoUrl.FMP4_HLS : null, VideoUrl.HLS_URL, VideoUrl.HLS_ONDEMAND_URL, VideoUrl.HLS_LIVE, VideoUrl.HLS_ONDEMAND_LIVE_URL});
    }

    public static List e() {
        List list;
        VideoUrl.Companion.getClass();
        list = VideoUrl.MP4_URLS;
        return j5g.D0(new a(), list);
    }

    public static List f() {
        fz5 fz5Var = fz5.d;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        long c = an10.c(((jk80) fz5Var.j(context)).b.getBitrateEstimate() * 0.75f);
        return j5g.D0(new b(c < 580000 ? PsExtractor.VIDEO_STREAM_MASK : c < 1000000 ? 360 : c < 2300000 ? 480 : c < 5200000 ? PublisherConfiguration.DEFAULT_MAX_RES : c < 9200000 ? 1080 : c < 21000000 ? 1440 : 2160), e());
    }
}
