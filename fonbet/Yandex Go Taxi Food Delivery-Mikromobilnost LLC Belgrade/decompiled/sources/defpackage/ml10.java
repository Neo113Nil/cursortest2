package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ml10 implements uxs {
    public static final ml10 a;
    private static final SerialDescriptor descriptor;

    static {
        ml10 ml10Var = new ml10();
        a = ml10Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.MenuItemDto", ml10Var, 4);
        pluginGeneratedSerialDescriptor.j("lead", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("is_subscribed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(z96.a);
        pl10 pl10Var = pl10.a;
        return new KSerializer[]{pl10Var, pl10Var, gl10.a, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        rl10 rl10Var = null;
        rl10 rl10Var2 = null;
        il10 il10Var = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                rl10Var = (rl10) b.A(serialDescriptor, 0, pl10.a, rl10Var);
                i |= 1;
            } else if (v == 1) {
                rl10Var2 = (rl10) b.A(serialDescriptor, 1, pl10.a, rl10Var2);
                i |= 2;
            } else if (v == 2) {
                il10Var = (il10) b.A(serialDescriptor, 2, gl10.a, il10Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ol10(i, rl10Var, rl10Var2, il10Var, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ol10 ol10Var = (ol10) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ol10Var.a, new rl10(0))) {
            b.e(serialDescriptor, 0, pl10.a, ol10Var.a);
        }
        if (b.F() || !jl40.l(ol10Var.b, new rl10(0))) {
            b.e(serialDescriptor, 1, pl10.a, ol10Var.b);
        }
        if (b.F() || !jl40.l(ol10Var.c, new il10(0))) {
            b.e(serialDescriptor, 2, gl10.a, ol10Var.c);
        }
        if (b.F() || ol10Var.d != null) {
            b.g(serialDescriptor, 3, z96.a, ol10Var.d);
        }
        b.c(serialDescriptor);
    }
}
