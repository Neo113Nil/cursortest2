package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: OneVideoPlayerQualityExt.kt */
/* loaded from: classes3.dex */
public final class vm80 {

    /* compiled from: OneVideoPlayerQualityExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.RTMP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoContentType.OFFLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FrameSize.values().length];
            try {
                iArr2[FrameSize._144p.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FrameSize._240p.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FrameSize._360p.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FrameSize._480p.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FrameSize._720p.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FrameSize._1080p.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FrameSize._1440p.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FrameSize._2160p.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FrameSize._4320p.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Integer a(OneVideoPlayer oneVideoPlayer) {
        int i;
        sht0 j = oneVideoPlayer.j();
        if (j != null) {
            one.video.player.tracks.c J = oneVideoPlayer.J();
            if (J == null) {
                int i2 = a.$EnumSwitchMapping$0[j.a.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return -5;
                        }
                        if (i2 == 4) {
                            sht0 j2 = oneVideoPlayer.j();
                            mv70 mv70Var = j2 instanceof mv70 ? (mv70) j2 : null;
                            if (mv70Var != null) {
                                if (oneVideoPlayer.k0().isEmpty()) {
                                    return -6;
                                }
                                sht0 sht0Var = mv70Var.e;
                                if ((sht0Var != null ? sht0Var.a : null) != VideoContentType.HLS) {
                                    if ((sht0Var != null ? sht0Var.a : null) == VideoContentType.DASH) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    return -4;
                }
                return -2;
            }
            switch (a.$EnumSwitchMapping$1[((cms0) J.c).b().ordinal()]) {
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
            return Integer.valueOf(i);
        }
        return null;
    }

    public static final one.video.player.tracks.c b(int i, List<? extends one.video.player.tracks.c> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i == ((cms0) ((one.video.player.tracks.c) obj).c).b().getHeight()) {
                break;
            }
        }
        return (one.video.player.tracks.c) obj;
    }

    public static final void c(OneVideoPlayer oneVideoPlayer, int i) {
        if (i == -4 || i == -2) {
            oneVideoPlayer.o0();
            return;
        }
        List<one.video.player.tracks.c> k0 = oneVideoPlayer.k0();
        one.video.player.tracks.c b = i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? i != 4320 ? null : b(4320, k0) : b(2160, k0) : b(1440, k0) : b(1080, k0) : b(PublisherConfiguration.DEFAULT_MAX_RES, k0) : b(480, k0) : b(360, k0) : b(PsExtractor.VIDEO_STREAM_MASK, k0) : b(144, k0);
        if (b != null) {
            oneVideoPlayer.S(b);
        }
    }
}
