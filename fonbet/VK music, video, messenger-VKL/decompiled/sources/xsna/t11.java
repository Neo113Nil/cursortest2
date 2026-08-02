package xsna;

import androidx.preference.Preference;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenResponseDto;
import com.vk.api.generated.auth.dto.AuthValidateAccountResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartTotalQuantityResponseDto;
import com.vk.api.generated.money.dto.MoneyGetNspkMembersResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationGroupSettingsSectionDto;
import com.vk.api.generated.orders.dto.OrdersPersonalDiscountDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.fragments.cities.CitySelectFragment;
import com.yandex.div.histogram.HistogramFilter;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;
import xsna.nku0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t11 implements f03, b03, io.reactivex.rxjava3.functions.l, nku0.b, Preference.c, ihz.a, io.reactivex.rxjava3.functions.c, ValueValidator, HistogramFilter, szs {
    public final /* synthetic */ int b;

    public /* synthetic */ t11(int i) {
        this.b = i;
    }

    public static UserId b() {
        return hd60.a().a().y();
    }

    public static void c(Object[] objArr, int i, String str, IronLog ironLog) {
        ironLog.verbose(String.format(str, Arrays.copyOf(objArr, i)));
    }

    public static boolean d() {
        return fxc0.B().J().W();
    }

    @Override // xsna.nku0.b
    public io.reactivex.rxjava3.core.x a(int i, String str) {
        int i2 = CitySelectFragment.Q;
        boolean z = !((Boolean) dgn0.f.invoke()).booleanValue();
        hwk hwkVar = new hwk("database.getCities", new gwk());
        hwkVar.d = z;
        hwkVar.C(i, AnalyticsBaseParamsConstantsKt.COUNTRY_ID);
        if (str != null && str.length() > 0) {
            hwkVar.K(CampaignEx.JSON_KEY_AD_Q, str);
            hwkVar.C(100, "count");
        }
        return rsg0.w0(hwkVar).l(new to(9));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        NewsEntriesContainer.Info info = (NewsEntriesContainer.Info) obj;
        w960 w960Var = (w960) obj2;
        info.n = true;
        info.o = w960Var.b;
        return new NewsEntriesContainer(info, w960Var.a);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (AuthValidateAccountResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AuthValidateAccountResponseDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (MoneyGetNspkMembersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MoneyGetNspkMembersResponseDto.class).getType())).a();
            default:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetAboutScreenResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCartTotalQuantityResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, NotificationsNotificationGroupSettingsSectionDto.class).getType()).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersPersonalDiscountDto.class).getType());
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
        Double d = (Double) obj;
        switch (this.b) {
            case 14:
                double doubleValue = d.doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                double doubleValue2 = d.doubleValue();
                if (doubleValue2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue2 > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // com.yandex.div.histogram.HistogramFilter
    public boolean report(String str) {
        boolean ON$lambda$0;
        ON$lambda$0 = HistogramFilter.Companion.ON$lambda$0(str);
        return ON$lambda$0;
    }

    public /* synthetic */ t11(Object obj, int i) {
        this.b = i;
    }

    public /* synthetic */ t11(by1.a aVar, pr10 pr10Var) {
        this.b = 12;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 6:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Set<CallMemberId> set = L != null ? L.w : null;
                return set == null ? EmptySet.b : set;
            case 9:
                return (File) obj;
            case 17:
                return s3q0.a;
            default:
                return (vep0) obj;
        }
    }
}
