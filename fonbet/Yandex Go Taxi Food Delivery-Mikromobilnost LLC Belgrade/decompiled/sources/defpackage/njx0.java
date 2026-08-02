package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevel$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class njx0 implements uxs {
    public static final njx0 a;
    private static final SerialDescriptor descriptor;

    static {
        njx0 njx0Var = new njx0();
        a = njx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.tariffs.model.TariffOverride", njx0Var, 3);
        pluginGeneratedSerialDescriptor.j("service_level", true);
        pluginGeneratedSerialDescriptor.j("base_service_level_class", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ServiceLevel$$serializer.INSTANCE, auu0.a, sjx0.e};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ServiceLevel serviceLevel = null;
        String str = null;
        rjx0 rjx0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                serviceLevel = (ServiceLevel) b.A(serialDescriptor, 0, ServiceLevel$$serializer.INSTANCE, serviceLevel);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                rjx0Var = (rjx0) b.A(serialDescriptor, 2, sjx0.e, rjx0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pjx0(i, serviceLevel, str, rjx0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pjx0 pjx0Var = (pjx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(pjx0Var.a, new ServiceLevel(0))) {
            b.e(serialDescriptor, 0, ServiceLevel$$serializer.INSTANCE, pjx0Var.a);
        }
        if (b.F() || !jl40.l(pjx0Var.b, "")) {
            b.o(serialDescriptor, 1, pjx0Var.b);
        }
        if (b.F() || !jl40.l(pjx0Var.c, x121.INSTANCE)) {
            b.e(serialDescriptor, 2, sjx0.e, pjx0Var.c);
        }
        b.c(serialDescriptor);
    }
}
