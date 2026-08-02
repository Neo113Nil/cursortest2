package com.yandex.go.payments.shared.details.experiments;

import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment.Screens.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment$Screens;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment$Screens;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/details/experiments/ForceZaloginForFamilyExperiment$Screens;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ForceZaloginForFamilyExperiment$Screens$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ForceZaloginForFamilyExperiment$Screens$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ForceZaloginForFamilyExperiment$Screens$$serializer forceZaloginForFamilyExperiment$Screens$$serializer = new ForceZaloginForFamilyExperiment$Screens$$serializer();
        INSTANCE = forceZaloginForFamilyExperiment$Screens$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment.Screens", forceZaloginForFamilyExperiment$Screens$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("order", true);
        pluginGeneratedSerialDescriptor.j("create", true);
        pluginGeneratedSerialDescriptor.j("invite", true);
        pluginGeneratedSerialDescriptor.j("default", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ForceZaloginForFamilyExperiment$Screens$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ForceZaloginForFamilyExperiment$Screen$$serializer forceZaloginForFamilyExperiment$Screen$$serializer = ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE;
        return new KSerializer[]{qke.n(forceZaloginForFamilyExperiment$Screen$$serializer), qke.n(forceZaloginForFamilyExperiment$Screen$$serializer), qke.n(forceZaloginForFamilyExperiment$Screen$$serializer), qke.n(forceZaloginForFamilyExperiment$Screen$$serializer)};
    }

    @Override // defpackage.myi
    public final ForceZaloginForFamilyExperiment.Screens deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ForceZaloginForFamilyExperiment.Screen screen = null;
        ForceZaloginForFamilyExperiment.Screen screen2 = null;
        ForceZaloginForFamilyExperiment.Screen screen3 = null;
        ForceZaloginForFamilyExperiment.Screen screen4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                screen = (ForceZaloginForFamilyExperiment.Screen) b.s(serialDescriptor, 0, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, screen);
                i |= 1;
            } else if (v == 1) {
                screen2 = (ForceZaloginForFamilyExperiment.Screen) b.s(serialDescriptor, 1, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, screen2);
                i |= 2;
            } else if (v == 2) {
                screen3 = (ForceZaloginForFamilyExperiment.Screen) b.s(serialDescriptor, 2, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, screen3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                screen4 = (ForceZaloginForFamilyExperiment.Screen) b.s(serialDescriptor, 3, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, screen4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ForceZaloginForFamilyExperiment.Screens(i, screen, screen2, screen3, screen4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ForceZaloginForFamilyExperiment.Screens value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ForceZaloginForFamilyExperiment$Screen$$serializer.INSTANCE, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
