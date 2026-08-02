package xsna;

import android.os.Parcel;
import com.vk.api.generated.apps.dto.AppsGetCollectionAppsResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.auth.dto.AuthSetAuthCodeStatusResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.combo.dto.ComboAvailableOfferResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetInfoResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.api.generated.market.dto.MarketGetFavesForAttachResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetRankedSharingPeersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.by1;
import xsna.chp0;
import xsna.ihz;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class ao implements b03, f03, io.reactivex.rxjava3.functions.l, ExternalIdsResolver.ParticipantPrivateStateModifier, ihz.a, io.reactivex.rxjava3.functions.m, ValueValidator, ub9.c, chp0.b {
    public final /* synthetic */ int b;

    public /* synthetic */ ao(int i) {
        this.b = i;
    }

    public static Iterator a(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static /* synthetic */ boolean b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, nm8 nm8Var, n4i0 n4i0Var, n4i0 n4i0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(nm8Var, n4i0Var, n4i0Var2)) {
            if (atomicReferenceFieldUpdater.get(nm8Var) != n4i0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                List<UsersFieldsDto> list = o3f.f;
                return Boolean.TRUE;
            case 14:
                return ((x960) obj).a();
            case 19:
                return Boolean.TRUE;
            default:
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        Object lambda$getForegroundInfoAsync$0;
        lambda$getForegroundInfoAsync$0 = androidx.work.b.lambda$getForegroundInfoAsync$0(aVar);
        return lambda$getForegroundInfoAsync$0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (AppsGetCollectionAppsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetCollectionAppsResponseDto.class).getType())).a();
            case 4:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioArtistDto.class).getType()).getType())).a();
            case 6:
                return (AuthSetAuthCodeStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthSetAuthCodeStatusResponseDto.class).getType())).a();
            case 8:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 10:
                return (ComboAvailableOfferResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ComboAvailableOfferResponseDto.class).getType())).a();
            case 20:
                return (MarketGetFavesForAttachResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetFavesForAttachResponseDto.class).getType())).a();
            case 21:
                return (MarketGetItemReviewsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetItemReviewsResponseDto.class).getType())).a();
            case 23:
                return (MessagesGetRankedSharingPeersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetRankedSharingPeersResponseDto.class).getType())).a();
            case 25:
                return (NotificationsGetRedesignSettingsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsGetRedesignSettingsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMiniappsCatalogItemPayloadListDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutGetInfoResponseDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGetActivitiesResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersGetAutoBuyStatusResponseDto.class).getType());
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

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ParticipantPrivateStateModifier
    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        User user;
        agm agmVar = (agm) obj;
        Peer Zb = agmVar.b.Zb();
        Zb.getClass();
        return Zb.Ab(Peer.Type.USER) && (user = (User) agmVar.f.zb(Zb)) != null && user.z != 3 && user.E;
    }

    public /* synthetic */ ao(by1.a aVar, int i, int i2) {
        this.b = 12;
    }

    public /* synthetic */ ao(izs izsVar, int i) {
        this.b = i;
    }

    @Override // xsna.chp0.b
    public void onTrackSelectionsInvalidated() {
    }
}
