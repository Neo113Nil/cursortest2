package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class djj implements uxs {
    public static final djj a;
    private static final SerialDescriptor descriptor;

    static {
        djj djjVar = new djj();
        a = djjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.section.divkit.Differ", djjVar, 4);
        pluginGeneratedSerialDescriptor.j("considerItemIds", true);
        pluginGeneratedSerialDescriptor.j("contentHash", true);
        pluginGeneratedSerialDescriptor.j("skipModelCheck", true);
        pluginGeneratedSerialDescriptor.j("animateOnChange", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(auu0.a), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                bool2 = (Boolean) b.s(serialDescriptor, 2, z96.a, bool2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool3 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new fjj(i, bool, str, bool2, bool3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fjj fjjVar = (fjj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fjjVar.a != null) {
            b.g(serialDescriptor, 0, z96.a, fjjVar.a);
        }
        if (b.F() || fjjVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, fjjVar.b);
        }
        if (b.F() || fjjVar.c != null) {
            b.g(serialDescriptor, 2, z96.a, fjjVar.c);
        }
        if (b.F() || fjjVar.d != null) {
            b.g(serialDescriptor, 3, z96.a, fjjVar.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
