package xsna;

import android.os.Parcel;
import com.vk.api.generated.account.dto.AccountGetPhoneResponseDto;
import com.vk.api.generated.apps.dto.AppsGetAttachPickerListResponseDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistExtendedResponseDto;
import com.vk.api.generated.audio.dto.AudioGetUserConfigResponseDto;
import com.vk.api.generated.auth.dto.AuthInvalidateExchangeTokenMultiResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsEditParticipantNameResponseDto;
import com.vk.api.generated.channels.dto.ChannelsSetConfigResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPaymentLinkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutCheckCensoredValidateResponseDto;
import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.api.generated.groups.dto.GroupsInviteLinksDto;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCheckoutOrderResponseDto;
import com.vk.api.generated.market.dto.MarketHasPinnedCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationStylesLangResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesByIdsResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetByIdResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedResponseDto;
import com.vk.api.generated.photos.dto.PhotosVerticalizeResponseDto;
import com.vk.api.generated.questions.dto.QuestionsGetByIdExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.apihelpers.RedirectHandler;
import org.chromium.net.apihelpers.RedirectHandlers;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ihz;
import xsna.ugw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nr implements b03, f03, io.reactivex.rxjava3.functions.m, ihz.a, ValueValidator, f0t, io.reactivex.rxjava3.functions.l, RedirectHandler {
    public final /* synthetic */ int b;

    public /* synthetic */ nr(int i) {
        this.b = i;
    }

    public static void a(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    @Override // xsna.f0t
    public Object apply(Object obj) {
        switch (this.b) {
            case 16:
                ugw.f fVar = ugw.z;
                return null;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetPhoneResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetPhoneResponseDto.class).getType())).a();
            case 3:
                return (AudioGetUserConfigResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetUserConfigResponseDto.class).getType())).a();
            case 7:
                return (CallsEditParticipantNameResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CallsEditParticipantNameResponseDto.class).getType())).a();
            case 8:
                return (ChannelsSetConfigResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ChannelsSetConfigResponseDto.class).getType())).a();
            case 9:
                return (CommunitySubscriptionsGetPaymentLinkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsGetPaymentLinkResponseDto.class).getType())).a();
            case 14:
                return (FriendsAddResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsAddResponseDto.class).getType())).a();
            case 19:
                return (MarketHasPinnedCommunityReviewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketHasPinnedCommunityReviewResponseDto.class).getType())).a();
            case 20:
                return (MessagesGetVideoMessageShapesByIdsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetVideoMessageShapesByIdsResponseDto.class).getType())).a();
            case 24:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (QuestionsGetByIdExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, QuestionsGetByIdExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetAttachPickerListResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetPlaylistExtendedResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthInvalidateExchangeTokenMultiResponseDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutCheckCensoredValidateResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsInviteLinksDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, LikesAddResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCreateCheckoutOrderResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetConversationStylesLangResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NarrativesGetByIdResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGetBannedExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosVerticalizeResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 11:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                if (((Long) obj).longValue() > 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.chromium.net.apihelpers.RedirectHandler
    public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
        boolean lambda$alwaysFollow$1;
        lambda$alwaysFollow$1 = RedirectHandlers.lambda$alwaysFollow$1(urlResponseInfo, str);
        return lambda$alwaysFollow$1;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ nr(Object obj, int i) {
        this.b = i;
    }
}
