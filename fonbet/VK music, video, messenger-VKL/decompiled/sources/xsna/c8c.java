package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.market.dto.MarketSetCheckoutSettingsDeliveryOptionDto;
import com.vk.api.generated.market.dto.MarketSetCheckoutSettingsPaymentOptionDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.checkout.feature.data.model.CheckoutSettingsAddressDto;
import com.vk.ecomm.cart.impl.checkout.feature.data.model.CheckoutSettingsCoordinatesDto;
import com.vk.ecomm.cart.impl.checkout.feature.data.model.CheckoutSettingsDeliveryPointIdDto;
import com.vk.ecomm.cart.impl.checkout.feature.state.CheckoutPaymentType;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.internal.api.GsonHolder;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: CheckoutRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class c8c implements b8c {
    public final yd10 a;
    public final bpn0 b = new bpn0(new com.vk.movika.sdk.base.ui.v(7));
    public final bpn0 c = new bpn0(new ek(5));
    public final bpn0 d = new bpn0(new t61(9));
    public final bpn0 e = new bpn0(new hy2(4));

    /* compiled from: CheckoutRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutPaymentType.values().length];
            try {
                iArr[CheckoutPaymentType.NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentType.IN_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c8c(yd10 yd10Var) {
        this.a = yd10Var;
    }

    @Override // xsna.b8c
    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, Long l, boolean z) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        HashMap d = fVar.d(z);
        Iterator<E> it = MarketSetCheckoutSettingsDeliveryOptionDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((MarketSetCheckoutSettingsDeliveryOptionDto) obj).j(), d.get("delivery_options"))) {
                break;
            }
        }
        MarketSetCheckoutSettingsDeliveryOptionDto marketSetCheckoutSettingsDeliveryOptionDto = (MarketSetCheckoutSettingsDeliveryOptionDto) obj;
        if (marketSetCheckoutSettingsDeliveryOptionDto == null) {
            marketSetCheckoutSettingsDeliveryOptionDto = MarketSetCheckoutSettingsDeliveryOptionDto.DEFAULT;
        }
        Iterator<E> it2 = MarketSetCheckoutSettingsPaymentOptionDto.i().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (epx.f(((MarketSetCheckoutSettingsPaymentOptionDto) obj2).j(), d.get("payment_options"))) {
                break;
            }
        }
        MarketSetCheckoutSettingsPaymentOptionDto marketSetCheckoutSettingsPaymentOptionDto = (MarketSetCheckoutSettingsPaymentOptionDto) obj2;
        Object obj3 = d.get(RTCStatsConstants.KEY_ADDRESS);
        CourierAddress courierAddress = obj3 instanceof CourierAddress ? (CourierAddress) obj3 : null;
        if (courierAddress != null) {
            Gson a2 = GsonHolder.a();
            ((k4c) this.c.getValue()).getClass();
            String str3 = courierAddress.b;
            Coordinates coordinates = courierAddress.d;
            str = a2.toJson(new CheckoutSettingsAddressDto(str3, coordinates != null ? new CheckoutSettingsCoordinatesDto((float) coordinates.b, (float) coordinates.c) : null, courierAddress.c));
        } else {
            str = null;
        }
        Object obj4 = d.get("service_delivery_point");
        DeliveryPointId deliveryPointId = obj4 instanceof DeliveryPointId ? (DeliveryPointId) obj4 : null;
        if (deliveryPointId != null) {
            Gson a3 = GsonHolder.a();
            ((o4c) this.d.getValue()).getClass();
            str2 = a3.toJson(new CheckoutSettingsDeliveryPointIdDto(deliveryPointId.b, deliveryPointId.c, deliveryPointId.d));
        } else {
            str2 = null;
        }
        Object obj5 = d.get("city_id");
        Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
        Object obj6 = d.get("name");
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = d.get("surname");
        String str5 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = d.get("patronymic");
        String str6 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = d.get("user_phone");
        String str7 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = d.get("phone_prompt");
        Boolean bool = obj10 instanceof Boolean ? (Boolean) obj10 : null;
        Object obj11 = d.get("user_comment");
        String str8 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = d.get("courier_delivery_area");
        String str9 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = d.get("entrance");
        String str10 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = d.get("door_code");
        String str11 = obj14 instanceof String ? (String) obj14 : null;
        Object obj15 = d.get("floor");
        String str12 = obj15 instanceof String ? (String) obj15 : null;
        Object obj16 = d.get("flat");
        String str13 = obj16 instanceof String ? (String) obj16 : null;
        Object obj17 = d.get("promo_code");
        String str14 = obj17 instanceof String ? (String) obj17 : null;
        Object obj18 = d.get("fiscal_email");
        String str15 = obj18 instanceof String ? (String) obj18 : null;
        this.a.getClass();
        tfx tfxVar = new tfx("market.setCheckoutSettings", new nq(15), new oq(17));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "delivery_option", marketSetCheckoutSettingsDeliveryOptionDto.j(), 0, 0, 12);
        if (l != null) {
            tfx.m(tfxVar, "item_id", l.longValue(), 0L, 8);
        }
        if (num != null) {
            tfx.l(tfxVar, "city_id", num.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "service_delivery_point", str2, 0, 0, 12);
            tfxVar = tfxVar;
        }
        if (str4 != null) {
            tfx.o(tfxVar, "name", str4, 0, 100, 4);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "surname", str5, 0, 100, 4);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "patronymic", str6, 0, 100, 4);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "user_phone", str7, 0, 20, 4);
        }
        if (bool != null) {
            tfxVar.j("phone_prompt", bool.booleanValue());
        }
        if (str8 != null) {
            tfx.o(tfxVar, "user_comment", str8, 0, 800, 4);
        }
        if (str9 != null) {
            tfx.o(tfxVar, "courier_delivery_area", str9, 0, 8, 4);
        }
        if (str10 != null) {
            tfx.o(tfxVar, "entrance", str10, 0, 100, 4);
        }
        if (str11 != null) {
            tfx.o(tfxVar, "door_code", str11, 0, 16, 4);
        }
        if (str12 != null) {
            tfx.o(tfxVar, "floor", str12, 0, 8, 4);
        }
        if (str13 != null) {
            tfx.o(tfxVar, "flat", str13, 0, 8, 4);
        }
        if (str14 != null) {
            tfx.o(tfxVar, "promo_code", str14, 0, 64, 4);
        }
        if (str15 != null) {
            tfx.o(tfxVar, "fiscal_email", str15, 0, 100, 4);
        }
        if (marketSetCheckoutSettingsPaymentOptionDto != null) {
            tfx.o(tfxVar, "payment_option", marketSetCheckoutSettingsPaymentOptionDto.j(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, RTCStatsConstants.KEY_ADDRESS, str, 0, 800, 4);
        }
        return c(tfxVar);
    }

    @Override // xsna.b8c
    public final io.reactivex.rxjava3.internal.operators.single.y b(UserId userId, Long l) {
        this.a.getClass();
        tfx tfxVar = new tfx("market.getCart", new oq(18), new xq(22));
        tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        if (l != null) {
            tfx.m(tfxVar, "item_id", l.longValue(), 0L, 8);
        }
        tfxVar.j("extended", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new ux0(new y90(8), 12));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y c(xy2 xy2Var) {
        return rsg0.w0(yfb.x(xy2Var)).l(new rx0(new com.vk.channels.impl.channel_screen.send_msg.e(1, (u4c) this.b.getValue(), u4c.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketCheckoutSettingsDto;)Lcom/vk/ecomm/cart/impl/checkout/feature/state/Form;", 0, 6), 6));
    }
}
