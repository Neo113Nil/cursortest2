package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import defpackage.jxi;
import defpackage.nor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets.$serializer", "Luxs;", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer implements uxs {
    public static final SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer superAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer = new SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer();
        INSTANCE = superAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets", superAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("top", true);
        pluginGeneratedSerialDescriptor.j("bottom", true);
        pluginGeneratedSerialDescriptor.j("left", true);
        pluginGeneratedSerialDescriptor.j("right", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{norVar, norVar, norVar, norVar};
    }

    @Override // defpackage.myi
    public final SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f2 = b.y(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                f3 = b.y(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f4 = b.y(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets(f, f2, f3, f4, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(value.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, value.a);
        }
        if (b.F() || Float.compare(value.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, value.b);
        }
        if (b.F() || Float.compare(value.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, value.c);
        }
        if (b.F() || Float.compare(value.d, 0.0f) != 0) {
            b.z(serialDescriptor, 3, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
