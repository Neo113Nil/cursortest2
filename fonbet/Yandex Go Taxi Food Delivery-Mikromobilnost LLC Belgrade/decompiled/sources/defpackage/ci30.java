package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.gi30;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ci30 implements uxs {
    public static final ci30 a;
    private static final SerialDescriptor descriptor;

    static {
        ci30 ci30Var = new ci30();
        a = ci30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.main.experiment.MtDiscoveryFlexExperiment", ci30Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("main_card_settings", true);
        pluginGeneratedSerialDescriptor.j("skeleton_content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, ei30.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        gi30.a aVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (gi30.a) b.A(serialDescriptor, 1, ei30.a, aVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new gi30(i, z2, aVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (defpackage.jl40.l(r0, gi30.a.e) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        gi30 gi30Var = (gi30) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        di30 di30Var = gi30.Companion;
        if (b.F() || gi30Var.b) {
            b.n(serialDescriptor, 0, gi30Var.b);
        }
        if (!b.F()) {
            gi30.a aVar = gi30Var.c;
            gi30.a.Companion.getClass();
        }
        b.e(serialDescriptor, 1, ei30.a, gi30Var.c);
        if (b.F() || !jl40.l(gi30Var.d, "")) {
            b.o(serialDescriptor, 2, gi30Var.d);
        }
        b.c(serialDescriptor);
    }
}
