package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jso0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class gso0 implements uxs {
    public static final gso0 a;
    private static final SerialDescriptor descriptor;

    static {
        gso0 gso0Var = new gso0();
        a = gso0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersRideButtonsStoriesExperiment", gso0Var, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("pause_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, qke.n(hso0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        jso0.a aVar = null;
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
                aVar = (jso0.a) b.s(serialDescriptor, 1, hso0.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new jso0(i, z2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jso0 jso0Var = (jso0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        mso0 mso0Var = jso0.Companion;
        if (b.F() || jso0Var.b) {
            b.n(serialDescriptor, 0, jso0Var.b);
        }
        if (b.F() || jso0Var.c != null) {
            b.g(serialDescriptor, 1, hso0.a, jso0Var.c);
        }
        b.c(serialDescriptor);
    }
}
