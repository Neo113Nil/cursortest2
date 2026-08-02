package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.e6m;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment.SettlementFocusingConfig.$serializer", "Luxs;", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SettlementFocusingConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SettlementFocusingConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SettlementFocusingConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer implements uxs {
    public static final SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer superAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer = new SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer();
        INSTANCE = superAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.SettlementFocusingConfig", superAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("settlement_focusing_timeout", true);
        pluginGeneratedSerialDescriptor.j("bbox_zoom_in_factor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, pnz.a, qke.n(e6m.a)};
    }

    @Override // defpackage.myi
    public final SuperAppDiscoveryMapExperiment.SettlementFocusingConfig deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        long j = 0;
        Double d = null;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z2 = false;
            } else if (v == 0) {
                z = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppDiscoveryMapExperiment.SettlementFocusingConfig(i, z, j, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppDiscoveryMapExperiment.SettlementFocusingConfig value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != 0) {
            b.s(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, e6m.a, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
