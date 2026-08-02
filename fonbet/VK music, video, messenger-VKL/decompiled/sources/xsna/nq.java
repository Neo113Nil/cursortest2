package xsna;

import android.graphics.Bitmap;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetBalanceResponseDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksSaveLinksResponseDto;
import com.vk.api.generated.apps.dto.AppsGetDevicePermissionsResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsPinMessagesResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBidOrganizationsListResponseDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsDto;
import com.vk.api.generated.messages.dto.MessagesGetCallParticipantsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRecordDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetViewersExtendedV5115ResponseDto;
import com.vk.api.generated.tabbar.dto.TabbarGetResponseDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.voip.api.dto.VoipChatInfo;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.er9;
import xsna.k840;
import xsna.mfg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nq implements b03, f03, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ nq(int i) {
        this.b = i;
    }

    public static void a(String str, g3y g3yVar, p2y p2yVar) {
        g3yVar.D1(new JsMethod(str), p2yVar);
    }

    public static void b(er9.b bVar, long j) {
        bVar.a().a();
        bVar.h(j);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        k840.b.d.a = ((Boolean) obj).booleanValue();
        k840.a.d().u();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return new mfg0.a(((Long) obj2).longValue(), (Throwable) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetBalanceResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetBalanceResponseDto.class).getType())).a();
            case 2:
                return (AppsGetDevicePermissionsResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetDevicePermissionsResponseDto.class).getType())).a();
            case 3:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioMoosicAudioDto.class).getType()).getType())).a();
            case 6:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 12:
                return (GroupsGetBidOrganizationsListResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetBidOrganizationsListResponseDto.class).getType())).a();
            case 15:
                return (MarketCheckoutSettingsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketCheckoutSettingsDto.class).getType())).a();
            case 17:
                return (MessagesGetCallParticipantsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetCallParticipantsResponseDto.class).getType())).a();
            case 23:
                return (ShortVideoGetThumbUploadUrlResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetThumbUploadUrlResponseDto.class).getType())).a();
            case 25:
                return (StoriesGetViewersExtendedV5115ResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetViewersExtendedV5115ResponseDto.class).getType())).a();
            case 27:
                return (TabbarGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, TabbarGetResponseDto.class).getType())).a();
            default:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, UsersUserDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ActionLinksSaveLinksResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsPinMessagesResponseDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingRecordDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    public /* synthetic */ nq(izs izsVar, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        VoipChatInfo voipChatInfo;
        switch (this.b) {
            case 5:
                dhw0 L = com.vk.voip.ui.c.b.L();
                return Boolean.valueOf(((L == null || (voipChatInfo = L.B) == null) ? null : voipChatInfo.e) != null);
            case 11:
                return afq.b((ExternalNpsCondition) obj);
            default:
                return kd7.c((Bitmap) obj);
        }
    }
}
