package xsna;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.DisplayMetrics;
import android.util.Range;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.dto.common.VideoContentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.player.model.FrameSize;
import ru.ok.proto.PublisherConfiguration;
import xsna.d5b0;

/* compiled from: ValidateVideoUrl.kt */
/* loaded from: classes3.dex */
public final class wir0 {
    public final VideoUrlStorage a;
    public final a b;
    public final Set<VideoUrl> c;
    public final ClipsRtmpLivePlaybackSettings d;
    public final nzf e;
    public final FrameSize f;

    /* compiled from: ValidateVideoUrl.kt */
    public interface a {

        /* compiled from: ValidateVideoUrl.kt */
        /* renamed from: xsna.wir0$a$a, reason: collision with other inner class name */
        public static final class C3936a implements a {
            public final boolean a;

            public C3936a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3936a) && this.a == ((C3936a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Live(isMobileLive="), this.a, ')');
            }
        }

        /* compiled from: ValidateVideoUrl.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1235854255;
            }

            public final String toString() {
                return "Video";
            }
        }
    }

    /* compiled from: ValidateVideoUrl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoUrl.values().length];
            try {
                iArr[VideoUrl.OKMP_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoUrl.RTMP_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wir0(VideoUrlStorage videoUrlStorage, a aVar) {
        int i;
        Set<VideoUrl> c = fxc0.B().i().c();
        ClipsRtmpLivePlaybackSettings i2 = g620.f().getExperiments().i();
        pzf codecInfo = qu5.c().getCodecInfo();
        Context context = e43.a;
        context = context == null ? null : context;
        if (!fxc0.B().J().a() || (i = d5b0.a) == Integer.MIN_VALUE) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int i3 = 0;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int i4 = 0;
            int i5 = 0;
            while (i3 < codecInfos.length) {
                int i6 = i3 + 1;
                try {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i3];
                    if (!mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int i7 = i4;
                        int i8 = i5;
                        int i9 = 0;
                        while (i9 < supportedTypes.length) {
                            int i10 = i9 + 1;
                            try {
                                String str = supportedTypes[i9];
                                if (io20.p(str)) {
                                    Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedWidths();
                                    Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeights();
                                    i7 = Math.max(i7, supportedWidths.getUpper().intValue());
                                    i8 = Math.max(i8, supportedHeights.getUpper().intValue());
                                }
                                i9 = i10;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                        i5 = i8;
                        i4 = i7;
                    }
                    i3 = i6;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
                }
            }
            Pair pair = new Pair(Integer.valueOf(i4), Integer.valueOf(i5));
            Pair pair2 = new Pair(Integer.valueOf(Math.min(max * 2, ((Number) pair.d()).intValue())), Integer.valueOf(Math.min(min * 2, ((Number) pair.g()).intValue())));
            switch (d5b0.a.$EnumSwitchMapping$0[e3r0.a(((Number) pair2.d()).intValue(), ((Number) pair2.g()).intValue()).ordinal()]) {
                case 1:
                    i = 144;
                    break;
                case 2:
                    i = PsExtractor.VIDEO_STREAM_MASK;
                    break;
                case 3:
                    i = 360;
                    break;
                case 4:
                    i = 480;
                    break;
                case 5:
                    i = PublisherConfiguration.DEFAULT_MAX_RES;
                    break;
                case 6:
                    i = 1080;
                    break;
                case 7:
                    i = 1440;
                    break;
                case 8:
                    i = 2160;
                    break;
                case 9:
                    i = 4320;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            d5b0.a = i;
        }
        FrameSize frameSize = i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? i != 4320 ? null : FrameSize._4320p : FrameSize._2160p : FrameSize._1440p : FrameSize._1080p : FrameSize._720p : FrameSize._480p : FrameSize._360p : FrameSize._240p : FrameSize._144p;
        if (frameSize == null) {
            FrameSize.Companion.getClass();
            frameSize = FrameSize._4320p;
        }
        this.a = videoUrlStorage;
        this.b = aVar;
        this.c = c;
        this.d = i2;
        this.e = codecInfo;
        this.f = frameSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        if (xsna.bd3.d(r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0091, code lost:
    
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(VideoUrl videoUrl) {
        boolean z;
        String Ab = this.a.Ab(videoUrl);
        if (Ab != null) {
            a aVar = this.b;
            if (aVar instanceof a.C3936a) {
                a.C3936a c3936a = (a.C3936a) aVar;
                ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings = this.d;
                ClipsRtmpLivePlaybackSettings.Player player = clipsRtmpLivePlaybackSettings.b;
                player.getClass();
                ClipsRtmpLivePlaybackSettings.Player player2 = ClipsRtmpLivePlaybackSettings.Player.NONE;
                boolean z2 = player != player2;
                ClipsRtmpLivePlaybackSettings.Player player3 = clipsRtmpLivePlaybackSettings.a;
                player3.getClass();
                boolean z3 = player3 != player2;
                boolean B = brm0.B(Ab, "rtmp://", true);
                int i = b.$EnumSwitchMapping$0[videoUrl.ordinal()];
                z = i == 1 ? false : false;
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (videoUrl == VideoUrl.EXTERNAL_URL) {
                    if (!brm0.B(Ab, "file://", false)) {
                    }
                    z = true;
                } else {
                    boolean z4 = videoUrl.j() != VideoContentType.MP4 || videoUrl.m() <= this.f.getHeight();
                    if (!videoUrl.p()) {
                    }
                }
            }
            if (!this.c.contains(videoUrl)) {
                boolean s = videoUrl.s();
                nzf nzfVar = this.e;
                if ((s ? nzfVar.a() : videoUrl.n() ? nzfVar.b() : true) && !videoUrl.r() && z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wir0(VideoFile videoFile) {
        this(r0, r1);
        a aVar;
        VideoUrlStorage w9 = videoFile.w9();
        if (videoFile.q0()) {
            aVar = new a.C3936a(videoFile.A1());
        } else {
            aVar = a.b.a;
        }
    }
}
