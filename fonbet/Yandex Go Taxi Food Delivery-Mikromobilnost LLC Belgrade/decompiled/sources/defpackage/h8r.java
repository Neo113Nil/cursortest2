package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class h8r implements uxs {
    public static final h8r a;
    private static final SerialDescriptor descriptor;

    static {
        h8r h8rVar = new h8r();
        a = h8rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("altimeter", h8rVar, 3);
        pluginGeneratedSerialDescriptor.j("pressure", false);
        pluginGeneratedSerialDescriptor.j("altitude", true);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, qke.n(e6mVar), qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        Double d2 = null;
        Double d3 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d2 = (Double) b.s(serialDescriptor, 1, e6m.a, d2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d3 = (Double) b.s(serialDescriptor, 2, e6m.a, d3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new j8r(i, d, d2, d3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j8r j8rVar = (j8r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        double d = j8rVar.a;
        Double d2 = j8rVar.c;
        Double d3 = j8rVar.b;
        b.E(serialDescriptor, 0, d);
        if (b.F() || d3 != null) {
            b.g(serialDescriptor, 1, e6m.a, d3);
        }
        if (b.F() || d2 != null) {
            b.g(serialDescriptor, 2, e6m.a, d2);
        }
        b.c(serialDescriptor);
    }
}
