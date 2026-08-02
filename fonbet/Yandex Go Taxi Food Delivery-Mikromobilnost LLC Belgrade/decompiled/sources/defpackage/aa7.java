package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class aa7 implements uxs {
    public static final aa7 a;
    private static final SerialDescriptor descriptor;

    static {
        aa7 aa7Var = new aa7();
        a = aa7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.CableFeatureDto", aa7Var, 2);
        pluginGeneratedSerialDescriptor.j("available", true);
        pluginGeneratedSerialDescriptor.j("properties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n(ia7.e)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        ha7 ha7Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                ha7Var = (ha7) b.s(serialDescriptor, 1, ia7.e, ha7Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ja7(i, bool, ha7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ja7 ja7Var = (ja7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ja7Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, ja7Var.a);
        }
        if (b.F() || ja7Var.b != null) {
            b.g(serialDescriptor, 1, ia7.e, ja7Var.b);
        }
        b.c(serialDescriptor);
    }
}
