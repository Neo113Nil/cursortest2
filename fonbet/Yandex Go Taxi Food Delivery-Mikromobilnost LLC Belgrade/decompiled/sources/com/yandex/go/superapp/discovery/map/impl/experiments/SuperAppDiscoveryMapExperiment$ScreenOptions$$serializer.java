package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment.ScreenOptions.$serializer", "Luxs;", "Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$ScreenOptions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$ScreenOptions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$ScreenOptions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperAppDiscoveryMapExperiment$ScreenOptions$$serializer implements uxs {
    public static final SuperAppDiscoveryMapExperiment$ScreenOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppDiscoveryMapExperiment$ScreenOptions$$serializer superAppDiscoveryMapExperiment$ScreenOptions$$serializer = new SuperAppDiscoveryMapExperiment$ScreenOptions$$serializer();
        INSTANCE = superAppDiscoveryMapExperiment$ScreenOptions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.ScreenOptions", superAppDiscoveryMapExperiment$ScreenOptions$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("map_style", true);
        pluginGeneratedSerialDescriptor.j("default_map_zoom", true);
        pluginGeneratedSerialDescriptor.j("settlement_focusing_config", true);
        pluginGeneratedSerialDescriptor.j("category_filters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppDiscoveryMapExperiment$ScreenOptions$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, nor.a, qke.n(SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer.INSTANCE), qke.n((KSerializer) SuperAppDiscoveryMapExperiment.ScreenOptions.e[3].getValue())};
    }

    @Override // defpackage.myi
    public final SuperAppDiscoveryMapExperiment.ScreenOptions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppDiscoveryMapExperiment.ScreenOptions.e;
        b.getClass();
        int i = 0;
        String str = null;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig = null;
        List list = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f = b.y(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                settlementFocusingConfig = (SuperAppDiscoveryMapExperiment.SettlementFocusingConfig) b.s(serialDescriptor, 2, SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer.INSTANCE, settlementFocusingConfig);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppDiscoveryMapExperiment.ScreenOptions(i, str, f, settlementFocusingConfig, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppDiscoveryMapExperiment.ScreenOptions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppDiscoveryMapExperiment.ScreenOptions.e;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || Float.compare(value.b, 12.0f) != 0) {
            b.z(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, SuperAppDiscoveryMapExperiment$SettlementFocusingConfig$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
