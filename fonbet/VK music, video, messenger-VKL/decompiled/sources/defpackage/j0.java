package defpackage;

import com.vk.api.generated.account.dto.AccountGetPhoneResponseDto;
import com.vk.api.generated.audio.dto.AudioGetStreamMixSettingsResponseDto;
import com.vk.api.generated.audio.dto.AudioGetUserConfigResponseDto;
import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsEditParticipantNameResponseDto;
import com.vk.api.generated.channels.dto.ChannelsSetConfigResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPaymentLinkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutAddLevelResponseDto;
import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketHasPinnedCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesByIdsResponseDto;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.log.L;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.c;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.flowable.p;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b03;
import xsna.chu;
import xsna.dhw0;
import xsna.f03;
import xsna.hi20;
import xsna.q630;
import xsna.wwx;
import xsna.xpy;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class j0 implements f03, l, b03, ValueValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ j0(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        return (((i - i2) - i3) / i4) + i5;
    }

    public static String b(String str, b bVar) {
        return bVar.i(new JsMethod(str));
    }

    public static String c(StringBuilder sb, hi20 hi20Var, char c) {
        sb.append(hi20Var);
        sb.append(c);
        return sb.toString();
    }

    public static q630 d(float f, q630 q630Var, boolean z) {
        return q630Var.g(new xpy(f, z));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                VideoAdvertisementsRepository.a aVar = (VideoAdvertisementsRepository.a) obj;
                return aVar instanceof VideoAdvertisementsRepository.a.b ? ((VideoAdvertisementsRepository.a.b) aVar).a : "";
            case 10:
                dhw0 L = c.b.L();
                Set<CallMemberId> set = L != null ? L.k : null;
                return set == null ? EmptySet.b : set;
            case 18:
                L.i((Throwable) obj);
                int i = g.b;
                return p.c;
            case 20:
                return chu.a.a;
            default:
                return EmptyList.b;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 6:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (AudioGetStreamMixSettingsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetStreamMixSettingsResponseDto.class).getType())).a();
            case 9:
                return (AuthGetExchangeTokenResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthGetExchangeTokenResponseDto.class).getType())).a();
            case 21:
                return (GroupsGetBannedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetBannedResponseDto.class).getType())).a();
            case 22:
                return (LikesGetListExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, LikesGetListExtendedResponseDto.class).getType())).a();
            case 23:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 26:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetPhoneResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetUserConfigResponseDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsEditParticipantNameResponseDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsSetConfigResponseDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsGetPaymentLinkResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutAddLevelResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsAddResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketHasPinnedCommunityReviewResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetVideoMessageShapesByIdsResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Double d = (Double) obj;
        switch (this.b) {
            case 14:
                double doubleValue = d.doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                if (d.doubleValue() >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                }
                break;
        }
        return false;
    }
}
