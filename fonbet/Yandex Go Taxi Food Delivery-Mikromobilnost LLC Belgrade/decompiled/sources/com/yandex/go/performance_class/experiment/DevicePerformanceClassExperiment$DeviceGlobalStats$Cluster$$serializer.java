package com.yandex.go.performance_class.experiment;

import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import defpackage.auu0;
import defpackage.e6m;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster.$serializer", "Luxs;", "Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer implements uxs {
    public static final DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer devicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer = new DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer();
        INSTANCE = devicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster", devicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("mean", true);
        pluginGeneratedSerialDescriptor.j("std", true);
        pluginGeneratedSerialDescriptor.j("weight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{auu0.a, e6mVar, e6mVar, e6mVar};
    }

    @Override // defpackage.myi
    public final DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                d2 = b.E(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                d3 = b.E(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster(i, str, d, d2, d3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DevicePerformanceClassExperiment.DeviceGlobalStats.Cluster value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "unknown")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || Double.compare(value.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, value.b);
        }
        if (b.F() || Double.compare(value.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, value.c);
        }
        if (b.F() || Double.compare(value.d, 0.0d) != 0) {
            b.E(serialDescriptor, 3, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
