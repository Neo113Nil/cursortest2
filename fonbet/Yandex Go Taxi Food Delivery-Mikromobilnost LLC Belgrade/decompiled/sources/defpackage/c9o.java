package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class c9o implements uxs {
    public static final c9o a;
    private static final SerialDescriptor descriptor;

    static {
        c9o c9oVar = new c9o();
        a = c9oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ErrorResponseDetails", c9oVar, 3);
        pluginGeneratedSerialDescriptor.j("ui_title", true);
        pluginGeneratedSerialDescriptor.j("ui_message", true);
        pluginGeneratedSerialDescriptor.j("special_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(f9o.a)};
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
        h9o h9oVar = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                h9oVar = (h9o) b.s(serialDescriptor, 2, f9o.a, h9oVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new e9o(i, str, str2, h9oVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e9o e9oVar = (e9o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || e9oVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, e9oVar.a);
        }
        if (b.F() || e9oVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, e9oVar.b);
        }
        if (b.F() || e9oVar.c != null) {
            b.g(serialDescriptor, 2, f9o.a, e9oVar.c);
        }
        b.c(serialDescriptor);
    }
}
