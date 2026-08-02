package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto$$serializer;
import com.yandex.go.masstransit.sdk.core.dto.PaymentMethodDto;
import com.yandex.go.masstransit.sdk.core.dto.PaymentMethodDto$$serializer;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/orders/PaymentDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/PaymentDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/order/impl/orders/PaymentDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/order/impl/orders/PaymentDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class PaymentDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PaymentDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentDto$$serializer paymentDto$$serializer = new PaymentDto$$serializer();
        INSTANCE = paymentDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.order.impl.orders.PaymentDto", paymentDto$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("total_price", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a, MasstransitSlotItemDto$$serializer.INSTANCE, PaymentMethodDto$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final PaymentDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        MasstransitSlotItemDto masstransitSlotItemDto = null;
        PaymentMethodDto paymentMethodDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                masstransitSlotItemDto = (MasstransitSlotItemDto) b.A(serialDescriptor, 1, MasstransitSlotItemDto$$serializer.INSTANCE, masstransitSlotItemDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                paymentMethodDto = (PaymentMethodDto) b.A(serialDescriptor, 2, PaymentMethodDto$$serializer.INSTANCE, paymentMethodDto);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PaymentDto(i, formattedText, masstransitSlotItemDto, paymentMethodDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !nzs.t(0, value.a)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, new MasstransitSlotItemDto(0))) {
            b.e(serialDescriptor, 1, MasstransitSlotItemDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new PaymentMethodDto(0))) {
            b.e(serialDescriptor, 2, PaymentMethodDto$$serializer.INSTANCE, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
