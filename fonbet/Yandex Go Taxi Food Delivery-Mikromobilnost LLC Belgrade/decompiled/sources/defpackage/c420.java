package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class c420 implements uxs {
    public static final c420 a;
    private static final SerialDescriptor descriptor;

    static {
        c420 c420Var = new c420();
        a = c420Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.messenger.experiment.MessengerSdkConfigExperiment", c420Var, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("disable_stickers", true);
        pluginGeneratedSerialDescriptor.j("disable_display_restriction", true);
        pluginGeneratedSerialDescriptor.j("enable_voice", true);
        pluginGeneratedSerialDescriptor.j("enable_translation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var};
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
        boolean z5 = false;
        boolean z6 = false;
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
            } else if (v == 2) {
                z4 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z5 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z6 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new e420(i, z2, z3, z4, z5, z6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e420 e420Var = (e420) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || e420Var.b) {
            b.n(serialDescriptor, 0, e420Var.b);
        }
        if (b.F() || !e420Var.c) {
            b.n(serialDescriptor, 1, e420Var.c);
        }
        if (b.F() || !e420Var.d) {
            b.n(serialDescriptor, 2, e420Var.d);
        }
        if (b.F() || e420Var.e) {
            b.n(serialDescriptor, 3, e420Var.e);
        }
        if (b.F() || e420Var.f) {
            b.n(serialDescriptor, 4, e420Var.f);
        }
        b.c(serialDescriptor);
    }
}
