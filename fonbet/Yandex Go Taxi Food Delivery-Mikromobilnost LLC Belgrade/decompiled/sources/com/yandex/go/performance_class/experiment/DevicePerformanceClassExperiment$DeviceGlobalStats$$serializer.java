package com.yandex.go.performance_class.experiment;

import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import defpackage.e6m;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment.DeviceGlobalStats.$serializer", "Luxs;", "Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DeviceGlobalStats;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class DevicePerformanceClassExperiment$DeviceGlobalStats$$serializer implements uxs {
    public static final DevicePerformanceClassExperiment$DeviceGlobalStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DevicePerformanceClassExperiment$DeviceGlobalStats$$serializer devicePerformanceClassExperiment$DeviceGlobalStats$$serializer = new DevicePerformanceClassExperiment$DeviceGlobalStats$$serializer();
        INSTANCE = devicePerformanceClassExperiment$DeviceGlobalStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment.DeviceGlobalStats", devicePerformanceClassExperiment$DeviceGlobalStats$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("cpu_count_weight", true);
        pluginGeneratedSerialDescriptor.j("cpu_freq_weight", true);
        pluginGeneratedSerialDescriptor.j("ram_weight", true);
        pluginGeneratedSerialDescriptor.j("min_cpu_count", true);
        pluginGeneratedSerialDescriptor.j("max_cpu_count", true);
        pluginGeneratedSerialDescriptor.j("min_cpu_freq", true);
        pluginGeneratedSerialDescriptor.j("max_cpu_freq", true);
        pluginGeneratedSerialDescriptor.j("min_ram", true);
        pluginGeneratedSerialDescriptor.j("max_ram", true);
        pluginGeneratedSerialDescriptor.j("clusters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DevicePerformanceClassExperiment$DeviceGlobalStats$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DevicePerformanceClassExperiment.DeviceGlobalStats.k;
        e6m e6mVar = e6m.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{e6mVar, e6mVar, e6mVar, h6wVar, h6wVar, h6wVar, h6wVar, h6wVar, h6wVar, i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final DevicePerformanceClassExperiment.DeviceGlobalStats deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DevicePerformanceClassExperiment.DeviceGlobalStats.k;
        b.getClass();
        DevicePerformanceClassExperiment.DeviceGlobalStats deviceGlobalStats = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        List list = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    d = b.E(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d2 = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d3 = b.E(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i5 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i6 = b.h(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i7 = b.h(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return deviceGlobalStats;
            }
            deviceGlobalStats = null;
        }
        b.c(serialDescriptor);
        return new DevicePerformanceClassExperiment.DeviceGlobalStats(i, d, d2, d3, i2, i3, i4, i5, i6, i7, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DevicePerformanceClassExperiment.DeviceGlobalStats value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DevicePerformanceClassExperiment.DeviceGlobalStats.k;
        if (b.F() || Double.compare(value.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, value.a);
        }
        if (b.F() || Double.compare(value.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, value.b);
        }
        if (b.F() || Double.compare(value.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != 0) {
            b.A(3, value.d, serialDescriptor);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || value.f != 0) {
            b.A(5, value.f, serialDescriptor);
        }
        if (b.F() || value.g != 0) {
            b.A(6, value.g, serialDescriptor);
        }
        if (b.F() || value.h != 0) {
            b.A(7, value.h, serialDescriptor);
        }
        if (b.F() || value.i != 0) {
            b.A(8, value.i, serialDescriptor);
        }
        if (b.F() || !jl40.l(value.j, EmptyList.a)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), value.j);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
