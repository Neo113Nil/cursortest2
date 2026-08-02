package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountManagePushDeviceMultiResponseDto;
import com.vk.api.generated.apps.dto.AppsGetRequestsResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannerResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewsResponseDto;
import com.vk.api.generated.messages.dto.MessagesDeleteChatPhotoResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetMessageReadPeersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsCategoriesVectorResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppOrderItemDto;
import com.vk.api.generated.photos.dto.PhotosGetRecognitionTagsExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsGetByIdResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tr implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.b, ListValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ tr(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.min(i, i2)), i4);
    }

    public static io.reactivex.rxjava3.internal.operators.single.x b(it80.a aVar) {
        aVar.getClass();
        return io.reactivex.rxjava3.core.x.k(it80.a.a());
    }

    public static String c(StringBuilder sb, yzt0 yzt0Var, char c) {
        sb.append(yzt0Var);
        sb.append(c);
        return sb.toString();
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                return Boolean.TRUE;
            case 22:
                return ((kym0) obj).a;
            default:
                return rl3.u0((Object[]) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 4:
                return (AudioPlaylistDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioPlaylistDto.class).getType())).a();
            case 5:
                return (AuthGetAuthCodeStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthGetAuthCodeStatusResponseDto.class).getType())).a();
            case 12:
                return (GroupsGetBannerResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetBannerResponseDto.class).getType())).a();
            case 13:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 15:
                return (MessagesDeleteChatPhotoResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesDeleteChatPhotoResponseDto.class).getType())).a();
            case 16:
                return (MessagesGetMessageReadPeersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetMessageReadPeersResponseDto.class).getType())).a();
            case 20:
                return (OrdersAppOrderItemDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, OrdersAppOrderItemDto.class).getType())).a();
            case 21:
                return (PhotosGetRecognitionTagsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosGetRecognitionTagsExtendedResponseDto.class).getType())).a();
            case 23:
                return (ShortVideoGetPlaylistsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoGetPlaylistsResponseDto.class).getType())).a();
            case 26:
                return (StatEventsBaseResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StatEventsBaseResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountManagePushDeviceMultiResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetRequestsResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioPlaylistDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogBlockItemsDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommunityReviewsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGenericResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsCategoriesVectorResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SituationalSuggestsGetByIdResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ tr(Object obj, int i) {
        this.b = i;
    }
}
