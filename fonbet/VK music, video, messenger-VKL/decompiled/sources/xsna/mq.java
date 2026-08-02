package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.adsint.dto.AdsintSuccessResponseDto;
import com.vk.api.generated.appWidgets.dto.AppWidgetsGetWidgetPreviewResponseDto;
import com.vk.api.generated.apps.dto.AppsGetActionMenuAppsResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetChannelMessagesCountersResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRestoreAudioResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemCardResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetAnonymCallTokenResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServicesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetStaticsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import xsna.k840;
import xsna.l8x;
import xsna.q630;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mq implements b03, f03, io.reactivex.rxjava3.functions.l, Preference.b, ListValidator, ValueValidator, l8x.a {
    public final /* synthetic */ int b;

    public /* synthetic */ mq(int i) {
        this.b = i;
    }

    public static void a(long j, String str, String str2) {
        Assert.fail(str + j + str2);
    }

    public static void b(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void d(q630.a aVar, float f, androidx.compose.runtime.a aVar2, int i) {
        f9t.e(txj0.v(aVar, f), aVar2, i);
        aVar2.j();
    }

    public static void f(int[] iArr, StringBuilder sb, String str) {
        sb.append(Arrays.toString(iArr));
        sb.append(str);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        k840.b.c.a = ((Boolean) obj).booleanValue();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return "";
            case 6:
                return io.reactivex.rxjava3.core.q.H((Throwable) obj);
            case 8:
                return va9.r;
            case 12:
                return k9q0.r((List) obj);
            default:
                return y6u.a.c.b;
        }
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new gjh0(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (AppsGetActionMenuAppsResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetActionMenuAppsResponseDto.class).getType())).a();
            case 5:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 9:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 19:
                return (GroupsGetObjectExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetObjectExtendedResponseDto.class).getType())).a();
            case 21:
                return (MarketGetItemCardResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetItemCardResponseDto.class).getType())).a();
            case 23:
                return (MessagesGetAnonymCallTokenResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetAnonymCallTokenResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetStaticsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetStaticsResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AdsintSuccessResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppWidgetsGetWidgetPreviewResponseDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsGetChannelMessagesCountersResponseDto.class).getType());
            case 17:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemCheckOtpResponseDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, KidsCollectionRestoreAudioResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingSearchServicesResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() > 0;
    }

    public /* synthetic */ mq(izs izsVar, int i) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
