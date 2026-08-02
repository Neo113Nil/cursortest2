package com.yandex.go.tariffcard.experiment;

import com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment;
import defpackage.h6w;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment.ShowPolicy.$serializer", "Luxs;", "Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment$ShowPolicy;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment$ShowPolicy;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment$ShowPolicy;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class RequirementsScrollButtonExperiment$ShowPolicy$$serializer implements uxs {
    public static final RequirementsScrollButtonExperiment$ShowPolicy$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequirementsScrollButtonExperiment$ShowPolicy$$serializer requirementsScrollButtonExperiment$ShowPolicy$$serializer = new RequirementsScrollButtonExperiment$ShowPolicy$$serializer();
        INSTANCE = requirementsScrollButtonExperiment$ShowPolicy$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment.ShowPolicy", requirementsScrollButtonExperiment$ShowPolicy$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("max_jump_count", true);
        pluginGeneratedSerialDescriptor.j("jump_interval_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RequirementsScrollButtonExperiment$ShowPolicy$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final RequirementsScrollButtonExperiment.ShowPolicy deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new RequirementsScrollButtonExperiment.ShowPolicy(i, i2, i3, i4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequirementsScrollButtonExperiment.ShowPolicy value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != 0) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || value.b != -1) {
            b.A(1, value.b, serialDescriptor);
        }
        if (b.F() || value.c != 0) {
            b.A(2, value.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
