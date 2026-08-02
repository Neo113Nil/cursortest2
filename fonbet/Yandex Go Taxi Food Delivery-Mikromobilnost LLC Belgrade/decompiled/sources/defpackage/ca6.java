package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ca6 implements uxs {
    public static final ca6 a;
    private static final SerialDescriptor descriptor;

    static {
        ca6 ca6Var = new ca6();
        a = ca6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.settings.BooleanSettingDto", ca6Var, 5);
        pluginGeneratedSerialDescriptor.j("setting_id", true);
        pluginGeneratedSerialDescriptor.j("metrica_name", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("is_local", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, z96Var, z96Var, z96Var};
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
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z3 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z4 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ea6(i, str, str2, z2, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ea6 ea6Var = (ea6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ea6Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ea6Var.a);
        }
        if (b.F() || ea6Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, ea6Var.b);
        }
        if (b.F() || ea6Var.c) {
            b.n(serialDescriptor, 2, ea6Var.c);
        }
        if (b.F() || !ea6Var.d) {
            b.n(serialDescriptor, 3, ea6Var.d);
        }
        if (b.F() || ea6Var.e) {
            b.n(serialDescriptor, 4, ea6Var.e);
        }
        b.c(serialDescriptor);
    }
}
