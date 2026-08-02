package xsna;

import com.ironsource.D1;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.ads.dto.AdsCatchUpLinkDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.ads.dto.AdsMobileAppOpenDto;
import com.vk.api.generated.ads.dto.AdsStatisticsPixelDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.stories.dto.StoriesClickableStickerDto;
import com.vk.api.generated.stories.dto.StoriesClickableStickersDto;
import com.vk.api.generated.stories.dto.StoriesNewReactionDto;
import com.vk.api.generated.stories.dto.StoriesQuestionsDto;
import com.vk.api.generated.stories.dto.StoriesRepliesDto;
import com.vk.api.generated.stories.dto.StoriesStoryAlsoSubscribedDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.stories.dto.StoriesStoryLinkDto;
import com.vk.api.generated.stories.dto.StoriesStoryTypeDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.stories.model.ExternalAdsInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StorySubscribersHeader;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.ads.MyTargetAdData;
import com.vk.dto.stories.model.ads.MyTargetAdFormat;
import com.vk.dto.stories.model.ads.MyTargetAdType;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: StoriesStoryToStoryEntryMapper.kt */
/* loaded from: classes3.dex */
public final class ivl0 {

    /* compiled from: StoriesStoryToStoryEntryMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[StoriesStoryDto.MemoryTypeDto.values().length];
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.ALBUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.FRIENDSHIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.YEAR_SUMMARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.PHOTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.FIRST_STORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.FIRST_AVATAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.FIRST_AUDIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.FIRST_POST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.MY_TOP_TRACK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StoriesStoryDto.MemoryTypeDto.BIRTHDAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoriesStoryDto.ContentScaleTypeDto.values().length];
            try {
                iArr2[StoriesStoryDto.ContentScaleTypeDto.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StoriesStoryDto.ContentScaleTypeDto.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[StoriesStoryDto.TemplateIdDto.values().length];
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.SITE_SDK.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.SITE_SLIDER_SDK.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.SITE_VIDEO_SDK.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.APP_SDK.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.APP_SLIDER_SDK.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.APP_VIDEO_SDK.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.LEAD_FORM_PHOTO_SDK.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.LEAD_FORM_VIDEO_SDK.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.SURVEY_PHOTO_SDK.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.SURVEY_VIDEO_SDK.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.VK_MINIAPP_SDK.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.VK_MINIAPP_VIDEO_SDK.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.VK_USER_SDK.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.VK_USER_VIDEO_SDK.ordinal()] = 14;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[StoriesStoryDto.TemplateIdDto.MOB_SDK.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[StoriesStoryDto.FormatDto.values().length];
            try {
                iArr4[StoriesStoryDto.FormatDto.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[StoriesStoryDto.FormatDto.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[StoriesStoryDto.FormatDto.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[StoriesStoryDto.FormatDto.HTML5.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StoryEntry a(StoriesStoryDto storiesStoryDto, Map map, Map map2, Map map3) {
        ActionLinkSnippet actionLinkSnippet;
        StoryMemoryType storyMemoryType;
        ButtonAction a2;
        CatchUpBanner catchUpBanner;
        StoryEntryExtended storyEntryExtended;
        List<StoriesNewReactionDto> b1;
        ArrayList arrayList;
        UserId q;
        StoryOwner community;
        StoriesStoryAlsoSubscribedDto j;
        StorySubscribersHeader storySubscribersHeader;
        boolean z;
        PhotosPhotoDto x1;
        String F5;
        MyTargetAdType myTargetAdType;
        MyTargetAdType myTargetAdType2;
        AdsMobileAppOpenDto k;
        String d;
        int i;
        Image image;
        String str;
        Object failure;
        AdsItemBlockAdStatPixelDto.TypeDto typeDto;
        StoryViewAction storyViewAction;
        String str2;
        Map map4 = map3;
        StoryEntry storyEntry = new StoryEntry();
        int i2 = 0;
        storyEntry.b = false;
        storyEntry.c = storiesStoryDto.getId();
        storyEntry.d = storiesStoryDto.q();
        StoriesStoryTypeDto V1 = storiesStoryDto.V1();
        MyTargetAdFormat myTargetAdFormat = null;
        String i3 = V1 != null ? V1.i() : null;
        if (i3 == null) {
            i3 = "";
        }
        storyEntry.e = i3;
        Long valueOf = storiesStoryDto.R() != null ? Long.valueOf(r0.intValue() * 1000) : null;
        storyEntry.f = valueOf != null ? valueOf.longValue() : 0L;
        storyEntry.g = storiesStoryDto.T() != null ? Long.valueOf(r0.intValue() * 1000) : null;
        BaseBoolIntDto N1 = storiesStoryDto.N1();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        storyEntry.h = N1 == baseBoolIntDto;
        Integer i22 = storiesStoryDto.i2();
        storyEntry.j = i22 != null ? i22.intValue() : 0;
        Boolean r2 = storiesStoryDto.r2();
        Boolean bool = Boolean.TRUE;
        storyEntry.k = epx.f(r2, bool);
        PhotosPhotoDto x12 = storiesStoryDto.x1();
        storyEntry.m = x12 != null ? xfa0.a(x12) : null;
        VideoVideoFullDto X1 = storiesStoryDto.X1();
        VideoFileOld d2 = X1 != null ? ums0.d(ums0.a, X1, null, null, null, 30) : null;
        storyEntry.n = d2;
        StoriesStoryLinkDto y0 = storiesStoryDto.y0();
        if (y0 != null) {
            storyEntry.S = y0.e();
            storyEntry.T = y0.getUrl();
        } else if ((d2 != null ? d2.Y : null) != null) {
            ActionLink actionLink = d2.Y;
            storyEntry.T = actionLink != null ? actionLink.e : null;
            storyEntry.S = (actionLink == null || (actionLinkSnippet = actionLink.f) == null) ? null : actionLinkSnippet.e;
        }
        StoriesStoryDto.MemoryTypeDto K0 = storiesStoryDto.K0();
        switch (K0 == null ? -1 : a.$EnumSwitchMapping$0[K0.ordinal()]) {
            case 1:
                storyMemoryType = StoryMemoryType.AVATAR;
                break;
            case 2:
                storyMemoryType = StoryMemoryType.STORY;
                break;
            case 3:
                storyMemoryType = StoryMemoryType.POST;
                break;
            case 4:
                storyMemoryType = StoryMemoryType.ALBUM;
                break;
            case 5:
                storyMemoryType = StoryMemoryType.FRIENDSHIP;
                break;
            case 6:
                storyMemoryType = StoryMemoryType.YEAR_SUMMARY;
                break;
            case 7:
                storyMemoryType = StoryMemoryType.PHOTO;
                break;
            case 8:
                storyMemoryType = StoryMemoryType.FIRST_STORY;
                break;
            case 9:
                storyMemoryType = StoryMemoryType.FIRST_AVATAR;
                break;
            case 10:
                storyMemoryType = StoryMemoryType.FIRST_AUDIO;
                break;
            case 11:
                storyMemoryType = StoryMemoryType.FIRST_POST;
                break;
            case 12:
                storyMemoryType = StoryMemoryType.MY_TOP_TRACK;
                break;
            case 13:
                storyMemoryType = StoryMemoryType.BIRTHDAY;
                break;
            default:
                storyMemoryType = null;
                break;
        }
        storyEntry.C0 = storyMemoryType;
        storyEntry.D0 = storiesStoryDto.H0();
        storyEntry.o = storiesStoryDto.d();
        storyEntry.i0 = epx.f(storiesStoryDto.I2(), bool);
        storyEntry.q = storiesStoryDto.D() == baseBoolIntDto;
        storyEntry.r = storiesStoryDto.o() == baseBoolIntDto;
        storyEntry.u = storiesStoryDto.r();
        storyEntry.F = epx.f(storiesStoryDto.l2(), bool);
        storyEntry.v0 = epx.f(storiesStoryDto.m2(), bool);
        storyEntry.N = epx.f(storiesStoryDto.L2(), bool);
        storyEntry.B = epx.f(storiesStoryDto.q2(), bool);
        storyEntry.t0 = storiesStoryDto.i();
        storyEntry.u0 = storiesStoryDto.f();
        storyEntry.v = storiesStoryDto.F0();
        MasksMaskDto D0 = storiesStoryDto.D0();
        storyEntry.w = D0 != null ? D0.k() : null;
        storyEntry.C = storiesStoryDto.C() == baseBoolIntDto;
        storyEntry.D = storiesStoryDto.B() == baseBoolIntDto;
        storyEntry.G = storiesStoryDto.p() == baseBoolIntDto;
        storyEntry.H = storiesStoryDto.l() == baseBoolIntDto;
        storyEntry.I = storiesStoryDto.n() == baseBoolIntDto;
        StoriesRepliesDto D1 = storiesStoryDto.D1();
        if (D1 != null) {
            storyEntry.z = D1.getCount();
            Integer d3 = D1.d();
            storyEntry.A = d3 != null ? d3.intValue() : 0;
        }
        StoriesQuestionsDto B1 = storiesStoryDto.B1();
        if (B1 != null) {
            Integer d4 = B1.d();
            storyEntry.Y = d4 != null ? d4.intValue() : 0;
            Integer e = B1.e();
            storyEntry.Z = e != null ? e.intValue() : 0;
        }
        Integer s1 = storiesStoryDto.s1();
        storyEntry.O = s1 != null ? s1.intValue() : 0;
        storyEntry.P = storiesStoryDto.t1() != null ? new UserId(r0.intValue()) : UserId.d;
        storyEntry.Q = storiesStoryDto.o1();
        storyEntry.s = storiesStoryDto.G();
        List<AdsStatisticsPixelDto> g = storiesStoryDto.g();
        if (g == null) {
            g = EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AdsStatisticsPixelDto adsStatisticsPixelDto : g) {
            StoryViewAction.a aVar = StoryViewAction.Companion;
            String type = adsStatisticsPixelDto.getType();
            aVar.getClass();
            StoryViewAction[] values = StoryViewAction.values();
            int length = values.length;
            int i4 = i2;
            while (true) {
                if (i4 < length) {
                    StoryViewAction storyViewAction2 = values[i4];
                    str2 = storyViewAction2.stringValue;
                    if (epx.f(str2, type)) {
                        storyViewAction = storyViewAction2;
                    } else {
                        i4++;
                    }
                } else {
                    storyViewAction = null;
                }
            }
            String url = adsStatisticsPixelDto.getUrl();
            xwl0 xwl0Var = (storyViewAction == null || url == null || url.length() == 0) ? null : new xwl0(storyViewAction, url);
            if (xwl0Var != null) {
                arrayList2.add(xwl0Var);
            }
            i2 = 0;
        }
        storyEntry.V = arrayList2;
        List<AdsStatisticsPixelDto> g2 = storiesStoryDto.g();
        if (g2 == null) {
            g2 = EmptyList.b;
        }
        List<AdsStatisticsPixelDto> list = g2;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        for (AdsStatisticsPixelDto adsStatisticsPixelDto2 : list) {
            AdsItemBlockAdStatPixelDto.TypeDto[] values2 = AdsItemBlockAdStatPixelDto.TypeDto.values();
            int length2 = values2.length;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    AdsItemBlockAdStatPixelDto.TypeDto typeDto2 = values2[i5];
                    if (epx.f(typeDto2.i(), adsStatisticsPixelDto2.getType())) {
                        typeDto = typeDto2;
                    } else {
                        i5++;
                    }
                } else {
                    typeDto = null;
                }
            }
            arrayList3.add(new PixelStats(adsStatisticsPixelDto2.getUrl(), typeDto, null, 4, null));
        }
        storyEntry.W = arrayList3;
        AdsCatchUpLinkDto v0 = storiesStoryDto.v0();
        if (v0 == null || (a2 = xf6.a(v0.d())) == null) {
            catchUpBanner = null;
        } else {
            String title = v0.getTitle();
            String str3 = title == null ? "" : title;
            String description = v0.getDescription();
            String str4 = description == null ? "" : description;
            int i6 = v0.i();
            new ne6();
            catchUpBanner = new CatchUpBanner("", a2, str3, str4, i6, ne6.a(v0.g()), epx.f(v0.e(), Boolean.TRUE), v0.f(), v0.r(), null, null, 1536, null);
        }
        storyEntry.U = catchUpBanner;
        StoriesClickableStickersDto K = storiesStoryDto.K();
        if (K != null) {
            int i7 = qrl0.a;
            List<StoriesClickableStickerDto> d5 = K.d();
            if (d5 == null) {
                d5 = EmptyList.b;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = d5.iterator();
            while (it.hasNext()) {
                try {
                    failure = qrl0.a((StoriesClickableStickerDto) it.next(), map, map2, map4);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                ClickableSticker clickableSticker = (ClickableSticker) failure;
                if (clickableSticker != null) {
                    arrayList4.add(clickableSticker);
                }
            }
            ClickableStickers clickableStickers = new ClickableStickers(K.f(), K.e(), new ArrayList(arrayList4));
            storyEntry.X = clickableStickers;
            clickableStickers.Ab();
        }
        Boolean U0 = storiesStoryDto.U0();
        Boolean bool2 = Boolean.TRUE;
        storyEntry.J = epx.f(U0, bool2);
        storyEntry.K = epx.f(storiesStoryDto.M2(), bool2);
        epx.f(storiesStoryDto.V0(), bool2);
        storyEntry.a0 = epx.f(storiesStoryDto.d1(), bool2);
        storyEntry.b0 = epx.f(storiesStoryDto.N0(), bool2);
        boolean z2 = fkq0.c(storyEntry.P) && storyEntry.O != 0;
        StoriesStoryDto n1 = storiesStoryDto.n1();
        if (n1 != null) {
            if (!z2 || map2 == null || map4 == null) {
                n1 = null;
            }
            if (n1 != null) {
                storyEntryExtended = new StoryEntryExtended(a(n1, map, map2, map4), (Map<UserId, UserProfile>) map2, (Map<UserId, Group>) map4);
                storyEntry.R = storyEntryExtended;
                Integer R1 = storiesStoryDto.R1();
                storyEntry.i = R1 == null ? R1.intValue() : 0;
                storyEntry.c0 = epx.f(storiesStoryDto.E2(), bool2);
                storyEntry.d0 = epx.f(storiesStoryDto.u(), bool2);
                Integer w0 = storiesStoryDto.w0();
                storyEntry.e0 = w0 == null ? w0.intValue() : 0;
                Integer W1 = storiesStoryDto.W1();
                int intValue = W1 == null ? W1.intValue() : -1;
                storyEntry.g0 = intValue < 0 ? Integer.valueOf(intValue) : null;
                b1 = storiesStoryDto.b1();
                Map map5 = jgp.b;
                if (b1 == null) {
                    List<StoriesNewReactionDto> list2 = b1;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        UserId userId = ((StoriesNewReactionDto) it2.next()).getUserId();
                        UserProfile userProfile = (UserProfile) (map2 == null ? map5 : map2).get(userId);
                        Group group = (Group) (map4 == null ? map5 : map4).get(userId);
                        if (userProfile == null || (image = userProfile.O) == null) {
                            image = group != null ? group.g : null;
                        }
                        if (userProfile == null || (str = userProfile.e) == null) {
                            str = group != null ? group.d : null;
                        }
                        arrayList.add(image == null ? null : new t860(str, image, null));
                    }
                } else {
                    arrayList = null;
                }
                storyEntry.h0 = arrayList;
                q = storiesStoryDto.q();
                if (fkq0.d(q)) {
                    if (fkq0.b(q)) {
                        if (map4 == null) {
                            map4 = map5;
                        }
                        Group group2 = (Group) map4.get(fkq0.e(q));
                        if (group2 != null) {
                            community = new StoryOwner.Community(group2, null, 2, null);
                        }
                    }
                    community = null;
                } else {
                    UserProfile userProfile2 = (UserProfile) (map2 == null ? map5 : map2).get(q);
                    if (userProfile2 != null) {
                        community = new StoryOwner.User(userProfile2, null, 2, null);
                    }
                    community = null;
                }
                storyEntry.l0 = community;
                Integer S0 = storiesStoryDto.S0();
                storyEntry.n0 = S0 == null ? S0.intValue() : 0;
                storyEntry.o0 = epx.f(storiesStoryDto.F(), Boolean.TRUE);
                storyEntry.p0 = storiesStoryDto.Z();
                Integer P0 = storiesStoryDto.P0();
                storyEntry.q0 = P0 == null ? P0.intValue() : 0;
                j = storiesStoryDto.j();
                if (j != null) {
                    storySubscribersHeader = null;
                } else {
                    String d6 = j.d();
                    if (map2 != null) {
                        map5 = map2;
                    }
                    List<Integer> e2 = j.e();
                    if (e2 == null) {
                        e2 = EmptyList.b;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it3 = e2.iterator();
                    while (it3.hasNext()) {
                        UserProfile userProfile3 = (UserProfile) map5.get(new UserId(((Number) it3.next()).intValue()));
                        Owner l0 = userProfile3 != null ? userProfile3.l0() : null;
                        if (l0 != null) {
                            arrayList5.add(l0);
                        }
                    }
                    storySubscribersHeader = new StorySubscribersHeader(d6, arrayList5);
                }
                storyEntry.r0 = storySubscribersHeader;
                Boolean J2 = storiesStoryDto.J2();
                Boolean bool3 = Boolean.TRUE;
                storyEntry.s0 = epx.f(J2, bool3);
                z = storyEntry.F;
                int i8 = storyEntry.c;
                UserId userId2 = storyEntry.d;
                if (z && i8 == 0 && epx.f(userId2, UserId.d)) {
                    k = storiesStoryDto.k();
                    StoriesStoryLinkDto y02 = storiesStoryDto.y0();
                    new ne6();
                    Image a3 = ne6.a(storiesStoryDto.y1());
                    d = y02 == null ? y02.d() : null;
                    if (d != null) {
                        switch (d.hashCode()) {
                            case -1820761141:
                                d.equals(D1.e);
                                break;
                            case -1544407700:
                                if (d.equals("internal_hidden")) {
                                    i = 1;
                                    break;
                                }
                                break;
                            case 570410685:
                                if (d.equals("internal")) {
                                    i = 2;
                                    break;
                                }
                                break;
                            case 1475610601:
                                if (d.equals("authorize")) {
                                    i = 3;
                                    break;
                                }
                                break;
                        }
                        StoriesStoryDto.ContentScaleTypeDto M = storiesStoryDto.M();
                        int i9 = M == null ? -1 : a.$EnumSwitchMapping$1[M.ordinal()];
                        ExternalAdsInfo.ScaleType scaleType = i9 != 1 ? i9 != 2 ? ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FIT;
                        String title2 = storiesStoryDto.getTitle();
                        String d7 = k != null ? k.d() : null;
                        String str5 = d7 == null ? "" : d7;
                        String e3 = k != null ? k.e() : null;
                        storyEntry.m0 = new ExternalAdsInfo(a3, title2, i, str5, e3 == null ? "" : e3, scaleType);
                    }
                    i = 0;
                    StoriesStoryDto.ContentScaleTypeDto M2 = storiesStoryDto.M();
                    if (M2 == null) {
                    }
                    ExternalAdsInfo.ScaleType scaleType2 = i9 != 1 ? i9 != 2 ? ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FIT;
                    String title22 = storiesStoryDto.getTitle();
                    if (k != null) {
                    }
                    if (d7 == null) {
                    }
                    if (k != null) {
                    }
                    storyEntry.m0 = new ExternalAdsInfo(a3, title22, i, str5, e3 == null ? "" : e3, scaleType2);
                }
                storyEntry.w0 = epx.f(storiesStoryDto.o2(), bool3);
                AccountPrivacyValueDto z1 = storiesStoryDto.z1();
                storyEntry.x0 = z1 == null ? z1.i() : null;
                Boolean l02 = storiesStoryDto.l0();
                storyEntry.y0 = l02 == null ? l02.booleanValue() : false;
                x1 = storiesStoryDto.x1();
                if (x1 != null || (F5 = x1.F5()) == null) {
                    VideoVideoFullDto X12 = storiesStoryDto.X1();
                    F5 = X12 == null ? X12.F5() : null;
                }
                storyEntry.B0 = F5;
                Boolean G2 = storiesStoryDto.G2();
                storyEntry.z0 = G2 == null ? G2.booleanValue() : false;
                Integer W = storiesStoryDto.W();
                storyEntry.A0 = W == null ? W.intValue() : 0;
                Boolean B2 = storiesStoryDto.B2();
                storyEntry.M = B2 == null ? B2.booleanValue() : false;
                Boolean y2 = storiesStoryDto.y2();
                storyEntry.L = y2 == null ? y2.booleanValue() : false;
                if (storyEntry.F) {
                    String L1 = storiesStoryDto.L1();
                    StoriesStoryDto.TemplateIdDto U1 = storiesStoryDto.U1();
                    switch (U1 == null ? -1 : a.$EnumSwitchMapping$2[U1.ordinal()]) {
                        case 1:
                            myTargetAdType = MyTargetAdType.SITE;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 2:
                            myTargetAdType = MyTargetAdType.SITE_SLIDER;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 3:
                            myTargetAdType = MyTargetAdType.SITE_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 4:
                            myTargetAdType = MyTargetAdType.APP;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 5:
                            myTargetAdType = MyTargetAdType.APP_SLIDER;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 6:
                            myTargetAdType = MyTargetAdType.APP_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 7:
                            myTargetAdType = MyTargetAdType.LEAD_FORM_PHOTO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 8:
                            myTargetAdType = MyTargetAdType.LEAD_FORM_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 9:
                            myTargetAdType = MyTargetAdType.SURVEY_PHOTO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 10:
                            myTargetAdType = MyTargetAdType.SURVEY_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 11:
                            myTargetAdType = MyTargetAdType.VK_MINIAPP;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 12:
                            myTargetAdType = MyTargetAdType.VK_MINIAPP_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 13:
                            myTargetAdType = MyTargetAdType.VK_USER;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 14:
                            myTargetAdType = MyTargetAdType.VK_USER_VIDEO;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        case 15:
                            myTargetAdType = MyTargetAdType.MOB;
                            myTargetAdType2 = myTargetAdType;
                            break;
                        default:
                            myTargetAdType2 = null;
                            break;
                    }
                    StoriesStoryDto.FormatDto a0 = storiesStoryDto.a0();
                    int i10 = a0 == null ? -1 : a.$EnumSwitchMapping$3[a0.ordinal()];
                    if (i10 != -1) {
                        if (i10 == 1) {
                            myTargetAdFormat = MyTargetAdFormat.STATIC;
                        } else if (i10 == 2) {
                            myTargetAdFormat = MyTargetAdFormat.VIDEO;
                        } else if (i10 == 3) {
                            myTargetAdFormat = MyTargetAdFormat.POST;
                        } else if (i10 == 4) {
                            myTargetAdFormat = MyTargetAdFormat.HTML5;
                        }
                    }
                    MyTargetAdFormat myTargetAdFormat2 = myTargetAdFormat;
                    String e4 = storiesStoryDto.e();
                    String str6 = e4 == null ? "" : e4;
                    if (L1 != null && L1.length() != 0) {
                        storyEntry.E0 = new MyTargetAdData(L1, myTargetAdType2, myTargetAdFormat2, str6, null);
                    }
                }
                storyEntry.F0 = storiesStoryDto.E1();
                return storyEntry;
            }
        }
        storyEntryExtended = null;
        storyEntry.R = storyEntryExtended;
        Integer R12 = storiesStoryDto.R1();
        storyEntry.i = R12 == null ? R12.intValue() : 0;
        storyEntry.c0 = epx.f(storiesStoryDto.E2(), bool2);
        storyEntry.d0 = epx.f(storiesStoryDto.u(), bool2);
        Integer w02 = storiesStoryDto.w0();
        storyEntry.e0 = w02 == null ? w02.intValue() : 0;
        Integer W12 = storiesStoryDto.W1();
        if (W12 == null) {
        }
        storyEntry.g0 = intValue < 0 ? Integer.valueOf(intValue) : null;
        b1 = storiesStoryDto.b1();
        Map map52 = jgp.b;
        if (b1 == null) {
        }
        storyEntry.h0 = arrayList;
        q = storiesStoryDto.q();
        if (fkq0.d(q)) {
        }
        storyEntry.l0 = community;
        Integer S02 = storiesStoryDto.S0();
        storyEntry.n0 = S02 == null ? S02.intValue() : 0;
        storyEntry.o0 = epx.f(storiesStoryDto.F(), Boolean.TRUE);
        storyEntry.p0 = storiesStoryDto.Z();
        Integer P02 = storiesStoryDto.P0();
        storyEntry.q0 = P02 == null ? P02.intValue() : 0;
        j = storiesStoryDto.j();
        if (j != null) {
        }
        storyEntry.r0 = storySubscribersHeader;
        Boolean J22 = storiesStoryDto.J2();
        Boolean bool32 = Boolean.TRUE;
        storyEntry.s0 = epx.f(J22, bool32);
        z = storyEntry.F;
        int i82 = storyEntry.c;
        UserId userId22 = storyEntry.d;
        if (z) {
            k = storiesStoryDto.k();
            StoriesStoryLinkDto y022 = storiesStoryDto.y0();
            new ne6();
            Image a32 = ne6.a(storiesStoryDto.y1());
            if (y022 == null) {
            }
            if (d != null) {
            }
            i = 0;
            StoriesStoryDto.ContentScaleTypeDto M22 = storiesStoryDto.M();
            if (M22 == null) {
            }
            ExternalAdsInfo.ScaleType scaleType22 = i9 != 1 ? i9 != 2 ? ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FILL : ExternalAdsInfo.ScaleType.FIT;
            String title222 = storiesStoryDto.getTitle();
            if (k != null) {
            }
            if (d7 == null) {
            }
            if (k != null) {
            }
            storyEntry.m0 = new ExternalAdsInfo(a32, title222, i, str5, e3 == null ? "" : e3, scaleType22);
        }
        storyEntry.w0 = epx.f(storiesStoryDto.o2(), bool32);
        AccountPrivacyValueDto z12 = storiesStoryDto.z1();
        storyEntry.x0 = z12 == null ? z12.i() : null;
        Boolean l022 = storiesStoryDto.l0();
        storyEntry.y0 = l022 == null ? l022.booleanValue() : false;
        x1 = storiesStoryDto.x1();
        if (x1 != null) {
        }
        VideoVideoFullDto X122 = storiesStoryDto.X1();
        if (X122 == null) {
        }
        storyEntry.B0 = F5;
        Boolean G22 = storiesStoryDto.G2();
        storyEntry.z0 = G22 == null ? G22.booleanValue() : false;
        Integer W2 = storiesStoryDto.W();
        storyEntry.A0 = W2 == null ? W2.intValue() : 0;
        Boolean B22 = storiesStoryDto.B2();
        storyEntry.M = B22 == null ? B22.booleanValue() : false;
        Boolean y22 = storiesStoryDto.y2();
        storyEntry.L = y22 == null ? y22.booleanValue() : false;
        if (storyEntry.F) {
        }
        storyEntry.F0 = storiesStoryDto.E1();
        return storyEntry;
    }
}
