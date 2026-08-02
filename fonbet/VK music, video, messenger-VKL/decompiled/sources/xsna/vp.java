package xsna;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.audio.dto.AudioDeleteExtendedResponseDto;
import com.vk.api.generated.auth.dto.AuthProcessAuthCodeResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetValidationStatusResponseDto;
import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.api.generated.market.dto.MarketGetProductLinkedContentResponseDto;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.memories.dto.MemoriesIsNewMemoriesAvailableResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetJoinLinkResponseDto;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.data.VkAppsList;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.chp0;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vp implements io.reactivex.rxjava3.functions.l, b03, f03, Preference.c, g7l, ValueValidator, chp0.b, ModalBottomSheetBehavior.e {
    public final /* synthetic */ int b;

    public /* synthetic */ vp(int i) {
        this.b = i;
    }

    public static int a(BaseBoolIntDto baseBoolIntDto, int i, int i2) {
        return (baseBoolIntDto.hashCode() + i) * i2;
    }

    public static String b(String str, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return ((se3) obj).a;
            case 9:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 25:
                return ((VkAppsList) obj).d();
            case 28:
                return j5g.O0((VKList) obj);
            default:
                return Boolean.TRUE;
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.e
    public boolean d(float f, int i) {
        return true;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsCatalogListDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsCatalogListDto.class).getType())).a();
            case 5:
                return (BusinessGroupsGetShieldSettingsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BusinessGroupsGetShieldSettingsResponseDto.class).getType())).a();
            case 8:
                return (ChannelsMessageDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ChannelsMessageDto.class).getType())).a();
            case 21:
                return Integer.valueOf(((Number) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 23:
                return (MarketGetProductLinkedContentResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetProductLinkedContentResponseDto.class).getType())).a();
            case 24:
                return (MemoriesIsNewMemoriesAvailableResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MemoriesIsNewMemoriesAvailableResponseDto.class).getType())).a();
            default:
                return (MessagesGetJoinLinkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetJoinLinkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        asu0.a.getClass();
        asu0.h().execute(new w3l());
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioDeleteExtendedResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthProcessAuthCodeResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemGetValidationStatusResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, IdentityAddressResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketProfileInfoDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 12:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 13:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // xsna.chp0.b
    public void onTrackSelectionsInvalidated() {
        npl.d dVar = DownloadHelper.q;
    }

    public /* synthetic */ vp(izs izsVar, int i) {
        this.b = i;
    }
}
