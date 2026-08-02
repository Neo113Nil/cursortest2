package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.j;

/* loaded from: classes14.dex */
public final /* synthetic */ class k61 implements uxs {
    public static final k61 a;
    private static final SerialDescriptor descriptor;

    static {
        k61 k61Var = new k61();
        a = k61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.AddressSelectionAction", k61Var, 4);
        pluginGeneratedSerialDescriptor.j("destination_search_text", true);
        pluginGeneratedSerialDescriptor.j("suggest_mode", true);
        pluginGeneratedSerialDescriptor.j("suggest_log", true);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new j(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j jVar = (j) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || jVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, jVar.a);
        }
        if (b.F() || !jl40.l(jVar.b, "")) {
            b.o(serialDescriptor, 1, jVar.b);
        }
        if (b.F() || !jl40.l(jVar.c, "")) {
            b.o(serialDescriptor, 2, jVar.c);
        }
        if (b.F() || jVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, jVar.d);
        }
        b.c(serialDescriptor);
    }
}
