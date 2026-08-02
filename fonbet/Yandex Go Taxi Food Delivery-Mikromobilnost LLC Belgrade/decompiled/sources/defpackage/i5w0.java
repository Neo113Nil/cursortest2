package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class i5w0 implements uxs {
    public static final i5w0 a;
    private static final SerialDescriptor descriptor;

    static {
        i5w0 i5w0Var = new i5w0();
        a = i5w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.superapp.SuperAppOptimizationsExperiment", i5w0Var, 3);
        pluginGeneratedSerialDescriptor.j("prefetch_startapp_document", true);
        pluginGeneratedSerialDescriptor.j("async_network_caching", true);
        pluginGeneratedSerialDescriptor.j("apply_experiments_on_document_apply", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new k5w0(i, z2, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k5w0 k5w0Var = (k5w0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || k5w0Var.b) {
            b.n(serialDescriptor, 0, k5w0Var.b);
        }
        if (b.F() || k5w0Var.c) {
            b.n(serialDescriptor, 1, k5w0Var.c);
        }
        if (b.F() || k5w0Var.d) {
            b.n(serialDescriptor, 2, k5w0Var.d);
        }
        b.c(serialDescriptor);
    }
}
