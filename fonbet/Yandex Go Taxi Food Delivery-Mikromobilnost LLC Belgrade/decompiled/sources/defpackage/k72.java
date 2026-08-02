package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class k72 implements uxs {
    public static final k72 a;
    private static final SerialDescriptor descriptor;

    static {
        k72 k72Var = new k72();
        a = k72Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.AndroidApiLocationUpdatesIntervalExperiment", k72Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("gps_interval", true);
        pluginGeneratedSerialDescriptor.j("network_interval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96.a, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new m72(i, i2, i3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m72 m72Var = (m72) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        l72 l72Var = m72.Companion;
        if (b.F() || m72Var.b) {
            b.n(serialDescriptor, 0, m72Var.b);
        }
        if (b.F() || m72Var.c != 0) {
            b.A(1, m72Var.c, serialDescriptor);
        }
        if (b.F() || m72Var.d != 0) {
            b.A(2, m72Var.d, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
