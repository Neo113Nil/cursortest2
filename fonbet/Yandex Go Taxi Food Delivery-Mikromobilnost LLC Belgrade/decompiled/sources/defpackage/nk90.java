package defpackage;

import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseStatusResponse;
import com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus;
import com.yandex.go.chargers.offer.passes.data.model.e;
import com.yandex.go.overdraft.data.model.DebtDetail$$serializer;
import com.yandex.go.overdraft.data.model.PayOrderParam;
import com.yandex.go.overdraft.data.model.PaymentInfo;
import com.yandex.go.overdraft.data.model.a0;
import com.yandex.go.overdraft.data.model.b0;
import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;
import com.yandex.go.payments.addmethod.data.model.k0;
import com.yandex.go.payments.paymentdomain.data.PaymentDomainRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.PaymentInfoDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.a;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.sdk.passport.PassportAdapterFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$ErrorPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$OpenUrlPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$PurchaseSuccessPaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$StatePaymentEvent;
import ru.yandex.taxi.plus.sdk.payments.web.g;
import ru.yandex.taxi.scooters.data.model.ScootersCard;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class nk90 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ nk90(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                e eVar = PassPurchaseStatusResponse.Companion;
                return PurchaseStatus.Companion.serializer();
            case 1:
                return ScootersCard.Companion.serializer();
            case 2:
                return ScootersPassesListServiceDto.Companion.serializer();
            case 3:
                try {
                    Object newInstance = PassportAdapterFactory.class.getConstructor(null).newInstance(null);
                    Method method = PassportAdapterFactory.class.getMethod("create", null);
                    if (cn90.class.isAssignableFrom(method.getReturnType())) {
                        return new bm50(23, method, newInstance);
                    }
                    return null;
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            case 4:
                return new oke(qoi0.a(q5o.class), null, new KSerializer[0]);
            case 5:
                return new p53(b0t.a, 0);
            case 6:
                return new p53(rax0.a, 0);
            case 7:
                return new k8u(auu0.a, mf31.a, 1);
            case 8:
                a0 a0Var = PayOrderParam.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 9:
                return vez0.g("ru.yandex.taxi.scooters.data.model.ScootersErrorCode", ScootersErrorCode.values(), new String[]{ResultType.RESULT_TYPE_FAILURE, "timeout", "connection_not_found", "internal_error", "success", "offer_expired", "card_not_allowed_by_restriction", "payment_required", "incorrect_car_position", "incorrect_scooter_position", "scooter_is_not_in_fix_finish_area", "user_have_rented_car", "car_is_busy", "deposit_fails", "required_deposit_is_not_held", "not_enough_charge", "too_close_destination", "too_far_destination", "bike_wheel_is_not_locked", "invalid_payment_method", "photo_verification_required", "photo_verification_with_passport_required", "check_verification_status", "pd_data_unfilled", "locked_resources_limit_enriched", "mos_ru_failed", "frauder", "no_funds", "resource_locked"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 10:
                return new yad0(new oed0(), new gdd0());
            case 11:
                com.yandex.go.payments.paymentdomain.data.e eVar2 = PaymentDomainRequestDto.Companion;
                return new p53(e6m.a, 0);
            case 12:
                uz90 uz90Var = PaymentEvent$ErrorPaymentEvent.Companion;
                return PaymentEvent$ErrorPaymentEvent.Action.Companion.serializer();
            case 13:
                uz90 uz90Var2 = PaymentEvent$ErrorPaymentEvent.Companion;
                return PaymentEvent$ErrorPaymentEvent.Type.Companion.serializer();
            case 14:
                return vez0.g("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.ErrorPaymentEvent.Action", PaymentEvent$ErrorPaymentEvent.Action.values(), new String[]{"close", "reload", null}, new Annotation[][]{null, null, null});
            case 15:
                return vez0.g("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.ErrorPaymentEvent.Type", PaymentEvent$ErrorPaymentEvent.Type.values(), new String[]{"fatal", "order", null}, new Annotation[][]{null, null, null});
            case 16:
                g gVar = PaymentEvent$OpenUrlPaymentEvent.UriInfo.Companion;
                return PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.Companion.serializer();
            case 17:
                return vez0.g("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.OpenUrlPaymentEvent.UriInfo.Type", PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.values(), new String[]{"system", "app", null}, new Annotation[][]{null, null, null});
            case 18:
                wz90 wz90Var = PaymentEvent$PurchaseSuccessPaymentEvent.Companion;
                return PaymentEvent$PurchaseSuccessPaymentEvent.Scenario.Companion.serializer();
            case 19:
                return vez0.g("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.PurchaseSuccessPaymentEvent.Scenario", PaymentEvent$PurchaseSuccessPaymentEvent.Scenario.values(), new String[]{"bundle", "purchase", "subscription", null}, new Annotation[][]{null, null, null, null});
            case 20:
                xz90 xz90Var = PaymentEvent$StatePaymentEvent.Companion;
                return PaymentEvent$StatePaymentEvent.Status.Companion.serializer();
            case 21:
                return vez0.g("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.StatePaymentEvent.Status", PaymentEvent$StatePaymentEvent.Status.values(), new String[]{"close", "loaded", null}, new Annotation[][]{null, null, null});
            case 22:
                return PaymentMethod$Type.Companion.serializer();
            case 23:
                b0 b0Var = PaymentInfo.Companion;
                return new p53(DebtDetail$$serializer.INSTANCE, 0);
            case 24:
                b0 b0Var2 = PaymentInfo.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 25:
                a aVar = PaymentInfoDto.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 26:
                return PaymentMethodType.Companion.serializer();
            case 27:
                k0 k0Var = PaymentMethodBindingStatusResponse.Companion;
                return PaymentMethodBindingStatusResponse.BindingStatus.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse.BindingStatus", PaymentMethodBindingStatusResponse.BindingStatus.values(), new String[]{"success", "fail", "processing", null}, new Annotation[][]{null, null, null, null});
            default:
                v6a0 v6a0Var = w6a0.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
