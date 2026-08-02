package com.yandex.go.scooters.data.model;

import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import defpackage.auu0;
import defpackage.gef;
import defpackage.ief;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse.AlternativeOffer.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAlternativeOfferResponse$AlternativeOffer$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersAlternativeOfferResponse$AlternativeOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersAlternativeOfferResponse$AlternativeOffer$$serializer scootersAlternativeOfferResponse$AlternativeOffer$$serializer = new ScootersAlternativeOfferResponse$AlternativeOffer$$serializer();
        INSTANCE = scootersAlternativeOfferResponse$AlternativeOffer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse.AlternativeOffer", scootersAlternativeOfferResponse$AlternativeOffer$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("vehicle", true);
        pluginGeneratedSerialDescriptor.j("prices", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("scooter_image_tag", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersAlternativeOfferResponse$AlternativeOffer$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$$serializer.INSTANCE, ScootersAlternativeOfferResponse$AlternativeOffer$Prices$$serializer.INSTANCE, gef.a, auu0.a, ScootersAlternativeOfferResponse$AlternativeOffer$Button$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ScootersAlternativeOfferResponse.AlternativeOffer deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle vehicle = null;
        ScootersAlternativeOfferResponse.AlternativeOffer.Prices prices = null;
        ief iefVar = null;
        String str = null;
        ScootersAlternativeOfferResponse.AlternativeOffer.Button button = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                vehicle = (ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle) b.A(serialDescriptor, 0, ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$$serializer.INSTANCE, vehicle);
                i |= 1;
            } else if (v == 1) {
                prices = (ScootersAlternativeOfferResponse.AlternativeOffer.Prices) b.A(serialDescriptor, 1, ScootersAlternativeOfferResponse$AlternativeOffer$Prices$$serializer.INSTANCE, prices);
                i |= 2;
            } else if (v == 2) {
                iefVar = (ief) b.A(serialDescriptor, 2, gef.a, iefVar);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                button = (ScootersAlternativeOfferResponse.AlternativeOffer.Button) b.A(serialDescriptor, 4, ScootersAlternativeOfferResponse$AlternativeOffer$Button$$serializer.INSTANCE, button);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScootersAlternativeOfferResponse.AlternativeOffer(i, vehicle, prices, iefVar, str, button);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersAlternativeOfferResponse.AlternativeOffer value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle(0))) {
            b.e(serialDescriptor, 0, ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new ScootersAlternativeOfferResponse.AlternativeOffer.Prices(0))) {
            b.e(serialDescriptor, 1, ScootersAlternativeOfferResponse$AlternativeOffer$Prices$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, ief.e)) {
            b.e(serialDescriptor, 2, gef.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, new ScootersAlternativeOfferResponse.AlternativeOffer.Button(0))) {
            b.e(serialDescriptor, 4, ScootersAlternativeOfferResponse$AlternativeOffer$Button$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
