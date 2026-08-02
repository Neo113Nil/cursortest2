package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.VideoUrl;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: ExtendedDownloadTrack.kt */
/* loaded from: classes3.dex */
public final class lbq {
    public static final HashMap<String, Integer> a = pn00.i(new Pair("mobile", 144), new Pair("lowest", Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK)), new Pair("low", 360), new Pair("medium", 480), new Pair("high", Integer.valueOf(PublisherConfiguration.DEFAULT_MAX_RES)), new Pair("full_hd", 1080), new Pair("quad_hd", 1440), new Pair("ultra_hd", 2160));
    public static final List<String> b = e43.l("av01", "vp", "avc");

    /* compiled from: ExtendedDownloadTrack.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoUrl.values().length];
            try {
                iArr[VideoUrl.DASH_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoUrl.DASH_WEBM_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoUrl.DASH_AV1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
