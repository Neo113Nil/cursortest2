package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountUserSettingsDto;
import com.vk.api.generated.audio.dto.AudioGetRecommendationsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersGoodItemDto;
import com.vk.api.generated.groups.dto.GroupsGetRecommendedGroupsResponseDto;
import com.vk.api.generated.market.dto.MarketCreateItemReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetAbandonedCartsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationStylesResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetServicesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.stories.dto.StoriesSaveResponseDto;
import com.vk.api.generated.users.dto.UsersSearchResponseDto;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.m0x;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tq implements b03, f03, io.reactivex.rxjava3.functions.c, nsm, ValueValidator, io.reactivex.rxjava3.functions.l, ScreenModeVideoStatMapper.a {
    public final /* synthetic */ int b;

    public /* synthetic */ tq(int i) {
        this.b = i;
    }

    public static int b(bpn0 bpn0Var, int i, int i2) {
        return (bpn0Var.hashCode() + i) * i2;
    }

    public static String c(StringBuilder sb, Photo photo, char c) {
        sb.append(photo);
        sb.append(c);
        return sb.toString();
    }

    public static String f(StringBuilder sb, String str, char c) {
        sb.append((Object) str);
        sb.append(c);
        return sb.toString();
    }

    public static tlo0.f h(tlo0.a aVar, int i) {
        aVar.getClass();
        return new tlo0.f(i);
    }

    public static void i(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    @Override // xsna.nsm
    public boolean a(Context context, u8m u8mVar, DialogExt dialogExt, io.reactivex.rxjava3.disposables.b bVar) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((m0x.a) obj).b;
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return ibj0.f(unifiedStatScreenMode);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountUserSettingsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountUserSettingsDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 17:
                return (MarketCreateItemReviewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketCreateItemReviewResponseDto.class).getType())).a();
            case 19:
                return (MessagesGetConversationStylesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetConversationStylesResponseDto.class).getType())).a();
            case 21:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
            case 26:
                return (StoriesSaveResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesSaveResponseDto.class).getType())).a();
            default:
                return (UsersSearchResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, UsersSearchResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetRecommendationsResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GoodsOrdersGoodItemDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetRecommendedGroupsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetAbandonedCartsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, String.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingGetServicesResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetOwnerVideosResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 11:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() > 0) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ tq(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ShortVideoGetPlaylistsResponseDto) obj;
    }
}
