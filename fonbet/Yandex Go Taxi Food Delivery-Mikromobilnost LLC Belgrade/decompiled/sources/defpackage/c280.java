package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.g280;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class c280 implements uxs {
    public static final c280 a;
    private static final SerialDescriptor descriptor;

    static {
        c280 c280Var = new c280();
        a = c280Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.OrderNotificationLiveUpdatesExperiment", c280Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("search", true);
        pluginGeneratedSerialDescriptor.j("driving", true);
        pluginGeneratedSerialDescriptor.j("waiting", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e280 e280Var = e280.a;
        return new KSerializer[]{z96.a, e280Var, e280Var, e280Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        g280.a aVar = null;
        g280.a aVar2 = null;
        g280.a aVar3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (g280.a) b.A(serialDescriptor, 1, e280.a, aVar);
                i |= 2;
            } else if (v == 2) {
                aVar2 = (g280.a) b.A(serialDescriptor, 2, e280.a, aVar2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar3 = (g280.a) b.A(serialDescriptor, 3, e280.a, aVar3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new g280(i, z2, aVar, aVar2, aVar3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g280 g280Var = (g280) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        d280 d280Var = g280.Companion;
        if (b.F() || g280Var.b) {
            b.n(serialDescriptor, 0, g280Var.b);
        }
        if (b.F() || !jl40.l(g280Var.c, new g280.a(0))) {
            b.e(serialDescriptor, 1, e280.a, g280Var.c);
        }
        if (b.F() || !jl40.l(g280Var.d, new g280.a(0))) {
            b.e(serialDescriptor, 2, e280.a, g280Var.d);
        }
        if (b.F() || !jl40.l(g280Var.e, new g280.a(0))) {
            b.e(serialDescriptor, 3, e280.a, g280Var.e);
        }
        b.c(serialDescriptor);
    }
}
