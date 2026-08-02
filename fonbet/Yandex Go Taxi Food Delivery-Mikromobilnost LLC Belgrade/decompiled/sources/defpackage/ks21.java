package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ks21 implements uxs {
    public static final ks21 a;
    private static final SerialDescriptor descriptor;

    static {
        ks21 ks21Var = new ks21();
        a = ks21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.profile.experiments.UserProfileToggledContentExperiment", ks21Var, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("is_adding_email_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var};
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
                z3 = b.C(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ms21(i, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ms21 ms21Var = (ms21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ls21 ls21Var = ms21.Companion;
        if (b.F() || ms21Var.b) {
            b.n(serialDescriptor, 0, ms21Var.b);
        }
        if (b.F() || !ms21Var.c) {
            b.n(serialDescriptor, 1, ms21Var.c);
        }
        b.c(serialDescriptor);
    }
}
