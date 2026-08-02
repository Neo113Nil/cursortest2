package com.yandex.go.scooters.promotions.data.model;

import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse.ScootersTopBanner.$serializer", "Luxs;", "Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPromoblockResponse$ScootersTopBanner$$serializer implements uxs {
    public static final ScootersPromoblockResponse$ScootersTopBanner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersPromoblockResponse$ScootersTopBanner$$serializer scootersPromoblockResponse$ScootersTopBanner$$serializer = new ScootersPromoblockResponse$ScootersTopBanner$$serializer();
        INSTANCE = scootersPromoblockResponse$ScootersTopBanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse.ScootersTopBanner", scootersPromoblockResponse$ScootersTopBanner$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("communication", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersPromoblockResponse$ScootersTopBanner$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ScootersPromoblockResponse.ScootersTopBanner deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                topBannerCommunication = (ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication) b.A(serialDescriptor, 1, ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer.INSTANCE, topBannerCommunication);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScootersPromoblockResponse.ScootersTopBanner(i, str, topBannerCommunication);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersPromoblockResponse.ScootersTopBanner value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication(0))) {
            b.e(serialDescriptor, 1, ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$$serializer.INSTANCE, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
