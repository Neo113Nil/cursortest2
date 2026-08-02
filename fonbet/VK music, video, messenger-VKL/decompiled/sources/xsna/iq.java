package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.api.generated.apps.dto.AppsGetActivityResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetOwnersForCreateResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckPhoneReuseResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.generated.identity.dto.IdentityLabelDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddAudioResponseDto;
import com.vk.api.generated.market.dto.MarketGetCheckoutDeliveryPointsResponseDto;
import com.vk.api.generated.messages.dto.MessagesConfigDto;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerPhotoResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetSettingsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDeviceBlacklistsResponseDto;
import com.vk.home.HomeFragment2;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iq implements f03, b03, io.reactivex.rxjava3.functions.l, szs, ValueValidator, io.reactivex.rxjava3.functions.m, ScreenModeVideoStatMapper.a {
    public final /* synthetic */ int b;

    public /* synthetic */ iq(int i) {
        this.b = i;
    }

    public static String a(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String b(StringBuilder sb, Long l, char c) {
        sb.append(l);
        sb.append(c);
        return sb.toString();
    }

    public static String c(StringBuilder sb, wp50 wp50Var, char c) {
        sb.append(wp50Var);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, n4i0 n4i0Var, n4i0 n4i0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(n4i0Var, null, n4i0Var2)) {
            if (atomicReferenceFieldUpdater.get(n4i0Var) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return EmptyList.b;
            case 6:
            default:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            case 7:
                long j = ((wkk) obj).b;
                if (j == C.TIME_UNSET) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return com.vk.libvideo.tracker.a.b(unifiedStatScreenMode);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AudioPlaylistDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioPlaylistDto.class).getType())).a();
            case 3:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 12:
                return (GroupsGetAddressesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetAddressesResponseDto.class).getType())).a();
            case 16:
                return (MarketGetCheckoutDeliveryPointsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetCheckoutDeliveryPointsResponseDto.class).getType())).a();
            case 19:
                return (MessagesConfigDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesConfigDto.class).getType())).a();
            case 22:
                return (PhotosSaveOwnerPhotoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosSaveOwnerPhotoResponseDto.class).getType())).a();
            case 27:
                return (ServiceBookingGetSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingGetSettingsResponseDto.class).getType())).a();
            case 28:
                return (ShortVideoGetDeviceBlacklistsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetDeviceBlacklistsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetActivityResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsGetOwnersForCreateResponseDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemCheckPhoneReuseResponseDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, IdentityLabelDto.class).getType()).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, KidsCollectionAddAudioResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetGroupsForCallResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PagesWikipageFullDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 8:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 9:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = HomeFragment2.x0;
        return (obj instanceof ns60) || (obj instanceof eij0);
    }
}
