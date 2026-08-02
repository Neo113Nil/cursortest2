package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class b2t0 implements uxs {
    public static final b2t0 a;
    private static final SerialDescriptor descriptor;

    static {
        b2t0 b2t0Var = new b2t0();
        a = b2t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("just.adapter.snapping.SnappingParams", b2t0Var, 4);
        pluginGeneratedSerialDescriptor.j("offset", true);
        pluginGeneratedSerialDescriptor.j("forceSnapOnFling", true);
        pluginGeneratedSerialDescriptor.j("increasing", false);
        pluginGeneratedSerialDescriptor.j("decreasing", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(nor.a);
        KSerializer n2 = qke.n(z96.a);
        z1t0 z1t0Var = z1t0.a;
        return new KSerializer[]{n, n2, z1t0Var, z1t0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        Boolean bool = null;
        y1t0 y1t0Var = null;
        y1t0 y1t0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else if (v != 1) {
                z1t0 z1t0Var = z1t0.a;
                if (v == 2) {
                    y1t0Var = (y1t0) b.A(serialDescriptor, 2, z1t0Var, y1t0Var);
                    i |= 4;
                } else {
                    if (v != 3) {
                        ny61.c(v);
                        return null;
                    }
                    y1t0Var2 = (y1t0) b.A(serialDescriptor, 3, z1t0Var, y1t0Var2);
                    i |= 8;
                }
            } else {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new d2t0(i, f, bool, y1t0Var, y1t0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d2t0 d2t0Var = (d2t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(d2t0Var.a, Float.valueOf(0.0f))) {
            b.g(serialDescriptor, 0, nor.a, d2t0Var.a);
        }
        if (b.F() || !jl40.l(d2t0Var.b, Boolean.FALSE)) {
            b.g(serialDescriptor, 1, z96.a, d2t0Var.b);
        }
        y1t0 y1t0Var = d2t0Var.c;
        z1t0 z1t0Var = z1t0.a;
        b.e(serialDescriptor, 2, z1t0Var, y1t0Var);
        b.e(serialDescriptor, 3, z1t0Var, d2t0Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
