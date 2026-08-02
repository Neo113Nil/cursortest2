package xsna;

import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.fave.dto.FaveCheckLinkResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetRequestsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityShopConditionsResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.messages.dto.MessagesGetMessagesReactionsResponseDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationsResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesEditResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetPhotosByIdWithTagsResponseDto;
import com.vk.api.generated.places.dto.PlacesSearchResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;
import xsna.pdg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fr implements b03, f03, io.reactivex.rxjava3.functions.l, m6o, io.reactivex.rxjava3.functions.m, ihz.a, ValueValidator, szs {
    public final /* synthetic */ int b;

    public /* synthetic */ fr(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, Responses$ClientError responses$ClientError, char c) {
        sb.append(responses$ClientError);
        sb.append(c);
        return sb.toString();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Set<CallMemberId> set;
        switch (this.b) {
            case 4:
                dhw0 L = com.vk.voip.ui.c.b.L();
                return (L == null || (set = L.r) == null) ? EmptySet.b : set;
            case 6:
                return ((File) obj).getAbsolutePath();
            case 18:
                zky zkyVar = (zky) obj;
                return zkyVar.a + ": " + zkyVar.b;
            default:
                return new pdg0.b(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        double d2 = d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
                return (AppsCatalogListDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsCatalogListDto.class).getType())).a();
            case 13:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, BaseCountryDto.class).getType()).getType())).a();
            case 22:
                return (MarketGetCommunityShopConditionsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetCommunityShopConditionsResponseDto.class).getType())).a();
            case 23:
                return (MarketReviewCommentsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketReviewCommentsDto.class).getType())).a();
            case 24:
                return (MessagesSearchConversationsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesSearchConversationsResponseDto.class).getType())).a();
            case 26:
                return (NarrativesEditResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NarrativesEditResponseDto.class).getType())).a();
            case 28:
                return (PhotosGetPhotosByIdWithTagsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosGetPhotosByIdWithTagsResponseDto.class).getType())).a();
            default:
                return (PlacesSearchResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PlacesSearchResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsAdsSlotsDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, UserId.class).getType()).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FaveCheckLinkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetRequestsResponseDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetMessagesReactionsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 15:
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

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((t8j) obj).b.t8() == Peer.Type.CONTACT;
    }

    public /* synthetic */ fr(by1.a aVar, fi20 fi20Var) {
        this.b = 14;
    }

    public /* synthetic */ fr(izs izsVar, int i) {
        this.b = i;
    }
}
