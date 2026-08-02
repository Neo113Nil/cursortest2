package xsna;

import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsHasActiveSubscriptionResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutDonatorSubscriptionInfoDto;
import com.vk.api.generated.fave.dto.FaveGetPhotosResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFriendsDeletionSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCommunityReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.messages.dto.MessagesIsMessagesFromGroupAllowedResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendServiceResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.api.generated.photos.dto.PhotosSaveAudioPlaylistCoverResponseDto;
import com.vk.api.generated.polls.dto.PollsGetStatsResponseDto;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.ParsingContext;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;
import xsna.ty6;
import xsna.xgy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lr implements b03, f03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ValueValidator, xgy.a {
    public final /* synthetic */ int b;

    public /* synthetic */ lr(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static JSONObject b(ParsingContext parsingContext, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, str, str2);
        return jSONObject;
    }

    public static q630 c(ty6.a aVar, q630 q630Var) {
        return q630Var.g(new gcv(aVar));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 10:
                return ((e0d) obj).b;
            default:
                return GroupCallViewModel.p;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 6:
                return (AudioGetPlaylistsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetPlaylistsResponseDto.class).getType())).a();
            case 11:
                return (CommunitySubscriptionsHasActiveSubscriptionResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsHasActiveSubscriptionResponseDto.class).getType())).a();
            case 20:
                return (MarketGetAlbumsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetAlbumsResponseDto.class).getType())).a();
            case 21:
                return (MarketCreateCommunityReviewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketCreateCommunityReviewResponseDto.class).getType())).a();
            case 22:
                return (MessagesSendServiceResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesSendServiceResponseDto.class).getType())).a();
            case 26:
                return (NotificationsNotificationListRedesignResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsNotificationListRedesignResponseDto.class).getType())).a();
            case 27:
                return (PhotosSaveAudioPlaylistCoverResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosSaveAudioPlaylistCoverResponseDto.class).getType())).a();
            default:
                return (PollsGetStatsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PollsGetStatsResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsJoinAndGetResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutDonatorSubscriptionInfoDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FaveGetPhotosResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetFriendsDeletionSuggestionsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetMembersFieldsResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesIsMessagesFromGroupAllowedResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGenericResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        return ify.d(3, null);
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = DiscoverSearchFragment.s0;
        return obj instanceof UIBlockActionOpenSearchTab.a;
    }

    public /* synthetic */ lr(izs izsVar, int i) {
        this.b = i;
    }

    public /* synthetic */ lr(boolean z) {
        this.b = 0;
    }
}
