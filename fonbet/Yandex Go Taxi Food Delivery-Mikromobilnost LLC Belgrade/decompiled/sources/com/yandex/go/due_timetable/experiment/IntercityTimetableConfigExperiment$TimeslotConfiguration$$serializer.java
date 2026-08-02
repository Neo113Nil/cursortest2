package com.yandex.go.due_timetable.experiment;

import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.nor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment.TimeslotConfiguration.$serializer", "Luxs;", "Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment$TimeslotConfiguration;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment$TimeslotConfiguration;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment$TimeslotConfiguration;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer implements uxs {
    public static final IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer intercityTimetableConfigExperiment$TimeslotConfiguration$$serializer = new IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer();
        INSTANCE = intercityTimetableConfigExperiment$TimeslotConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment.TimeslotConfiguration", intercityTimetableConfigExperiment$TimeslotConfiguration$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("from", true);
        pluginGeneratedSerialDescriptor.j("to", true);
        pluginGeneratedSerialDescriptor.j("width", true);
        pluginGeneratedSerialDescriptor.j("multiplier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntercityTimetableConfigExperiment$TimeslotConfiguration$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final IntercityTimetableConfigExperiment.TimeslotConfiguration deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                num2 = (Integer) b.s(serialDescriptor, 1, h6w.a, num2);
                i |= 2;
            } else if (v == 2) {
                num3 = (Integer) b.s(serialDescriptor, 2, h6w.a, num3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f = (Float) b.s(serialDescriptor, 3, nor.a, f);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new IntercityTimetableConfigExperiment.TimeslotConfiguration(i, f, num, num2, num3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IntercityTimetableConfigExperiment.TimeslotConfiguration value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, h6w.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, h6w.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, nor.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
