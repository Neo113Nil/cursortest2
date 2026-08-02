package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class lnu0 implements uxs {
    public static final lnu0 a;
    private static final SerialDescriptor descriptor;

    static {
        lnu0 lnu0Var = new lnu0();
        a = lnu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.StoriesSource", lnu0Var, 2);
        pluginGeneratedSerialDescriptor.j("screenName", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(k6z.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        v6z v6zVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                v6zVar = (v6z) b.s(serialDescriptor, 1, k6z.a, v6zVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new nnu0(i, str, v6zVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nnu0 nnu0Var = (nnu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || nnu0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, nnu0Var.a);
        }
        if (b.F() || nnu0Var.b != null) {
            b.g(serialDescriptor, 1, k6z.a, nnu0Var.b);
        }
        b.c(serialDescriptor);
    }
}
