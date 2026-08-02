package xsna;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.firebase.encoders.proto.a;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetButtonsResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdExtendedResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemAppsCarouselDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerCoverPhotoResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchServicesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetSettingsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeModalSharingOpen;
import com.vkontakte.android.attachments.PollAttachment;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ibj0;
import xsna.nsl0;
import xsna.xi9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq implements b03, f03, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, ValueValidator, szs, ScreenModeVideoStatMapper.a {
    public final /* synthetic */ int b;

    public /* synthetic */ rq(int i) {
        this.b = i;
    }

    public static String a(UsersUserFullDto usersUserFullDto, StringBuilder sb, char c) {
        sb.append(usersUserFullDto.D0());
        sb.append(c);
        sb.append(usersUserFullDto.x1());
        return sb.toString();
    }

    public static String b(String str, String str2, String str3, Uri uri, char c) {
        return str + str2 + str3 + uri + c;
    }

    public static String c(StringBuilder sb, MusicTrack musicTrack, char c) {
        sb.append(musicTrack);
        sb.append(c);
        return sb.toString();
    }

    public static HashMap f(Class cls, a.C0136a c0136a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c0136a);
        return hashMap;
    }

    public static void h(StringBuilder sb, Integer num, String str, Boolean bool, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(bool);
        sb.append(str2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return new xi9.a(((PollAttachment) obj).f, ((nsl0.a) obj2).a);
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        int i = ibj0.a.$EnumSwitchMapping$0[unifiedStatScreenMode.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.DISCOVERY;
        }
        if (i == 2) {
            return MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (i == 3) {
            return MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (i == 4) {
            return MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.PREVIEW;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (NewsfeedItemAppsCarouselDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, NewsfeedItemAppsCarouselDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 16:
                return (MarketGetByIdExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetByIdExtendedResponseDto.class).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 27:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetButtonsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosSaveOwnerCoverPhotoResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingActivitySearchServicesResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetChallengeResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersGetSettingsResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 10:
                if (l.longValue() >= 0) {
                }
                break;
            case 11:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return new Group();
            case 12:
                return Boolean.TRUE;
            default:
                r9v r9vVar = (r9v) obj;
                r9vVar.l();
                return ImmutableList.m(qhz.e(r9vVar.J.b, new xul0(3)));
        }
    }
}
