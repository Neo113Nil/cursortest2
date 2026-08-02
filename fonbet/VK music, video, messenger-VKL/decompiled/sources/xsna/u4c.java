package xsna;

import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketCheckoutDeliveryOptionDto;
import com.vk.api.generated.market.dto.MarketCheckoutOrderDetailsPriceDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsActionDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsAddressCoordinatesDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsAddressDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsFormControlDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsPaymentInfoDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsPriceOptionDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsPriceOptionTooltipDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsSectionDto;
import com.vk.api.generated.market.dto.MarketCityWithCoordinatesDto;
import com.vk.api.generated.market.dto.MarketDeliveryPointWithGroupDto;
import com.vk.api.generated.market.dto.MarketDeliveryServiceDto;
import com.vk.api.generated.market.dto.MarketFormDropdownOptionDto;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentOptionsField;
import com.vk.ecomm.cart.impl.checkout.feature.state.c;
import com.vk.ecomm.cart.impl.checkout.feature.state.d;
import com.vk.ecomm.cart.impl.checkout.feature.state.e;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.tlo0;

/* compiled from: CheckoutDtoV2ToFormMapper.kt */
/* loaded from: classes18.dex */
public final class u4c {
    public final bpn0 a = new bpn0(new vg0(5));
    public final bpn0 b = new bpn0(new cu1(6));

    /* compiled from: CheckoutDtoV2ToFormMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketCheckoutSettingsFormControlDto.TypeDto.values().length];
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.COUNTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.CITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.TEXTAREA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PROMPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.HEADER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PLACEHOLDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.IMAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.DROPDOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.DELIVERY_OPTIONS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.CHECKBOX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PRICE_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.INFO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.GROUP_INFO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.ACTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.TEXT_INFO.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.ADDRESS_INPUT_SELF.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.ADDRESS_INPUT_COURIER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PAYMENT_OPTIONS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MarketCheckoutSettingsFormControlDto.TypeDto.PAYMENT_INFO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(MarketCheckoutSettingsFormControlDto marketCheckoutSettingsFormControlDto, String str) {
        String str2;
        String B = marketCheckoutSettingsFormControlDto.B();
        String str3 = B == null ? str : B;
        Boolean f = marketCheckoutSettingsFormControlDto.f();
        Boolean bool = Boolean.TRUE;
        boolean f2 = epx.f(f, bool);
        boolean f3 = epx.f(marketCheckoutSettingsFormControlDto.y0(), bool);
        String u = marketCheckoutSettingsFormControlDto.u();
        if (u == null) {
            u = "";
        }
        String str4 = u;
        String M = marketCheckoutSettingsFormControlDto.M();
        String l0 = marketCheckoutSettingsFormControlDto.l0();
        String v0 = marketCheckoutSettingsFormControlDto.v0();
        InputField.InputType inputType = null;
        Regex regex = v0 != null ? new Regex(v0) : null;
        String w0 = marketCheckoutSettingsFormControlDto.w0();
        String G = marketCheckoutSettingsFormControlDto.G();
        boolean z = marketCheckoutSettingsFormControlDto.a0() == MarketCheckoutSettingsFormControlDto.TypeDto.TEXT;
        MarketCheckoutSettingsFormControlDto.InputTypeDto p = marketCheckoutSettingsFormControlDto.p();
        if (p != null) {
            InputField.InputType.a aVar = InputField.InputType.Companion;
            String i = p.i();
            aVar.getClass();
            Iterator<E> it = InputField.InputType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                str2 = ((InputField.InputType) next).value;
                if (epx.f(str2, i)) {
                    inputType = next;
                    break;
                }
            }
            inputType = inputType;
        }
        return Collections.singletonList(new InputField(str3, f2, f3, str4, M, l0, regex, w0, null, null, G, z, null, inputType, 4864));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public final List a(MarketCheckoutSettingsFormControlDto marketCheckoutSettingsFormControlDto, String str) {
        c.a aVar;
        CourierAddress courierAddress;
        Coordinates coordinates;
        PaymentOptionsField.Option.Type type;
        PaymentOptionsField.Option option;
        String i;
        PaymentOptionsField.a aVar2;
        Object obj;
        Coordinates coordinates2 = null;
        r7 = null;
        PaymentInfoField.a aVar3 = null;
        PaymentOptionsField paymentOptionsField = null;
        ?? r7 = 0;
        ?? r72 = 0;
        coordinates2 = null;
        coordinates2 = null;
        coordinates2 = null;
        switch (a.$EnumSwitchMapping$0[marketCheckoutSettingsFormControlDto.a0().ordinal()]) {
            case 1:
                return b(marketCheckoutSettingsFormControlDto, str);
            case 2:
                return EmptyList.b;
            case 3:
                String B = marketCheckoutSettingsFormControlDto.B();
                String str2 = B == null ? str : B;
                Boolean f = marketCheckoutSettingsFormControlDto.f();
                Boolean bool = Boolean.TRUE;
                boolean f2 = epx.f(f, bool);
                MarketCityWithCoordinatesDto j = marketCheckoutSettingsFormControlDto.j();
                if (j != null) {
                    int id = j.getId();
                    String title = j.getTitle();
                    MarketCheckoutSettingsAddressCoordinatesDto d = j.d();
                    Float d2 = d != null ? d.d() : null;
                    MarketCheckoutSettingsAddressCoordinatesDto d3 = j.d();
                    Float e = d3 != null ? d3.e() : null;
                    if (d2 != null && e != null) {
                        float floatValue = e.floatValue();
                        float floatValue2 = d2.floatValue();
                        if (floatValue2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            coordinates2 = new Coordinates(floatValue2, floatValue);
                        }
                    }
                    aVar = new c.a(id, title, coordinates2);
                } else {
                    aVar = null;
                }
                boolean f3 = epx.f(marketCheckoutSettingsFormControlDto.y0(), bool);
                String u = marketCheckoutSettingsFormControlDto.u();
                return Collections.singletonList(new com.vk.ecomm.cart.impl.checkout.feature.state.c(str2, f2, aVar, f3, u == null ? "" : u, marketCheckoutSettingsFormControlDto.G(), marketCheckoutSettingsFormControlDto.M(), marketCheckoutSettingsFormControlDto.w0(), null));
            case 4:
                return b(marketCheckoutSettingsFormControlDto, str);
            case 5:
                return b(marketCheckoutSettingsFormControlDto, str);
            case 6:
                return b(marketCheckoutSettingsFormControlDto, str);
            case 7:
                String B2 = marketCheckoutSettingsFormControlDto.B();
                String str3 = B2 == null ? str : B2;
                Boolean f4 = marketCheckoutSettingsFormControlDto.f();
                Boolean bool2 = Boolean.TRUE;
                boolean f5 = epx.f(f4, bool2);
                String o = marketCheckoutSettingsFormControlDto.o();
                if (o == null) {
                    o = "";
                }
                String w0 = marketCheckoutSettingsFormControlDto.w0();
                if (w0 != null && w0.length() != 0) {
                    r5 = false;
                }
                String B3 = marketCheckoutSettingsFormControlDto.B();
                if (B3 == null) {
                    B3 = str;
                }
                boolean f6 = epx.f(marketCheckoutSettingsFormControlDto.f(), bool2);
                Boolean y0 = marketCheckoutSettingsFormControlDto.y0();
                boolean booleanValue = y0 != null ? y0.booleanValue() : false;
                String u2 = marketCheckoutSettingsFormControlDto.u();
                String str4 = u2 == null ? "" : u2;
                String M = marketCheckoutSettingsFormControlDto.M();
                String l0 = marketCheckoutSettingsFormControlDto.l0();
                String v0 = marketCheckoutSettingsFormControlDto.v0();
                return Collections.singletonList(new com.vk.ecomm.cart.impl.checkout.feature.state.h(str3, f5, o, r5, new InputField(B3, f6, booleanValue, str4, M, l0, v0 != null ? new Regex(v0) : null, marketCheckoutSettingsFormControlDto.w0(), marketCheckoutSettingsFormControlDto.n(), marketCheckoutSettingsFormControlDto.W(), marketCheckoutSettingsFormControlDto.G(), true, marketCheckoutSettingsFormControlDto.i(), null, 8192)));
            case 8:
                tlo0.a aVar4 = tlo0.Companion;
                String u3 = marketCheckoutSettingsFormControlDto.u();
                return Collections.singletonList(new qwu(str, marketCheckoutSettingsFormControlDto.Z(), oq.d(aVar4, u3 != null ? u3 : "")));
            case 9:
                return EmptyList.b;
            case 10:
                return EmptyList.b;
            case 11:
                List<MarketFormDropdownOptionDto> C = marketCheckoutSettingsFormControlDto.C();
                if (C != null) {
                    List<MarketFormDropdownOptionDto> list = C;
                    r72 = new ArrayList(c5g.u(list, 10));
                    for (MarketFormDropdownOptionDto marketFormDropdownOptionDto : list) {
                        r72.add(new e.a(marketFormDropdownOptionDto.getId(), marketFormDropdownOptionDto.getTitle(), marketFormDropdownOptionDto.d()));
                    }
                }
                if (r72 == 0) {
                    r72 = EmptyList.b;
                }
                List list2 = r72;
                if (list2.isEmpty()) {
                    return EmptyList.b;
                }
                String B4 = marketCheckoutSettingsFormControlDto.B();
                String str5 = B4 == null ? str : B4;
                Boolean f7 = marketCheckoutSettingsFormControlDto.f();
                Boolean bool3 = Boolean.TRUE;
                boolean f8 = epx.f(f7, bool3);
                boolean f9 = epx.f(marketCheckoutSettingsFormControlDto.y0(), bool3);
                String u4 = marketCheckoutSettingsFormControlDto.u();
                String str6 = u4 == null ? "" : u4;
                String G = marketCheckoutSettingsFormControlDto.G();
                String M2 = marketCheckoutSettingsFormControlDto.M();
                String R = marketCheckoutSettingsFormControlDto.R();
                if (R == null) {
                    R = marketCheckoutSettingsFormControlDto.w0();
                }
                return Collections.singletonList(new com.vk.ecomm.cart.impl.checkout.feature.state.e(str5, f8, f9, str6, list2, G, M2, R, null));
            case 12:
                String a2 = fo8.a(str, "_header");
                tlo0.a aVar5 = tlo0.Companion;
                String u5 = marketCheckoutSettingsFormControlDto.u();
                qwu qwuVar = new qwu(a2, marketCheckoutSettingsFormControlDto.Z(), oq.d(aVar5, u5 != null ? u5 : ""));
                List<MarketCheckoutDeliveryOptionDto> k = marketCheckoutSettingsFormControlDto.k();
                if (k == null || k.isEmpty()) {
                    return Collections.singletonList(qwuVar);
                }
                List<MarketCheckoutDeliveryOptionDto> k2 = marketCheckoutSettingsFormControlDto.k();
                ArrayList arrayList = new ArrayList(c5g.u(k2, 10));
                for (MarketCheckoutDeliveryOptionDto marketCheckoutDeliveryOptionDto : k2) {
                    arrayList.add(new d.a(marketCheckoutDeliveryOptionDto.getType(), marketCheckoutDeliveryOptionDto.getTitle(), marketCheckoutDeliveryOptionDto.e(), marketCheckoutDeliveryOptionDto.d()));
                }
                boolean f10 = epx.f(marketCheckoutSettingsFormControlDto.f(), Boolean.TRUE);
                String R2 = marketCheckoutSettingsFormControlDto.R();
                if (R2 == null) {
                    R2 = BuildConfig.FLAVOR;
                }
                return e43.l(qwuVar, new com.vk.ecomm.cart.impl.checkout.feature.state.d(str, R2, f10, arrayList));
            case 13:
                String str7 = str;
                String B5 = marketCheckoutSettingsFormControlDto.B();
                if (B5 != null) {
                    str7 = B5;
                }
                Boolean f11 = marketCheckoutSettingsFormControlDto.f();
                boolean booleanValue2 = f11 != null ? f11.booleanValue() : false;
                String u6 = marketCheckoutSettingsFormControlDto.u();
                return Collections.singletonList(new d0c(str7, booleanValue2, u6 != null ? u6 : "", epx.f(marketCheckoutSettingsFormControlDto.w0(), "1")));
            case 14:
                ListBuilder e2 = e43.e();
                List<MarketCheckoutOrderDetailsPriceDto> K = marketCheckoutSettingsFormControlDto.K();
                if (K != null) {
                    for (MarketCheckoutOrderDetailsPriceDto marketCheckoutOrderDetailsPriceDto : K) {
                        boolean f12 = epx.f(marketCheckoutOrderDetailsPriceDto.getType(), "discount");
                        String str8 = epx.f(marketCheckoutOrderDetailsPriceDto.getType(), X3.i.l) ? "price_row_total" : marketCheckoutOrderDetailsPriceDto.getTitle() + '_' + marketCheckoutOrderDetailsPriceDto.d().n();
                        String title2 = marketCheckoutOrderDetailsPriceDto.getTitle();
                        String e3 = marketCheckoutOrderDetailsPriceDto.e();
                        o6d0 o6d0Var = new o6d0(str8, title2, e3 == null ? "" : e3, marketCheckoutOrderDetailsPriceDto.d().n(), f12, epx.f(marketCheckoutOrderDetailsPriceDto.f(), Boolean.TRUE));
                        if (epx.f(marketCheckoutOrderDetailsPriceDto.getType(), X3.i.l) && !((Boolean) this.b.getValue()).booleanValue()) {
                            e2.add(new lki0(o6d0Var.a));
                        }
                        e2.add(o6d0Var);
                    }
                }
                return e2.g();
            case 15:
                return Collections.singletonList(new c26(str, marketCheckoutSettingsFormControlDto.w0(), "", true));
            case 16:
                String Z = marketCheckoutSettingsFormControlDto.Z();
                return Collections.singletonList(new c26(str, null, Z != null ? z23.c("(?m)^[ \t]*\r?\n", Z, "") : "", true));
            case 17:
                MarketCheckoutSettingsActionDto d4 = marketCheckoutSettingsFormControlDto.d();
                if (d4 == null) {
                    return EmptyList.b;
                }
                Boolean e4 = d4.e();
                boolean booleanValue3 = e4 != null ? e4.booleanValue() : false;
                Boolean f13 = d4.f();
                boolean booleanValue4 = f13 != null ? f13.booleanValue() : false;
                String title3 = d4.getTitle();
                ActionField.Type.a aVar6 = ActionField.Type.Companion;
                String i2 = d4.d().i();
                aVar6.getClass();
                ActionField.Type[] values = ActionField.Type.values();
                int length = values.length;
                int i3 = 0;
                while (i3 < length) {
                    ActionField.Type type2 = values[i3];
                    if (epx.f(type2.h(), i2)) {
                        return Collections.singletonList(new ActionField(str, booleanValue3, booleanValue4, title3, type2));
                    }
                    i3++;
                    booleanValue4 = booleanValue4;
                    booleanValue3 = booleanValue3;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            case 18:
                String Z2 = marketCheckoutSettingsFormControlDto.Z();
                return Collections.singletonList(new kio0(str, Z2 != null ? Z2 : ""));
            case 19:
                String B6 = marketCheckoutSettingsFormControlDto.B();
                String str9 = B6 == null ? str : B6;
                Boolean f14 = marketCheckoutSettingsFormControlDto.f();
                boolean booleanValue5 = f14 != null ? f14.booleanValue() : true;
                MarketDeliveryPointWithGroupDto l = marketCheckoutSettingsFormControlDto.l();
                DeliveryPoint b = l != null ? ((jwl) this.a.getValue()).b(l) : null;
                List<MarketDeliveryServiceDto> g = marketCheckoutSettingsFormControlDto.g();
                if (g != null) {
                    List<MarketDeliveryServiceDto> list3 = g;
                    r7 = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        r7.add(Integer.valueOf(((MarketDeliveryServiceDto) it.next()).getId()));
                    }
                }
                if (r7 == 0) {
                    r7 = EmptyList.b;
                }
                List list4 = r7;
                Boolean y02 = marketCheckoutSettingsFormControlDto.y0();
                boolean booleanValue6 = y02 != null ? y02.booleanValue() : false;
                String u7 = marketCheckoutSettingsFormControlDto.u();
                String str10 = u7 == null ? "" : u7;
                String w02 = marketCheckoutSettingsFormControlDto.w0();
                String str11 = w02 == null ? "" : w02;
                String G2 = marketCheckoutSettingsFormControlDto.G();
                String str12 = G2 == null ? "" : G2;
                String M3 = marketCheckoutSettingsFormControlDto.M();
                return Collections.singletonList(new com.vk.ecomm.cart.impl.checkout.feature.state.j(str9, booleanValue5, b, list4, new i7i0(str10, str11, str12, null, M3 == null ? "" : M3, booleanValue6)));
            case 20:
                String B7 = marketCheckoutSettingsFormControlDto.B();
                String str13 = B7 == null ? str : B7;
                Boolean f15 = marketCheckoutSettingsFormControlDto.f();
                boolean booleanValue7 = f15 != null ? f15.booleanValue() : true;
                MarketCheckoutSettingsAddressDto e5 = marketCheckoutSettingsFormControlDto.e();
                if (e5 != null) {
                    String title4 = e5.getTitle();
                    if (title4 == null) {
                        title4 = "";
                    }
                    Boolean e6 = e5.e();
                    boolean booleanValue8 = e6 != null ? e6.booleanValue() : false;
                    MarketCheckoutSettingsAddressCoordinatesDto d5 = e5.d();
                    if (d5 != null) {
                        Float d6 = d5.d();
                        double d7 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        double floatValue3 = d6 != null ? d6.floatValue() : 0.0d;
                        Float e7 = d5.e();
                        if (e7 != null) {
                            d7 = e7.floatValue();
                        }
                        coordinates = new Coordinates(floatValue3, d7);
                    } else {
                        coordinates = null;
                    }
                    courierAddress = new CourierAddress(title4, booleanValue8, coordinates);
                } else {
                    courierAddress = null;
                }
                Boolean y03 = marketCheckoutSettingsFormControlDto.y0();
                boolean booleanValue9 = y03 != null ? y03.booleanValue() : false;
                String u8 = marketCheckoutSettingsFormControlDto.u();
                String str14 = u8 == null ? "" : u8;
                String w03 = marketCheckoutSettingsFormControlDto.w0();
                String str15 = w03 == null ? "" : w03;
                String G3 = marketCheckoutSettingsFormControlDto.G();
                String str16 = G3 == null ? "" : G3;
                String M4 = marketCheckoutSettingsFormControlDto.M();
                i7i0 i7i0Var = new i7i0(str14, str15, str16, null, M4 == null ? "" : M4, booleanValue9);
                String v02 = marketCheckoutSettingsFormControlDto.v0();
                Regex regex = v02 != null ? new Regex(v02) : null;
                String l02 = marketCheckoutSettingsFormControlDto.l0();
                return Collections.singletonList(new com.vk.ecomm.cart.impl.checkout.feature.state.i(str13, booleanValue7, courierAddress, i7i0Var, regex, l02 == null ? "" : l02));
            case 21:
                List<MarketCheckoutSettingsPriceOptionDto> F = marketCheckoutSettingsFormControlDto.F();
                if (F == null) {
                    F = EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (MarketCheckoutSettingsPriceOptionDto marketCheckoutSettingsPriceOptionDto : F) {
                    PaymentOptionsField.Option.Type.a aVar7 = PaymentOptionsField.Option.Type.Companion;
                    MarketCheckoutSettingsPriceOptionDto.TypeDto f16 = marketCheckoutSettingsPriceOptionDto.f();
                    if (f16 == null || (i = f16.i()) == null) {
                        option = null;
                    } else {
                        aVar7.getClass();
                        PaymentOptionsField.Option.Type a3 = PaymentOptionsField.Option.Type.a.a(i);
                        String title5 = marketCheckoutSettingsPriceOptionDto.getTitle();
                        String str17 = title5 == null ? "" : title5;
                        String d8 = marketCheckoutSettingsPriceOptionDto.d();
                        String str18 = d8 == null ? "" : d8;
                        Boolean g2 = marketCheckoutSettingsPriceOptionDto.g();
                        boolean booleanValue10 = g2 != null ? g2.booleanValue() : false;
                        MarketCheckoutSettingsPriceOptionTooltipDto e8 = marketCheckoutSettingsPriceOptionDto.e();
                        if (e8 != null) {
                            String title6 = e8.getTitle();
                            if (title6 == null) {
                                title6 = "";
                            }
                            String e9 = e8.e();
                            if (e9 == null) {
                                e9 = "";
                            }
                            String d9 = e8.d();
                            if (d9 == null) {
                                d9 = "";
                            }
                            aVar2 = new PaymentOptionsField.a(title6, e9, d9);
                        } else {
                            aVar2 = null;
                        }
                        option = new PaymentOptionsField.Option(a3, str17, str18, booleanValue10, aVar2);
                    }
                    if (option != null) {
                        arrayList2.add(option);
                    }
                }
                String a4 = fo8.a(str, "_header");
                tlo0.a aVar8 = tlo0.Companion;
                String u9 = marketCheckoutSettingsFormControlDto.u();
                qwu qwuVar2 = new qwu(a4, marketCheckoutSettingsFormControlDto.Z(), oq.d(aVar8, u9 != null ? u9 : ""));
                List x = rdi.x(arrayList2);
                if (x != null) {
                    Boolean f17 = marketCheckoutSettingsFormControlDto.f();
                    boolean booleanValue11 = f17 != null ? f17.booleanValue() : true;
                    String T = marketCheckoutSettingsFormControlDto.T();
                    if (T != null) {
                        PaymentOptionsField.Option.Type.Companion.getClass();
                        type = PaymentOptionsField.Option.Type.a.a(T);
                    } else {
                        type = ((PaymentOptionsField.Option) j5g.Y(arrayList2)).a;
                    }
                    paymentOptionsField = new PaymentOptionsField(str, booleanValue11, x, type);
                }
                return rl3.I(new b7r[]{qwuVar2, paymentOptionsField, new lki0(str)});
            case 22:
                MarketCheckoutSettingsPaymentInfoDto D = marketCheckoutSettingsFormControlDto.D();
                if (D == null) {
                    return EmptyList.b;
                }
                PaymentInfoField.Type.a aVar9 = PaymentInfoField.Type.Companion;
                String type3 = D.getType();
                aVar9.getClass();
                Iterator it2 = PaymentInfoField.Type.h().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (epx.f(((PaymentInfoField.Type) obj).i(), type3)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                PaymentInfoField.Type type4 = (PaymentInfoField.Type) obj;
                if (type4 == null) {
                    return EmptyList.b;
                }
                Boolean f18 = marketCheckoutSettingsFormControlDto.f();
                boolean booleanValue12 = f18 != null ? f18.booleanValue() : false;
                String title7 = D.getTitle();
                MarketCheckoutSettingsPriceOptionTooltipDto d10 = D.d();
                if (d10 != null && (d10.getTitle() != null || d10.e() != null || d10.d() != null)) {
                    aVar3 = new PaymentInfoField.a(d10.getTitle(), d10.e(), d10.d());
                }
                return Collections.singletonList(new PaymentInfoField(str, booleanValue12, type4, title7, aVar3));
            default:
                return EmptyList.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap<String, b7r> c(List<MarketCheckoutSettingsSectionDto> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MarketCheckoutSettingsSectionDto marketCheckoutSettingsSectionDto : list) {
            String id = marketCheckoutSettingsSectionDto.getId();
            List<MarketCheckoutSettingsFormControlDto> d = marketCheckoutSettingsSectionDto.d();
            if (d.size() == 1) {
                arrayList.addAll(a((MarketCheckoutSettingsFormControlDto) j5g.Y(d), id));
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    g5g.y(a((MarketCheckoutSettingsFormControlDto) it.next(), id), arrayList3);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(((b7r) next).c(), next);
                }
                arrayList.add(new ppg0(id, linkedHashMap, false));
            }
            g5g.y(arrayList, arrayList2);
        }
        LinkedHashMap<String, b7r> linkedHashMap2 = new LinkedHashMap<>();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            linkedHashMap2.put(((b7r) next2).c(), next2);
        }
        return linkedHashMap2;
    }
}
