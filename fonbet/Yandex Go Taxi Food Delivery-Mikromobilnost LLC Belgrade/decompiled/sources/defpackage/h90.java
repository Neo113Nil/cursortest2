package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import com.yandex.messaging.sdk.a;
import com.ybsdk.core.analytics.DeeplinkParamsFilter;
import com.ybsdk.core.common.data.network.adapters.JsonStringMapAdapter;
import com.ybsdk.core.common.data.network.adapters.RawJsonStringAdapter;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.utils.dto.RequestStatus;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeDto;
import com.ybsdk.feature.card.api.entities.CardTokenType;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.network.dto.CardProductType;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.educations.api.data.EducationScrollScreenEdge;
import com.ybsdk.feature.educations.api.data.EducationScrollSnapPreference;
import com.ybsdk.feature.educations.api.data.EducationScrollType;
import com.ybsdk.feature.main.internal.data.network.dto.ProductTypeDto;
import com.ybsdk.feature.pfm.internal.data.network.adapters.PfmCalendarIso8601ZAdapter;
import com.ybsdk.feature.push.impl.network.PushNotificationsApi;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;
import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import com.ybsdk.feature.transactions.api.dto.TransactionStatusCode;
import com.ybsdk.feature.transactions.api.dto.TransactionType;
import com.ybsdk.feature.transactions.api.entities.TransactionEntity;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferStatusDto;
import com.ybsdk.network.converters.ApplicationsAdapter;
import com.ybsdk.network.converters.BigDecimalAdapter;
import com.ybsdk.network.converters.RawSkeletonIdAdapter;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.network.dto.PaymentMethodProductType;
import com.ybsdk.network.dto.StartSessionResponse;
import com.ybsdk.network.dto.card.CardDeliveryStatusResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneApplicationStatusResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeResponse;
import com.ybsdk.network.dto.common.Product;
import com.ybsdk.network.dto.creditlimit.CreditLimitPlanPaymentIntervalType;
import com.ybsdk.network.dto.creditlimit.CreditLimitPlanPaymentStatus;
import com.ybsdk.network.dto.creditlimit.CreditLimitPlansResponse;
import com.ybsdk.network.dto.creditlimit.CreditPaymentMethodTypeResponse;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationResponse;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.adapters.CommonPollingAdapter;
import com.ybsdk.rconfig.adapters.ShimmersConfigAdapter;
import com.ybsdk.rconfig.adapters.TextAdapter;
import com.ybsdk.rconfig.adapters.YbCommonUrlsAdapter;
import com.ybsdk.rconfig.configs.DefaultProductForDashboard;
import com.ybsdk.rconfig.configs.NfcFailAction;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class h90 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public /* synthetic */ h90(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new g90((m90) n3wVar.a);
            case 1:
                return new ayc((zxc) n3wVar.a);
            case 2:
                ViewGroup viewGroup = (ViewGroup) n3wVar.a;
                int i3 = ahh0.content;
                WeakHashMap weakHashMap = b.a;
                return new ffe((ViewGroup) ((View) rp31.d(viewGroup, i3)));
            case 3:
                return new v720((u720) n3wVar.a);
            case 4:
                return new nfa0((mfa0) n3wVar.a);
            case 5:
                return new nna0((ona0) n3wVar.a);
            case 6:
                a1b0 a1b0Var = (a1b0) i5m.b(new g970(new m5g(i2, (dnp0) n3wVar.a), 12)).get();
                q5z.i(a1b0Var);
                return a1b0Var;
            case 7:
                return new kkc0(i2, (mkc0) n3wVar.a);
            case 8:
                tse tseVar = ((d551) n3wVar.a).b;
                q5z.i(tseVar);
                return tseVar;
            case 9:
                return (PushNotificationsApi) ((t0k0) ((x8g) ((dnp0) n3wVar.a)).s.get()).b(PushNotificationsApi.class);
            case 10:
                ((zzf) ((a) n3wVar.a).b()).e.get();
                return "ru.yandex.taxi";
            case 11:
                return new gm51(((g420) n3wVar.a).a);
            case 12:
                w4o w4oVar = ((hh51) n3wVar.a).c;
                q5z.i(w4oVar);
                return w4oVar;
            case 13:
                Context context = (Context) n3wVar.a;
                Moshi.Builder add = new Moshi.Builder().add(ApplicationsAdapter.a).add(BigDecimalAdapter.a).add(CommonPollingAdapter.a).add(ShimmersConfigAdapter.a).add(YbCommonUrlsAdapter.a).add((JsonAdapter.Factory) x1e0.a).add((JsonAdapter.Factory) er51.a).add(TransactionStatusCode.class, EnumJsonAdapter.create(TransactionStatusCode.class).withUnknownFallback(null)).add(StartSessionResponse.Action.class, EnumJsonAdapter.create(StartSessionResponse.Action.class).withUnknownFallback(StartSessionResponse.Action.NONE)).add(ExperimentApplyType.class, EnumJsonAdapter.create(ExperimentApplyType.class).withUnknownFallback(ExperimentApplyType.COLD_START)).add(TransactionEntity.TokenProvider.class, EnumJsonAdapter.create(TransactionEntity.TokenProvider.class).withUnknownFallback(TransactionEntity.TokenProvider.UNDEFINED)).add(TransactionEntity.PaymentSystem.class, EnumJsonAdapter.create(TransactionEntity.PaymentSystem.class).withUnknownFallback(TransactionEntity.PaymentSystem.UNKNOWN)).add(SimplifiedIdApplicationResponse.SecondDocument.class, EnumJsonAdapter.create(SimplifiedIdApplicationResponse.SecondDocument.class).withUnknownFallback(null)).add(Product.class, EnumJsonAdapter.create(Product.class).withUnknownFallback(Product.UNKNOWN)).add(PaymentMethodTypeDto.class, EnumJsonAdapter.create(PaymentMethodTypeDto.class).withUnknownFallback(PaymentMethodTypeDto.UNKNOWN)).add(AutoTopupWidgetDto.SwitchState.class, EnumJsonAdapter.create(AutoTopupWidgetDto.SwitchState.class).withUnknownFallback(null)).add(TransactionType.class, EnumJsonAdapter.create(TransactionType.class).withUnknownFallback(TransactionType.UNKNOWN)).add(YbCardStatusEntity.class, EnumJsonAdapter.create(YbCardStatusEntity.class).withUnknownFallback(YbCardStatusEntity.UNKNOWN)).add(SettingPropertyDto.Type.class, EnumJsonAdapter.create(SettingPropertyDto.Type.class).withUnknownFallback(SettingPropertyDto.Type.UNKNOWN)).add(TransferStatusDto.class, EnumJsonAdapter.create(TransferStatusDto.class).withUnknownFallback(TransferStatusDto.UNKNOWN)).add(RequestStatus.class, EnumJsonAdapter.create(RequestStatus.class).withUnknownFallback(RequestStatus.UNKNOWN)).add(CreditLimitPlansResponse.UpgradeStatus.class, EnumJsonAdapter.create(CreditLimitPlansResponse.UpgradeStatus.class).withUnknownFallback(CreditLimitPlansResponse.UpgradeStatus.DONT_SHOW_UPGRADE)).add(CreditLimitPlanPaymentIntervalType.class, EnumJsonAdapter.create(CreditLimitPlanPaymentIntervalType.class).withUnknownFallback(CreditLimitPlanPaymentIntervalType.MONTH)).add(CreditLimitPlanPaymentStatus.class, EnumJsonAdapter.create(CreditLimitPlanPaymentStatus.class).withUnknownFallback(CreditLimitPlanPaymentStatus.COMING)).add(AutoTopupTypeDto.class, EnumJsonAdapter.create(AutoTopupTypeDto.class).withUnknownFallback(AutoTopupTypeDto.UNKNOWN)).add(CardProductType.class, EnumJsonAdapter.create(CardProductType.class).withUnknownFallback(CardProductType.UNKNOWN)).add(CardTokenType.class, EnumJsonAdapter.create(CardTokenType.class).withUnknownFallback(CardTokenType.UNKNOWN)).add(CreditPaymentMethodTypeResponse.class, EnumJsonAdapter.create(CreditPaymentMethodTypeResponse.class).withUnknownFallback(CreditPaymentMethodTypeResponse.UNKNOWN)).add(ChangePhoneSendCodeResponse.SendStatus.class, EnumJsonAdapter.create(ChangePhoneSendCodeResponse.SendStatus.class).withUnknownFallback(ChangePhoneSendCodeResponse.SendStatus.UNKNOWN)).add(ChangePhoneApplicationStatusResponse.ChangePhoneStatus.class, EnumJsonAdapter.create(ChangePhoneApplicationStatusResponse.ChangePhoneStatus.class).withUnknownFallback(ChangePhoneApplicationStatusResponse.ChangePhoneStatus.UNKNOWN)).add(DeeplinkParamsFilter.class, EnumJsonAdapter.create(DeeplinkParamsFilter.class).withUnknownFallback(DeeplinkParamsFilter.UNKNOWN)).add(PaymentMethodProductType.class, EnumJsonAdapter.create(PaymentMethodProductType.class).withUnknownFallback(PaymentMethodProductType.UNKNOWN)).add(RebindPaymentMethodStatusDto.class, EnumJsonAdapter.create(RebindPaymentMethodStatusDto.class).withUnknownFallback(RebindPaymentMethodStatusDto.FAILED)).add(ProductTypeDto.class, EnumJsonAdapter.create(ProductTypeDto.class).withUnknownFallback(ProductTypeDto.OTHER)).add(NfcFailAction.class, EnumJsonAdapter.create(NfcFailAction.class).withUnknownFallback(NfcFailAction.UNKNOWN)).add(DefaultProductForDashboard.class, EnumJsonAdapter.create(DefaultProductForDashboard.class).withUnknownFallback(DefaultProductForDashboard.WALLET)).add(CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.class, EnumJsonAdapter.create(CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.class).withUnknownFallback(CardDeliveryStatusResponse.CardDeliveryInfo.CardDeliveryApplicationStatus.UNKNOWN)).add(EducationScrollType.class, EnumJsonAdapter.create(EducationScrollType.class).withUnknownFallback(EducationScrollType.UNKNOWN)).add(EducationScrollScreenEdge.class, EnumJsonAdapter.create(EducationScrollScreenEdge.class).withUnknownFallback(EducationScrollScreenEdge.UNKNOWN)).add(EducationScrollSnapPreference.class, EnumJsonAdapter.create(EducationScrollSnapPreference.class).withUnknownFallback(EducationScrollSnapPreference.UNKNOWN)).add((JsonAdapter.Factory) gra0.a).add((JsonAdapter.Factory) zbb0.a).add((JsonAdapter.Factory) zbb0.b).add((JsonAdapter.Factory) zbb0.c).add((JsonAdapter.Factory) zbb0.d).add((JsonAdapter.Factory) zbb0.e).add((JsonAdapter.Factory) zbb0.f).add((JsonAdapter.Factory) zbb0.g).add((JsonAdapter.Factory) zbb0.h).add(new PfmCalendarIso8601ZAdapter()).add((JsonAdapter.Factory) n80.a).add(RawJsonStringAdapter.a).add(CreateApplicationWithProductJsonAdapter.INSTANCE).add(JsonStringMapAdapter.a);
                trp0 trp0Var = trp0.a;
                return add.add((JsonAdapter.Factory) new cns0()).add(new TextAdapter(context)).add(RawSkeletonId.class, RawSkeletonIdAdapter.a).build();
            case 14:
                return new g6x(1, (f8v0) n3wVar.a);
            case 15:
                return new mjx0((ljx0) n3wVar.a);
            case 16:
                return qtb1.o((fup0) n3wVar.a);
            case 17:
                return new x631((h6r) n3wVar.a);
            case 18:
                return new ju51((ku51) n3wVar.a);
            default:
                return new ny51((oy51) n3wVar.a);
        }
    }

    public /* synthetic */ h90(Object obj, n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }
}
