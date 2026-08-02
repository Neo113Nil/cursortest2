package com.yandex.go.fallback_experiment.network;

import com.yandex.go.fallback_experiment.network.FallbackExperimentParam;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/fallback_experiment/network/FallbackExperimentParam.$serializer", "Luxs;", "Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class FallbackExperimentParam$$serializer implements uxs {
    public static final FallbackExperimentParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FallbackExperimentParam$$serializer fallbackExperimentParam$$serializer = new FallbackExperimentParam$$serializer();
        INSTANCE = fallbackExperimentParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.fallback_experiment.network.FallbackExperimentParam", fallbackExperimentParam$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("point_a", false);
        pluginGeneratedSerialDescriptor.j("geo_position", false);
        pluginGeneratedSerialDescriptor.j("scenario_name", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FallbackExperimentParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        FallbackExperimentParam$Point$$serializer fallbackExperimentParam$Point$$serializer = FallbackExperimentParam$Point$$serializer.INSTANCE;
        return new KSerializer[]{qke.n(fallbackExperimentParam$Point$$serializer), qke.n(fallbackExperimentParam$Point$$serializer), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final FallbackExperimentParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FallbackExperimentParam.Point point = null;
        FallbackExperimentParam.Point point2 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                point = (FallbackExperimentParam.Point) b.s(serialDescriptor, 0, FallbackExperimentParam$Point$$serializer.INSTANCE, point);
                i |= 1;
            } else if (v == 1) {
                point2 = (FallbackExperimentParam.Point) b.s(serialDescriptor, 1, FallbackExperimentParam$Point$$serializer.INSTANCE, point2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new FallbackExperimentParam(i, point, point2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FallbackExperimentParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        FallbackExperimentParam$Point$$serializer fallbackExperimentParam$Point$$serializer = FallbackExperimentParam$Point$$serializer.INSTANCE;
        b.g(serialDescriptor, 0, fallbackExperimentParam$Point$$serializer, value.a);
        b.g(serialDescriptor, 1, fallbackExperimentParam$Point$$serializer, value.b);
        b.g(serialDescriptor, 2, auu0.a, value.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
