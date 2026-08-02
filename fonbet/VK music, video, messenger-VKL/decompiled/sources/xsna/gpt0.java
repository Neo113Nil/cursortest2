package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Range;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.live.LiveLayoutSettings;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.models.videofile.LivePlayBackSettingsDo;
import com.vk.libvideo.models.videofile.PixelEventDo;
import com.vk.libvideo.models.videofile.StatPixelDo;
import com.vk.libvideo.models.videofile.StatPixelListDo;
import com.vk.libvideo.models.videofile.TimelineThumbsDo;
import com.vk.libvideo.models.videofile.VideoFilePlaybackDo;
import com.vk.libvideo.models.videofile.VideoQuality;
import com.vk.libvideo.models.videofile.VideoTypeDo;
import com.vk.libvideo.models.videofile.VideoUrlInfoDo;
import com.vk.libvideo.models.videofile.VideoUrlStorageDo;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.s9t0;
import xsna.x8s;

/* compiled from: VideoUtils.kt */
/* loaded from: classes.dex */
public final class gpt0 {
    public static final gpt0 a = new gpt0();
    public static final bpn0 b = new bpn0(new hu2(15));
    public static final Set<Integer> c = rl3.y0(new Integer[]{-1001, -1002, -1003, -1004});
    public static final bpn0 d = new bpn0(new s63(14));

    /* compiled from: VideoUtils.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[PlayerError.values().length];
            try {
                iArr[PlayerError.ERROR_CANT_DECODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerError.ERROR_SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerError.ERROR_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerError.ERROR_NOT_PROCESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerError.ERROR_NOT_CONVERTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayerError.ERROR_LIVE_NOT_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlayerError.ERROR_CONTENT_RESTRICTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlayerError.ERROR_NOT_SUPPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlayerError.ERROR_NOT_SUPPORT_RESOLUTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PlayerError.ERROR_GL_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OneVideoPlaybackException.ErrorCode.values().length];
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_NO_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_CLEARTEXT_NOT_PERMITTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_READ_POSITION_OUT_OF_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_WRITE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.VIDEO_FRAME_PROCESSOR_INIT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.VIDEO_FRAME_PROCESSING_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_PROVISIONING_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_EXCEEDS_CAPABILITIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_SCHEME_UNSUPPORTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_UNSUPPORTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_UNSPECIFIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_CONTENT_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_LICENSE_ACQUISITION_FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_DISALLOWED_OPERATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_SYSTEM_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_DEVICE_REVOKED.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DRM_LICENSE_EXPIRED.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODER_INIT_FAILED.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODER_QUERY_FAILED.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODING_FAILED.ordinal()] = 21;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.DECODING_RESOURCES_RECLAIMED.ordinal()] = 22;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_INIT_FAILED.ordinal()] = 23;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.REMOTE_ERROR.ordinal()] = 24;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.BEHIND_LIVE_WINDOW.ordinal()] = 25;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.TIMEOUT.ordinal()] = 26;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.FAILED_RUNTIME_CHECK.ordinal()] = 27;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_UNSPECIFIED.ordinal()] = 28;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_FAILED.ordinal()] = 29;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT.ordinal()] = 30;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_INVALID_HTTP_CONTENT_TYPE.ordinal()] = 31;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_BAD_HTTP_STATUS.ordinal()] = 32;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.IO_FILE_NOT_FOUND.ordinal()] = 33;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED.ordinal()] = 34;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_UNSUPPORTED.ordinal()] = 35;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_UNSUPPORTED.ordinal()] = 36;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED.ordinal()] = 37;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DownloadInfo.State.values().length];
            try {
                iArr3[DownloadInfo.State.STATE_REMOVING.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[DownloadInfo.State.STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[VideoTypeDo.values().length];
            try {
                iArr4[VideoTypeDo.COVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr4[VideoTypeDo.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr4[VideoTypeDo.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr4[VideoTypeDo.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr4[VideoTypeDo.CLIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr4[VideoTypeDo.STORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[VideoTypeDo.VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused57) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static Boolean A(d3b0 d3b0Var) {
        OneVideoPlayer a2;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return null;
        }
        return Boolean.valueOf(a2.k0().isEmpty() && !a2.F().isEmpty());
    }

    public static boolean B(VideoFile videoFile) {
        boolean z = (videoFile.C2() || videoFile.q0() || !epx.f(videoFile.getType(), "video")) ? false : true;
        VideoRestriction O = videoFile.O();
        return z && !videoFile.isExternal() && !((O != null && !O.Bb()) || fxc0.B().b0().e(videoFile)) && xg5.a().d(videoFile.I0()) && ((long) videoFile.getDuration()) > ((Number) ((Range) b.getValue()).getUpper()).longValue();
    }

    public static boolean C(VideoFile videoFile) {
        return videoFile.z0() && videoFile.Na() > 0;
    }

    public static final boolean D(VideoFile videoFile) {
        if (!fxc0.B().s().isEnabled() || fxc0.B().c(videoFile)) {
            return false;
        }
        VideoRestriction O = videoFile.O();
        return ((O != null && !O.Bb()) || videoFile.q0() || BuildInfo.t() || videoFile.W9()) ? false : true;
    }

    public static VideoUrlStorageDo E(VideoUrlStorage videoUrlStorage) {
        Map<String, VideoUrlInfo> v9 = videoUrlStorage.v9();
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(v9.size()));
        Iterator<T> it = v9.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            VideoQuality.a aVar = VideoQuality.Companion;
            int Ab = ((VideoUrlInfo) entry.getValue()).Ab();
            aVar.getClass();
            linkedHashMap.put(key, new VideoUrlInfoDo(VideoQuality.a.a(Ab), ((VideoUrlInfo) entry.getValue()).getUrl(), ((VideoUrlInfo) entry.getValue()).Bb(), ((VideoUrlInfo) entry.getValue()).Db(), ((VideoUrlInfo) entry.getValue()).isExternal(), ((VideoUrlInfo) entry.getValue()).Cb(), ((VideoUrlInfo) entry.getValue()).zb()));
        }
        return new VideoUrlStorageDo(linkedHashMap);
    }

    public static final s9t0 F(DownloadInfo downloadInfo) {
        DownloadInfo.State f = downloadInfo != null ? downloadInfo.f() : null;
        int i = f == null ? -1 : a.$EnumSwitchMapping$2[f.ordinal()];
        return i != -1 ? i != 1 ? i != 2 ? i != 3 ? downloadInfo.e() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new s9t0.d((int) Math.ceil(downloadInfo.e()), w8o.c(downloadInfo.f()), w8o.d(downloadInfo.f())) : s9t0.e.a : s9t0.a.a : s9t0.b.a : s9t0.c.a : s9t0.c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VideoFilePlaybackDo G(VideoFile videoFile) {
        VideoFile videoFile2;
        VideoTypeDo videoTypeDo;
        int e;
        Iterator it;
        if (videoFile.I1()) {
            videoTypeDo = VideoTypeDo.COVER;
        } else if (videoFile.x5()) {
            videoTypeDo = VideoTypeDo.GIF;
        } else if (videoFile.q0()) {
            videoTypeDo = VideoTypeDo.LIVE;
        } else {
            if (!videoFile.Sa()) {
                videoFile2 = videoFile;
                videoTypeDo = g620.f().c(videoFile2) ? VideoTypeDo.CLIP : videoFile2.N() ? VideoTypeDo.STORY : VideoTypeDo.VIDEO;
                VideoTypeDo videoTypeDo2 = videoTypeDo;
                boolean A1 = videoFile2.A1();
                LivePlayBackSettings K1 = videoFile2.K1();
                LivePlayBackSettingsDo livePlayBackSettingsDo = K1 == null ? new LivePlayBackSettingsDo(K1.b, K1.c, K1.d, K1.e, K1.f.zb()) : null;
                String r1 = videoFile2.r1();
                VideoUrlStorageDo E = E(videoFile2.w9());
                VideoUrlStorage L7 = videoFile2.L7();
                VideoUrlStorageDo E2 = L7 == null ? E(L7) : null;
                boolean Sa = videoFile2.Sa();
                float n5 = videoFile2.n5();
                long millis = TimeUnit.SECONDS.toMillis(videoFile2.getDuration());
                int width = videoFile2.getWidth();
                int height = videoFile2.getHeight();
                boolean M5 = videoFile2.M5();
                LivePlayBackSettingsDo livePlayBackSettingsDo2 = livePlayBackSettingsDo;
                long j = videoFile2.I0().b;
                int o0 = videoFile2.o0();
                String Y6 = videoFile2.Y6();
                String x8 = videoFile2.x8();
                String K5 = videoFile2.K5();
                Set<Map.Entry<StatPixel.a, nsk0>> entrySet = videoFile2.e0().entrySet();
                e = on00.e(c5g.u(entrySet, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    StatPixel.a aVar = (StatPixel.a) entry.getKey();
                    nsk0 nsk0Var = (nsk0) entry.getValue();
                    String a2 = aVar.a();
                    List<StatPixel> a3 = nsk0Var.a();
                    Iterator it2 = it;
                    VideoTypeDo videoTypeDo3 = videoTypeDo2;
                    boolean z = A1;
                    ArrayList arrayList = new ArrayList(c5g.u(a3, 10));
                    for (StatPixel statPixel : a3) {
                        arrayList.add(new StatPixelDo(statPixel.zb().a(), statPixel.getUrl(), statPixel.Bb(), statPixel.Ab(), null));
                    }
                    Pair pair = new Pair(PixelEventDo.a(a2), new StatPixelListDo(arrayList));
                    linkedHashMap.put(pair.i(), pair.j());
                    A1 = z;
                    it = it2;
                    videoTypeDo2 = videoTypeDo3;
                }
                VideoTypeDo videoTypeDo4 = videoTypeDo2;
                boolean z2 = A1;
                boolean p0 = videoFile.p0();
                String r = videoFile.r();
                TimelineThumbs B0 = videoFile.B0();
                return new VideoFilePlaybackDo(videoTypeDo4, z2, livePlayBackSettingsDo2, r1, E, E2, Sa, n5, millis, width, height, M5, j, o0, Y6, x8, K5, linkedHashMap, p0, r, B0 == null ? new TimelineThumbsDo(B0.Db(), B0.Cb(), B0.Ab(), B0.zb(), B0.Bb(), B0.Eb(), B0.Gb(), B0.Fb()) : null);
            }
            videoTypeDo = VideoTypeDo.MESSAGE;
        }
        videoFile2 = videoFile;
        VideoTypeDo videoTypeDo22 = videoTypeDo;
        boolean A12 = videoFile2.A1();
        LivePlayBackSettings K12 = videoFile2.K1();
        if (K12 == null) {
        }
        String r12 = videoFile2.r1();
        VideoUrlStorageDo E3 = E(videoFile2.w9());
        VideoUrlStorage L72 = videoFile2.L7();
        if (L72 == null) {
        }
        boolean Sa2 = videoFile2.Sa();
        float n52 = videoFile2.n5();
        long millis2 = TimeUnit.SECONDS.toMillis(videoFile2.getDuration());
        int width2 = videoFile2.getWidth();
        int height2 = videoFile2.getHeight();
        boolean M52 = videoFile2.M5();
        LivePlayBackSettingsDo livePlayBackSettingsDo22 = livePlayBackSettingsDo;
        long j2 = videoFile2.I0().b;
        int o02 = videoFile2.o0();
        String Y62 = videoFile2.Y6();
        String x82 = videoFile2.x8();
        String K52 = videoFile2.K5();
        Set<Map.Entry<StatPixel.a, nsk0>> entrySet2 = videoFile2.e0().entrySet();
        e = on00.e(c5g.u(entrySet2, 10));
        if (e < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
        it = entrySet2.iterator();
        while (it.hasNext()) {
        }
        VideoTypeDo videoTypeDo42 = videoTypeDo22;
        boolean z22 = A12;
        boolean p02 = videoFile.p0();
        String r2 = videoFile.r();
        TimelineThumbs B02 = videoFile.B0();
        return new VideoFilePlaybackDo(videoTypeDo42, z22, livePlayBackSettingsDo22, r12, E3, E2, Sa2, n52, millis2, width2, height2, M52, j2, o02, Y62, x82, K52, linkedHashMap2, p02, r2, B02 == null ? new TimelineThumbsDo(B02.Db(), B02.Cb(), B02.Ab(), B02.zb(), B02.Bb(), B02.Eb(), B02.Gb(), B02.Fb()) : null);
    }

    public static boolean a(VideoFile videoFile) {
        if (videoFile == null || !g620.f().getExperiments().c()) {
            return false;
        }
        boolean z = (videoFile.C2() || videoFile.q0() || !epx.f(videoFile.getType(), "video")) ? false : true;
        VideoRestriction O = videoFile.O();
        return ((Range) b.getValue()).contains((Range) Long.valueOf(videoFile.getDuration())) & (!(!(O == null || O.Bb()) || fxc0.B().b0().e(videoFile))) & z & qr.f(videoFile.I0());
    }

    public static int b(int i, VideoFile videoFile) {
        if (videoFile.k1() == i || videoFile.b0() != videoFile.k1()) {
            return videoFile.b0();
        }
        if (i > 0) {
            return i;
        }
        xuo0.a.getClass();
        return (int) (xuo0.a() / 1000);
    }

    public static final boolean c(Context context) {
        if (BuildInfo.q()) {
            return true;
        }
        VideoPipStateHolder.a.getClass();
        return !VideoPipStateHolder.d() && iah0.s(context);
    }

    public static m7q d(VideoFilePlaybackDo videoFilePlaybackDo) {
        int i;
        String a2 = qxi0.a();
        String r = videoFilePlaybackDo.r();
        switch (a.$EnumSwitchMapping$3[videoFilePlaybackDo.i().ordinal()]) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 0;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        boolean A1 = videoFilePlaybackDo.A1();
        LivePlayBackSettingsDo e = videoFilePlaybackDo.e();
        LivePlayBackSettings livePlayBackSettings = e != null ? new LivePlayBackSettings(e.e(), e.d(), e.i(), e.f(), new LiveLayoutSettings(e.g())) : null;
        String g = videoFilePlaybackDo.g();
        VideoUrlStorageDo j = videoFilePlaybackDo.j();
        if (j == null) {
            j = videoFilePlaybackDo.j();
        }
        Map<String, VideoUrlInfoDo> d2 = j.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(d2.size()));
        Iterator<T> it = d2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new VideoUrlInfo(((VideoUrlInfoDo) entry.getValue()).e().i(), ((VideoUrlInfoDo) entry.getValue()).getUrl(), ((VideoUrlInfoDo) entry.getValue()).f(), ((VideoUrlInfoDo) entry.getValue()).i(), ((VideoUrlInfoDo) entry.getValue()).isExternal(), ((VideoUrlInfoDo) entry.getValue()).g(), ((VideoUrlInfoDo) entry.getValue()).d()));
        }
        VideoUrlStorage videoUrlStorage = new VideoUrlStorage(linkedHashMap);
        boolean Sa = videoFilePlaybackDo.Sa();
        float n5 = videoFilePlaybackDo.n5();
        long c2 = com.vk.libvideo.autoplay.j.c(videoFilePlaybackDo);
        int d3 = (int) videoFilePlaybackDo.d();
        Size size = new Size(videoFilePlaybackDo.getWidth(), videoFilePlaybackDo.getHeight());
        boolean M5 = videoFilePlaybackDo.M5();
        int o0 = videoFilePlaybackDo.o0();
        long f = videoFilePlaybackDo.f();
        String Y6 = videoFilePlaybackDo.Y6();
        String x8 = videoFilePlaybackDo.x8();
        String K5 = videoFilePlaybackDo.K5();
        Set<Map.Entry<PixelEventDo, StatPixelListDo>> entrySet = videoFilePlaybackDo.e0().entrySet();
        int e2 = on00.e(c5g.u(entrySet, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String d4 = ((PixelEventDo) entry2.getKey()).d();
            StatPixelListDo statPixelListDo = (StatPixelListDo) entry2.getValue();
            StatPixel.a a3 = StatPixel.a.b.a(d4);
            List<StatPixelDo> d5 = statPixelListDo.d();
            int i2 = i;
            Iterator it3 = it2;
            boolean z = A1;
            ArrayList arrayList = new ArrayList(c5g.u(d5, 10));
            Iterator it4 = d5.iterator();
            while (it4.hasNext()) {
                StatPixelDo statPixelDo = (StatPixelDo) it4.next();
                arrayList.add(new StatPixel(StatPixel.a.b.a(statPixelDo.d()), statPixelDo.getUrl(), statPixelDo.f(), statPixelDo.e()));
                livePlayBackSettings = livePlayBackSettings;
                it4 = it4;
                g = g;
            }
            Pair pair = new Pair(a3, new nsk0(arrayList));
            linkedHashMap2.put(pair.i(), pair.j());
            i = i2;
            A1 = z;
            it2 = it3;
        }
        return new n7q(-4, i, A1, livePlayBackSettings, g, videoUrlStorage, Sa, n5, videoFilePlaybackDo.i() == VideoTypeDo.CLIP || videoFilePlaybackDo.i() == VideoTypeDo.GIF, c2, d3, size, M5, false, o0, f, Y6, a2, r, x8, null, true, K5, linkedHashMap2).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m7q e(gpt0 gpt0Var, VideoFile videoFile, int i, String str, boolean z, boolean z2, String str2, String str3, boolean z3, int i2) {
        VideoRestriction O;
        int i3;
        VideoUrlStorage L7;
        int i4;
        VideoUrlStorage w9;
        String a2 = (i2 & 32) != 0 ? qxi0.a() : str2;
        String r = (i2 & 64) != 0 ? videoFile.r() : str3;
        boolean z4 = (i2 & 256) != 0 ? false : z3;
        if (videoFile.Z9() || !((O = videoFile.O()) == null || O.Bb())) {
            L.l("unable to create ExoVideoSource for restricted content " + videoFile.r1());
            return null;
        }
        if (!videoFile.I1()) {
            if (videoFile.x5()) {
                i3 = 0;
            } else if (videoFile.q0()) {
                i4 = 2;
            } else if (videoFile.Sa()) {
                i4 = 5;
            } else if (g620.f().c(videoFile)) {
                i4 = 3;
            } else if (videoFile.N()) {
                i4 = 7;
            } else if (!z4 || (L7 = videoFile.L7()) == null || L7.isEmpty()) {
                i3 = 1;
            } else {
                i4 = 8;
            }
            boolean A1 = videoFile.A1();
            LivePlayBackSettings K1 = videoFile.K1();
            String r1 = videoFile.r1();
            w9 = (z4 || videoFile.L7() == null) ? videoFile.w9() : videoFile.L7();
            if (w9 == null) {
                w9 = videoFile.w9();
            }
            return new n7q(i, i3, A1, K1, r1, w9, videoFile.Sa(), videoFile.n5(), !g620.f().c(videoFile) || videoFile.x5(), com.vk.libvideo.autoplay.j.b(videoFile), (int) TimeUnit.SECONDS.toMillis(videoFile.getDuration()), new Size(videoFile.getWidth(), videoFile.getHeight()), videoFile.M5(), z, videoFile.o0(), videoFile.I0().b, videoFile.Y6(), a2, r, videoFile.x8(), str, z2, videoFile.K5(), videoFile.e0()).a();
        }
        i4 = 4;
        i3 = i4;
        boolean A12 = videoFile.A1();
        LivePlayBackSettings K12 = videoFile.K1();
        String r12 = videoFile.r1();
        if (z4) {
        }
        if (w9 == null) {
        }
        return new n7q(i, i3, A12, K12, r12, w9, videoFile.Sa(), videoFile.n5(), !g620.f().c(videoFile) || videoFile.x5(), com.vk.libvideo.autoplay.j.b(videoFile), (int) TimeUnit.SECONDS.toMillis(videoFile.getDuration()), new Size(videoFile.getWidth(), videoFile.getHeight()), videoFile.M5(), z, videoFile.o0(), videoFile.I0().b, videoFile.Y6(), a2, r, videoFile.x8(), str, z2, videoFile.K5(), videoFile.e0()).a();
    }

    public static LayerDrawable f(Context context, float f, float f2, int i) {
        return new LayerDrawable(new Drawable[]{m33.a(R.drawable.bg_video_live, context), new aeo0(context.getResources(), "LIVE", iah0.a(f), f2, i)});
    }

    public static final String g(Context context, VideoFile videoFile) {
        if (videoFile.getDuration() <= 0) {
            return m(context, videoFile, true, false);
        }
        int max = Math.max(videoFile.getDuration(), 0);
        int i = (max / 60) % 60;
        int i2 = max % 60;
        return max < 3600 ? context.getResources().getString(R.string.n_mins_secs, Integer.valueOf(i), Integer.valueOf(i2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(max / 3600), Integer.valueOf(i), Integer.valueOf(i2)}, 3));
    }

    public static String h(m7q m7qVar) {
        int b2 = m7qVar.b();
        return b2 != 0 ? b2 != 1 ? b2 != 2 ? b2 != 3 ? b2 != 4 ? b2 != 5 ? b2 != 7 ? "unknown" : "stories" : "message" : "cover" : "clip" : "live" : "video" : "gif";
    }

    public static ImageSize i(Context context, VideoFile videoFile) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (videoFile != null) {
            int h = (int) (ImageScreenSize.BIG.h() * o(context));
            ImageSize f = w65.f(videoFile.getImage());
            ImageSize Cb = videoFile.getImage().Cb(h, false, false);
            Image Eb = videoFile.getImage().Eb();
            ImageSize imageSize = (Eb == null || (arrayList2 = Eb.b) == null) ? null : (ImageSize) ixj0.b(arrayList2);
            ImageSize f2 = w65.f(videoFile.e1());
            ImageSize Cb2 = videoFile.e1().Cb(h, false, false);
            Image Eb2 = videoFile.e1().Eb();
            for (ImageSize imageSize2 : e43.l(f, Cb, imageSize, f2, Cb2, (Eb2 == null || (arrayList = Eb2.b) == null) ? null : (ImageSize) ixj0.b(arrayList))) {
                if (imageSize2 != null) {
                    return imageSize2;
                }
            }
        }
        return null;
    }

    public static long j(VideoFile videoFile) {
        return videoFile.b0() * 1000;
    }

    public static String k(Context context, VideoFile videoFile) {
        String c2;
        if (fxc0.B().J().j0()) {
            return r(context, videoFile);
        }
        DecimalFormat decimalFormat = z8s.a;
        c2 = z8s.c(context, j(videoFile), x8s.a.g, true);
        return c2;
    }

    public static final Pair<String, sht0> l(VideoFile videoFile) {
        ListBuilder e = e43.e();
        e.addAll(zot0.c());
        e.addAll(zot0.d());
        e.addAll(zot0.f());
        Pair<sht0, VideoUrl> a2 = new on80(videoFile).a(e.g());
        if (a2 == null) {
            return null;
        }
        sht0 d2 = a2.d();
        String Ab = videoFile.w9().Ab(a2.g());
        Pair pair = Ab == null ? null : new Pair(d2, Ab);
        if (pair != null) {
            return new Pair<>((String) pair.g(), (sht0) pair.d());
        }
        return null;
    }

    public static final String m(Context context, VideoFile videoFile, boolean z, boolean z2) {
        String string = (TextUtils.isEmpty(videoFile.getPlatform()) || !z) ? (fxc0.B().J().v() && videoFile.ab() == OfferVkVideo.LISTING) ? context.getString(R.string.vk_video_title) : "" : videoFile.getPlatform();
        if (!z2 && videoFile.z0()) {
            return context.getString(R.string.video_live_upcoming);
        }
        if (videoFile.q0()) {
            return context.getString(R.string.video_live).toUpperCase(Locale.ROOT);
        }
        if (videoFile.getDuration() <= 0 && (string.length() != 0 || videoFile.getDuration() != 0)) {
            return string;
        }
        String a2 = z8s.a(videoFile.getDuration());
        return TextUtils.isEmpty(string) ? a2 : pzl.b(string, " · ", a2);
    }

    public static final int n(PlayerError playerError, boolean z) {
        switch (a.$EnumSwitchMapping$0[playerError.ordinal()]) {
            case 1:
                return z ? R.string.video_err_decode_clip : R.string.video_err_decode;
            case 2:
                return R.string.err_internal;
            case 3:
                return R.string.default_network_error;
            case 4:
                return R.string.err_video_not_processed;
            case 5:
                return R.string.err_video_not_converted;
            case 6:
                return R.string.video_err_live_not_ready;
            case 7:
                return R.string.video_restricted_withdrawn;
            case 8:
                return R.string.video_not_supported_flv;
            case 9:
                return R.string.video_not_supported_resolution;
            case 10:
                return R.string.video_gl_error;
            default:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown video error code: " + playerError));
                return R.string.error;
        }
    }

    public static float o(Context context) {
        Float f;
        float f2 = 1.0f;
        if (context == null) {
            return 1.0f;
        }
        xps0 X = fxc0.B().J().X();
        float f3 = ((jk80) fz5.d.j(context)).getBitrateEstimate() < 2097152 ? 0.5f : 1.0f;
        if (X != null) {
            float c2 = X.c();
            int b2 = X.b();
            int a2 = X.a();
            if (c2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && b2 > 0 && a2 > 0 && a2 >= b2) {
                float h = ImageScreenSize.BIG.h();
                if (h >= b2) {
                    f2 = Math.min(c2, a2 / h);
                }
            }
            f = Float.valueOf(f2);
        } else {
            f = null;
        }
        return f != null ? Math.min(f3, f.floatValue()) : f3;
    }

    public static final zva0 p(OneVideoPlaybackException.ErrorCode errorCode, boolean z) {
        int[] iArr = a.$EnumSwitchMapping$1;
        int i = iArr[errorCode.ordinal()];
        if (i == 9 || i == 10) {
            return new zva0(R.string.video_not_supported_resolution, R.string.video_error_retry);
        }
        switch (iArr[errorCode.ordinal()]) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return new zva0(R.string.video_restricted_withdrawn, R.string.video_error_retry);
            default:
                if (iArr[errorCode.ordinal()] == 11) {
                    return new zva0(R.string.video_not_supported_flv, R.string.video_error_retry);
                }
                switch (iArr[errorCode.ordinal()]) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return new zva0(R.string.video_gl_error, R.string.video_error_retry);
                    default:
                        switch (iArr[errorCode.ordinal()]) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                return z ? new zva0(R.string.video_err_load_offline, R.string.watch_from_start) : new zva0(R.string.default_network_error, R.string.video_error_retry);
                            default:
                                switch (iArr[errorCode.ordinal()]) {
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        return new zva0(R.string.err_internal, R.string.video_error_retry);
                                    default:
                                        return new zva0(R.string.vk_error, R.string.video_error_retry);
                                }
                        }
                }
        }
    }

    public static String q(int i) {
        String i2 = pvo0.i(true, i, false, true);
        if (i2.length() <= 0) {
            return i2;
        }
        return ((Object) String.valueOf(i2.charAt(0)).toUpperCase(Locale.ROOT)) + i2.substring(1);
    }

    public static String r(Context context, VideoFile videoFile) {
        String c2;
        if (C(videoFile)) {
            return q((int) videoFile.Na());
        }
        if (videoFile.k1() > 0) {
            return q(videoFile.k1());
        }
        DecimalFormat decimalFormat = z8s.a;
        c2 = z8s.c(context, videoFile.b0() * 1000, x8s.a.g, true);
        return c2.toString();
    }

    public static String s(int i, Context context) {
        return context.getString(i != -6 ? i != -4 ? i != -2 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? R.string.video_quality_unknown : R.string.video_quality_2160 : R.string.video_quality_1440 : R.string.video_quality_1080 : R.string.video_quality_720 : R.string.video_quality_480 : R.string.video_quality_360 : R.string.video_quality_240 : R.string.video_quality_hls : R.string.video_quality_dash : R.string.video_quality_sound_only);
    }

    public static SpannableStringBuilder t(Context context, int i, Map map) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) s(i, context));
        int length = spannableStringBuilder.length();
        List list = (List) map.get(Integer.valueOf(i));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!drm0.N((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
            if (g0 != null) {
                if (g0.length() <= 0) {
                    g0 = null;
                }
                if (g0 != null) {
                    spannableStringBuilder.append((CharSequence) (" (" + g0 + ')'));
                }
            }
        }
        if (length != spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_gray_500)), length, spannableStringBuilder.length(), 18);
        }
        return spannableStringBuilder;
    }

    public static String u(Context context, boolean z, int i, int i2) {
        if (!z) {
            return context.getString(i2);
        }
        return context.getString(i2) + " · " + s(i, context);
    }

    public static final CharSequence v(VideoFile videoFile) {
        String title = videoFile.getTitle();
        CharSequence i = ucp.i(title);
        return !TextUtils.isEmpty(i) ? i : title;
    }

    public static final boolean w(VideoFile videoFile) {
        long Na = videoFile.Na() * 1000;
        xuo0.a.getClass();
        return Na - xuo0.a() > 0;
    }

    public static final boolean x(VideoFile videoFile) {
        Pair<String, sht0> l;
        VideoRestriction O;
        if ((fxc0.B().c(videoFile) && (O = videoFile.O()) != null && !O.Bb()) || (l = l(videoFile)) == null) {
            return false;
        }
        if (videoFile instanceof ClipVideoFile) {
            ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
            if (clipVideoFile.F4() != VideoCanDownload.FILE && clipVideoFile.F4() != VideoCanDownload.CACHE_AND_FILE) {
                return false;
            }
        } else if (videoFile.F4() != VideoCanDownload.CACHE && videoFile.F4() != VideoCanDownload.CACHE_AND_FILE) {
            return false;
        }
        return !drm0.N(l.i());
    }

    public static boolean y(VideoFile videoFile) {
        ListBuilder a2;
        Object obj;
        String Ab;
        xuo0.a.getClass();
        long a3 = xuo0.a();
        wir0 wir0Var = new wir0(videoFile);
        a2 = zot0.a();
        ListIterator listIterator = a2.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            if (wir0Var.a((VideoUrl) obj)) {
                break;
            }
        }
        VideoUrl videoUrl = (VideoUrl) obj;
        if (videoUrl == null || (Ab = videoFile.w9().Ab(videoUrl)) == null) {
            return false;
        }
        return z(a3, Ab);
    }

    public static boolean z(long j, String str) {
        List<String> b2;
        String str2;
        Long n;
        hl10 b3 = ((Regex) d.getValue()).b(str);
        return b3 == null || (b2 = b3.b()) == null || (str2 = (String) j5g.k0(b2)) == null || (n = arm0.n(str2)) == null || j - (n.longValue() - TimeUnit.HOURS.toMillis(4L)) < 0;
    }
}
