package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetConversationByCallResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetCommentsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersOrderItemDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.api.generated.market.dto.MarketDeleteCommunityReviewCommentResponseDto;
import com.vk.api.generated.messages.dto.MessagesChangeConversationMemberRestrictionsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationByIdDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchDatesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.TokenProvider;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vq implements f03, io.reactivex.rxjava3.functions.m, b03, io.reactivex.rxjava3.functions.c, TokenProvider, ValueValidator, ListValidator, io.reactivex.rxjava3.functions.l, l8x.a {
    public final /* synthetic */ int b;

    public /* synthetic */ vq(int i) {
        this.b = i;
    }

    public static StringBuilder a(String str, int i, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(c);
        return sb;
    }

    public static void b(int i, int i2, ComposeView composeView) {
        composeView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void d(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static void f(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.b) {
            case 14:
                return -1;
            case 18:
                return wrw.g;
            default:
                return new Result(new Result.Failure(th));
        }
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new xjh0(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 5:
                return (CallsGetConversationByCallResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CallsGetConversationByCallResponseDto.class).getType())).a();
            case 8:
                return (ChannelsGetCommentsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsGetCommentsResponseDto.class).getType())).a();
            case 15:
                return (FriendsGetListsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, FriendsGetListsResponseDto.class).getType())).a();
            case 21:
                return (MarketDeleteCommunityReviewCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketDeleteCommunityReviewCommentResponseDto.class).getType())).a();
            case 23:
                return (MessagesChangeConversationMemberRestrictionsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesChangeConversationMemberRestrictionsResponseDto.class).getType())).a();
            default:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GoodsOrdersOrderItemDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetContentForTabsResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketAddAlbumResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetConversationByIdDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingActivitySearchDatesResponseDto.class).getType());
        }
    }

    @Override // ru.ok.android.sdk.api.TokenProvider
    public String getToken() {
        String lambda$joinAnonByLinkInternal$9;
        lambda$joinAnonByLinkInternal$9 = ConversationFactory.lambda$joinAnonByLinkInternal$9();
        return lambda$joinAnonByLinkInternal$9;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ShortVideoGetPlaylistsResponseDto) obj;
    }
}
