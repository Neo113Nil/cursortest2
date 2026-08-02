package defpackage;

import defpackage.q9e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class n9e0 implements uxs {
    public static final n9e0 a;
    private static final SerialDescriptor descriptor;

    static {
        n9e0 n9e0Var = new n9e0();
        a = n9e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.api.network.objects.PopupOption", n9e0Var, 2);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(o9e0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        q9e0.a aVar = null;
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
                aVar = (q9e0.a) b.s(serialDescriptor, 1, o9e0.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q9e0(i, str, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q9e0 q9e0Var = (q9e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || q9e0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, q9e0Var.a);
        }
        if (b.F() || q9e0Var.b != null) {
            b.g(serialDescriptor, 1, o9e0.a, q9e0Var.b);
        }
        b.c(serialDescriptor);
    }
}
