package defpackage;

import android.database.CursorWindow;
import com.yandex.go.chargers.data.model.ChargersAttributeDto$$serializer;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto$ProgressDiscountPerkDto$$serializer;
import com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.s0;
import com.yandex.go.chargers.subscription.data.model.ChargersActiveSubscriptionDto$$serializer;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionButtonDto$$serializer;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionTermItemDto$$serializer;
import com.yandex.go.chargers.subscription.data.model.l;
import com.yandex.go.chargers.subscription.data.model.o;
import com.yandex.go.chargers.subscription.data.model.p;
import com.yandex.go.chargers.subscription.data.model.q;
import com.yandex.go.chargers.subscription.data.model.s;
import com.yandex.go.chargers.surge.data.ChargersSurgeInfoItemDto$$serializer;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import com.yandex.go.chargers.surge.data.c;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffBlockDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffBlockDto$$serializer;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto$$serializer;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.b;
import com.yandex.go.chargers.tariff_item_info.api.data.model.d;
import com.yandex.go.chargers.tariff_item_info.api.data.model.g;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceParam;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceResponse;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceResponse$Point$$serializer;
import com.yandex.go.taxi.order.change.source.data.f;
import com.yandex.go.taxi.order.models.api.response.CheckInAction;
import com.yandex.go.taxi.order.models.api.response.CheckInActionType;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.CheckInZone$$serializer;
import com.yandex.go.taxi.order.models.api.response.u;
import com.yandex.go.taxi.order.models.api.response.v;
import com.yandex.messaging.input.ChatInputEditText;
import com.yandex.payment.common.result.ResultType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Condition;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class eua implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ eua(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i;
        boolean markdownInInputFeatureState$lambda$0;
        switch (this.a) {
            case 0:
                l lVar = ChargersSubscriptionListResponseDto.Companion;
                return new p53(ChargersActiveSubscriptionDto$$serializer.INSTANCE, 0);
            case 1:
                o oVar = ChargersSubscriptionResponseDto.Companion;
                return new p53(ChargersSubscriptionTermItemDto$$serializer.INSTANCE, 0);
            case 2:
                o oVar2 = ChargersSubscriptionResponseDto.Companion;
                return new p53(ChargersSubscriptionButtonDto$$serializer.INSTANCE, 0);
            case 3:
                return new o4o("com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusActionDto.ChargersDiscovery", p.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusActionDto.ChargersSubscription", q.INSTANCE, new Annotation[0]);
            case 5:
                return new o4o("com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusActionDto.Unknown", s.INSTANCE, new Annotation[0]);
            case 6:
                c cVar = ChargersSurgeModalDto.Companion;
                return new p53(ChargersSurgeInfoItemDto$$serializer.INSTANCE, 0);
            case 7:
                b bVar = ChargersTariffBlockDto.Companion;
                return new p53(ChargersTariffDetailItemDto$$serializer.INSTANCE, 0);
            case 8:
                d dVar = ChargersTariffDetailItemDto.Companion;
                return ChargersTariffDetailItemDto.Type.Companion.serializer();
            case 9:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto.ChargersTariffDetailActionDto.OpenSurgeModalAction", ywa.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto.ChargersTariffDetailActionDto.ShowHiddenLinesAction", axa.INSTANCE, new Annotation[0]);
            case 11:
                return new o4o("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto.ChargersTariffDetailActionDto.Unknown", bxa.INSTANCE, new Annotation[0]);
            case 12:
                return vez0.g("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto.Type", ChargersTariffDetailItemDto.Type.values(), new String[]{"tariff_detail", "tariff_detail_with_top_divider"}, new Annotation[][]{null, null});
            case 13:
                g gVar = ChargersTariffDto.Companion;
                return new p53(ChargersAttributeDto$$serializer.INSTANCE, 0);
            case 14:
                g gVar2 = ChargersTariffDto.Companion;
                return new p53(ChargersTariffBlockDto$$serializer.INSTANCE, 0);
            case 15:
                s0 s0Var = ChargersTaskDiscountDetailsDto.Companion;
                return new p53(ChargersProgressDiscountDetailsDto$ProgressDiscountPerkDto$$serializer.INSTANCE, 0);
            case 16:
                markdownInInputFeatureState$lambda$0 = ChatInputEditText.getMarkdownInInputFeatureState$lambda$0();
                return Boolean.valueOf(markdownInInputFeatureState$lambda$0);
            case 17:
                q7b q7bVar = r7b.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(qke.n(auu0Var), qke.n(auu0Var), 1);
            case 18:
                try {
                    Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                    declaredField.setAccessible(true);
                    i = declaredField.getInt(null);
                } catch (Throwable unused) {
                    i = -1;
                }
                return Integer.valueOf(i);
            case 19:
                f fVar = CheckChangeSourceParam.Companion;
                return new p53(b0t.a, 0);
            case 20:
                com.yandex.go.taxi.order.change.source.data.g gVar3 = CheckChangeSourceResponse.Companion;
                return new p53(CheckChangeSourceResponse$Point$$serializer.INSTANCE, 0);
            case 21:
                u uVar = CheckInAction.Companion;
                return CheckInActionType.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.CheckInActionType", CheckInActionType.values(), new String[]{"qr_code", "button", "slider"}, new Annotation[][]{null, null, null});
            case 23:
                v vVar = CheckInInfo.Companion;
                return new p53(CheckInZone$$serializer.INSTANCE, 0);
            case 24:
                return CheckPaymentResponse$Result.Companion.serializer();
            case 25:
                return CheckPaymentResponse$Condition.Companion.serializer();
            case 26:
                return vez0.g("ru.yandex.taxi.eatskit.dto.CheckPaymentResponse.Condition", CheckPaymentResponse$Condition.values(), new String[]{TopupFragment.WEBVIEW_NAME, "identification", "kyc"}, new Annotation[][]{null, null, null});
            case 27:
                return vez0.g("ru.yandex.taxi.eatskit.dto.CheckPaymentResponse.Result", CheckPaymentResponse$Result.values(), new String[]{"allowed", "denied"}, new Annotation[][]{null, null});
            case 28:
                return vez0.g("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto", CheckoutOrderStatusDto.values(), new String[]{ResultType.RESULT_TYPE_FAILURE, "success", "processing"}, new Annotation[][]{null, null, null});
            default:
                e eVar = CheckoutResponse.CheckoutPaymentMethods.Companion;
                return CheckoutResponse.CheckoutPaymentMethods.Source.Companion.serializer();
        }
    }
}
