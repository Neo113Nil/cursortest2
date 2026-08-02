package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class lmx0 implements uxs {
    public static final lmx0 a;
    private static final SerialDescriptor descriptor;

    static {
        lmx0 lmx0Var = new lmx0();
        a = lmx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.tariffs.experiments.TariffRideTimeAppearanceExperiment", lmx0Var, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("ride_time_appearance_override", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, qke.n(qqk0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        sqk0 sqk0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                sqk0Var = (sqk0) b.s(serialDescriptor, 1, qqk0.a, sqk0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new nmx0(i, z2, sqk0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nmx0 nmx0Var = (nmx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        mmx0 mmx0Var = nmx0.Companion;
        if (b.F() || nmx0Var.b) {
            b.n(serialDescriptor, 0, nmx0Var.b);
        }
        if (b.F() || nmx0Var.c != null) {
            b.g(serialDescriptor, 1, qqk0.a, nmx0Var.c);
        }
        b.c(serialDescriptor);
    }
}
