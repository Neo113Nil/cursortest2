package com.yandex.go.zone.dto.objects;

import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonOptions.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonOptions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonOptions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonOptions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class DeliveryPaidInsuranceScreenButtonOptions$$serializer implements uxs {
    public static final DeliveryPaidInsuranceScreenButtonOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryPaidInsuranceScreenButtonOptions$$serializer deliveryPaidInsuranceScreenButtonOptions$$serializer = new DeliveryPaidInsuranceScreenButtonOptions$$serializer();
        INSTANCE = deliveryPaidInsuranceScreenButtonOptions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButtonOptions", deliveryPaidInsuranceScreenButtonOptions$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("selected", true);
        pluginGeneratedSerialDescriptor.j("unselected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeliveryPaidInsuranceScreenButtonOptions$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        DeliveryPaidInsuranceScreenButton$$serializer deliveryPaidInsuranceScreenButton$$serializer = DeliveryPaidInsuranceScreenButton$$serializer.INSTANCE;
        return new KSerializer[]{deliveryPaidInsuranceScreenButton$$serializer, deliveryPaidInsuranceScreenButton$$serializer};
    }

    @Override // defpackage.myi
    public final DeliveryPaidInsuranceScreenButtonOptions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton = null;
        DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                deliveryPaidInsuranceScreenButton = (DeliveryPaidInsuranceScreenButton) b.A(serialDescriptor, 0, DeliveryPaidInsuranceScreenButton$$serializer.INSTANCE, deliveryPaidInsuranceScreenButton);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                deliveryPaidInsuranceScreenButton2 = (DeliveryPaidInsuranceScreenButton) b.A(serialDescriptor, 1, DeliveryPaidInsuranceScreenButton$$serializer.INSTANCE, deliveryPaidInsuranceScreenButton2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryPaidInsuranceScreenButtonOptions(i, deliveryPaidInsuranceScreenButton, deliveryPaidInsuranceScreenButton2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButton.e) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButton.e) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DeliveryPaidInsuranceScreenButtonOptions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton = value.a;
            DeliveryPaidInsuranceScreenButton.Companion.getClass();
        }
        b.e(serialDescriptor, 0, DeliveryPaidInsuranceScreenButton$$serializer.INSTANCE, value.a);
        if (!b.F()) {
            DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton2 = value.b;
            DeliveryPaidInsuranceScreenButton.Companion.getClass();
        }
        b.e(serialDescriptor, 1, DeliveryPaidInsuranceScreenButton$$serializer.INSTANCE, value.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
