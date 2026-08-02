package xsna;

import com.vk.api.generated.account.dto.AccountManagePushDeviceMultiResponseDto;
import com.vk.api.generated.apps.dto.AppsGetRequestsResponseDto;
import com.vk.api.generated.assets.dto.AssetsItemDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.auth.dto.AuthGetWebAuthLinkResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewsResponseDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsCategoriesVectorResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsGetByIdResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.models.users.User;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.protocol.screenshare.recv.PatchedDecoder;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sr implements b03, f03, io.reactivex.rxjava3.functions.m, ValueValidator, mba, PatchedDecoder.ErrorCallback {
    public final /* synthetic */ int b;

    public /* synthetic */ sr(int i) {
        this.b = i;
    }

    public static int a(yzt0 yzt0Var, int i, int i2) {
        return (yzt0Var.hashCode() + i) * i2;
    }

    public static AttachSyncState b(Serializer serializer, AttachSyncState.a aVar) {
        int u = serializer.u();
        aVar.getClass();
        if (u == 1) {
            return AttachSyncState.UPLOAD_REQUIRED;
        }
        if (u == 2) {
            return AttachSyncState.UPLOAD_ON_BG;
        }
        if (u == 3) {
            return AttachSyncState.DONE;
        }
        if (u == 4) {
            return AttachSyncState.ERROR;
        }
        if (u == 5) {
            return AttachSyncState.REJECTED;
        }
        throw new IllegalArgumentException(lhg.a(u, "Illegal intId value: "));
    }

    public static void c(ChannelsDb.Column column, StringBuilder sb, String str) {
        sb.append(column.getKey());
        sb.append(str);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountManagePushDeviceMultiResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountManagePushDeviceMultiResponseDto.class).getType())).a();
            case 2:
                return (AppsGetRequestsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetRequestsResponseDto.class).getType())).a();
            case 5:
                return (AudioPlaylistDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioPlaylistDto.class).getType())).a();
            case 8:
                return (CatalogBlockItemsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogBlockItemsDto.class).getType())).a();
            case 15:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 16:
                return (MarketGetCommunityReviewsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetCommunityReviewsResponseDto.class).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (NewsfeedGenericResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            case 21:
                return (NotificationsCategoriesVectorResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsCategoriesVectorResponseDto.class).getType())).a();
            case 24:
                return (BaseUploadServerDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 27:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 28:
                return (SituationalSuggestsGetByIdResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, SituationalSuggestsGetByIdResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.recv.PatchedDecoder.ErrorCallback
    public void error(Exception exc, String str) {
        PatchedDecoder.a(exc, str);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AssetsItemDto.class).getType()).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MediaPopupDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthGetWebAuthLinkResponseDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutGroupSettingsDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesFoldersInfoDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersGetAutoBuyStatusResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 10:
                agm agmVar = (agm) obj;
                Peer Zb = agmVar.b.Zb();
                Zb.getClass();
                return Zb.Ab(Peer.Type.USER) && ((User) agmVar.f.zb(Zb)) != null;
            default:
                return obj instanceof bwg0;
        }
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        if (aVar == null) {
            aVar = null;
        }
        MusicRestrictionPopupDisplayer.d(aVar, "audio_download_library", MusicPlaybackLaunchContext.e, "audio_download_library", null, 8);
    }
}
