package com.yandex.go.performance_class.experiment;

import com.adjust.sdk.Constants;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment.DynamicThresholds.$serializer", "Luxs;", "Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DynamicThresholds;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DynamicThresholds;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/performance_class/experiment/DevicePerformanceClassExperiment$DynamicThresholds;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class DevicePerformanceClassExperiment$DynamicThresholds$$serializer implements uxs {
    public static final DevicePerformanceClassExperiment$DynamicThresholds$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DevicePerformanceClassExperiment$DynamicThresholds$$serializer devicePerformanceClassExperiment$DynamicThresholds$$serializer = new DevicePerformanceClassExperiment$DynamicThresholds$$serializer();
        INSTANCE = devicePerformanceClassExperiment$DynamicThresholds$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment.DynamicThresholds", devicePerformanceClassExperiment$DynamicThresholds$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(Constants.LOW, true);
        pluginGeneratedSerialDescriptor.j("medium", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DevicePerformanceClassExperiment$DynamicThresholds$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer devicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer = DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer.INSTANCE;
        return new KSerializer[]{devicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer, devicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer};
    }

    @Override // defpackage.myi
    public final DevicePerformanceClassExperiment.DynamicThresholds deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold = null;
        DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dynamicThreshold = (DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold) b.A(serialDescriptor, 0, DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer.INSTANCE, dynamicThreshold);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                dynamicThreshold2 = (DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold) b.A(serialDescriptor, 1, DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer.INSTANCE, dynamicThreshold2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new DevicePerformanceClassExperiment.DynamicThresholds(i, dynamicThreshold, dynamicThreshold2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DevicePerformanceClassExperiment.DynamicThresholds value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        d dVar = DevicePerformanceClassExperiment.DynamicThresholds.Companion;
        boolean F = b.F();
        DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold = DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold.c;
        if (!F) {
            DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold2 = value.a;
            DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold.Companion.getClass();
        }
        b.e(serialDescriptor, 0, DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer.INSTANCE, value.a);
        if (!b.F()) {
            DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold3 = value.b;
            DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold.Companion.getClass();
        }
        b.e(serialDescriptor, 1, DevicePerformanceClassExperiment$DynamicThresholds$DynamicThreshold$$serializer.INSTANCE, value.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
