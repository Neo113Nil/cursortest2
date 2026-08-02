package xsna;

import android.os.SystemClock;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.video.dto.VideoAdsInfoDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.video.dto.VideoVideoTrackingInfoDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import java.util.List;

/* compiled from: VideoToVideoFileMapper.kt */
/* loaded from: classes3.dex */
public final class okt0 {

    /* compiled from: VideoToVideoFileMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoVideoTypeDto.values().length];
            try {
                iArr[VideoVideoTypeDto.SHORT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoVideoTypeDto.MUSIC_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoVideoTypeDto.UGC_MUSIC_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoVideoTypeDto.VIDEO_MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoVideoTypeDto.STORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoVideoTypeDto.INTERACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoLiveStatusDto.values().length];
            try {
                iArr2[VideoLiveStatusDto.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoLiveStatusDto.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoLiveStatusDto.UPCOMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VideoLiveStatusDto.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VideoLiveStatusDto.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VideoLiveStatusDto.POSTLIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        if (r3 == null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VideoFileOld a(VideoVideoDto videoVideoDto) {
        String str;
        VideoCanDownload videoCanDownload;
        TitleAction titleAction;
        int i;
        VideoRestriction videoRestriction;
        BaseBoolIntDto l;
        VideoVideoTypeDto t1 = videoVideoDto.t1();
        VideoFileOld clipVideoFile = (t1 == null ? -1 : a.$EnumSwitchMapping$0[t1.ordinal()]) == 1 ? new ClipVideoFile() : new VideoFileOld();
        Integer w0 = videoVideoDto.w0();
        clipVideoFile.c = w0 != null ? w0.intValue() : 0;
        UserId q = videoVideoDto.q();
        if (q == null) {
            q = UserId.d;
        }
        clipVideoFile.b = q;
        UserId userId = videoVideoDto.getUserId();
        if (userId == null) {
            userId = UserId.d;
        }
        clipVideoFile.d = userId;
        Integer a0 = videoVideoDto.a0();
        clipVideoFile.e = a0 != null ? a0.intValue() : 0;
        if (clipVideoFile.h != null) {
            clipVideoFile.i = Long.valueOf(System.currentTimeMillis());
        }
        String title = videoVideoDto.getTitle();
        if (title == null) {
            title = "";
        }
        clipVideoFile.l = title;
        clipVideoFile.m = videoVideoDto.getDescription();
        String platform = videoVideoDto.getPlatform();
        if (platform == null) {
            platform = "";
        }
        clipVideoFile.o = platform;
        VideoVideoTypeDto t12 = videoVideoDto.t1();
        switch (t12 == null ? -1 : a.$EnumSwitchMapping$0[t12.ordinal()]) {
            case 1:
                str = "short_video";
                break;
            case 2:
                str = "music_video";
                break;
            case 3:
                str = "ugc_music_video";
                break;
            case 4:
                str = "video_message";
                break;
            case 5:
                str = "story";
                break;
            case 6:
                str = "interactive";
                break;
            default:
                str = "video";
                break;
        }
        clipVideoFile.p = str;
        Integer Z = videoVideoDto.Z();
        clipVideoFile.q = Z != null ? Z.intValue() : 0;
        Integer x1 = videoVideoDto.x1();
        clipVideoFile.s = x1 != null ? x1.intValue() : 0;
        Integer n1 = videoVideoDto.n1();
        clipVideoFile.t = n1 != null ? n1.intValue() : 0;
        BaseLikesDto D0 = videoVideoDto.D0();
        Integer d = D0 != null ? D0.d() : null;
        clipVideoFile.u = d != null ? d.intValue() : 0;
        Integer M = videoVideoDto.M();
        clipVideoFile.v = M != null ? M.intValue() : 0;
        BaseRepostsInfoDto b1 = videoVideoDto.b1();
        Integer valueOf = b1 != null ? Integer.valueOf(b1.getCount()) : null;
        clipVideoFile.w = valueOf != null ? valueOf.intValue() : 0;
        BaseLikesDto D02 = videoVideoDto.D0();
        BaseBoolIntDto e = D02 != null ? D02.e() : null;
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        clipVideoFile.x = e == baseBoolIntDto;
        BaseRepostsInfoDto b12 = videoVideoDto.b1();
        clipVideoFile.y = (b12 != null ? b12.e() : null) == baseBoolIntDto;
        BasePropertyExistsDto V0 = videoVideoDto.V0();
        clipVideoFile.z = V0 != null && V0.i() == 1;
        clipVideoFile.B = videoVideoDto.n() == baseBoolIntDto;
        clipVideoFile.C = videoVideoDto.C() == null || videoVideoDto.C() == baseBoolIntDto;
        clipVideoFile.F = videoVideoDto.u() == baseBoolIntDto;
        Integer G = videoVideoDto.G();
        clipVideoFile.H = G != null && G.intValue() == 1;
        clipVideoFile.I = videoVideoDto.j() == baseBoolIntDto && videoVideoDto.L1() != baseBoolIntDto;
        clipVideoFile.J = videoVideoDto.k() == null || videoVideoDto.k() == baseBoolIntDto;
        Integer p = videoVideoDto.p();
        if (p != null) {
            int intValue = p.intValue();
            VideoCanDownload.Companion.getClass();
            videoCanDownload = VideoCanDownload.a.a(intValue);
        }
        videoCanDownload = VideoCanDownload.NO;
        clipVideoFile.b2(videoCanDownload);
        clipVideoFile.D = videoVideoDto.o() == baseBoolIntDto;
        ActionLinksActionDto o1 = videoVideoDto.o1();
        if (o1 != null) {
            String id = o1.getId();
            String url = o1.getUrl();
            String type = o1.getType();
            ActionLinksActionSnippetDto e2 = o1.e();
            titleAction = new TitleAction(id, type, url, e2 != null ? new TitleAction.Snippet(e2.j(), e2.getTitle(), e2.getDescription(), e2.o()) : null);
        } else {
            titleAction = null;
        }
        clipVideoFile.c1 = titleAction;
        BasePropertyExistsDto U0 = videoVideoDto.U0();
        clipVideoFile.O = U0 != null && U0.i() == 1;
        clipVideoFile.P = videoVideoDto.W() == baseBoolIntDto;
        Integer R = videoVideoDto.R();
        clipVideoFile.Q = R != null && R.intValue() == 1;
        BasePropertyExistsDto P0 = videoVideoDto.P0();
        clipVideoFile.R = P0 != null && P0.i() == 1;
        clipVideoFile.S = videoVideoDto.e() == baseBoolIntDto;
        clipVideoFile.T = videoVideoDto.K() == baseBoolIntDto;
        clipVideoFile.W = videoVideoDto.r();
        VideoVideoTrackingInfoDto s1 = videoVideoDto.s1();
        clipVideoFile.X = s1 != null ? rdi.G(s1) : null;
        clipVideoFile.A0 = SystemClock.elapsedRealtime();
        clipVideoFile.Z = videoVideoDto.l() == baseBoolIntDto;
        clipVideoFile.b0 = videoVideoDto.f() != null;
        VideoAdsInfoDto f = videoVideoDto.f();
        clipVideoFile.c0 = f != null ? bw0.a(f, null) : null;
        Boolean B1 = videoVideoDto.B1();
        Boolean bool = Boolean.TRUE;
        clipVideoFile.i0 = epx.f(B1, bool);
        Integer y1 = videoVideoDto.y1();
        clipVideoFile.m0 = y1 != null ? y1.intValue() : 0;
        Integer v0 = videoVideoDto.v0();
        clipVideoFile.n0 = v0 != null ? v0.intValue() : 0;
        String d2 = videoVideoDto.d();
        clipVideoFile.r0 = d2 != null ? d2 : "";
        clipVideoFile.t0 = videoVideoDto.N1() == baseBoolIntDto;
        VideoLiveStatusDto K0 = videoVideoDto.K0();
        switch (K0 != null ? a.$EnumSwitchMapping$1[K0.ordinal()] : -1) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        clipVideoFile.w0 = i;
        Integer i2 = videoVideoDto.i();
        clipVideoFile.D0 = i2 != null ? i2.intValue() : 0;
        List<VideoVideoImageDto> y0 = videoVideoDto.y0();
        clipVideoFile.I0 = y0 != null ? q7o.i(y0) : Image.d;
        List<VideoVideoImageDto> l0 = videoVideoDto.l0();
        clipVideoFile.J0 = l0 != null ? q7o.i(l0) : Image.d;
        clipVideoFile.N0 = videoVideoDto.T();
        MediaRestrictionDto d1 = videoVideoDto.d1();
        if (d1 != null) {
            if (d1.l() == null || ((l = d1.l()) != null && l.i() == 0)) {
                videoRestriction = sd9.n(d1);
                clipVideoFile.O0 = videoRestriction;
                clipVideoFile.P0 = videoVideoDto.S0();
                BasePropertyExistsDto N0 = videoVideoDto.N0();
                clipVideoFile.Q0 = N0 == null && N0.i() == 1;
                clipVideoFile.V0 = Boolean.valueOf(videoVideoDto.F0() != baseBoolIntDto);
                clipVideoFile.W0 = epx.f(videoVideoDto.E1(), bool);
                clipVideoFile.U0 = videoVideoDto.H0() == null ? r1.intValue() : -1L;
                BaseBoolIntDto D = videoVideoDto.D();
                clipVideoFile.K = D == null && D.i() == 1;
                clipVideoFile.d1 = epx.f(videoVideoDto.z1(), bool);
                BaseBoolIntDto B = videoVideoDto.B();
                clipVideoFile.e1 = B == null && B.i() == 1;
                BaseBoolIntDto D1 = videoVideoDto.D1();
                clipVideoFile.h1 = D1 == null && D1.i() == 1;
                clipVideoFile.i1 = videoVideoDto.F5();
                clipVideoFile.k1 = videoVideoDto.g() != null ? Long.valueOf(r1.intValue() * 1000) : null;
                clipVideoFile.E = videoVideoDto.F() == baseBoolIntDto;
                return clipVideoFile;
            }
            clipVideoFile.u1 = OfferVkVideo.LISTING;
        }
        videoRestriction = null;
        clipVideoFile.O0 = videoRestriction;
        clipVideoFile.P0 = videoVideoDto.S0();
        BasePropertyExistsDto N02 = videoVideoDto.N0();
        clipVideoFile.Q0 = N02 == null && N02.i() == 1;
        clipVideoFile.V0 = Boolean.valueOf(videoVideoDto.F0() != baseBoolIntDto);
        clipVideoFile.W0 = epx.f(videoVideoDto.E1(), bool);
        clipVideoFile.U0 = videoVideoDto.H0() == null ? r1.intValue() : -1L;
        BaseBoolIntDto D2 = videoVideoDto.D();
        clipVideoFile.K = D2 == null && D2.i() == 1;
        clipVideoFile.d1 = epx.f(videoVideoDto.z1(), bool);
        BaseBoolIntDto B2 = videoVideoDto.B();
        clipVideoFile.e1 = B2 == null && B2.i() == 1;
        BaseBoolIntDto D12 = videoVideoDto.D1();
        clipVideoFile.h1 = D12 == null && D12.i() == 1;
        clipVideoFile.i1 = videoVideoDto.F5();
        clipVideoFile.k1 = videoVideoDto.g() != null ? Long.valueOf(r1.intValue() * 1000) : null;
        clipVideoFile.E = videoVideoDto.F() == baseBoolIntDto;
        return clipVideoFile;
    }
}
