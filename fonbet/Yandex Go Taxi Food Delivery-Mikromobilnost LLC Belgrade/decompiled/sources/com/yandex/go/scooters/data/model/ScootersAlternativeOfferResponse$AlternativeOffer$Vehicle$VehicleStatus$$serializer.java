package com.yandex.go.scooters.data.model;

import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer scootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer = new ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer();
        INSTANCE = scootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus", scootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("charge_level", true);
        pluginGeneratedSerialDescriptor.j("remaining_distance", true);
        pluginGeneratedSerialDescriptor.j("remaining_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, nor.a, pnz.a};
    }

    @Override // defpackage.myi
    public final ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f = b.y(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus(i, i2, f, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != 0) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || Float.compare(value.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != 0) {
            b.s(serialDescriptor, 2, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
