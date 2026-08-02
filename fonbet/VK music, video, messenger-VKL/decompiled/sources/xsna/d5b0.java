package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.reefton.dto.ReefContentQuality;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.FrameSize;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: PlayerTypesUtils.kt */
/* loaded from: classes3.dex */
public final class d5b0 {
    public static int a = Integer.MIN_VALUE;

    /* compiled from: PlayerTypesUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameSize.values().length];
            try {
                iArr[FrameSize._144p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameSize._240p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameSize._360p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FrameSize._480p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FrameSize._720p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FrameSize._1080p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FrameSize._1440p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FrameSize._2160p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FrameSize._4320p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ReefContentQuality a(int i) {
        if (i != -5) {
            if (i != -4) {
                if (i != -3) {
                    if (i != -2) {
                        if (i != -1) {
                            return i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? ReefContentQuality.UNKNOWN : ReefContentQuality.P2160 : ReefContentQuality.P1440 : ReefContentQuality.P1080 : ReefContentQuality.P720 : ReefContentQuality.P480 : ReefContentQuality.P360 : ReefContentQuality.P240 : ReefContentQuality.P144;
                        }
                    }
                }
            }
            return ReefContentQuality.AUTO;
        }
        return ReefContentQuality.UNKNOWN;
    }

    public static int b(int i, int i2) {
        switch (a.$EnumSwitchMapping$0[e3r0.a(i, i2).ordinal()]) {
            case 1:
                return 144;
            case 2:
                return PsExtractor.VIDEO_STREAM_MASK;
            case 3:
                return 360;
            case 4:
                return 480;
            case 5:
                return PublisherConfiguration.DEFAULT_MAX_RES;
            case 6:
                return 1080;
            case 7:
                return 1440;
            case 8:
                return 2160;
            case 9:
                return 4320;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String c(int i) {
        return i != -5 ? i != -4 ? i != -3 ? i != -2 ? i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? i != 4320 ? "unknown" : "4320" : "2160" : "1440" : "1080" : "720" : "480" : "360" : "240" : "144" : "auto" : "rtmp" : "auto" : "rtmp";
    }
}
