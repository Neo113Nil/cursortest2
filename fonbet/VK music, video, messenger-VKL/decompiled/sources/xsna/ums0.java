package xsna;

import android.os.Parcelable;
import android.os.SystemClock;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.privacy.dto.PrivacyCategoryDto;
import com.vk.api.generated.privacy.dto.PrivacyListsDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAdsFeaturesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioTemplateInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickerItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickersDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCoOwnerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoDuetDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoMainTabStateDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistMinDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAdsFlagDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoNewsMonothemeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoTrendingHashtagDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSourceVideoDto;
import com.vk.api.generated.video.dto.VideoAccessInfoDto;
import com.vk.api.generated.video.dto.VideoAdsDto;
import com.vk.api.generated.video.dto.VideoAdsInfoDto;
import com.vk.api.generated.video.dto.VideoDonutActionDto;
import com.vk.api.generated.video.dto.VideoDonutChipDto;
import com.vk.api.generated.video.dto.VideoDonutDto;
import com.vk.api.generated.video.dto.VideoDonutPopupDto;
import com.vk.api.generated.video.dto.VideoEditForbiddenReasonsDto;
import com.vk.api.generated.video.dto.VideoEpisodeDto;
import com.vk.api.generated.video.dto.VideoInteractiveInfoDto;
import com.vk.api.generated.video.dto.VideoLinkedToPlaylistMarkDto;
import com.vk.api.generated.video.dto.VideoLiveSettingsDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoOrdInfoAdvertiserDto;
import com.vk.api.generated.video.dto.VideoOrdInfoDto;
import com.vk.api.generated.video.dto.VideoQualityInfoDto;
import com.vk.api.generated.video.dto.VideoStatsPixelDto;
import com.vk.api.generated.video.dto.VideoStatsPixelParamsDto;
import com.vk.api.generated.video.dto.VideoTimelineThumbsDto;
import com.vk.api.generated.video.dto.VideoVideoDownloadDto;
import com.vk.api.generated.video.dto.VideoVideoFilesDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.video.dto.VideoVideoTrackingInfoDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketDto;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketSeanceDto;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ClipVideoOrigin;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.Good;
import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoDownloadDto;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.clips.NewsMonotheme;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.donut.VideoDonut;
import com.vk.dto.common.donut.chip.VideoDonutChip;
import com.vk.dto.common.donut.popup.VideoDonutAction;
import com.vk.dto.common.donut.popup.VideoDonutPopup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.dto.common.live.LiveLayoutSettings;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.dto.stories.model.clickable.SeanceInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import xsna.d5o;
import xsna.emd;
import xsna.yvr0;

/* compiled from: VideoFullToVideoFileMapper.kt */
/* loaded from: classes3.dex */
public final class ums0 {
    public static final ums0 a = new ums0();
    public static final j2r0 b = new j2r0();
    public static final k2r0 c = new k2r0();
    public static final dqu d = new dqu();
    public static final equ e = new equ();
    public static final yvr0 f = new yvr0();
    public static final sd9 g = new sd9();
    public static final bw0 h = new bw0();
    public static final nzo i = new nzo();
    public static final s20 j = new s20();
    public static final fz5 k = new fz5();
    public static final bhu l = new bhu();
    public static final qxm0 m = new qxm0();
    public static final q7o n = new q7o();
    public static final crx0 o = new crx0();
    public static final lit0 p = new lit0();
    public static final sa30 q = new sa30();
    public static final d5o r = new d5o();

    /* compiled from: VideoFullToVideoFileMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VideoVideoTypeDto.values().length];
            try {
                iArr[VideoVideoTypeDto.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoVideoTypeDto.TV_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoVideoTypeDto.MUSIC_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoVideoTypeDto.SHORT_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoVideoTypeDto.UGC_MUSIC_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoVideoTypeDto.INTERACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoVideoTypeDto.VIDEO_MESSAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoVideoTypeDto.STORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoVideoTypeDto.MOVIE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoVideoTypeDto.VIDEO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShortVideoShortVideoAdsFlagDto.values().length];
            try {
                iArr2[ShortVideoShortVideoAdsFlagDto.HIDE_CLOSING_AD_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ShortVideoShortVideoAdsFlagDto.HIDE_FULLSCREEN_AD_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoLiveStatusDto.values().length];
            try {
                iArr3[VideoLiveStatusDto.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[VideoLiveStatusDto.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[VideoLiveStatusDto.UPCOMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[VideoLiveStatusDto.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[VideoLiveStatusDto.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[VideoLiveStatusDto.POSTLIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0246, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0935 A[LOOP:9: B:417:0x092f->B:419:0x0935, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0579  */
    /* JADX WARN: Type inference failed for: r6v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.List<com.vk.dto.common.VideoEpisode>] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(VideoFileOld videoFileOld, VideoVideoFullDto videoVideoFullDto, Map map) {
        String str;
        VideoAccessInfo videoAccessInfo;
        VideoCanDownload videoCanDownload;
        TitleAction titleAction;
        ActionLink actionLink;
        VideoAdInfo videoAdInfo;
        OrdAdInfo ordAdInfo;
        Map linkedHashMap;
        int i2;
        TimelineThumbs timelineThumbs;
        VideoRestriction videoRestriction;
        List<VideoStatsPixelDto> L2;
        VideoLiveSettingsDto D1;
        LivePlayBackSettings livePlayBackSettings;
        VideoAdsDto i3;
        InstreamAd instreamAd;
        List<VideoEpisodeDto> Y3;
        ?? r6;
        VideoInteractiveInfoDto x1;
        InteractiveInfo interactiveInfo;
        List<VideoVideoFullDto> o2;
        List<VideoLinkedToPlaylistMarkDto> z1;
        Pair pair;
        Integer a6;
        VideoVideoDownloadDto N0;
        VideoDownloadDto videoDownloadDto;
        VideoDonutDto H0;
        VideoDonut videoDonut;
        VideoDonutPopup videoDonutPopup;
        VideoDonutAction videoDonutAction;
        VideoDonutActionDto d2;
        VideoDonutAction.ActionType actionType;
        VideoLinkedToPlaylistMarkDto videoLinkedToPlaylistMarkDto;
        String d3;
        Iterator it;
        List Y0;
        AdSection adSection;
        String obj;
        Integer d4;
        BaseBoolIntDto l2;
        ?? r9;
        Parcelable parcelable;
        Integer s1 = videoVideoFullDto.s1();
        videoFileOld.c = s1 != null ? s1.intValue() : 0;
        UserId q2 = videoVideoFullDto.q();
        if (q2 == null) {
            q2 = UserId.d;
        }
        videoFileOld.b = q2;
        UserId userId = videoVideoFullDto.getUserId();
        if (userId == null) {
            userId = UserId.d;
        }
        videoFileOld.d = userId;
        Integer P0 = videoVideoFullDto.P0();
        videoFileOld.e = P0 != null ? P0.intValue() : 0;
        Long valueOf = videoVideoFullDto.T2() != null ? Long.valueOf(r1.intValue()) : null;
        videoFileOld.h = valueOf;
        if (valueOf != null) {
            videoFileOld.i = Long.valueOf(System.currentTimeMillis());
        }
        a.getClass();
        VideoVideoFilesDto U0 = videoVideoFullDto.U0();
        if (U0 != null) {
            videoFileOld.j = U0.K5();
        }
        videoFileOld.f = new VideoUrlStorage(videoVideoFullDto);
        String title = videoVideoFullDto.getTitle();
        if (title == null) {
            title = "";
        }
        videoFileOld.l = title;
        videoFileOld.m = videoVideoFullDto.getDescription();
        String ra = videoVideoFullDto.ra();
        if (ra == null) {
            ra = "";
        }
        videoFileOld.n = ra;
        String platform = videoVideoFullDto.getPlatform();
        if (platform == null) {
            platform = "";
        }
        videoFileOld.o = platform;
        VideoVideoTypeDto R2 = videoVideoFullDto.R2();
        switch (R2 == null ? -1 : a.$EnumSwitchMapping$0[R2.ordinal()]) {
            case 3:
                str = "music_video";
                break;
            case 4:
                str = "short_video";
                break;
            case 5:
                str = "ugc_music_video";
                break;
            case 6:
                str = "interactive";
                break;
            case 7:
                str = "video_message";
                break;
            case 8:
                str = "story";
                break;
            default:
                str = "video";
                break;
        }
        videoFileOld.p = str;
        Integer F0 = videoVideoFullDto.F0();
        videoFileOld.q = F0 != null ? F0.intValue() : 0;
        Integer V2 = videoVideoFullDto.V2();
        videoFileOld.s = V2 != null ? V2.intValue() : 0;
        Integer J2 = videoVideoFullDto.J2();
        videoFileOld.t = J2 != null ? J2.intValue() : 0;
        BaseLikesDto y1 = videoVideoFullDto.y1();
        Integer d5 = y1 != null ? y1.d() : null;
        videoFileOld.u = d5 != null ? d5.intValue() : 0;
        Integer v0 = videoVideoFullDto.v0();
        videoFileOld.v = v0 != null ? v0.intValue() : 0;
        BaseRepostsInfoDto E2 = videoVideoFullDto.E2();
        Integer valueOf2 = E2 != null ? Integer.valueOf(E2.getCount()) : null;
        videoFileOld.w = valueOf2 != null ? valueOf2.intValue() : 0;
        BaseLikesDto y12 = videoVideoFullDto.y1();
        BaseBoolIntDto e2 = y12 != null ? y12.e() : null;
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        videoFileOld.x = e2 == baseBoolIntDto;
        BaseRepostsInfoDto E22 = videoVideoFullDto.E2();
        videoFileOld.y = (E22 != null ? E22.e() : null) == baseBoolIntDto;
        BasePropertyExistsDto B2 = videoVideoFullDto.B2();
        videoFileOld.z = B2 != null && B2.i() == 1;
        VideoAccessInfoDto d6 = videoVideoFullDto.d();
        if (d6 != null) {
            f.getClass();
            List<VideoEditForbiddenReasonsDto> G1 = d6.G1();
            if (G1 != null) {
                r9 = new ArrayList();
                for (VideoEditForbiddenReasonsDto videoEditForbiddenReasonsDto : G1) {
                    VideoEditForbiddenReasonsDto.CodeDto d7 = videoEditForbiddenReasonsDto.d();
                    int i4 = d7 == null ? -1 : yvr0.a.$EnumSwitchMapping$0[d7.ordinal()];
                    if (i4 == -1) {
                        parcelable = null;
                    } else if (i4 == 1) {
                        String description = videoEditForbiddenReasonsDto.getDescription();
                        bpn0 bpn0Var = cqm0.a;
                        if (description == null) {
                            description = "";
                        }
                        parcelable = new VideoEditForbiddenReason.Ad(description);
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String description2 = videoEditForbiddenReasonsDto.getDescription();
                        bpn0 bpn0Var2 = cqm0.a;
                        if (description2 == null) {
                            description2 = "";
                        }
                        parcelable = new VideoEditForbiddenReason.Test(description2);
                    }
                    if (parcelable != null) {
                        r9.add(parcelable);
                    }
                }
            } else {
                r9 = EmptyList.b;
            }
            videoAccessInfo = new VideoAccessInfo(r9);
        } else {
            videoAccessInfo = null;
        }
        videoFileOld.A = videoAccessInfo;
        BaseBoolIntDto D = videoVideoFullDto.D();
        BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
        videoFileOld.B = D == baseBoolIntDto2;
        videoFileOld.C = videoVideoFullDto.T() == null || videoVideoFullDto.T() == baseBoolIntDto2;
        videoFileOld.F = videoVideoFullDto.M() == baseBoolIntDto2;
        videoFileOld.G = videoVideoFullDto.F() == baseBoolIntDto2;
        Integer a0 = videoVideoFullDto.a0();
        videoFileOld.H = a0 != null && a0.intValue() == 1;
        videoFileOld.I = videoVideoFullDto.u() == baseBoolIntDto2 && videoVideoFullDto.z3() != baseBoolIntDto2;
        videoFileOld.J = videoVideoFullDto.B() == baseBoolIntDto2;
        Integer K = videoVideoFullDto.K();
        if (K != null) {
            int intValue = K.intValue();
            VideoCanDownload.Companion.getClass();
            videoCanDownload = VideoCanDownload.a.a(intValue);
        }
        videoCanDownload = VideoCanDownload.NO;
        videoFileOld.b2(videoCanDownload);
        videoFileOld.D = videoVideoFullDto.G() == baseBoolIntDto2;
        ActionLinksActionDto O2 = videoVideoFullDto.O2();
        if (O2 != null) {
            String id = O2.getId();
            String url = O2.getUrl();
            String type = O2.getType();
            ActionLinksActionSnippetDto e3 = O2.e();
            titleAction = new TitleAction(id, type, url, e3 != null ? new TitleAction.Snippet(e3.j(), e3.getTitle(), e3.getDescription(), e3.o()) : null);
        } else {
            titleAction = null;
        }
        videoFileOld.c1 = titleAction;
        BasePropertyExistsDto o22 = videoVideoFullDto.o2();
        videoFileOld.O = o22 != null && o22.i() == 1;
        videoFileOld.P = videoVideoFullDto.D0() == baseBoolIntDto2;
        Integer w0 = videoVideoFullDto.w0();
        videoFileOld.Q = w0 != null && w0.intValue() == 1;
        BasePropertyExistsDto V1 = videoVideoFullDto.V1();
        videoFileOld.R = V1 != null && V1.i() == 1;
        videoFileOld.S = videoVideoFullDto.g() == baseBoolIntDto2;
        videoFileOld.T = videoVideoFullDto.l0() == baseBoolIntDto2;
        BasePropertyExistsDto n1 = videoVideoFullDto.n1();
        videoFileOld.U = n1 != null && n1.i() == 1;
        videoFileOld.V = videoVideoFullDto.b1();
        videoFileOld.W = videoVideoFullDto.r();
        VideoVideoTrackingInfoDto Q2 = videoVideoFullDto.Q2();
        videoFileOld.X = Q2 != null ? rdi.G(Q2) : null;
        videoFileOld.A0 = SystemClock.elapsedRealtime();
        ActionLinksActionDto f2 = videoVideoFullDto.f();
        if (f2 != null) {
            j.getClass();
            actionLink = s20.a(f2);
        } else {
            actionLink = null;
        }
        videoFileOld.Y = actionLink;
        videoFileOld.Z = videoVideoFullDto.C() == baseBoolIntDto2;
        videoFileOld.b0 = videoVideoFullDto.j() != null;
        VideoAdsInfoDto j2 = videoVideoFullDto.j();
        if (j2 != null) {
            h.getClass();
            videoAdInfo = bw0.a(j2, map);
        } else {
            videoAdInfo = null;
        }
        videoFileOld.c0 = videoAdInfo;
        VideoOrdInfoDto W1 = videoVideoFullDto.W1();
        if (W1 != null) {
            i.getClass();
            String title2 = W1.getTitle();
            List<VideoOrdInfoAdvertiserDto> d8 = W1.d();
            ArrayList arrayList = new ArrayList(c5g.u(d8, 10));
            for (VideoOrdInfoAdvertiserDto videoOrdInfoAdvertiserDto : d8) {
                arrayList.add(new OrdAdvertiser(videoOrdInfoAdvertiserDto.getUrl(), videoOrdInfoAdvertiserDto.d()));
            }
            ordAdInfo = new OrdAdInfo(title2, arrayList);
        } else {
            ordAdInfo = null;
        }
        videoFileOld.d0 = ordAdInfo;
        videoFileOld.e0 = epx.f(videoVideoFullDto.U1(), Boolean.TRUE);
        List<VideoQualityInfoDto> r2 = videoVideoFullDto.r2();
        Map map2 = jgp.b;
        if (r2 == null) {
            linkedHashMap = map2;
        } else {
            l.getClass();
            List<VideoQualityInfoDto> list = r2;
            int e4 = on00.e(c5g.u(list, 10));
            if (e4 < 16) {
                e4 = 16;
            }
            linkedHashMap = new LinkedHashMap(e4);
            for (VideoQualityInfoDto videoQualityInfoDto : list) {
                Integer e5 = videoQualityInfoDto.e();
                Integer valueOf3 = Integer.valueOf(e5 != null ? e5.intValue() : 0);
                List<String> d9 = videoQualityInfoDto.d();
                if (d9 == null) {
                    d9 = EmptyList.b;
                }
                Pair pair2 = new Pair(valueOf3, d9);
                linkedHashMap.put(pair2.i(), pair2.j());
            }
        }
        videoFileOld.f0 = epe0.a(linkedHashMap);
        videoFileOld.i0 = epx.f(videoVideoFullDto.u3(), Boolean.TRUE);
        Integer o3 = videoVideoFullDto.o3();
        videoFileOld.m0 = o3 != null ? o3.intValue() : 0;
        Integer o1 = videoVideoFullDto.o1();
        videoFileOld.n0 = o1 != null ? o1.intValue() : 0;
        String e6 = videoVideoFullDto.e();
        if (e6 == null) {
            e6 = "";
        }
        videoFileOld.r0 = e6;
        videoFileOld.t0 = videoVideoFullDto.B3() == BaseBoolIntDto.YES;
        VideoLiveStatusDto L1 = videoVideoFullDto.L1();
        switch (L1 != null ? a.$EnumSwitchMapping$2[L1.ordinal()] : -1) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        videoFileOld.w0 = i2;
        Integer p2 = videoVideoFullDto.p();
        videoFileOld.D0 = p2 != null ? p2.intValue() : 0;
        List<VideoVideoImageDto> t1 = videoVideoFullDto.t1();
        q7o q7oVar = n;
        if (t1 != null) {
            q7oVar.getClass();
            videoFileOld.I0 = q7o.i(t1);
        }
        List<VideoVideoImageDto> V0 = videoVideoFullDto.V0();
        if (V0 != null) {
            q7oVar.getClass();
            videoFileOld.J0 = q7o.i(V0);
        }
        VideoTimelineThumbsDto N2 = videoVideoFullDto.N2();
        if (N2 == null) {
            timelineThumbs = null;
        } else {
            o.getClass();
            Float i5 = N2.i();
            int floatValue = i5 != null ? (int) i5.floatValue() : 0;
            Integer g2 = N2.g();
            int intValue2 = g2 != null ? g2.intValue() : 0;
            Integer e7 = N2.e();
            int intValue3 = e7 != null ? e7.intValue() : 0;
            Integer d10 = N2.d();
            int intValue4 = d10 != null ? d10.intValue() : 0;
            Integer f3 = N2.f();
            int intValue5 = f3 != null ? f3.intValue() : 0;
            Integer j3 = N2.j();
            int intValue6 = j3 != null ? j3.intValue() : 0;
            Boolean l3 = N2.l();
            boolean booleanValue = l3 != null ? l3.booleanValue() : false;
            List<String> k2 = N2.k();
            if (k2 == null) {
                k2 = EmptyList.b;
            }
            timelineThumbs = new TimelineThumbs(floatValue, intValue2, intValue3, intValue4, intValue5, intValue6, booleanValue, k2);
        }
        videoFileOld.K0 = timelineThumbs;
        videoFileOld.N0 = videoVideoFullDto.y0();
        MediaRestrictionDto G2 = videoVideoFullDto.G2();
        if (G2 != null) {
            if (G2.l() == null || ((l2 = G2.l()) != null && l2.i() == 0)) {
                g.getClass();
                videoRestriction = sd9.n(G2);
                videoFileOld.O0 = videoRestriction;
                videoFileOld.P0 = videoVideoFullDto.X1();
                BasePropertyExistsDto R1 = videoVideoFullDto.R1();
                videoFileOld.Q0 = R1 == null && R1.i() == 1;
                Float h3 = videoVideoFullDto.h3();
                videoFileOld.R0 = h3 == null ? h3.floatValue() : 1.0f;
                L2 = videoVideoFullDto.L2();
                if (L2 != null) {
                    p.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Object obj2 : L2) {
                        VideoStatsPixelDto.EventDto d11 = ((VideoStatsPixelDto) obj2).d();
                        Object obj3 = linkedHashMap3.get(d11);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap3.put(d11, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    for (Map.Entry entry : linkedHashMap3.entrySet()) {
                        StatPixel.a a2 = StatPixel.a.b.a(((VideoStatsPixelDto.EventDto) entry.getKey()).i());
                        Iterable<VideoStatsPixelDto> iterable = (Iterable) entry.getValue();
                        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
                        for (VideoStatsPixelDto videoStatsPixelDto : iterable) {
                            MapBuilder mapBuilder = new MapBuilder();
                            VideoStatsPixelParamsDto e8 = videoStatsPixelDto.e();
                            if (e8 != null && (d4 = e8.d()) != null) {
                                mapBuilder.put("interval", String.valueOf(d4.intValue()));
                            }
                            MapBuilder h2 = mapBuilder.h();
                            String url2 = videoStatsPixelDto.getUrl();
                            BasePropertyExistsDto f4 = videoStatsPixelDto.f();
                            arrayList2.add(new StatPixel(a2, url2, h2, f4 != null && f4.i() == 1));
                        }
                        linkedHashMap2.put(a2, new nsk0(arrayList2));
                    }
                    videoFileOld.S0 = linkedHashMap2;
                }
                D1 = videoVideoFullDto.D1();
                if (D1 == null) {
                    m.getClass();
                    BaseBoolIntDto i6 = D1.i();
                    BaseBoolIntDto baseBoolIntDto3 = BaseBoolIntDto.YES;
                    boolean z = i6 == baseBoolIntDto3;
                    Integer e9 = D1.e();
                    livePlayBackSettings = new LivePlayBackSettings(z, (e9 != null ? e9.intValue() : 0) != 0, D1.g() == baseBoolIntDto3, D1.f() != null ? r6.intValue() * 1000 : 0L, new LiveLayoutSettings(!(D1.d() != null ? epx.f(r1.d(), Boolean.FALSE) : false)));
                } else {
                    livePlayBackSettings = null;
                }
                videoFileOld.T0 = livePlayBackSettings;
                videoFileOld.V0 = Boolean.valueOf(videoVideoFullDto.B1() != BaseBoolIntDto.YES);
                videoFileOld.W0 = epx.f(videoVideoFullDto.y3(), Boolean.TRUE);
                videoFileOld.U0 = videoVideoFullDto.E1() == null ? r1.intValue() : -1L;
                BasePrivacyDto m2 = videoVideoFullDto.m2();
                videoFileOld.x0 = m2 == null ? b(m2) : EmptyList.b;
                BasePrivacyDto l22 = videoVideoFullDto.l2();
                videoFileOld.y0 = l22 == null ? b(l22) : EmptyList.b;
                i3 = videoVideoFullDto.i();
                if (i3 == null) {
                    if (i3.g() instanceof Map) {
                        Map map3 = (Map) i3.g();
                        ArrayList arrayList3 = new ArrayList(map3.size());
                        for (Map.Entry entry2 : map3.entrySet()) {
                            Object value = entry2.getValue();
                            Double k3 = (value == null || (obj = value.toString()) == null) ? null : arm0.k(obj);
                            q2z.a(String.valueOf(entry2.getKey()), k3 != null ? String.valueOf((int) k3.doubleValue()) : String.valueOf(entry2.getValue()), arrayList3);
                        }
                        map2 = pn00.s(arrayList3);
                    }
                    Map map4 = map2;
                    boolean z2 = i3.e() == BaseBoolIntDto.YES;
                    List<Float> f5 = i3.f();
                    List<String> i7 = i3.i();
                    ArrayList arrayList4 = new ArrayList(c5g.u(i7, 10));
                    for (String str2 : i7) {
                        AdSection.Companion.getClass();
                        AdSection[] values = AdSection.values();
                        int length = values.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                adSection = values[i8];
                                String name = adSection.name();
                                Locale locale = Locale.ROOT;
                                if (!name.toUpperCase(locale).equals(str2.toUpperCase(locale))) {
                                    i8++;
                                }
                            } else {
                                adSection = null;
                            }
                        }
                        if (adSection == null) {
                            adSection = AdSection.PREROLL;
                        }
                        arrayList4.add(adSection);
                    }
                    instreamAd = new InstreamAd(z2, f5, map4, j5g.S0(arrayList4), i3.j(), (int) i3.k(), i3.d() == BaseBoolIntDto.YES);
                } else {
                    instreamAd = null;
                }
                videoFileOld.a0 = instreamAd;
                BaseBoolIntDto W = videoVideoFullDto.W();
                videoFileOld.K = W == null && W.i() == 1;
                Y3 = videoVideoFullDto.Y3();
                if (Y3 == null) {
                    r6 = new ArrayList();
                    for (VideoEpisodeDto videoEpisodeDto : Y3) {
                        Integer e10 = videoEpisodeDto.e();
                        String d12 = videoEpisodeDto.d();
                        VideoEpisode videoEpisode = (e10 == null || d12 == null) ? null : new VideoEpisode(e10.intValue(), d12);
                        if (videoEpisode != null) {
                            r6.add(videoEpisode);
                        }
                    }
                } else {
                    r6 = EmptyList.b;
                }
                videoFileOld.a1 = r6;
                videoFileOld.d1 = epx.f(videoVideoFullDto.p3(), Boolean.TRUE);
                BaseBoolIntDto R = videoVideoFullDto.R();
                videoFileOld.e1 = R == null && R.i() == 1;
                BaseBoolIntDto w3 = videoVideoFullDto.w3();
                videoFileOld.h1 = w3 == null && w3.i() == 1;
                x1 = videoVideoFullDto.x1();
                if (x1 == null) {
                    String X1 = videoVideoFullDto.X1();
                    k.getClass();
                    interactiveInfo = new InteractiveInfo(x1.e().d(), String.valueOf(x1.d().e()), X1, String.valueOf(x1.d().f()));
                } else {
                    interactiveInfo = null;
                }
                videoFileOld.g0 = interactiveInfo;
                o2 = videoVideoFullDto.o();
                if (o2 != null || (r1 = e(a, o2, null, null, false, 62)) == null) {
                    List<VideoFile> list2 = EmptyList.b;
                }
                videoFileOld.b1 = list2;
                videoFileOld.i1 = videoVideoFullDto.F5();
                videoFileOld.j1 = videoVideoFullDto.L3();
                videoFileOld.k1 = videoVideoFullDto.n() == null ? Long.valueOf(r1.intValue() * 1000) : null;
                videoFileOld.l1 = videoVideoFullDto.K0();
                videoFileOld.E = videoVideoFullDto.Z() != BaseBoolIntDto.YES;
                videoFileOld.p1 = videoVideoFullDto.K2();
                z1 = videoVideoFullDto.z1();
                if (z1 != null && (videoLinkedToPlaylistMarkDto = (VideoLinkedToPlaylistMarkDto) j5g.a0(z1)) != null && (d3 = videoLinkedToPlaylistMarkDto.d()) != null) {
                    List c0 = drm0.c0(d3, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                    ArrayList arrayList5 = new ArrayList(c5g.u(c0, 10));
                    it = c0.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(Long.valueOf(Long.parseLong((String) it.next())));
                    }
                    Y0 = j5g.Y0(arrayList5);
                    if (Y0 != null) {
                        pair = (Pair) Y0.get(0);
                        videoFileOld.n1 = pair != null ? (Long) pair.i() : null;
                        videoFileOld.m1 = pair != null ? Integer.valueOf((int) ((Number) pair.j()).longValue()) : null;
                        videoFileOld.q1 = videoVideoFullDto.r3() == BaseBoolIntDto.YES;
                        a6 = videoVideoFullDto.a6();
                        if (a6 == null) {
                            videoFileOld.v1 = 0;
                        } else {
                            videoFileOld.v1 = a6.intValue();
                        }
                        Integer q22 = videoVideoFullDto.q2();
                        videoFileOld.r = q22 != null ? q22.intValue() : 0;
                        videoFileOld.f1 = videoVideoFullDto.Aa();
                        videoFileOld.g1 = videoVideoFullDto.Q();
                        N0 = videoVideoFullDto.N0();
                        q.getClass();
                        if (N0 != null) {
                            Boolean d13 = N0.d();
                            boolean booleanValue2 = d13 != null ? d13.booleanValue() : false;
                            Boolean e11 = N0.e();
                            boolean booleanValue3 = e11 != null ? e11.booleanValue() : false;
                            String f6 = N0.f();
                            videoDownloadDto = new VideoDownloadDto(booleanValue2, booleanValue3, f6 != null ? f6 : "");
                        } else {
                            videoDownloadDto = null;
                        }
                        videoFileOld.M = videoDownloadDto;
                        H0 = videoVideoFullDto.H0();
                        if (H0 != null) {
                            r.getClass();
                            boolean g3 = H0.g();
                            int e12 = H0.e();
                            VideoDonutPopupDto f7 = H0.f();
                            if (f7 == null) {
                                videoDonutPopup = null;
                            } else {
                                if (d5o.a.$EnumSwitchMapping$0[f7.e().ordinal()] != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                VideoDonutPopup.Illustration illustration = VideoDonutPopup.Illustration.ILLUSTRATION_DONUT_LOGO_CONFETTI_120H;
                                String title3 = f7.getTitle();
                                String f8 = f7.f();
                                VideoDonutPopupDto f9 = H0.f();
                                if (f9 == null || (d2 = f9.d()) == null) {
                                    videoDonutAction = null;
                                } else {
                                    String title4 = d2.getTitle();
                                    int i9 = d5o.a.$EnumSwitchMapping$1[d2.d().ordinal()];
                                    if (i9 == 1) {
                                        actionType = VideoDonutAction.ActionType.HIGHER_LEVEL;
                                    } else if (i9 == 2) {
                                        actionType = VideoDonutAction.ActionType.EDIT_PRIVACY;
                                    } else {
                                        if (i9 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        actionType = VideoDonutAction.ActionType.CLOSE;
                                    }
                                    videoDonutAction = new VideoDonutAction(title4, actionType, d2.getUrl());
                                }
                                videoDonutPopup = new VideoDonutPopup(illustration, title3, f8, videoDonutAction);
                            }
                            VideoDonutChipDto d14 = H0.d();
                            videoDonut = new VideoDonut(g3, e12, new VideoDonutChip(d14.e(), d14.d()), videoDonutPopup);
                        } else {
                            videoDonut = null;
                        }
                        videoFileOld.N = videoDonut;
                        videoFileOld.x1 = videoVideoFullDto.i3();
                    }
                }
                pair = null;
                videoFileOld.n1 = pair != null ? (Long) pair.i() : null;
                videoFileOld.m1 = pair != null ? Integer.valueOf((int) ((Number) pair.j()).longValue()) : null;
                videoFileOld.q1 = videoVideoFullDto.r3() == BaseBoolIntDto.YES;
                a6 = videoVideoFullDto.a6();
                if (a6 == null) {
                }
                Integer q222 = videoVideoFullDto.q2();
                videoFileOld.r = q222 != null ? q222.intValue() : 0;
                videoFileOld.f1 = videoVideoFullDto.Aa();
                videoFileOld.g1 = videoVideoFullDto.Q();
                N0 = videoVideoFullDto.N0();
                q.getClass();
                if (N0 != null) {
                }
                videoFileOld.M = videoDownloadDto;
                H0 = videoVideoFullDto.H0();
                if (H0 != null) {
                }
                videoFileOld.N = videoDonut;
                videoFileOld.x1 = videoVideoFullDto.i3();
            }
            videoFileOld.u1 = OfferVkVideo.LISTING;
        }
        videoRestriction = null;
        videoFileOld.O0 = videoRestriction;
        videoFileOld.P0 = videoVideoFullDto.X1();
        BasePropertyExistsDto R12 = videoVideoFullDto.R1();
        videoFileOld.Q0 = R12 == null && R12.i() == 1;
        Float h32 = videoVideoFullDto.h3();
        videoFileOld.R0 = h32 == null ? h32.floatValue() : 1.0f;
        L2 = videoVideoFullDto.L2();
        if (L2 != null) {
        }
        D1 = videoVideoFullDto.D1();
        if (D1 == null) {
        }
        videoFileOld.T0 = livePlayBackSettings;
        videoFileOld.V0 = Boolean.valueOf(videoVideoFullDto.B1() != BaseBoolIntDto.YES);
        videoFileOld.W0 = epx.f(videoVideoFullDto.y3(), Boolean.TRUE);
        videoFileOld.U0 = videoVideoFullDto.E1() == null ? r1.intValue() : -1L;
        BasePrivacyDto m22 = videoVideoFullDto.m2();
        videoFileOld.x0 = m22 == null ? b(m22) : EmptyList.b;
        BasePrivacyDto l222 = videoVideoFullDto.l2();
        videoFileOld.y0 = l222 == null ? b(l222) : EmptyList.b;
        i3 = videoVideoFullDto.i();
        if (i3 == null) {
        }
        videoFileOld.a0 = instreamAd;
        BaseBoolIntDto W2 = videoVideoFullDto.W();
        videoFileOld.K = W2 == null && W2.i() == 1;
        Y3 = videoVideoFullDto.Y3();
        if (Y3 == null) {
        }
        videoFileOld.a1 = r6;
        videoFileOld.d1 = epx.f(videoVideoFullDto.p3(), Boolean.TRUE);
        BaseBoolIntDto R3 = videoVideoFullDto.R();
        videoFileOld.e1 = R3 == null && R3.i() == 1;
        BaseBoolIntDto w32 = videoVideoFullDto.w3();
        videoFileOld.h1 = w32 == null && w32.i() == 1;
        x1 = videoVideoFullDto.x1();
        if (x1 == null) {
        }
        videoFileOld.g0 = interactiveInfo;
        o2 = videoVideoFullDto.o();
        if (o2 != null) {
        }
        List<VideoFile> list22 = EmptyList.b;
        videoFileOld.b1 = list22;
        videoFileOld.i1 = videoVideoFullDto.F5();
        videoFileOld.j1 = videoVideoFullDto.L3();
        videoFileOld.k1 = videoVideoFullDto.n() == null ? Long.valueOf(r1.intValue() * 1000) : null;
        videoFileOld.l1 = videoVideoFullDto.K0();
        videoFileOld.E = videoVideoFullDto.Z() != BaseBoolIntDto.YES;
        videoFileOld.p1 = videoVideoFullDto.K2();
        z1 = videoVideoFullDto.z1();
        if (z1 != null) {
            List c02 = drm0.c0(d3, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            ArrayList arrayList52 = new ArrayList(c5g.u(c02, 10));
            it = c02.iterator();
            while (it.hasNext()) {
            }
            Y0 = j5g.Y0(arrayList52);
            if (Y0 != null) {
            }
        }
        pair = null;
        videoFileOld.n1 = pair != null ? (Long) pair.i() : null;
        videoFileOld.m1 = pair != null ? Integer.valueOf((int) ((Number) pair.j()).longValue()) : null;
        videoFileOld.q1 = videoVideoFullDto.r3() == BaseBoolIntDto.YES;
        a6 = videoVideoFullDto.a6();
        if (a6 == null) {
        }
        Integer q2222 = videoVideoFullDto.q2();
        videoFileOld.r = q2222 != null ? q2222.intValue() : 0;
        videoFileOld.f1 = videoVideoFullDto.Aa();
        videoFileOld.g1 = videoVideoFullDto.Q();
        N0 = videoVideoFullDto.N0();
        q.getClass();
        if (N0 != null) {
        }
        videoFileOld.M = videoDownloadDto;
        H0 = videoVideoFullDto.H0();
        if (H0 != null) {
        }
        videoFileOld.N = videoDonut;
        videoFileOld.x1 = videoVideoFullDto.i3();
    }

    public static ArrayList b(BasePrivacyDto basePrivacyDto) {
        String str;
        List<Integer> d2;
        List<Integer> e2;
        List<UserId> e3;
        String i2;
        a.getClass();
        PrivacyCategoryDto d3 = basePrivacyDto.d();
        String str2 = "";
        if (d3 == null || (str = d3.i()) == null) {
            str = "";
        }
        PrivacyCategoryDto e4 = basePrivacyDto.e();
        if (e4 != null && (i2 = e4.i()) != null) {
            str2 = i2;
        }
        PrivacyOwnersDto g2 = basePrivacyDto.g();
        boolean z = (g2 == null || (e3 = g2.e()) == null) ? false : !e3.isEmpty();
        PrivacyListsDto f2 = basePrivacyDto.f();
        boolean z2 = (f2 == null || (e2 = f2.e()) == null) ? false : !e2.isEmpty();
        PrivacyListsDto f3 = basePrivacyDto.f();
        PrivacySetting.PrivacyRule a2 = ied0.a(z, z2, (f3 == null || (d2 = f3.d()) == null || !d2.contains(28)) ? false : true, str, str2);
        ArrayList arrayList = new ArrayList();
        PrivacyRules.Include include = new PrivacyRules.Include();
        PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
        arrayList.add(a2);
        PrivacyOwnersDto g3 = basePrivacyDto.g();
        if (g3 != null) {
            List<UserId> e5 = g3.e();
            if (e5 != null) {
                Iterator<T> it = e5.iterator();
                while (it.hasNext()) {
                    exclude.Fb((UserId) it.next());
                }
            }
            List<UserId> d4 = g3.d();
            if (d4 != null) {
                Iterator<T> it2 = d4.iterator();
                while (it2.hasNext()) {
                    include.Fb((UserId) it2.next());
                }
            }
        }
        PrivacyListsDto f4 = basePrivacyDto.f();
        if (f4 != null) {
            List<Integer> e6 = f4.e();
            if (e6 != null) {
                Iterator<T> it3 = e6.iterator();
                while (it3.hasNext()) {
                    exclude.Fb(new UserId(((Number) it3.next()).intValue() + 2000000000));
                }
            }
            List<Integer> d5 = f4.d();
            if (d5 != null) {
                Iterator<T> it4 = d5.iterator();
                while (it4.hasNext()) {
                    include.Fb(new UserId(((Number) it4.next()).intValue() + 2000000000));
                }
            }
        }
        if (!exclude.c.isEmpty()) {
            arrayList.add(exclude);
        }
        if (!include.c.isEmpty()) {
            arrayList.add(include);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0829  */
    /* JADX WARN: Type inference failed for: r3v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v28, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VideoFileOld c(VideoVideoFullDto videoVideoFullDto, Map map, Map map2, Map map3, boolean z) {
        VideoFileOld videoFileOld;
        VideoVideoFullDto videoVideoFullDto2;
        VideoNotificationsStatus videoNotificationsStatus;
        VideoVideoTypeDto R2;
        boolean z2;
        Owner b2;
        Long l2;
        Group group;
        VideoVideoTypeDto R22;
        Group group2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ClickableStickers clickableStickers;
        ?? r7;
        ?? r8;
        List list;
        ?? r82;
        ?? r6;
        ?? r62;
        ?? r3;
        List<String> p2;
        NewsMonotheme newsMonotheme;
        ShortVideoMainTabStateDto u;
        ShortVideoShortVideoInfoDto.ClipsUserLinkModerationDto k2;
        Boolean e2;
        ShortVideoShortVideoNewsMonothemeDto B;
        List<ShortVideoShortVideoTrendingHashtagDto> R0;
        ShortVideoAdsFeaturesDto d2;
        ShortVideoAdsFeaturesDto d3;
        List<ShortVideoShortVideoAdsFlagDto> d4;
        ShortVideoAdsFeaturesDto d5;
        List<ShortVideoCoOwnerDto> l3;
        List<ShortVideoPlaylistMinDto> d0;
        ShortVideoAudioTemplateInfoDto g2;
        String d6;
        ShortVideoSourceVideoDto D;
        ShortVideoDuetDto n2;
        ShortVideoDuetDto n3;
        Integer e3;
        ShortVideoDuetDto n4;
        UserId q2;
        List<ShortVideoCompilationInfoDto> H4;
        List<MasksMaskDto> H2;
        List<MasksEffectDto> o2;
        ShortVideoClickableStickersDto j2;
        ArrayList arrayList4;
        Serializer.StreamParcelableAdapter clickableHashtag;
        Serializer.StreamParcelableAdapter clickableMention;
        String name;
        Serializer.StreamParcelableAdapter streamParcelableAdapter;
        Serializer.StreamParcelableAdapter clickableLink;
        AwayLink awayLink;
        GeoPlace geoPlace;
        AwayLink awayLink2;
        VkTicketsVkTicketSeanceDto e4;
        VkTicketsVkTicketSeanceDto e5;
        VkTicketsVkTicketSeanceDto e6;
        VkTicketsVkTicketSeanceDto e7;
        BaseImageDto d7;
        ShortVideoAudioDto f2;
        VideoVideoTypeDto R23 = videoVideoFullDto.R2();
        int i2 = R23 == null ? -1 : a.$EnumSwitchMapping$0[R23.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                boolean z3 = videoVideoFullDto.t3() == BaseBoolIntDto.YES;
                List<AudioArtistDto> N1 = videoVideoFullDto.N1();
                if (N1 != null) {
                    List<AudioArtistDto> list2 = N1;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(sp.n((AudioArtistDto) it.next(), true));
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                List<AudioArtistDto> S0 = videoVideoFullDto.S0();
                if (S0 != null) {
                    List<AudioArtistDto> list3 = S0;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(sp.n((AudioArtistDto) it2.next(), true));
                    }
                    arrayList2 = arrayList6;
                } else {
                    arrayList2 = null;
                }
                String M2 = videoVideoFullDto.M2();
                List<AudioGenreDto> d1 = videoVideoFullDto.d1();
                if (d1 != null) {
                    List<AudioGenreDto> list4 = d1;
                    ArrayList arrayList7 = new ArrayList(c5g.u(list4, 10));
                    for (AudioGenreDto audioGenreDto : list4) {
                        arrayList7.add(new Genre(audioGenreDto.getId(), audioGenreDto.d()));
                    }
                    arrayList3 = arrayList7;
                } else {
                    arrayList3 = null;
                }
                videoVideoFullDto2 = videoVideoFullDto;
                videoFileOld = new MusicVideoFile(z3, arrayList, arrayList2, M2, arrayList3, videoVideoFullDto.y2() != null ? r1.intValue() : 0L);
            } else if (i2 != 4) {
                videoFileOld = i2 != 5 ? new VideoFileOld() : new VideoFileOld();
            } else {
                ums0 ums0Var = a;
                ShortVideoShortVideoInfoDto I2 = videoVideoFullDto.I2();
                MusicTrack c2 = (I2 == null || (f2 = I2.f()) == null) ? null : sfj0.c(f2);
                if (I2 == null || (j2 = I2.j()) == null) {
                    clickableStickers = null;
                } else {
                    int i3 = emd.a;
                    List<ShortVideoClickableStickerItemDto> d8 = j2.d();
                    if (d8 == null) {
                        arrayList4 = new ArrayList();
                    } else {
                        ArrayList arrayList8 = new ArrayList();
                        for (ShortVideoClickableStickerItemDto shortVideoClickableStickerItemDto : d8) {
                            switch (emd.a.$EnumSwitchMapping$0[shortVideoClickableStickerItemDto.K().ordinal()]) {
                                case 1:
                                    ArrayList b3 = emd.b(shortVideoClickableStickerItemDto.e());
                                    q500 a2 = emd.a(shortVideoClickableStickerItemDto);
                                    String g3 = shortVideoClickableStickerItemDto.g();
                                    String str2 = g3 == null ? "" : g3;
                                    ShortVideoClickableStickerItemDto.StyleDto D2 = shortVideoClickableStickerItemDto.D();
                                    String i4 = D2 != null ? D2.i() : null;
                                    clickableHashtag = new ClickableHashtag(0L, b3, a2, str2, i4 == null ? "" : i4, 1, null);
                                    streamParcelableAdapter = clickableHashtag;
                                    break;
                                case 2:
                                    String k3 = shortVideoClickableStickerItemDto.k();
                                    String obj = drm0.p0(k3 != null ? k3 : "").toString();
                                    Serializer.c<ClickableMention> cVar = ClickableMention.CREATOR;
                                    Pair c3 = ClickableMention.a.c(obj);
                                    if (c3 == null) {
                                        streamParcelableAdapter = null;
                                        break;
                                    } else {
                                        UserId userId = (UserId) c3.d();
                                        String str3 = (String) c3.g();
                                        ShortVideoClickableStickerItemDto.StyleDto D3 = shortVideoClickableStickerItemDto.D();
                                        clickableMention = new ClickableMention(0L, emd.b(shortVideoClickableStickerItemDto.e()), emd.a(shortVideoClickableStickerItemDto), userId, str3, (D3 == null || (name = D3.name()) == null) ? null : name.toLowerCase(Locale.ROOT), (userId.b <= 0 || map2 == 0) ? null : (UserProfile) map2.get(userId), (userId.b >= 0 || map3 == null) ? null : (Group) map3.get(fkq0.e(userId)), 1, null);
                                        streamParcelableAdapter = clickableMention;
                                        break;
                                    }
                                    break;
                                case 3:
                                    SnippetAttachment j3 = aqw.j(shortVideoClickableStickerItemDto.i(), null);
                                    ArrayList b4 = emd.b(shortVideoClickableStickerItemDto.e());
                                    q500 a3 = emd.a(shortVideoClickableStickerItemDto);
                                    String str4 = (j3 == null || (awayLink = j3.f) == null) ? null : awayLink.b;
                                    String str5 = str4 == null ? "" : str4;
                                    String G = shortVideoClickableStickerItemDto.G();
                                    ShortVideoClickableStickerItemDto.StyleDto D4 = shortVideoClickableStickerItemDto.D();
                                    clickableLink = new ClickableLink(0L, b4, a3, str5, null, G, j3, D4 != null ? D4.i() : null, null, 257, null);
                                    streamParcelableAdapter = clickableLink;
                                    break;
                                case 4:
                                    ArrayList b5 = emd.b(shortVideoClickableStickerItemDto.e());
                                    q500 a4 = emd.a(shortVideoClickableStickerItemDto);
                                    Integer l4 = shortVideoClickableStickerItemDto.l();
                                    int intValue = l4 != null ? l4.intValue() : 0;
                                    ShortVideoClickableStickerItemDto.StyleDto D5 = shortVideoClickableStickerItemDto.D();
                                    String i5 = D5 != null ? D5.i() : null;
                                    String str6 = i5 == null ? "" : i5;
                                    PlacesPlaceDto n5 = shortVideoClickableStickerItemDto.n();
                                    if (n5 != null) {
                                        int id = n5.getId();
                                        String title = n5.getTitle();
                                        double j4 = n5.j();
                                        double k4 = n5.k();
                                        int l5 = n5.l();
                                        UserId q3 = n5.q();
                                        if (q3 == null) {
                                            q3 = UserId.d;
                                        }
                                        UserId userId2 = q3;
                                        String d9 = n5.d();
                                        String str7 = d9 == null ? "" : d9;
                                        Integer g4 = n5.g();
                                        int intValue2 = g4 != null ? g4.intValue() : 0;
                                        Integer i6 = n5.i();
                                        geoPlace = new GeoPlace(id, title, j4, k4, l5, "", userId2, str7, intValue2, i6 != null ? i6.intValue() : 0, 0);
                                    } else {
                                        geoPlace = null;
                                    }
                                    clickableHashtag = new ClickableGeo(0L, b5, a4, intValue, str6, geoPlace, shortVideoClickableStickerItemDto.G(), null, 1, null);
                                    streamParcelableAdapter = clickableHashtag;
                                    break;
                                case 5:
                                    SnippetAttachment j5 = aqw.j(shortVideoClickableStickerItemDto.i(), null);
                                    MarketMarketItemDto j6 = shortVideoClickableStickerItemDto.j();
                                    Good c4 = j6 != null ? b210.c(j6) : null;
                                    new ne6();
                                    clickableLink = new ClickableMarketItem(0L, emd.b(shortVideoClickableStickerItemDto.e()), emd.a(shortVideoClickableStickerItemDto), j6 != null ? Long.valueOf(j6.getId()) : null, j6 != null ? j6.q() : null, (j5 == null || (awayLink2 = j5.f) == null) ? null : awayLink2.b, ne6.a(j6 != null ? j6.W() : null), j5 != null ? j5.p : null, c4, j5, shortVideoClickableStickerItemDto.d(), null, 2049, null);
                                    streamParcelableAdapter = clickableLink;
                                    break;
                                case 6:
                                    Long o3 = shortVideoClickableStickerItemDto.o();
                                    long longValue = o3 != null ? o3.longValue() : 0L;
                                    UserId p3 = shortVideoClickableStickerItemDto.p();
                                    if (p3 == null) {
                                        p3 = UserId.d;
                                    }
                                    UserId userId3 = p3;
                                    ArrayList b6 = emd.b(shortVideoClickableStickerItemDto.e());
                                    q500 a5 = emd.a(shortVideoClickableStickerItemDto);
                                    int i7 = (int) longValue;
                                    ShortVideoClickableStickerItemDto.StyleDto D6 = shortVideoClickableStickerItemDto.D();
                                    clickableMention = new ClickablePost(0L, b6, a5, i7, userId3, D6 != null ? D6.i() : null, 1, null);
                                    streamParcelableAdapter = clickableMention;
                                    break;
                                case 7:
                                    Integer B2 = shortVideoClickableStickerItemDto.B();
                                    int intValue3 = B2 != null ? B2.intValue() : 0;
                                    Integer C = shortVideoClickableStickerItemDto.C();
                                    clickableMention = new ClickablePackSticker(0L, emd.b(shortVideoClickableStickerItemDto.e()), emd.a(shortVideoClickableStickerItemDto), intValue3, C != null ? C.intValue() : 0, null, 33, null);
                                    streamParcelableAdapter = clickableMention;
                                    break;
                                case 8:
                                    ArrayList b7 = emd.b(shortVideoClickableStickerItemDto.e());
                                    q500 a6 = emd.a(shortVideoClickableStickerItemDto);
                                    VkTicketsVkTicketDto F = shortVideoClickableStickerItemDto.F();
                                    String id2 = F != null ? F.getId() : null;
                                    VkTicketsVkTicketDto F2 = shortVideoClickableStickerItemDto.F();
                                    String title2 = F2 != null ? F2.getTitle() : null;
                                    VkTicketsVkTicketDto F3 = shortVideoClickableStickerItemDto.F();
                                    String url = (F3 == null || (d7 = F3.d()) == null) ? null : d7.getUrl();
                                    VkTicketsVkTicketDto F4 = shortVideoClickableStickerItemDto.F();
                                    String url2 = F4 != null ? F4.getUrl() : null;
                                    VkTicketsVkTicketDto F5 = shortVideoClickableStickerItemDto.F();
                                    String id3 = (F5 == null || (e7 = F5.e()) == null) ? null : e7.getId();
                                    VkTicketsVkTicketDto F6 = shortVideoClickableStickerItemDto.F();
                                    String e8 = (F6 == null || (e6 = F6.e()) == null) ? null : e6.e();
                                    VkTicketsVkTicketDto F7 = shortVideoClickableStickerItemDto.F();
                                    String d10 = (F7 == null || (e5 = F7.e()) == null) ? null : e5.d();
                                    VkTicketsVkTicketDto F8 = shortVideoClickableStickerItemDto.F();
                                    clickableHashtag = new ClickableVkTicket(0L, b7, a6, id2, title2, url, url2, new SeanceInfo(id3, e8, d10, (F8 == null || (e4 = F8.e()) == null) ? null : e4.f()), 1, null);
                                    streamParcelableAdapter = clickableHashtag;
                                    break;
                                default:
                                    streamParcelableAdapter = null;
                                    break;
                            }
                            if (streamParcelableAdapter != null) {
                                arrayList8.add(streamParcelableAdapter);
                            }
                        }
                        arrayList4 = arrayList8;
                    }
                    clickableStickers = new ClickableStickers(j2.f(), j2.e(), arrayList4);
                }
                if (I2 == null || (o2 = I2.o()) == null) {
                    r7 = 0;
                } else {
                    List<MasksEffectDto> list5 = o2;
                    r7 = new ArrayList(c5g.u(list5, 10));
                    for (MasksEffectDto masksEffectDto : list5) {
                        ums0Var.getClass();
                        r7.add(i(masksEffectDto, map2, map3));
                    }
                }
                if (r7 == 0) {
                    r7 = EmptyList.b;
                }
                if (I2 == null || (H2 = I2.H2()) == null) {
                    r8 = 0;
                } else {
                    r8 = new ArrayList();
                    for (MasksMaskDto masksMaskDto : H2) {
                        ums0Var.getClass();
                        Mask a7 = ii10.a(masksMaskDto, map2, map3);
                        if (a7 != null) {
                            r8.add(a7);
                        }
                    }
                }
                if (r8 == 0) {
                    r8 = EmptyList.b;
                }
                ArrayList u0 = j5g.u0((Iterable) r8, (Collection) r7);
                if (I2 == null || (H4 = I2.H4()) == null) {
                    list = 0;
                } else {
                    List<ShortVideoCompilationInfoDto> list6 = H4;
                    list = new ArrayList(c5g.u(list6, 10));
                    for (ShortVideoCompilationInfoDto shortVideoCompilationInfoDto : list6) {
                        ums0Var.getClass();
                        list.add(h(shortVideoCompilationInfoDto));
                    }
                }
                if (list == 0) {
                    list = EmptyList.b;
                }
                DuetMeta duetMeta = new DuetMeta(I2 != null ? I2.i() : null, I2 != null ? I2.C() : null, (I2 == null || (n4 = I2.n()) == null || (q2 = n4.q()) == null) ? null : Long.valueOf(q2.b).toString(), (I2 == null || (n3 = I2.n()) == null || (e3 = n3.e()) == null) ? null : e3.toString(), (I2 == null || (n2 = I2.n()) == null) ? null : n2.d());
                ClipVideoOrigin clipVideoOrigin = (I2 == null || (D = I2.D()) == null) ? null : new ClipVideoOrigin(String.valueOf(D.q().b), String.valueOf(D.d()), D.getDescription());
                ClipAudioTemplate clipAudioTemplate = (I2 == null || (g2 = I2.g()) == null || (d6 = g2.d()) == null) ? null : new ClipAudioTemplate(d6);
                if (I2 == null || (d0 = I2.d0()) == null) {
                    r82 = 0;
                } else {
                    List<ShortVideoPlaylistMinDto> list7 = d0;
                    r82 = new ArrayList(c5g.u(list7, 10));
                    for (ShortVideoPlaylistMinDto shortVideoPlaylistMinDto : list7) {
                        r82.add(new ClipsDraftablePlaylist(shortVideoPlaylistMinDto.getId(), shortVideoPlaylistMinDto.getTitle(), EmptyList.b, shortVideoPlaylistMinDto.q()));
                    }
                }
                if (r82 == 0) {
                    r82 = EmptyList.b;
                }
                List list8 = r82;
                if (I2 == null || (l3 = I2.l()) == null) {
                    r6 = 0;
                } else {
                    r6 = new ArrayList();
                    Iterator it3 = l3.iterator();
                    while (it3.hasNext()) {
                        CoOwnerItem a8 = com.vk.dto.common.clips.a.a((ShortVideoCoOwnerDto) it3.next(), map2, map3, map);
                        if (a8 != null) {
                            r6.add(a8);
                        }
                    }
                }
                if (r6 == 0) {
                    r6 = EmptyList.b;
                }
                List list9 = r6;
                List<AdsItemBlockAdStatPixelDto> k5 = videoVideoFullDto.k();
                Map b8 = k5 != null ? ui0.b(k5) : null;
                if (b8 == null) {
                    b8 = jgp.b;
                }
                Map map4 = b8;
                List<String> f3 = (I2 == null || (d5 = I2.d()) == null) ? null : d5.f();
                if (f3 == null) {
                    f3 = EmptyList.b;
                }
                if (I2 == null || (d3 = I2.d()) == null || (d4 = d3.d()) == null) {
                    r62 = 0;
                } else {
                    List<ShortVideoShortVideoAdsFlagDto> list10 = d4;
                    r62 = new ArrayList(c5g.u(list10, 10));
                    for (ShortVideoShortVideoAdsFlagDto shortVideoShortVideoAdsFlagDto : list10) {
                        ums0Var.getClass();
                        int i8 = a.$EnumSwitchMapping$1[shortVideoShortVideoAdsFlagDto.ordinal()];
                        r62.add(i8 != 1 ? i8 != 2 ? ClipsAdsFeaturesParams.AdsFlags.UNKNOWN : ClipsAdsFeaturesParams.AdsFlags.HIDE_FULLSCREEN_AD_BANNER : ClipsAdsFeaturesParams.AdsFlags.HIDE_CLOSING_AD_BANNER);
                    }
                }
                if (r62 == 0) {
                    r62 = EmptyList.b;
                }
                ClipsAdsFeaturesParams clipsAdsFeaturesParams = new ClipsAdsFeaturesParams(f3, r62, (I2 == null || (d2 = I2.d()) == null) ? null : d2.e());
                ShortVideoShortVideoInfoDto I22 = videoVideoFullDto.I2();
                if (I22 == null || (R0 = I22.R0()) == null) {
                    ShortVideoShortVideoInfoDto I23 = videoVideoFullDto.I2();
                    if (I23 == null || (p2 = I23.p()) == null) {
                        r3 = EmptyList.b;
                    } else {
                        List<String> list11 = p2;
                        r3 = new ArrayList(c5g.u(list11, 10));
                        Iterator it4 = list11.iterator();
                        while (it4.hasNext()) {
                            r3.add(new TrendingHashtag((String) it4.next(), EmptyList.b));
                        }
                    }
                } else {
                    List<ShortVideoShortVideoTrendingHashtagDto> list12 = R0;
                    r3 = new ArrayList(c5g.u(list12, 10));
                    for (ShortVideoShortVideoTrendingHashtagDto shortVideoShortVideoTrendingHashtagDto : list12) {
                        r3.add(new TrendingHashtag(shortVideoShortVideoTrendingHashtagDto.e(), shortVideoShortVideoTrendingHashtagDto.d()));
                    }
                }
                List list13 = r3;
                if (I2 == null || (B = I2.B()) == null) {
                    newsMonotheme = null;
                } else {
                    String e9 = B.e();
                    newsMonotheme = e9 != null ? new NewsMonotheme(e9, B.d()) : null;
                }
                OriginalSoundStatus originalSoundStatus = OriginalSoundStatus.NONE;
                boolean booleanValue = (I2 == null || (e2 = I2.e()) == null) ? false : e2.booleanValue();
                ClipLinkModerationStatus.a aVar = ClipLinkModerationStatus.Companion;
                Integer valueOf = (I2 == null || (k2 = I2.k()) == null) ? null : Integer.valueOf(k2.i());
                aVar.getClass();
                ClipLinkModerationStatus a9 = ClipLinkModerationStatus.a.a(valueOf);
                Integer i32 = videoVideoFullDto.i3();
                ClipMainTabState.a aVar2 = ClipMainTabState.Companion;
                ShortVideoShortVideoInfoDto I24 = videoVideoFullDto.I2();
                Integer valueOf2 = (I24 == null || (u = I24.u()) == null) ? null : Integer.valueOf(u.i());
                aVar2.getClass();
                ClipVideoFile clipVideoFile = new ClipVideoFile(clickableStickers, c2, u0, list, duetMeta, clipVideoOrigin, originalSoundStatus, booleanValue, a9, clipAudioTemplate, list8, list9, map4, i32, null, list13, ClipMainTabState.a.a(valueOf2), clipsAdsFeaturesParams, newsMonotheme);
                videoVideoFullDto2 = videoVideoFullDto;
                videoFileOld = clipVideoFile;
            }
            a(videoFileOld, videoVideoFullDto2, map);
            if (map3 != null || (group2 = (Group) map3.get(videoFileOld.b)) == null || (str = group2.k0) == null) {
                videoNotificationsStatus = null;
            } else {
                VideoNotificationsStatus.Companion.getClass();
                videoNotificationsStatus = VideoNotificationsStatus.a.a(str);
            }
            videoFileOld.u0 = videoNotificationsStatus;
            R2 = videoVideoFullDto2.R2();
            if (R2 != null) {
                switch (a.$EnumSwitchMapping$0[R2.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        z2 = false;
                        if (map != null) {
                            videoFileOld.f1((Owner) map.get(videoFileOld.b));
                        }
                        R22 = videoVideoFullDto2.R2();
                        if (R22 != null) {
                            switch (a.$EnumSwitchMapping$0[R22.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    if (map3 != null) {
                                        Group group3 = (Group) map3.get(videoFileOld.b);
                                        videoFileOld.h0 = Boolean.valueOf((group3 == null || !group3.v0) ? z2 : true);
                                        return videoFileOld;
                                    }
                                    break;
                                case 10:
                                    if (map3 != null) {
                                        Group group4 = (Group) map3.get(videoFileOld.b);
                                        videoFileOld.h0 = Boolean.valueOf((group4 == null || !group4.v0) ? z2 : true);
                                        return videoFileOld;
                                    }
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        return videoFileOld;
                    case 3:
                        List<AudioArtistDto> N12 = videoVideoFullDto2.N1();
                        if (N12 != null) {
                            List<AudioArtistDto> list14 = N12;
                            ArrayList arrayList9 = new ArrayList(c5g.u(list14, 10));
                            Iterator it5 = list14.iterator();
                            while (it5.hasNext()) {
                                arrayList9.add(sp.n((AudioArtistDto) it5.next(), true));
                            }
                            if (arrayList9.isEmpty()) {
                                arrayList9 = null;
                            }
                            if (arrayList9 != null) {
                                if (z) {
                                    Artist artist = (Artist) j5g.a0(arrayList9);
                                    if (artist != null && (l2 = artist.l) != null) {
                                        long abs = Math.abs(l2.longValue());
                                        gzs<s3q0> gzsVar = fkq0.a;
                                        UserId userId4 = new UserId(abs);
                                        if (map3 == null || (group = (Group) map3.get(userId4)) == null) {
                                            z2 = false;
                                            b2 = tsj.b(arrayList9, 0, null, 7);
                                        } else {
                                            b2 = tsj.a(group);
                                            z2 = false;
                                        }
                                    }
                                } else {
                                    z2 = false;
                                    b2 = tsj.b(arrayList9, 0, null, 7);
                                }
                                videoFileOld.f1(b2);
                                R22 = videoVideoFullDto2.R2();
                                if (R22 != null) {
                                }
                                return videoFileOld;
                            }
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            z2 = false;
            R22 = videoVideoFullDto2.R2();
            if (R22 != null) {
            }
            return videoFileOld;
        }
        videoFileOld = new VideoFileOld();
        videoFileOld.t1 = videoVideoFullDto.g3();
        videoFileOld.r1 = videoVideoFullDto.f3();
        videoFileOld.s1 = videoVideoFullDto.W2();
        videoVideoFullDto2 = videoVideoFullDto;
        a(videoFileOld, videoVideoFullDto2, map);
        if (map3 != null) {
        }
        videoNotificationsStatus = null;
        videoFileOld.u0 = videoNotificationsStatus;
        R2 = videoVideoFullDto2.R2();
        if (R2 != null) {
        }
        z2 = false;
        R22 = videoVideoFullDto2.R2();
        if (R22 != null) {
        }
        return videoFileOld;
    }

    public static /* synthetic */ VideoFileOld d(ums0 ums0Var, VideoVideoFullDto videoVideoFullDto, Map map, Map map2, Map map3, int i2) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        if ((i2 & 4) != 0) {
            map2 = null;
        }
        if ((i2 & 8) != 0) {
            map3 = null;
        }
        ums0Var.getClass();
        return c(videoVideoFullDto, map, map2, map3, false);
    }

    public static List e(ums0 ums0Var, List list, List list2, List list3, boolean z, int i2) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3 = null;
        if ((i2 & 2) != 0) {
            list2 = null;
        }
        if ((i2 & 8) != 0) {
            list3 = null;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        ums0Var.getClass();
        List list4 = list;
        if (list4 == null || list4.isEmpty()) {
            return EmptyList.b;
        }
        LinkedHashMap b2 = list2 != null ? c.b(list2) : null;
        if (list3 != null) {
            e.getClass();
            linkedHashMap = equ.b(list3);
        } else {
            linkedHashMap = null;
        }
        if (b2 != null && linkedHashMap != null) {
            b2 = pn00.n(b2, linkedHashMap);
        } else if (b2 == null) {
            b2 = linkedHashMap == null ? null : linkedHashMap;
        }
        if (list2 != null) {
            b.getClass();
            linkedHashMap2 = j2r0.b(list2);
        } else {
            linkedHashMap2 = null;
        }
        if (list3 != null) {
            d.getClass();
            linkedHashMap3 = dqu.b(list3);
        }
        List<VideoVideoFullDto> list5 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
        for (VideoVideoFullDto videoVideoFullDto : list5) {
            a.getClass();
            arrayList.add(c(videoVideoFullDto, b2, linkedHashMap2, linkedHashMap3, z));
        }
        return arrayList;
    }

    public static ArrayList f(ums0 ums0Var, List list, List list2, List list3) {
        ums0Var.getClass();
        List<VideoFile> e2 = e(ums0Var, list, list2, list3, false, 32);
        ArrayList arrayList = new ArrayList();
        for (VideoFile videoFile : e2) {
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile != null) {
                arrayList.add(clipVideoFile);
            }
        }
        return arrayList;
    }

    public static NotificationImage g(List list) {
        ArrayList arrayList;
        if (list != null) {
            List<BaseImageDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (BaseImageDto baseImageDto : list2) {
                arrayList.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
            }
        } else {
            arrayList = null;
        }
        return new NotificationImage(arrayList);
    }

    public static Compilation h(ShortVideoCompilationInfoDto shortVideoCompilationInfoDto) {
        NotificationImage notificationImage;
        Integer e2 = shortVideoCompilationInfoDto.e();
        int intValue = e2 != null ? e2.intValue() : 0;
        String g2 = shortVideoCompilationInfoDto.g();
        Integer i2 = shortVideoCompilationInfoDto.i();
        int intValue2 = i2 != null ? i2.intValue() : 0;
        String d2 = shortVideoCompilationInfoDto.d();
        List<BaseImageDto> f2 = shortVideoCompilationInfoDto.f();
        if (f2 != null) {
            a.getClass();
            notificationImage = g(f2);
        } else {
            notificationImage = null;
        }
        return new Compilation(intValue, g2, intValue2, d2, notificationImage);
    }

    public static Mask i(MasksEffectDto masksEffectDto, Map map, Map map2) {
        UserProfile userProfile = map != null ? (UserProfile) map.get(new UserId(1L)) : null;
        Group group = map2 != null ? (Group) map2.get(new UserId(1L)) : null;
        int id = masksEffectDto.getId();
        UserId q2 = masksEffectDto.q();
        String e2 = masksEffectDto.e();
        String url = masksEffectDto.getUrl();
        NotificationImage g2 = g(masksEffectDto.f());
        boolean z = masksEffectDto.getId() < 0;
        Boolean i2 = masksEffectDto.i();
        return new Mask(userProfile, group, id, q2, false, e2, 0, 0L, 0L, url, g2, false, 0, 0, null, null, null, false, false, z, false, i2 != null ? i2.booleanValue() : false, masksEffectDto.d(), 0L, 8388608, null);
    }
}
