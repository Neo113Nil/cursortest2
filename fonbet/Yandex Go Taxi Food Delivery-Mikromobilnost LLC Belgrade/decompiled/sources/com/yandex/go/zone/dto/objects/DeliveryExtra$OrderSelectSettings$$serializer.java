package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.DeliveryExtra;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryExtra.OrderSelectSettings.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryExtra$OrderSelectSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class DeliveryExtra$OrderSelectSettings$$serializer implements uxs {
    public static final DeliveryExtra$OrderSelectSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryExtra$OrderSelectSettings$$serializer deliveryExtra$OrderSelectSettings$$serializer = new DeliveryExtra$OrderSelectSettings$$serializer();
        INSTANCE = deliveryExtra$OrderSelectSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryExtra.OrderSelectSettings", deliveryExtra$OrderSelectSettings$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("selector_overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryExtra$OrderSelectSettings$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(DeliveryExtra$OrderHeader$$serializer.INSTANCE), qke.n(DeliveryExtra$OrderSelectorOverrides$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final DeliveryExtra.OrderSelectSettings deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        DeliveryExtra.OrderHeader orderHeader = null;
        DeliveryExtra.OrderSelectorOverrides orderSelectorOverrides = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                orderHeader = (DeliveryExtra.OrderHeader) b.s(serialDescriptor, 0, DeliveryExtra$OrderHeader$$serializer.INSTANCE, orderHeader);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                orderSelectorOverrides = (DeliveryExtra.OrderSelectorOverrides) b.s(serialDescriptor, 1, DeliveryExtra$OrderSelectorOverrides$$serializer.INSTANCE, orderSelectorOverrides);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryExtra.OrderSelectSettings(i, orderHeader, orderSelectorOverrides);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DeliveryExtra.OrderSelectSettings value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, DeliveryExtra$OrderHeader$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, DeliveryExtra$OrderSelectorOverrides$$serializer.INSTANCE, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
