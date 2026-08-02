package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class n3r implements uxs {
    public static final n3r a;
    private static final SerialDescriptor descriptor;

    static {
        n3r n3rVar = new n3r();
        a = n3rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.FillParams", n3rVar, 4);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("background_color_multi_hex", true);
        pluginGeneratedSerialDescriptor.j("opacity", true);
        pluginGeneratedSerialDescriptor.j("inner_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(vxv.a)};
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
        Integer num = null;
        xxv xxvVar = null;
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
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                xxvVar = (xxv) b.s(serialDescriptor, 3, vxv.a, xxvVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new p3r(i, str, str2, num, xxvVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p3r p3rVar = (p3r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || p3rVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, p3rVar.a);
        }
        if (b.F() || p3rVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, p3rVar.b);
        }
        if (b.F() || p3rVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, p3rVar.c);
        }
        if (b.F() || p3rVar.d != null) {
            b.g(serialDescriptor, 3, vxv.a, p3rVar.d);
        }
        b.c(serialDescriptor);
    }
}
