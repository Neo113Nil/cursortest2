package com.yandex.go.blur.experiments;

import com.yandex.go.blur.experiments.BlurConfigurationExperiment;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/blur/experiments/BlurConfigurationExperiment.SystemRenderEffect.$serializer", "Luxs;", "Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$SystemRenderEffect;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$SystemRenderEffect;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$SystemRenderEffect;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class BlurConfigurationExperiment$SystemRenderEffect$$serializer implements uxs {
    public static final BlurConfigurationExperiment$SystemRenderEffect$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BlurConfigurationExperiment$SystemRenderEffect$$serializer blurConfigurationExperiment$SystemRenderEffect$$serializer = new BlurConfigurationExperiment$SystemRenderEffect$$serializer();
        INSTANCE = blurConfigurationExperiment$SystemRenderEffect$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.blur.experiments.BlurConfigurationExperiment.SystemRenderEffect", blurConfigurationExperiment$SystemRenderEffect$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("supported", true);
        pluginGeneratedSerialDescriptor.j("uniform_blur_bitmap_masks_supported", true);
        pluginGeneratedSerialDescriptor.j("uniform_blur_bitmap_mask_downscale_default_multiplier", true);
        pluginGeneratedSerialDescriptor.j("progressive_blur_supported", true);
        pluginGeneratedSerialDescriptor.j("progressive_blur_max_segments", true);
        pluginGeneratedSerialDescriptor.j("progressive_blur_step_length", true);
        pluginGeneratedSerialDescriptor.j("minimum_device_performance_class", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BlurConfigurationExperiment$SystemRenderEffect$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) BlurConfigurationExperiment.SystemRenderEffect.h[6].getValue());
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, z96Var, h6wVar, z96Var, h6wVar, h6wVar, n};
    }

    @Override // defpackage.myi
    public final BlurConfigurationExperiment.SystemRenderEffect deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = BlurConfigurationExperiment.SystemRenderEffect.h;
        b.getClass();
        BlurConfigurationExperiment.SystemRenderEffect systemRenderEffect = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        BlurConfigurationExperiment.DevicePerformanceClass devicePerformanceClass = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z4 = b.C(serialDescriptor, 3);
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
                    devicePerformanceClass = (BlurConfigurationExperiment.DevicePerformanceClass) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), devicePerformanceClass);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return systemRenderEffect;
            }
            systemRenderEffect = null;
        }
        b.c(serialDescriptor);
        return new BlurConfigurationExperiment.SystemRenderEffect(i, z2, z3, i2, z4, i3, i4, devicePerformanceClass);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BlurConfigurationExperiment.SystemRenderEffect value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BlurConfigurationExperiment.SystemRenderEffect.h;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != 2) {
            b.A(2, value.c, serialDescriptor);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != 128) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || value.f != 64) {
            b.A(5, value.f, serialDescriptor);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
