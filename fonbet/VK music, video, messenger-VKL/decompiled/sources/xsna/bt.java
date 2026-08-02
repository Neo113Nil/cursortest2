package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoResponseDto;
import com.vk.api.generated.auth.dto.AuthCheckAccessResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogReplaceBlocksDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetValidationStatusResponseDto;
import com.vk.api.generated.email.dto.EmailCreationResponseDto;
import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.generated.messages.dto.MessagesAddTemplateResponseDto;
import com.vk.api.generated.messages.dto.MessagesCreateChatWithPeerIdsResponseDto;
import com.vk.api.generated.onboarding.dto.OnboardingCampaignItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.stories.dto.StoriesGetBackgroundsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.masks.MasksEffectUpdateAppRequiredException;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bt implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.c, ListValidator, ValueValidator, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ bt(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, tlo0 tlo0Var, char c) {
        sb.append(tlo0Var);
        sb.append(c);
        return sb.toString();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) obj2;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 12:
                return (EcosystemGetValidationStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EcosystemGetValidationStatusResponseDto.class).getType())).a();
            case 13:
                return (EmailCreationResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EmailCreationResponseDto.class).getType())).a();
            case 14:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 15:
                return (IdentityAddressResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, IdentityAddressResponseDto.class).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 19:
                return (MessagesAddTemplateResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesAddTemplateResponseDto.class).getType())).a();
            case 23:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, OnboardingCampaignItemDto.class).getType()).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 27:
                return (StoriesGetBackgroundsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoriesGetBackgroundsResponseDto.class).getType())).a();
            default:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, Integer.class).getType()).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        om.a.getClass();
        com.vk.core.preference.Preference.C("AccessibilitySettingsPreferences", "__lastSendTime__");
        cvk.w("Статус отправки метрик по доступности сброшен", false);
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountVerificationGetSessionInfoResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthCheckAccessResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogReplaceBlocksDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetByIdResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesCreateChatWithPeerIdsResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoPlaylistFullDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 10:
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

    public /* synthetic */ bt(xpd xpdVar) {
        this.b = 21;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Map<CallMemberId, MediaOptionState> map = L != null ? L.t : null;
                return map == null ? jgp.b : map;
            default:
                gi10 gi10Var = (gi10) obj;
                if (gi10Var.a.isEmpty()) {
                    throw new MasksEffectUpdateAppRequiredException();
                }
                return gi10Var.a.get(0);
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
