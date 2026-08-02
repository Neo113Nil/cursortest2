package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetPrivacySettingsResponseDto;
import com.vk.api.generated.audio.dto.AudioAddResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupTagDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigDto;
import com.vk.api.generated.identity.dto.IdentityPhoneResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewCreateConfigResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemsByVideoResponseDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsGetCheckoutUrlResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetInviteLinkResponseDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallSingleItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoFeedGetResponseDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.masks.MasksCatalogItem;
import com.vk.dto.music.Playlist;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class eq implements b03, f03, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, ListValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ eq(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, Peer peer, char c) {
        sb.append(peer);
        sb.append(c);
        return sb.toString();
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        switch (this.b) {
            case 7:
                String[] strArr = DebugDevSettingsFragment.t0;
                wh50 wh50Var = uef0.a;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((zak0) uef0.a).setValue(bool);
                break;
            default:
                String[] strArr2 = DebugDevSettingsFragment.t0;
                o2l o2lVar = o2l.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o2lVar.getClass();
                o2l.h("__removeInternalPrefix", booleanValue);
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return new Result(new Result.Failure(new ClipsCoauthorsException.CoauthorsNetworkException()));
            case 6:
                int i = dgh.x;
                return null;
            case 13:
                return s3q0.a;
            case 21:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MasksCatalogItem) it.next()).zb());
                }
                return arrayList;
            default:
                return ((Playlist) obj).y;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetPrivacySettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetPrivacySettingsResponseDto.class).getType())).a();
            case 1:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 12:
                return (EcosystemSendOtpResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, EcosystemSendOtpResponseDto.class).getType())).a();
            case 16:
                return (IdentityPhoneResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, IdentityPhoneResponseDto.class).getType())).a();
            case 18:
                return (MarketIntegrationsGetCheckoutUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketIntegrationsGetCheckoutUrlResponseDto.class).getType())).a();
            case 19:
                return (MarketGetCommunityReviewCreateConfigResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetCommunityReviewCreateConfigResponseDto.class).getType())).a();
            default:
                return (MessagesScheduledCallSingleItemDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesScheduledCallSingleItemDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioAddResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, GroupsGroupTagDto.class).getType()).getType());
            case 15:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, HealthCommonClientConfigDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetItemsByVideoResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetInviteLinkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosPhotoFeedGetResponseDto.class).getType());
            case 28:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 9:
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

    public /* synthetic */ eq(izs izsVar, int i) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
