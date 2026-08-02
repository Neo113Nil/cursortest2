package defpackage;

import defpackage.i000;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class g000 implements uxs {
    public static final g000 a;
    private static final SerialDescriptor descriptor;

    static {
        g000 g000Var = new g000();
        a = g000Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.Maas.MenuButton", g000Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("trips_info", true);
        pluginGeneratedSerialDescriptor.j("expiring_info", true);
        pluginGeneratedSerialDescriptor.j("webview_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var};
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
                str = b.k(serialDescriptor, 0);
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
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new i000.a(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i000.a aVar = (i000.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
