package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class a79 implements uxs {
    public static final a79 a;
    private static final SerialDescriptor descriptor;

    static {
        a79 a79Var = new a79();
        a = a79Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.Centroid", a79Var, 3);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("display_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(b0t.a), qke.n(xwu0.a), qke.n(xzj.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        bxu0 bxu0Var = null;
        f0k f0kVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.s(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                bxu0Var = (bxu0) b.s(serialDescriptor, 1, xwu0.a, bxu0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                f0kVar = (f0k) b.s(serialDescriptor, 2, xzj.a, f0kVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new c79(i, zzsVar, bxu0Var, f0kVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c79 c79Var = (c79) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c79Var.a != null) {
            b.g(serialDescriptor, 0, b0t.a, c79Var.a);
        }
        if (b.F() || c79Var.b != null) {
            b.g(serialDescriptor, 1, xwu0.a, c79Var.b);
        }
        if (b.F() || c79Var.c != null) {
            b.g(serialDescriptor, 2, xzj.a, c79Var.c);
        }
        b.c(serialDescriptor);
    }
}
