package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import com.ironsource.D1;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAdsFeaturesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioTemplateInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCoOwnerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoDuetDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedItemShortVideoFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoMainTabStateDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistMinDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAccessDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAccessEditDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoActionButtonDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoActionButtonStylesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAdsFlagDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAudioIdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoClickableStickerItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoClickableStickersDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoEffectIdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoEngagementDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFilesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoMaskIdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoNewsMonothemeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoOrdAdvertiserDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoOrdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoPrivacyDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoRestrictionButtonDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoRestrictionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoStatsPixelDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoTimelineThumbsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoTrendingHashtagDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSourceVideoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoEditForbiddenReasonsDto;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketDto;
import com.vk.api.generated.vkTickets.dto.VkTicketsVkTicketSeanceDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ClipVideoOrigin;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.clips.NewsMonotheme;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.dto.stories.model.clickable.SeanceInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import xsna.ums0;
import xsna.vfj0;

/* compiled from: ShortVideoToClipsVideoFileMapper.kt */
/* loaded from: classes3.dex */
public final class qgj0 {
    public static final j2r0 a = new j2r0();
    public static final k2r0 b = new k2r0();
    public static final dqu c = new dqu();
    public static final equ d = new equ();
    public static final rfj0 e = new rfj0();
    public static final sd9 f = new sd9();
    public static final gfk0 g = new gfk0();
    public static final s1v h = new s1v();
    public static final jw i = new jw();
    public static final y000 j = new y000();
    public static final edi k = new edi(20);
    public static final pgj0 l = new pgj0();

    /* compiled from: ShortVideoToClipsVideoFileMapper.kt */
    public static final class a {
        public final Map<UserId, Owner> a;
        public final Map<UserId, UserProfile> b;
        public final Map<UserId, Group> c;
        public final Map<c14, ShortVideoAudioDto> d;
        public final Map<c14, MasksEffectDto> e;
        public final Map<c14, MasksMaskDto> f;
        public final Map<c14, MarketMarketItemDto> g;
        public final Map<Integer, ShortVideoCompilationInfoDto> h;
        public final Map<Integer, PlacesPlaceDto> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<UserId, Owner> map, Map<UserId, ? extends UserProfile> map2, Map<UserId, ? extends Group> map3, Map<c14, ShortVideoAudioDto> map4, Map<c14, MasksEffectDto> map5, Map<c14, MasksMaskDto> map6, Map<c14, MarketMarketItemDto> map7, Map<Integer, ShortVideoCompilationInfoDto> map8, Map<Integer, PlacesPlaceDto> map9) {
            this.a = map;
            this.b = map2;
            this.c = map3;
            this.d = map4;
            this.e = map5;
            this.f = map6;
            this.g = map7;
            this.h = map8;
            this.i = map9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            Map<UserId, Owner> map = this.a;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<UserId, UserProfile> map2 = this.b;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<UserId, Group> map3 = this.c;
            int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            Map<c14, ShortVideoAudioDto> map4 = this.d;
            int hashCode4 = (hashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
            Map<c14, MasksEffectDto> map5 = this.e;
            int hashCode5 = (hashCode4 + (map5 == null ? 0 : map5.hashCode())) * 31;
            Map<c14, MasksMaskDto> map6 = this.f;
            int hashCode6 = (hashCode5 + (map6 == null ? 0 : map6.hashCode())) * 31;
            Map<c14, MarketMarketItemDto> map7 = this.g;
            int hashCode7 = (hashCode6 + (map7 == null ? 0 : map7.hashCode())) * 31;
            Map<Integer, ShortVideoCompilationInfoDto> map8 = this.h;
            int hashCode8 = (hashCode7 + (map8 == null ? 0 : map8.hashCode())) * 31;
            Map<Integer, PlacesPlaceDto> map9 = this.i;
            return hashCode8 + (map9 != null ? map9.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupedParameters(owners=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", groups=");
            sb.append(this.c);
            sb.append(", audios=");
            sb.append(this.d);
            sb.append(", effects=");
            sb.append(this.e);
            sb.append(", masks=");
            sb.append(this.f);
            sb.append(", marketItems=");
            sb.append(this.g);
            sb.append(", compilationsMap=");
            sb.append(this.h);
            sb.append(", places=");
            return cjl0.a(sb, this.i, ')');
        }
    }

    /* compiled from: ShortVideoToClipsVideoFileMapper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShortVideoShortVideoFullDto.OriginalSoundStatusDto.values().length];
            try {
                iArr[ShortVideoShortVideoFullDto.OriginalSoundStatusDto.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoShortVideoFullDto.OriginalSoundStatusDto.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShortVideoShortVideoActionButtonDto.ModerationStatusDto.values().length];
            try {
                iArr2[ShortVideoShortVideoActionButtonDto.ModerationStatusDto.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShortVideoShortVideoActionButtonDto.ModerationStatusDto.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShortVideoShortVideoActionButtonDto.ModerationStatusDto.APPROVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025b, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0545, code lost:
    
        if (r2 != null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x02bb, code lost:
    
        if (r3.equals("clips_trend") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x02bf, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02c8, code lost:
    
        if (r3.equals("clips_compilation_view") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02d2, code lost:
    
        if (r3.equals("clips_compilation_next") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02dc, code lost:
    
        if (r3.equals("clips_challenge") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02e6, code lost:
    
        if (r3.equals("video") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02f0, code lost:
    
        if (r3.equals("group") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x02fa, code lost:
    
        if (r3.equals("user") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0304, code lost:
    
        if (r3.equals("post") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x030e, code lost:
    
        if (r3.equals("poll") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0317, code lost:
    
        if (r3.equals("link") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0320, code lost:
    
        if (r3.equals(com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_APP) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0329, code lost:
    
        if (r3.equals("product") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0332, code lost:
    
        if (r3.equals("video_postcard_gift") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x033b, code lost:
    
        if (r3.equals("link_community_with_subscribe") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0344, code lost:
    
        if (r3.equals("clips_user_link") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x034d, code lost:
    
        if (r3.equals("article") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0356, code lost:
    
        if (r3.equals("clips_compilation_first") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x035f, code lost:
    
        if (r3.equals("moneysend") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0368, code lost:
    
        if (r3.equals(com.ironsource.D1.e) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x027c, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0404  */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v90, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v91, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v92, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ClipVideoFile clipVideoFile, ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, a aVar, gjx gjxVar, Map map) {
        UserId q;
        VideoAccessInfo videoAccessInfo;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String a2;
        String str5;
        String str6;
        String e2;
        ActionLink actionLink;
        ShortVideoShortVideoActionButtonStylesDto g2;
        ShortVideoShortVideoActionButtonStylesDto.IconDto e3;
        ShortVideoShortVideoActionButtonStylesDto g3;
        Integer g4;
        String str7;
        ShortVideoShortVideoActionButtonStylesDto g5;
        List<BaseImageDto> f2;
        ShortVideoShortVideoActionButtonStylesDto g6;
        String str8;
        String str9;
        String title;
        String str10;
        String g7;
        String str11;
        String f3;
        String str12;
        String j2;
        VideoAdsType videoAdsType;
        ArrayList arrayList;
        List list;
        VideoAdInfo videoAdInfo;
        egz0 c2;
        ArrayList arrayList2;
        List<BaseImageDto> l2;
        ShortVideoShortVideoAdDto.PatternDto k2;
        ShortVideoShortVideoAdDto.TypeDto o;
        wjz0 content;
        wjz0 content2;
        wjz0 content3;
        l0n d2;
        wjz0 content4;
        OrdAdInfo ordAdInfo;
        TimelineThumbs timelineThumbs;
        VideoRestriction videoRestriction;
        List<PrivacySetting.PrivacyRule> list2;
        List<PrivacySetting.PrivacyRule> list3;
        BasePrivacyDto d3;
        BasePrivacyDto e4;
        ShortVideoShortVideoRestrictionButtonDto.ActionDto d4;
        ShortVideoShortVideoAccessEditDto l3;
        ShortVideoShortVideoAccessEditDto l4;
        ?? r8;
        clipVideoFile.c = shortVideoShortVideoFullDto.getId();
        ShortVideoShortVideoAdDto f4 = shortVideoShortVideoFullDto.f();
        if ((f4 != null ? f4.o() : null) == ShortVideoShortVideoAdDto.TypeDto.ADS_MAIL_SHORT_VIDEO_KNOWN_OWNER) {
            ShortVideoShortVideoAdDto f5 = shortVideoShortVideoFullDto.f();
            q = f5 != null ? f5.n() : null;
        } else {
            q = shortVideoShortVideoFullDto.q();
        }
        if (q == null) {
            q = UserId.d;
        }
        clipVideoFile.b = q;
        clipVideoFile.d = UserId.d;
        Integer B = shortVideoShortVideoFullDto.B();
        clipVideoFile.e = B != null ? B.intValue() : 0;
        clipVideoFile.h = null;
        ShortVideoShortVideoFilesDto F = shortVideoShortVideoFullDto.F();
        if (F != null) {
            clipVideoFile.j = F.K5();
        }
        clipVideoFile.f = new VideoUrlStorage(shortVideoShortVideoFullDto);
        clipVideoFile.m = shortVideoShortVideoFullDto.getDescription();
        clipVideoFile.p = "short_video";
        Integer v0 = shortVideoShortVideoFullDto.v0();
        clipVideoFile.q = v0 != null ? v0.intValue() : 0;
        ShortVideoShortVideoEngagementDto D = shortVideoShortVideoFullDto.D();
        Integer g8 = D != null ? D.g() : null;
        clipVideoFile.s = g8 != null ? g8.intValue() : 0;
        ShortVideoShortVideoEngagementDto D2 = shortVideoShortVideoFullDto.D();
        Integer e5 = D2 != null ? D2.e() : null;
        clipVideoFile.u = e5 != null ? e5.intValue() : 0;
        ShortVideoShortVideoEngagementDto D3 = shortVideoShortVideoFullDto.D();
        Integer d5 = D3 != null ? D3.d() : null;
        clipVideoFile.v = d5 != null ? d5.intValue() : 0;
        ShortVideoShortVideoEngagementDto D4 = shortVideoShortVideoFullDto.D();
        Integer f6 = D4 != null ? D4.f() : null;
        clipVideoFile.w = f6 != null ? f6.intValue() : 0;
        ShortVideoShortVideoEngagementDto D5 = shortVideoShortVideoFullDto.D();
        clipVideoFile.x = D5 != null ? epx.f(D5.k(), Boolean.TRUE) : false;
        ShortVideoShortVideoEngagementDto D6 = shortVideoShortVideoFullDto.D();
        clipVideoFile.y = D6 != null ? epx.f(D6.l(), Boolean.TRUE) : false;
        ShortVideoShortVideoEngagementDto D7 = shortVideoShortVideoFullDto.D();
        clipVideoFile.y = D7 != null ? epx.f(D7.l(), Boolean.TRUE) : false;
        ShortVideoShortVideoAccessDto d6 = shortVideoShortVideoFullDto.d();
        if (d6 == null || (l4 = d6.l()) == null) {
            videoAccessInfo = null;
        } else {
            e.getClass();
            List<String> e6 = l4.e();
            if (e6 != null) {
                r8 = new ArrayList();
                for (String str13 : e6) {
                    Parcelable ad = epx.f(str13, VideoEditForbiddenReasonsDto.CodeDto.AD.i()) ? new VideoEditForbiddenReason.Ad("") : epx.f(str13, VideoEditForbiddenReasonsDto.CodeDto.TEST.i()) ? new VideoEditForbiddenReason.Test("") : null;
                    if (ad != null) {
                        r8.add(ad);
                    }
                }
            } else {
                r8 = EmptyList.b;
            }
            videoAccessInfo = new VideoAccessInfo(r8);
        }
        clipVideoFile.A = videoAccessInfo;
        ShortVideoShortVideoAccessDto d7 = shortVideoShortVideoFullDto.d();
        clipVideoFile.B = d7 != null ? epx.f(d7.d(), Boolean.TRUE) : false;
        ShortVideoShortVideoAccessDto d8 = shortVideoShortVideoFullDto.d();
        clipVideoFile.C = d8 != null ? epx.f(d8.g(), Boolean.TRUE) : false;
        ShortVideoShortVideoAccessDto d9 = shortVideoShortVideoFullDto.d();
        clipVideoFile.F = (d9 == null || (l3 = d9.l()) == null) ? false : epx.f(l3.d(), Boolean.TRUE);
        ShortVideoShortVideoAccessDto d10 = shortVideoShortVideoFullDto.d();
        clipVideoFile.G = d10 != null ? epx.f(d10.e(), Boolean.TRUE) : false;
        ShortVideoShortVideoAccessDto d11 = shortVideoShortVideoFullDto.d();
        clipVideoFile.H = d11 != null ? epx.f(d11.j(), Boolean.TRUE) : false;
        ShortVideoShortVideoAccessDto d12 = shortVideoShortVideoFullDto.d();
        clipVideoFile.b2(d12 != null ? epx.f(d12.f(), Boolean.TRUE) : false ? VideoCanDownload.FILE : VideoCanDownload.NO);
        Boolean V0 = shortVideoShortVideoFullDto.V0();
        Boolean bool = Boolean.TRUE;
        clipVideoFile.O = epx.f(V0, bool);
        clipVideoFile.R = false;
        ShortVideoShortVideoAccessDto d13 = shortVideoShortVideoFullDto.d();
        clipVideoFile.T = d13 != null ? epx.f(d13.k(), bool) : false;
        clipVideoFile.U = epx.f(shortVideoShortVideoFullDto.S0(), bool);
        Map<UserId, Group> map2 = aVar.c;
        Group group = map2 != null ? map2.get(fkq0.a(shortVideoShortVideoFullDto.q())) : null;
        Map<UserId, UserProfile> map3 = aVar.b;
        UserProfile userProfile = map3 != null ? map3.get(shortVideoShortVideoFullDto.q()) : null;
        if (group != null) {
            String str14 = group.d;
            if (str14 != null) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                string = context.getString(R.string.clip_group_title, str14);
            }
            string = "";
        } else {
            if (userProfile != null && (str = userProfile.q) != null) {
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                string = context2.getString(R.string.clip_user_title, "@".concat(str));
            }
            string = "";
        }
        clipVideoFile.l = string;
        clipVideoFile.W = shortVideoShortVideoFullDto.r();
        clipVideoFile.A0 = SystemClock.elapsedRealtime();
        ShortVideoShortVideoActionButtonDto e7 = shortVideoShortVideoFullDto.e();
        i.getClass();
        if (e7 == null && jw.a(gjxVar) == null) {
            actionLink = null;
        } else {
            String type = e7 != null ? e7.getType() : null;
            if (type != null) {
                switch (type.hashCode()) {
                    case -1820761141:
                        str8 = D1.e;
                        break;
                    case -1712615352:
                        str8 = "moneysend";
                        break;
                    case -933240040:
                        str8 = "clips_compilation_first";
                        break;
                    case -732377866:
                        str8 = "article";
                        break;
                    case -652765742:
                        str8 = "clips_user_link";
                        break;
                    case -591591220:
                        str8 = "link_community_with_subscribe";
                        break;
                    case -378331237:
                        str8 = "video_postcard_gift";
                        break;
                    case -309474065:
                        str8 = "product";
                        break;
                    case 96801:
                        str8 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
                        break;
                    case 3321850:
                        str8 = "link";
                        break;
                    case 3446719:
                        str8 = "poll";
                        break;
                    case 3446944:
                        str8 = "post";
                        break;
                    case 3599307:
                        str8 = "user";
                        break;
                    case 98629247:
                        str8 = "group";
                        break;
                    case 112202875:
                        str8 = "video";
                        break;
                    case 410578503:
                        str8 = "clips_challenge";
                        break;
                    case 1217056139:
                        str8 = "clips_compilation_next";
                        break;
                    case 1217297725:
                        str8 = "clips_compilation_view";
                        break;
                    case 1378026881:
                        str8 = "clips_trend";
                        break;
                }
                SnippetStyle snippetStyle = (e7 != null || (g6 = e7.g()) == null) ? null : new SnippetStyle(f370.G(g6.d()), f370.G(g6.i()));
                if (e7 != null || (g5 = e7.g()) == null || (f2 = g5.f()) == null) {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                } else {
                    String str15 = null;
                    String str16 = null;
                    String str17 = null;
                    for (BaseImageDto baseImageDto : f2) {
                        int width = baseImageDto.getWidth();
                        if (width >= 0 && width < 100) {
                            str17 = baseImageDto.getUrl();
                        } else if (100 > width || width >= 300) {
                            str15 = baseImageDto.getUrl();
                        } else {
                            str16 = baseImageDto.getUrl();
                        }
                    }
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                }
                a2 = jw.a(gjxVar);
                if (a2 != null) {
                    if (e7 == null || (str7 = e7.f()) == null || str7.length() <= 0) {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = e7 != null ? e7.getTitle() : null;
                        if (str7 == null) {
                            str5 = "";
                        }
                    }
                    str5 = str7;
                } else {
                    str5 = a2;
                }
                String i2 = e7 == null ? e7.i() : null;
                String str18 = i2 != null ? "" : i2;
                if (a2 == null) {
                    a2 = e7 != null ? e7.getTitle() : null;
                    if (a2 == null) {
                        str6 = "";
                        ActionLinkSnippet actionLinkSnippet = new ActionLinkSnippet(str5, "", str18, str6, SnippetTarget.UNKNOWN, (e7 != null || (g3 = e7.g()) == null || (g4 = g3.g()) == null) ? 0 : g4.intValue(), 0, snippetStyle, str2, str3, str4, null, null, null, (e7 != null || (g2 = e7.g()) == null || (e3 = g2.e()) == null) ? null : e3.i(), 14336, null);
                        e2 = e7 != null ? e7.e() : null;
                        if (e2 == null) {
                            e2 = "";
                        }
                        String url = e7 != null ? e7.getUrl() : null;
                        actionLink = new ActionLink(0, r11, e2, url == null ? "" : url, actionLinkSnippet, null, null, null);
                    }
                }
                str6 = a2;
                ActionLinkSnippet actionLinkSnippet2 = new ActionLinkSnippet(str5, "", str18, str6, SnippetTarget.UNKNOWN, (e7 != null || (g3 = e7.g()) == null || (g4 = g3.g()) == null) ? 0 : g4.intValue(), 0, snippetStyle, str2, str3, str4, null, null, null, (e7 != null || (g2 = e7.g()) == null || (e3 = g2.e()) == null) ? null : e3.i(), 14336, null);
                if (e7 != null) {
                }
                if (e2 == null) {
                }
                if (e7 != null) {
                }
                actionLink = new ActionLink(0, r11, e2, url == null ? "" : url, actionLinkSnippet2, null, null, null);
            }
            String str19 = "";
            if (e7 != null) {
            }
            if (e7 != null) {
            }
            str2 = null;
            str3 = null;
            str4 = null;
            a2 = jw.a(gjxVar);
            if (a2 != null) {
            }
            if (e7 == null) {
            }
            if (i2 != null) {
            }
            if (a2 == null) {
            }
            str6 = a2;
            ActionLinkSnippet actionLinkSnippet22 = new ActionLinkSnippet(str5, "", str18, str6, SnippetTarget.UNKNOWN, (e7 != null || (g3 = e7.g()) == null || (g4 = g3.g()) == null) ? 0 : g4.intValue(), 0, snippetStyle, str2, str3, str4, null, null, null, (e7 != null || (g2 = e7.g()) == null || (e3 = g2.e()) == null) ? null : e3.i(), 14336, null);
            if (e7 != null) {
            }
            if (e2 == null) {
            }
            if (e7 != null) {
            }
            actionLink = new ActionLink(0, str19, e2, url == null ? "" : url, actionLinkSnippet22, null, null, null);
        }
        clipVideoFile.Y = actionLink;
        clipVideoFile.Z = false;
        clipVideoFile.b0 = shortVideoShortVideoFullDto.f() != null;
        ShortVideoShortVideoAdDto f7 = shortVideoShortVideoFullDto.f();
        g.getClass();
        if (f7 == null && gjxVar == null) {
            videoAdInfo = null;
        } else {
            if (gjxVar == null || (content4 = gjxVar.getContent()) == null || (title = content4.a.r) == null) {
                if (f7 != null) {
                    title = f7.getTitle();
                } else {
                    str9 = null;
                    if (gjxVar != null || (content3 = gjxVar.getContent()) == null || (d2 = content3.d()) == null || (g7 = d2.c) == null) {
                        if (f7 == null) {
                            g7 = f7.g();
                        } else {
                            str10 = null;
                            if (gjxVar != null || (content2 = gjxVar.getContent()) == null || (f3 = content2.a.h) == null) {
                                if (f7 == null) {
                                    f3 = f7.f();
                                } else {
                                    str11 = null;
                                    UserId n = f7 == null ? f7.n() : null;
                                    Owner owner = map == null ? (Owner) map.get(f7 != null ? f7.n() : null) : null;
                                    if (gjxVar != null || (content = gjxVar.getContent()) == null || (j2 = content.a.f) == null) {
                                        if (f7 == null) {
                                            j2 = f7.j();
                                        } else {
                                            str12 = null;
                                            if (f7 != null && (o = f7.o()) != null) {
                                                VideoAdsType.a aVar2 = VideoAdsType.Companion;
                                                String i3 = o.i();
                                                aVar2.getClass();
                                                videoAdsType = VideoAdsType.a.a(i3);
                                            }
                                            videoAdsType = VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO;
                                            if (gjxVar == null) {
                                                videoAdsType = null;
                                            }
                                            if (videoAdsType == null) {
                                                videoAdsType = VideoAdsType.UNKNOWN;
                                            }
                                            VideoAdsType videoAdsType2 = videoAdsType;
                                            boolean f8 = epx.f(f7 == null ? f7.i() : null, Boolean.TRUE);
                                            String e8 = f7 == null ? f7.e() : null;
                                            String d14 = f7 == null ? f7.d() : null;
                                            String i4 = (f7 != null || (k2 = f7.k()) == null) ? null : k2.i();
                                            if (f7 != null || (l2 = f7.l()) == null) {
                                                arrayList = null;
                                            } else {
                                                List<BaseImageDto> list4 = l2;
                                                arrayList = new ArrayList(c5g.u(list4, 10));
                                                for (BaseImageDto baseImageDto2 : list4) {
                                                    arrayList.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                                                }
                                            }
                                            Image image = new Image(arrayList);
                                            if (gjxVar != null || (c2 = gjxVar.c()) == null || (arrayList2 = c2.b) == null) {
                                                list = 0;
                                            } else {
                                                list = new ArrayList(c5g.u(arrayList2, 10));
                                                Iterator it = arrayList2.iterator();
                                                while (it.hasNext()) {
                                                    ajx ajxVar = (ajx) it.next();
                                                    list.add(new AdsChoicesOptions(ajxVar.b(), ajxVar.getType(), ajxVar.getTitle(), null, Boolean.valueOf(ajxVar.a()), null, null, 104, null));
                                                }
                                            }
                                            if (list == 0) {
                                                list = EmptyList.b;
                                            }
                                            videoAdInfo = new VideoAdInfo(str9, str10, str11, n, owner, str12, videoAdsType2, f8, e8, d14, i4, image, new AdsChoices(null, null, null, null, list, 15, null));
                                        }
                                    }
                                    str12 = j2;
                                    if (f7 != null) {
                                        VideoAdsType.a aVar22 = VideoAdsType.Companion;
                                        String i32 = o.i();
                                        aVar22.getClass();
                                        videoAdsType = VideoAdsType.a.a(i32);
                                    }
                                    videoAdsType = VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO;
                                    if (gjxVar == null) {
                                    }
                                    if (videoAdsType == null) {
                                    }
                                    VideoAdsType videoAdsType22 = videoAdsType;
                                    boolean f82 = epx.f(f7 == null ? f7.i() : null, Boolean.TRUE);
                                    if (f7 == null) {
                                    }
                                    if (f7 == null) {
                                    }
                                    if (f7 != null) {
                                    }
                                    if (f7 != null) {
                                    }
                                    arrayList = null;
                                    Image image2 = new Image(arrayList);
                                    if (gjxVar != null) {
                                    }
                                    list = 0;
                                    if (list == 0) {
                                    }
                                    videoAdInfo = new VideoAdInfo(str9, str10, str11, n, owner, str12, videoAdsType22, f82, e8, d14, i4, image2, new AdsChoices(null, null, null, null, list, 15, null));
                                }
                            }
                            str11 = f3;
                            if (f7 == null) {
                            }
                            if (map == null) {
                            }
                            if (gjxVar != null) {
                            }
                            if (f7 == null) {
                            }
                        }
                    }
                    str10 = g7;
                    if (gjxVar != null) {
                    }
                    if (f7 == null) {
                    }
                }
            }
            str9 = title;
            if (gjxVar != null) {
            }
            if (f7 == null) {
            }
        }
        clipVideoFile.c0 = videoAdInfo;
        ShortVideoShortVideoOrdDto Z = shortVideoShortVideoFullDto.Z();
        if (Z != null) {
            h.getClass();
            String title2 = Z.getTitle();
            List<ShortVideoShortVideoOrdAdvertiserDto> d15 = Z.d();
            ArrayList arrayList3 = new ArrayList(c5g.u(d15, 10));
            for (ShortVideoShortVideoOrdAdvertiserDto shortVideoShortVideoOrdAdvertiserDto : d15) {
                arrayList3.add(new OrdAdvertiser(shortVideoShortVideoOrdAdvertiserDto.getUrl(), shortVideoShortVideoOrdAdvertiserDto.d()));
            }
            ordAdInfo = new OrdAdInfo(title2, arrayList3);
        } else {
            ordAdInfo = null;
        }
        clipVideoFile.d0 = ordAdInfo;
        clipVideoFile.e0 = false;
        clipVideoFile.f0 = epe0.a(jgp.b);
        ShortVideoShortVideoEngagementDto D8 = shortVideoShortVideoFullDto.D();
        clipVideoFile.i0 = D8 != null ? epx.f(D8.j(), Boolean.TRUE) : false;
        Integer P0 = shortVideoShortVideoFullDto.P0();
        clipVideoFile.m0 = P0 != null ? P0.intValue() : 0;
        Integer K = shortVideoShortVideoFullDto.K();
        clipVideoFile.n0 = K != null ? K.intValue() : 0;
        clipVideoFile.r0 = "";
        ShortVideoShortVideoEngagementDto D9 = shortVideoShortVideoFullDto.D();
        clipVideoFile.t0 = D9 != null ? epx.f(D9.n(), Boolean.TRUE) : false;
        clipVideoFile.w0 = 0;
        clipVideoFile.D0 = 0;
        List<ShortVideoShortVideoImageDto> p = shortVideoShortVideoFullDto.p();
        y000 y000Var = j;
        if (p != null) {
            y000Var.getClass();
            clipVideoFile.I0 = y000.h(p);
        }
        List<ShortVideoShortVideoImageDto> G = shortVideoShortVideoFullDto.G();
        if (G != null) {
            y000Var.getClass();
            clipVideoFile.J0 = y000.h(G);
        }
        ShortVideoShortVideoTimelineThumbsDto H0 = shortVideoShortVideoFullDto.H0();
        if (H0 == null) {
            timelineThumbs = null;
        } else {
            k.getClass();
            Float i5 = H0.i();
            int floatValue = i5 != null ? (int) i5.floatValue() : 0;
            Integer g9 = H0.g();
            int intValue = g9 != null ? g9.intValue() : 0;
            Integer e9 = H0.e();
            int intValue2 = e9 != null ? e9.intValue() : 0;
            Integer d16 = H0.d();
            int intValue3 = d16 != null ? d16.intValue() : 0;
            Integer f9 = H0.f();
            int intValue4 = f9 != null ? f9.intValue() : 0;
            Integer j3 = H0.j();
            int intValue5 = j3 != null ? j3.intValue() : 0;
            List<String> k3 = H0.k();
            if (k3 == null) {
                k3 = EmptyList.b;
            }
            timelineThumbs = new TimelineThumbs(floatValue, intValue, intValue2, intValue3, intValue4, intValue5, true, k3);
        }
        clipVideoFile.K0 = timelineThumbs;
        ShortVideoShortVideoRestrictionDto w0 = shortVideoShortVideoFullDto.w0();
        if (w0 != null) {
            f.getClass();
            String title3 = w0.getTitle();
            String l5 = w0.l();
            String str20 = l5 == null ? "" : l5;
            Boolean d17 = w0.d();
            Boolean bool2 = Boolean.TRUE;
            boolean f10 = epx.f(d17, bool2);
            ShortVideoShortVideoRestrictionButtonDto e10 = w0.e();
            String i6 = (e10 == null || (d4 = e10.d()) == null) ? null : d4.i();
            if (i6 == null) {
                i6 = "";
            }
            String title4 = e10 != null ? e10.getTitle() : null;
            if (title4 == null) {
                title4 = "";
            }
            RestrictionButton restrictionButton = (i6.length() == 0 && title4.length() == 0) ? null : new RestrictionButton(i6, title4, null);
            boolean f11 = epx.f(w0.f(), bool2);
            new ne6();
            Image a3 = ne6.a(w0.g());
            new ne6();
            Image a4 = ne6.a(w0.j());
            Integer i7 = w0.i();
            int intValue6 = i7 != null ? i7.intValue() : 0;
            String k4 = w0.k();
            videoRestriction = new VideoRestriction(title3, str20, f10, restrictionButton, f11, a3, a4, intValue6, k4 == null ? "" : k4);
        } else {
            videoRestriction = null;
        }
        clipVideoFile.O0 = videoRestriction;
        String K0 = shortVideoShortVideoFullDto.K0();
        clipVideoFile.P0 = K0 != null ? K0.toString() : null;
        clipVideoFile.Q0 = epx.f(shortVideoShortVideoFullDto.U0(), Boolean.TRUE);
        Float N0 = shortVideoShortVideoFullDto.N0();
        clipVideoFile.R0 = N0 != null ? N0.floatValue() : 1.0f;
        List<ShortVideoShortVideoStatsPixelDto> F0 = shortVideoShortVideoFullDto.F0();
        if (F0 != null) {
            l.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : F0) {
                ShortVideoShortVideoStatsPixelDto.EventDto d18 = ((ShortVideoShortVideoStatsPixelDto) obj).d();
                Object obj2 = linkedHashMap2.get(d18);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(d18, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                StatPixel.a a5 = StatPixel.a.b.a(((ShortVideoShortVideoStatsPixelDto.EventDto) entry.getKey()).i());
                Iterable<ShortVideoShortVideoStatsPixelDto> iterable = (Iterable) entry.getValue();
                ArrayList arrayList4 = new ArrayList(c5g.u(iterable, 10));
                for (ShortVideoShortVideoStatsPixelDto shortVideoShortVideoStatsPixelDto : iterable) {
                    MapBuilder mapBuilder = new MapBuilder();
                    Integer e11 = shortVideoShortVideoStatsPixelDto.e();
                    if (e11 != null) {
                        mapBuilder.put("interval", String.valueOf(e11.intValue()));
                    }
                    arrayList4.add(new StatPixel(a5, shortVideoShortVideoStatsPixelDto.getUrl(), mapBuilder.h(), false));
                }
                linkedHashMap.put(a5, new nsk0(arrayList4));
            }
            clipVideoFile.S0 = linkedHashMap;
        }
        clipVideoFile.U0 = -1L;
        ShortVideoShortVideoPrivacyDto l0 = shortVideoShortVideoFullDto.l0();
        if (l0 == null || (e4 = l0.e()) == null) {
            list2 = EmptyList.b;
        } else {
            ums0.a.getClass();
            list2 = ums0.b(e4);
        }
        clipVideoFile.x0 = list2;
        ShortVideoShortVideoPrivacyDto l02 = shortVideoShortVideoFullDto.l0();
        if (l02 == null || (d3 = l02.d()) == null) {
            list3 = EmptyList.b;
        } else {
            ums0.a.getClass();
            list3 = ums0.b(d3);
        }
        clipVideoFile.y0 = list3;
        clipVideoFile.a1 = EmptyList.b;
        Integer y0 = shortVideoShortVideoFullDto.y0();
        clipVideoFile.r = y0 != null ? y0.intValue() : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0186  */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v38, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ClipVideoFile b(ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, gjx gjxVar) {
        ClickableStickers clickableStickers;
        ?? r7;
        ?? r9;
        ?? r72;
        MusicTrack musicTrack;
        String str;
        ArrayList arrayList;
        ?? r5;
        ?? r73;
        ?? r4;
        ClipLinkModerationStatus clipLinkModerationStatus;
        VideoNotificationsStatus videoNotificationsStatus;
        Group group;
        String str2;
        String e2;
        ShortVideoShortVideoActionButtonDto.ModerationStatusDto d2;
        Boolean i2;
        List<ShortVideoShortVideoAdsFlagDto> d3;
        String d4;
        Integer e3;
        UserId q;
        Compilation compilation;
        ShortVideoCompilationInfoDto shortVideoCompilationInfoDto;
        Mask mask;
        ArrayList arrayList2;
        Serializer.StreamParcelableAdapter clickableHashtag;
        String name;
        GeoPlace geoPlace;
        MarketMarketItemDto marketMarketItemDto;
        VkTicketsVkTicketSeanceDto e4;
        VkTicketsVkTicketSeanceDto e5;
        VkTicketsVkTicketSeanceDto e6;
        VkTicketsVkTicketSeanceDto e7;
        BaseImageDto d5;
        ShortVideoAudioDto shortVideoAudioDto;
        a aVar = new a(map, map2, map3, map4, map5, map6, map7, map8, map9);
        ShortVideoShortVideoAudioIdDto j2 = shortVideoShortVideoFullDto.j();
        MusicTrack c2 = (j2 == null || map4 == null || (shortVideoAudioDto = (ShortVideoAudioDto) map4.get(new c14(j2.e(), j2.d()))) == null) ? null : sfj0.c(shortVideoAudioDto);
        ShortVideoShortVideoClickableStickersDto l2 = shortVideoShortVideoFullDto.l();
        boolean z = false;
        if (l2 != null) {
            List<ShortVideoShortVideoClickableStickerItemDto> d6 = l2.d();
            if (d6 == null) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (ShortVideoShortVideoClickableStickerItemDto shortVideoShortVideoClickableStickerItemDto : d6) {
                    switch (vfj0.a.$EnumSwitchMapping$0[shortVideoShortVideoClickableStickerItemDto.B().ordinal()]) {
                        case 1:
                            List b2 = vfj0.b(shortVideoShortVideoClickableStickerItemDto.e());
                            q500 a2 = vfj0.a(shortVideoShortVideoClickableStickerItemDto);
                            String g2 = shortVideoShortVideoClickableStickerItemDto.g();
                            String str3 = g2 == null ? "" : g2;
                            ShortVideoShortVideoClickableStickerItemDto.StyleDto p = shortVideoShortVideoClickableStickerItemDto.p();
                            String i3 = p != null ? p.i() : null;
                            clickableHashtag = new ClickableHashtag(0L, b2, a2, str3, i3 == null ? "" : i3, 1, null);
                            break;
                        case 2:
                            String j3 = shortVideoShortVideoClickableStickerItemDto.j();
                            String obj = drm0.p0(j3 != null ? j3 : "").toString();
                            Serializer.c<ClickableMention> cVar = ClickableMention.CREATOR;
                            Pair c3 = ClickableMention.a.c(obj);
                            if (c3 != null) {
                                UserId userId = (UserId) c3.d();
                                String str4 = (String) c3.g();
                                ShortVideoShortVideoClickableStickerItemDto.StyleDto p2 = shortVideoShortVideoClickableStickerItemDto.p();
                                clickableHashtag = new ClickableMention(0L, vfj0.b(shortVideoShortVideoClickableStickerItemDto.e()), vfj0.a(shortVideoShortVideoClickableStickerItemDto), userId, str4, (p2 == null || (name = p2.name()) == null) ? null : name.toLowerCase(Locale.ROOT), (userId.b <= 0 || map2 == 0) ? null : (UserProfile) map2.get(userId), (userId.b >= 0 || map3 == null) ? null : (Group) map3.get(fkq0.e(userId)), 1, null);
                                break;
                            }
                            clickableHashtag = null;
                            break;
                        case 3:
                            PlacesPlaceDto placesPlaceDto = map9 != null ? (PlacesPlaceDto) map9.get(shortVideoShortVideoClickableStickerItemDto.k()) : null;
                            List b3 = vfj0.b(shortVideoShortVideoClickableStickerItemDto.e());
                            q500 a3 = vfj0.a(shortVideoShortVideoClickableStickerItemDto);
                            Integer k2 = shortVideoShortVideoClickableStickerItemDto.k();
                            int intValue = k2 != null ? k2.intValue() : 0;
                            ShortVideoShortVideoClickableStickerItemDto.StyleDto p3 = shortVideoShortVideoClickableStickerItemDto.p();
                            String i4 = p3 != null ? p3.i() : null;
                            String str5 = i4 == null ? "" : i4;
                            if (placesPlaceDto != null) {
                                int id = placesPlaceDto.getId();
                                String title = placesPlaceDto.getTitle();
                                double j4 = placesPlaceDto.j();
                                double k3 = placesPlaceDto.k();
                                int l3 = placesPlaceDto.l();
                                UserId q2 = placesPlaceDto.q();
                                if (q2 == null) {
                                    q2 = UserId.d;
                                }
                                UserId userId2 = q2;
                                String d7 = placesPlaceDto.d();
                                String str6 = d7 == null ? "" : d7;
                                Integer g3 = placesPlaceDto.g();
                                int intValue2 = g3 != null ? g3.intValue() : 0;
                                Integer i5 = placesPlaceDto.i();
                                geoPlace = new GeoPlace(id, title, j4, k3, l3, "", userId2, str6, intValue2, i5 != null ? i5.intValue() : 0, 0);
                            } else {
                                geoPlace = null;
                            }
                            clickableHashtag = new ClickableGeo(0L, b3, a3, intValue, str5, geoPlace, null, null, 1, null);
                            break;
                        case 4:
                            UserId q3 = shortVideoShortVideoClickableStickerItemDto.q();
                            Integer i6 = shortVideoShortVideoClickableStickerItemDto.i();
                            if (q3 != null && i6 != null) {
                                int intValue3 = i6.intValue();
                                if (map7 != null) {
                                    marketMarketItemDto = (MarketMarketItemDto) map7.get(new c14(q3, intValue3));
                                    Good c4 = marketMarketItemDto == null ? b210.c(marketMarketItemDto) : null;
                                    new ne6();
                                    clickableHashtag = new ClickableMarketItem(0L, vfj0.b(shortVideoShortVideoClickableStickerItemDto.e()), vfj0.a(shortVideoShortVideoClickableStickerItemDto), marketMarketItemDto == null ? Long.valueOf(marketMarketItemDto.getId()) : null, marketMarketItemDto == null ? marketMarketItemDto.q() : null, null, ne6.a(marketMarketItemDto == null ? marketMarketItemDto.W() : null), null, c4, null, shortVideoShortVideoClickableStickerItemDto.d(), null, 2049, null);
                                    break;
                                }
                            }
                            marketMarketItemDto = null;
                            if (marketMarketItemDto == null) {
                            }
                            new ne6();
                            clickableHashtag = new ClickableMarketItem(0L, vfj0.b(shortVideoShortVideoClickableStickerItemDto.e()), vfj0.a(shortVideoShortVideoClickableStickerItemDto), marketMarketItemDto == null ? Long.valueOf(marketMarketItemDto.getId()) : null, marketMarketItemDto == null ? marketMarketItemDto.q() : null, null, ne6.a(marketMarketItemDto == null ? marketMarketItemDto.W() : null), null, c4, null, shortVideoShortVideoClickableStickerItemDto.d(), null, 2049, null);
                        case 5:
                            Integer n = shortVideoShortVideoClickableStickerItemDto.n();
                            int intValue4 = n != null ? n.intValue() : 0;
                            Integer o = shortVideoShortVideoClickableStickerItemDto.o();
                            clickableHashtag = new ClickablePackSticker(0L, vfj0.b(shortVideoShortVideoClickableStickerItemDto.e()), vfj0.a(shortVideoShortVideoClickableStickerItemDto), intValue4, o != null ? o.intValue() : 0, null, 33, null);
                            break;
                        case 6:
                            List b4 = vfj0.b(shortVideoShortVideoClickableStickerItemDto.e());
                            q500 a4 = vfj0.a(shortVideoShortVideoClickableStickerItemDto);
                            VkTicketsVkTicketDto u = shortVideoShortVideoClickableStickerItemDto.u();
                            String id2 = u != null ? u.getId() : null;
                            VkTicketsVkTicketDto u2 = shortVideoShortVideoClickableStickerItemDto.u();
                            String title2 = u2 != null ? u2.getTitle() : null;
                            VkTicketsVkTicketDto u3 = shortVideoShortVideoClickableStickerItemDto.u();
                            String url = (u3 == null || (d5 = u3.d()) == null) ? null : d5.getUrl();
                            VkTicketsVkTicketDto u4 = shortVideoShortVideoClickableStickerItemDto.u();
                            String url2 = u4 != null ? u4.getUrl() : null;
                            VkTicketsVkTicketDto u5 = shortVideoShortVideoClickableStickerItemDto.u();
                            String id3 = (u5 == null || (e7 = u5.e()) == null) ? null : e7.getId();
                            VkTicketsVkTicketDto u6 = shortVideoShortVideoClickableStickerItemDto.u();
                            String e8 = (u6 == null || (e6 = u6.e()) == null) ? null : e6.e();
                            VkTicketsVkTicketDto u7 = shortVideoShortVideoClickableStickerItemDto.u();
                            String d8 = (u7 == null || (e5 = u7.e()) == null) ? null : e5.d();
                            VkTicketsVkTicketDto u8 = shortVideoShortVideoClickableStickerItemDto.u();
                            clickableHashtag = new ClickableVkTicket(0L, b4, a4, id2, title2, url, url2, new SeanceInfo(id3, e8, d8, (u8 == null || (e4 = u8.e()) == null) ? null : e4.f()), 1, null);
                            break;
                        default:
                            clickableHashtag = null;
                            break;
                    }
                    if (clickableHashtag != null) {
                        arrayList3.add(clickableHashtag);
                    }
                }
                arrayList2 = arrayList3;
            }
            clickableStickers = new ClickableStickers(l2.f(), l2.e(), arrayList2);
        } else {
            clickableStickers = null;
        }
        List<ShortVideoShortVideoEffectIdDto> C = shortVideoShortVideoFullDto.C();
        Map<UserId, Group> map10 = aVar.c;
        if (C != null) {
            r7 = new ArrayList();
            for (ShortVideoShortVideoEffectIdDto shortVideoShortVideoEffectIdDto : C) {
                Map<c14, MasksEffectDto> map11 = aVar.e;
                MasksEffectDto masksEffectDto = map11 != null ? map11.get(new c14(shortVideoShortVideoEffectIdDto.e(), shortVideoShortVideoEffectIdDto.d())) : null;
                if (masksEffectDto != null) {
                    ums0.a.getClass();
                    mask = ums0.i(masksEffectDto, map2, map10);
                } else {
                    mask = null;
                }
                if (mask != null) {
                    r7.add(mask);
                }
            }
        } else {
            r7 = 0;
        }
        if (r7 == 0) {
            r7 = EmptyList.b;
        }
        List<ShortVideoShortVideoMaskIdDto> T = shortVideoShortVideoFullDto.T();
        if (T != null) {
            r9 = new ArrayList();
            for (ShortVideoShortVideoMaskIdDto shortVideoShortVideoMaskIdDto : T) {
                Map<c14, MasksMaskDto> map12 = aVar.f;
                Mask a5 = ii10.a(map12 != null ? map12.get(new c14(shortVideoShortVideoMaskIdDto.e(), shortVideoShortVideoMaskIdDto.d())) : null, map2, map10);
                if (a5 != null) {
                    r9.add(a5);
                }
            }
        } else {
            r9 = 0;
        }
        if (r9 == 0) {
            r9 = EmptyList.b;
        }
        ArrayList u0 = j5g.u0((Iterable) r9, (Collection) r7);
        List<Integer> o2 = shortVideoShortVideoFullDto.o();
        if (o2 != null) {
            r72 = new ArrayList();
            Iterator it = o2.iterator();
            while (it.hasNext()) {
                int intValue5 = ((Number) it.next()).intValue();
                Map<Integer, ShortVideoCompilationInfoDto> map13 = aVar.h;
                if (map13 == null || (shortVideoCompilationInfoDto = map13.get(Integer.valueOf(intValue5))) == null) {
                    compilation = null;
                } else {
                    ums0.a.getClass();
                    compilation = ums0.h(shortVideoCompilationInfoDto);
                }
                if (compilation != null) {
                    r72.add(compilation);
                }
            }
        } else {
            r72 = 0;
        }
        if (r72 == 0) {
            r72 = EmptyList.b;
        }
        List list = r72;
        ShortVideoShortVideoAccessDto d9 = shortVideoShortVideoFullDto.d();
        Boolean i7 = d9 != null ? d9.i() : null;
        Boolean bool = Boolean.FALSE;
        ShortVideoDuetDto u9 = shortVideoShortVideoFullDto.u();
        if (u9 == null || (q = u9.q()) == null) {
            musicTrack = c2;
            str = null;
        } else {
            musicTrack = c2;
            str = Long.valueOf(q.b).toString();
        }
        ShortVideoDuetDto u10 = shortVideoShortVideoFullDto.u();
        String num = (u10 == null || (e3 = u10.e()) == null) ? null : e3.toString();
        ShortVideoDuetDto u11 = shortVideoShortVideoFullDto.u();
        DuetMeta duetMeta = new DuetMeta(i7, bool, str, num, u11 != null ? u11.d() : null);
        ShortVideoSourceVideoDto D0 = shortVideoShortVideoFullDto.D0();
        ClipVideoOrigin clipVideoOrigin = D0 != null ? new ClipVideoOrigin(String.valueOf(D0.q().b), String.valueOf(D0.d()), D0.getDescription()) : null;
        ShortVideoAudioTemplateInfoDto k4 = shortVideoShortVideoFullDto.k();
        ClipAudioTemplate clipAudioTemplate = (k4 == null || (d4 = k4.d()) == null) ? null : new ClipAudioTemplate(d4);
        List<ShortVideoPlaylistMinDto> d0 = shortVideoShortVideoFullDto.d0();
        if (d0 != null) {
            List<ShortVideoPlaylistMinDto> list2 = d0;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ShortVideoPlaylistMinDto shortVideoPlaylistMinDto = (ShortVideoPlaylistMinDto) it2.next();
                arrayList.add(new ClipsDraftablePlaylist(shortVideoPlaylistMinDto.getId(), shortVideoPlaylistMinDto.getTitle(), EmptyList.b, shortVideoPlaylistMinDto.q()));
                it2 = it2;
                clickableStickers = clickableStickers;
            }
        } else {
            arrayList = null;
        }
        ClickableStickers clickableStickers2 = clickableStickers;
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = EmptyList.b;
        }
        List list4 = list3;
        List<ShortVideoCoOwnerDto> n2 = shortVideoShortVideoFullDto.n();
        if (n2 != null) {
            r5 = new ArrayList();
            Iterator it3 = n2.iterator();
            while (it3.hasNext()) {
                CoOwnerItem a6 = com.vk.dto.common.clips.a.a((ShortVideoCoOwnerDto) it3.next(), map2, map10, aVar.a);
                if (a6 != null) {
                    r5.add(a6);
                }
            }
        } else {
            r5 = 0;
        }
        if (r5 == 0) {
            r5 = EmptyList.b;
        }
        List list5 = r5;
        List<AdsItemBlockAdStatPixelDto> i8 = shortVideoShortVideoFullDto.i();
        Map b5 = i8 != null ? ui0.b(i8) : null;
        if (b5 == null) {
            b5 = jgp.b;
        }
        Map map14 = b5;
        ShortVideoAdsFeaturesDto g4 = shortVideoShortVideoFullDto.g();
        List<String> f2 = g4 != null ? g4.f() : null;
        if (f2 == null) {
            f2 = EmptyList.b;
        }
        ShortVideoAdsFeaturesDto g5 = shortVideoShortVideoFullDto.g();
        if (g5 == null || (d3 = g5.d()) == null) {
            r73 = 0;
        } else {
            List<ShortVideoShortVideoAdsFlagDto> list6 = d3;
            r73 = new ArrayList(c5g.u(list6, 10));
            for (ShortVideoShortVideoAdsFlagDto shortVideoShortVideoAdsFlagDto : list6) {
                ums0.a.getClass();
                int i9 = ums0.a.$EnumSwitchMapping$1[shortVideoShortVideoAdsFlagDto.ordinal()];
                r73.add(i9 != 1 ? i9 != 2 ? ClipsAdsFeaturesParams.AdsFlags.UNKNOWN : ClipsAdsFeaturesParams.AdsFlags.HIDE_FULLSCREEN_AD_BANNER : ClipsAdsFeaturesParams.AdsFlags.HIDE_CLOSING_AD_BANNER);
            }
        }
        if (r73 == 0) {
            r73 = EmptyList.b;
        }
        ShortVideoAdsFeaturesDto g6 = shortVideoShortVideoFullDto.g();
        ClipsAdsFeaturesParams clipsAdsFeaturesParams = new ClipsAdsFeaturesParams(f2, r73, g6 != null ? g6.e() : null);
        List<ShortVideoShortVideoTrendingHashtagDto> R0 = shortVideoShortVideoFullDto.R0();
        if (R0 != null) {
            List<ShortVideoShortVideoTrendingHashtagDto> list7 = R0;
            r4 = new ArrayList(c5g.u(list7, 10));
            for (ShortVideoShortVideoTrendingHashtagDto shortVideoShortVideoTrendingHashtagDto : list7) {
                r4.add(new TrendingHashtag(shortVideoShortVideoTrendingHashtagDto.e(), shortVideoShortVideoTrendingHashtagDto.d()));
            }
        } else {
            List<String> M = shortVideoShortVideoFullDto.M();
            if (M != null) {
                List<String> list8 = M;
                r4 = new ArrayList(c5g.u(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    r4.add(new TrendingHashtag((String) it4.next(), EmptyList.b));
                }
            } else {
                r4 = EmptyList.b;
            }
        }
        List list9 = r4;
        ShortVideoShortVideoFullDto.OriginalSoundStatusDto a0 = shortVideoShortVideoFullDto.a0();
        int i10 = a0 == null ? -1 : b.$EnumSwitchMapping$0[a0.ordinal()];
        OriginalSoundStatus originalSoundStatus = i10 != 1 ? i10 != 2 ? OriginalSoundStatus.NONE : OriginalSoundStatus.MODERATING : OriginalSoundStatus.DENIED;
        ShortVideoShortVideoEngagementDto D = shortVideoShortVideoFullDto.D();
        boolean booleanValue = (D == null || (i2 = D.i()) == null) ? false : i2.booleanValue();
        ShortVideoShortVideoActionButtonDto e9 = shortVideoShortVideoFullDto.e();
        if (e9 == null || (d2 = e9.d()) == null) {
            clipLinkModerationStatus = ClipLinkModerationStatus.UNDEFINED;
        } else {
            int i11 = b.$EnumSwitchMapping$1[d2.ordinal()];
            clipLinkModerationStatus = i11 != 1 ? i11 != 2 ? i11 != 3 ? ClipLinkModerationStatus.UNDEFINED : ClipLinkModerationStatus.APPROVED : ClipLinkModerationStatus.REJECTED : ClipLinkModerationStatus.PENDING_MODERATION;
        }
        ClipLinkModerationStatus clipLinkModerationStatus2 = clipLinkModerationStatus;
        ClipMainTabState.a aVar2 = ClipMainTabState.Companion;
        ShortVideoMainTabStateDto R = shortVideoShortVideoFullDto.R();
        Integer valueOf = R != null ? Integer.valueOf(R.i()) : null;
        aVar2.getClass();
        ClipMainTabState a7 = ClipMainTabState.a.a(valueOf);
        ShortVideoShortVideoNewsMonothemeDto W = shortVideoShortVideoFullDto.W();
        ClipVideoFile clipVideoFile = new ClipVideoFile(clickableStickers2, musicTrack, u0, list, duetMeta, clipVideoOrigin, originalSoundStatus, booleanValue, clipLinkModerationStatus2, clipAudioTemplate, list4, list5, map14, null, null, list9, a7, clipsAdsFeaturesParams, (W == null || (e2 = W.e()) == null) ? null : new NewsMonotheme(e2, W.d()));
        a(clipVideoFile, shortVideoShortVideoFullDto, aVar, gjxVar, map);
        if (map3 == null || (group = (Group) map3.get(clipVideoFile.b)) == null || (str2 = group.k0) == null) {
            videoNotificationsStatus = null;
        } else {
            VideoNotificationsStatus.Companion.getClass();
            videoNotificationsStatus = VideoNotificationsStatus.a.a(str2);
        }
        clipVideoFile.u0 = videoNotificationsStatus;
        if (map != null) {
            clipVideoFile.f1((Owner) map.get(clipVideoFile.b));
        }
        if (map3 == null) {
            return clipVideoFile;
        }
        Group group2 = (Group) map3.get(clipVideoFile.b);
        if (group2 != null && group2.v0) {
            z = true;
        }
        clipVideoFile.h0 = Boolean.valueOf(z);
        return clipVideoFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb A[LOOP:6: B:80:0x01c5->B:82:0x01cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(ShortVideoGetResponseDto shortVideoGetResponseDto) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List<ShortVideoAudioDto> d2;
        LinkedHashMap linkedHashMap3;
        List<MarketMarketItemDto> i2;
        LinkedHashMap linkedHashMap4;
        List<PlacesPlaceDto> j2;
        LinkedHashMap linkedHashMap5;
        List<MasksMaskDto> H2;
        LinkedHashMap linkedHashMap6;
        List<MasksEffectDto> e2;
        LinkedHashMap linkedHashMap7;
        List<ShortVideoCompilationInfoDto> H4;
        Iterator<T> it;
        List<UsersUserFullDto> k2 = shortVideoGetResponseDto.k();
        List<GroupsGroupFullDto> g2 = shortVideoGetResponseDto.g();
        LinkedHashMap linkedHashMap8 = null;
        LinkedHashMap b2 = k2 != null ? b.b(k2) : null;
        if (g2 != null) {
            d.getClass();
            linkedHashMap = equ.b(g2);
        } else {
            linkedHashMap = null;
        }
        if (b2 != null && linkedHashMap != null) {
            b2 = pn00.n(b2, linkedHashMap);
        } else if (b2 == null) {
            linkedHashMap2 = linkedHashMap == null ? null : linkedHashMap;
            a.getClass();
            LinkedHashMap b3 = j2r0.b(k2);
            c.getClass();
            LinkedHashMap b4 = dqu.b(g2);
            d2 = shortVideoGetResponseDto.d();
            if (d2 == null) {
                List<ShortVideoAudioDto> list = d2;
                int e3 = on00.e(c5g.u(list, 10));
                if (e3 < 16) {
                    e3 = 16;
                }
                linkedHashMap3 = new LinkedHashMap(e3);
                for (Object obj : list) {
                    ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) obj;
                    linkedHashMap3.put(new c14(shortVideoAudioDto.q(), shortVideoAudioDto.getId()), obj);
                }
            } else {
                linkedHashMap3 = null;
            }
            i2 = shortVideoGetResponseDto.i();
            if (i2 == null) {
                List<MarketMarketItemDto> list2 = i2;
                int e4 = on00.e(c5g.u(list2, 10));
                if (e4 < 16) {
                    e4 = 16;
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(e4);
                for (Object obj2 : list2) {
                    MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj2;
                    linkedHashMap9.put(new c14(marketMarketItemDto.q(), marketMarketItemDto.getId()), obj2);
                }
                linkedHashMap4 = linkedHashMap9;
            } else {
                linkedHashMap4 = null;
            }
            j2 = shortVideoGetResponseDto.j();
            if (j2 == null) {
                List<PlacesPlaceDto> list3 = j2;
                int e5 = on00.e(c5g.u(list3, 10));
                if (e5 < 16) {
                    e5 = 16;
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap(e5);
                for (Object obj3 : list3) {
                    linkedHashMap10.put(Integer.valueOf(((PlacesPlaceDto) obj3).getId()), obj3);
                }
                linkedHashMap5 = linkedHashMap10;
            } else {
                linkedHashMap5 = null;
            }
            H2 = shortVideoGetResponseDto.H2();
            if (H2 == null) {
                List<MasksMaskDto> list4 = H2;
                int e6 = on00.e(c5g.u(list4, 10));
                if (e6 < 16) {
                    e6 = 16;
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap(e6);
                for (Object obj4 : list4) {
                    MasksMaskDto masksMaskDto = (MasksMaskDto) obj4;
                    linkedHashMap11.put(new c14(masksMaskDto.q(), masksMaskDto.getId()), obj4);
                }
                linkedHashMap6 = linkedHashMap11;
            } else {
                linkedHashMap6 = null;
            }
            e2 = shortVideoGetResponseDto.e();
            if (e2 == null) {
                List<MasksEffectDto> list5 = e2;
                int e7 = on00.e(c5g.u(list5, 10));
                if (e7 < 16) {
                    e7 = 16;
                }
                linkedHashMap7 = new LinkedHashMap(e7);
                for (Object obj5 : list5) {
                    MasksEffectDto masksEffectDto = (MasksEffectDto) obj5;
                    linkedHashMap7.put(new c14(masksEffectDto.q(), masksEffectDto.getId()), obj5);
                }
            } else {
                linkedHashMap7 = null;
            }
            H4 = shortVideoGetResponseDto.H4();
            if (H4 != null) {
                List<ShortVideoCompilationInfoDto> list6 = H4;
                int e8 = on00.e(c5g.u(list6, 10));
                linkedHashMap8 = new LinkedHashMap(e8 >= 16 ? e8 : 16);
                for (Object obj6 : list6) {
                    Integer e9 = ((ShortVideoCompilationInfoDto) obj6).e();
                    linkedHashMap8.put(Integer.valueOf(e9 != null ? e9.intValue() : 0), obj6);
                }
            }
            LinkedHashMap linkedHashMap12 = linkedHashMap8;
            List<ShortVideoFeedItemShortVideoFullDto> d3 = shortVideoGetResponseDto.f().d();
            ArrayList arrayList = new ArrayList(c5g.u(d3, 10));
            it = d3.iterator();
            while (it.hasNext()) {
                arrayList.add(b(((ShortVideoFeedItemShortVideoFullDto) it.next()).d(), linkedHashMap2, b3, b4, linkedHashMap3, linkedHashMap7, linkedHashMap6, linkedHashMap4, linkedHashMap12, linkedHashMap5, null));
            }
            return arrayList;
        }
        linkedHashMap2 = b2;
        a.getClass();
        LinkedHashMap b32 = j2r0.b(k2);
        c.getClass();
        LinkedHashMap b42 = dqu.b(g2);
        d2 = shortVideoGetResponseDto.d();
        if (d2 == null) {
        }
        i2 = shortVideoGetResponseDto.i();
        if (i2 == null) {
        }
        j2 = shortVideoGetResponseDto.j();
        if (j2 == null) {
        }
        H2 = shortVideoGetResponseDto.H2();
        if (H2 == null) {
        }
        e2 = shortVideoGetResponseDto.e();
        if (e2 == null) {
        }
        H4 = shortVideoGetResponseDto.H4();
        if (H4 != null) {
        }
        LinkedHashMap linkedHashMap122 = linkedHashMap8;
        List<ShortVideoFeedItemShortVideoFullDto> d32 = shortVideoGetResponseDto.f().d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d32, 10));
        it = d32.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
