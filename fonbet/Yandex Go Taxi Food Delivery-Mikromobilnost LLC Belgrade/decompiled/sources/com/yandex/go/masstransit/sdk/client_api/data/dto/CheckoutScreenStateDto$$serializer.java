package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class CheckoutScreenStateDto$$serializer implements uxs {
    public static final CheckoutScreenStateDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutScreenStateDto$$serializer checkoutScreenStateDto$$serializer = new CheckoutScreenStateDto$$serializer();
        INSTANCE = checkoutScreenStateDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto", checkoutScreenStateDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("trip_id", false);
        pluginGeneratedSerialDescriptor.j("debounce_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("elements", false);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("checkout_locked_until", true);
        pluginGeneratedSerialDescriptor.j("route_display_data", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        pluginGeneratedSerialDescriptor.j("user_agreement", true);
        pluginGeneratedSerialDescriptor.j("price_info", true);
        pluginGeneratedSerialDescriptor.j("payment_methods_info", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CheckoutScreenStateDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CheckoutScreenStateDto.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(h6w.a), i3yVarArr[2].getValue(), qke.n(NotificationDto$$serializer.INSTANCE), qke.n(auu0Var), qke.n(RouteDisplayDataDto$$serializer.INSTANCE), qke.n(ButtonFooterDto$$serializer.INSTANCE), qke.n(w7s.a), qke.n(PriceInfoDto$$serializer.INSTANCE), PaymentMethodsInfoDto$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final CheckoutScreenStateDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = CheckoutScreenStateDto.k;
        b.getClass();
        PaymentMethodsInfoDto paymentMethodsInfoDto = null;
        PriceInfoDto priceInfoDto = null;
        boolean z = true;
        FormattedText formattedText = null;
        int i = 0;
        String str = null;
        Integer num = null;
        List list = null;
        NotificationDto notificationDto = null;
        String str2 = null;
        RouteDisplayDataDto routeDisplayDataDto = null;
        ButtonFooterDto buttonFooterDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    notificationDto = (NotificationDto) b.s(serialDescriptor, 3, NotificationDto$$serializer.INSTANCE, notificationDto);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    routeDisplayDataDto = (RouteDisplayDataDto) b.s(serialDescriptor, 5, RouteDisplayDataDto$$serializer.INSTANCE, routeDisplayDataDto);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    buttonFooterDto = (ButtonFooterDto) b.s(serialDescriptor, 6, ButtonFooterDto$$serializer.INSTANCE, buttonFooterDto);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 7, w7s.a, formattedText);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    priceInfoDto = (PriceInfoDto) b.s(serialDescriptor, 8, PriceInfoDto$$serializer.INSTANCE, priceInfoDto);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    paymentMethodsInfoDto = (PaymentMethodsInfoDto) b.A(serialDescriptor, 9, PaymentMethodsInfoDto$$serializer.INSTANCE, paymentMethodsInfoDto);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new CheckoutScreenStateDto(i, str, num, list, notificationDto, str2, routeDisplayDataDto, buttonFooterDto, formattedText, priceInfoDto, paymentMethodsInfoDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CheckoutScreenStateDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutScreenStateDto.k;
        String str = value.a;
        PriceInfoDto priceInfoDto = value.i;
        FormattedText formattedText = value.h;
        ButtonFooterDto buttonFooterDto = value.g;
        RouteDisplayDataDto routeDisplayDataDto = value.f;
        String str2 = value.e;
        NotificationDto notificationDto = value.d;
        Integer num = value.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 1, h6w.a, num);
        }
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        if (b.F() || notificationDto != null) {
            b.g(serialDescriptor, 3, NotificationDto$$serializer.INSTANCE, notificationDto);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        if (b.F() || routeDisplayDataDto != null) {
            b.g(serialDescriptor, 5, RouteDisplayDataDto$$serializer.INSTANCE, routeDisplayDataDto);
        }
        if (b.F() || buttonFooterDto != null) {
            b.g(serialDescriptor, 6, ButtonFooterDto$$serializer.INSTANCE, buttonFooterDto);
        }
        if (b.F() || formattedText != null) {
            b.g(serialDescriptor, 7, w7s.a, formattedText);
        }
        if (b.F() || priceInfoDto != null) {
            b.g(serialDescriptor, 8, PriceInfoDto$$serializer.INSTANCE, priceInfoDto);
        }
        b.e(serialDescriptor, 9, PaymentMethodsInfoDto$$serializer.INSTANCE, value.j);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
