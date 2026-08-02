package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.vk.api.generated.audio.dto.AudioGetReactionsConfigResponseDto;
import com.vk.api.generated.auth.dto.AuthTerminateAuthCodeResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.channels.dto.ChannelsGetReactionsMappingResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetNameHistoryResponseDto;
import com.vk.api.generated.market.dto.MarketReferenceDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsUnsubscribeActionsResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAllUserSubscriptionsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.api.generated.questions.dto.QuestionsDeleteFromAuthorResponseDto;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qr implements f03, b03, io.reactivex.rxjava3.functions.l, ihz.a, ListValidator, ValueValidator, vgp {
    public final /* synthetic */ int b;

    public /* synthetic */ qr(int i) {
        this.b = i;
    }

    public static int a(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static Bundle b(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static String c(StringBuilder sb, Bitmap bitmap, char c) {
        sb.append(bitmap);
        sb.append(c);
        return sb.toString();
    }

    public static void d(ce60 ce60Var, int i, NewsEntry newsEntry) {
        ce60Var.getClass();
        p870.f().e(i, newsEntry);
    }

    public static boolean f(UserId userId) {
        return epx.f(userId, o25.a().c());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return s3q0.a;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 5:
                return (AudioGetReactionsConfigResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetReactionsConfigResponseDto.class).getType())).a();
            case 8:
                return (ChannelsGetReactionsMappingResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ChannelsGetReactionsMappingResponseDto.class).getType())).a();
            case 14:
                return (DonutGetLevelsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGetLevelsResponseDto.class).getType())).a();
            case 15:
                return (FriendsGetFieldsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, FriendsGetFieldsResponseDto.class).getType())).a();
            case 19:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (MessagesGetCallTokenResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetCallTokenResponseDto.class).getType())).a();
            case 23:
                return (NotificationsUnsubscribeActionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsUnsubscribeActionsResponseDto.class).getType())).a();
            case 24:
                return (OrdersGetAllUserSubscriptionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OrdersGetAllUserSubscriptionsResponseDto.class).getType())).a();
            default:
                return (QuestionsDeleteFromAuthorResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, QuestionsDeleteFromAuthorResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthTerminateAuthCodeResponseDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetNameHistoryResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketReferenceDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosPhotoUploadDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vgp
    public com.vk.core.view.components.paging.list.a provide() {
        int i = SearchDocumentsListFragment.h0;
        tlo0 tlo0Var = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return new com.vk.core.view.components.paging.list.a(0 == true ? 1 : 0, new VkPlaceholder.b(tlo0Var, (tlo0) tq.h(tlo0.Companion, R.string.search_empty), (com.vk.core.compose.component.semantics.a) objArr, 11), 0 == true ? 1 : 0, 5);
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ qr(by1.a aVar, Exception exc) {
        this.b = 11;
    }
}
