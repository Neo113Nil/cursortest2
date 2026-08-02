package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.health.connect.datatypes.AggregationType;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.preference.Preference;
import com.vk.api.generated.auth.dto.AuthValidateAccountResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesConversationCardConfigDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontResponseDto;
import com.vk.api.generated.messages.dto.MessagesAudioMessageDto;
import com.vk.api.generated.money.dto.MoneyGetNspkMembersResponseDto;
import com.vk.api.generated.orders.dto.OrdersConfirmSubscriptionResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.histogram.HistogramFilter;
import com.yandex.div.internal.parser.ValueValidator;
import io.appmetrica.analytics.impl.Ck;
import io.appmetrica.analytics.impl.InterfaceC5204tn;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.stat.InnerExtractionContext;
import ru.ok.android.externcalls.sdk.stat.StatPack;
import ru.ok.android.externcalls.sdk.stat.Util;
import xsna.by1;
import xsna.ihz;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u11 implements b03, f03, io.reactivex.rxjava3.functions.m, InterfaceC5204tn, Preference.b, ihz.a, ValueValidator, HistogramFilter, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ u11(int i) {
        this.b = i;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int c(int i, int i2, CharSequence charSequence) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static Object d(Util util, StatPack statPack, InnerExtractionContext innerExtractionContext) {
        return util.getMonotimeDiffMs().extract(statPack, innerExtractionContext).getValue();
    }

    public static tlo0.h f(tlo0.a aVar, CharSequence charSequence) {
        aVar.getClass();
        return new tlo0.h(charSequence);
    }

    public static void h(int i, int i2, View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void i(AggregateMetric aggregateMetric, AggregationType aggregationType, rmk0 rmk0Var) {
        rmk0Var.a(new Pair(aggregateMetric, aggregationType));
    }

    public static /* synthetic */ boolean j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Throwable th) {
        con0 con0Var = upj.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, con0Var, th)) {
            if (atomicReferenceFieldUpdater.get(obj) != con0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o2l.a.getClass();
        o2l.h("__dbg_log_eruda_mini_app", booleanValue);
        return true;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5204tn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return Ck.a(sQLiteDatabase);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return yal0.b((StoreGetStickersKeywordsResponseDto) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (String) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, String.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 10:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 13:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 20:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, GiftsMessagesConversationCardConfigDto.class).getType()).getType())).a();
            case 23:
                return (MarketGetStorefrontResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetStorefrontResponseDto.class).getType())).a();
            case 24:
                return (MessagesAudioMessageDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesAudioMessageDto.class).getType())).a();
            case 27:
                return ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Object.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (OrdersConfirmSubscriptionResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, OrdersConfirmSubscriptionResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthValidateAccountResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MoneyGetNspkMembersResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 18:
                long longValue = l.longValue();
                if (longValue < 0 || longValue > 360) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.yandex.div.histogram.HistogramFilter
    public boolean report(String str) {
        boolean OFF$lambda$1;
        OFF$lambda$1 = HistogramFilter.Companion.OFF$lambda$1(str);
        return OFF$lambda$1;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ u11(by1.a aVar, Exception exc) {
        this.b = 16;
    }
}
