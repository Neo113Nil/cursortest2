package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.auth.dto.AuthGetSilentTokensResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewFriendsResponseDto;
import com.vk.api.generated.market.dto.MarketGetOrdersExtendedResponseDto;
import com.vk.api.generated.owners.dto.OwnersGetContentSectionsResponseDto;
import com.vk.api.generated.services.dto.ServicesCategoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.MutualFriendsTabFragment;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class gp implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.b, ihz.a, ValueValidator, io.reactivex.rxjava3.functions.m, fsn0 {
    public final /* synthetic */ int b;

    public /* synthetic */ gp(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, UserId userId, char c) {
        sb.append(userId);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder c(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static boolean d(androidx.compose.runtime.a aVar) {
        aVar.j();
        aVar.G();
        return androidx.compose.runtime.b.d();
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        a201.b().a().b();
        return true;
    }

    @Override // xsna.fsn0
    public boolean a(UsersUserFullDto usersUserFullDto) {
        int i = MutualFriendsTabFragment.b0;
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 7:
                dhw0 L = com.vk.voip.ui.c.b.L();
                return Boolean.valueOf(L != null ? L.H : false);
            case 8:
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof ApiAccessDeniedException) {
                    return EmptyList.b;
                }
                throw th;
            case 9:
                return s3q0.a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 6:
                return (AuthGetSilentTokensResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthGetSilentTokensResponseDto.class).getType())).a();
            case 22:
                return (MarketGetOrdersExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetOrdersExtendedResponseDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, ServicesCategoryDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemSendOtpResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommunityReviewFriendsResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OwnersGetContentSectionsResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 12:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 13:
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
        sxp sxpVar = (sxp) obj;
        return (sxpVar instanceof OnCacheInvalidateEvent) || (sxpVar instanceof OnChannelsCacheInvalidateEvent) || (sxpVar instanceof t480) || (sxpVar instanceof v280) || (sxpVar instanceof f780) || (sxpVar instanceof dxj) || (sxpVar instanceof s480);
    }

    public /* synthetic */ gp(by1.a aVar, long j) {
        this.b = 11;
    }
}
