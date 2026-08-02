package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class a0e implements uxs {
    public static final a0e a;
    private static final SerialDescriptor descriptor;

    static {
        a0e a0eVar = new a0e();
        a = a0eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ConfigParams", a0eVar, 3);
        pluginGeneratedSerialDescriptor.j("onboarding_type", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), b0t.a, qke.n(id7.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        zzs zzsVar = null;
        kd7 kd7Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                kd7Var = (kd7) b.s(serialDescriptor, 2, id7.a, kd7Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new c0e(i, str, zzsVar, kd7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0e c0eVar = (c0e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        String str = c0eVar.a;
        kd7 kd7Var = c0eVar.c;
        b.g(serialDescriptor, 0, auu0Var, str);
        b.e(serialDescriptor, 1, b0t.a, c0eVar.b);
        if (b.F() || kd7Var != null) {
            b.g(serialDescriptor, 2, id7.a, kd7Var);
        }
        b.c(serialDescriptor);
    }
}
