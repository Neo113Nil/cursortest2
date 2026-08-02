package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class m4t0 implements uxs {
    public static final m4t0 a;
    private static final SerialDescriptor descriptor;

    static {
        m4t0 m4t0Var = new m4t0();
        a = m4t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.snippet.behaviour.SnippetBehaviour.SnappingBehaviourSerializer.SnappingSurrogate", m4t0Var, 4);
        pluginGeneratedSerialDescriptor.j("gravity", true);
        pluginGeneratedSerialDescriptor.j("snippetStart", true);
        pluginGeneratedSerialDescriptor.j("snippetEnd", true);
        pluginGeneratedSerialDescriptor.j("callbacks", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(nor.a);
        b2t0 b2t0Var = b2t0.a;
        return new KSerializer[]{n, qke.n(b2t0Var), qke.n(b2t0Var), qke.n(r1t0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        d2t0 d2t0Var = null;
        d2t0 d2t0Var2 = null;
        t1t0 t1t0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else if (v == 1) {
                d2t0Var = (d2t0) b.s(serialDescriptor, 1, b2t0.a, d2t0Var);
                i |= 2;
            } else if (v == 2) {
                d2t0Var2 = (d2t0) b.s(serialDescriptor, 2, b2t0.a, d2t0Var2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                t1t0Var = (t1t0) b.s(serialDescriptor, 3, r1t0.a, t1t0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new o4t0(i, f, d2t0Var, d2t0Var2, t1t0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o4t0 o4t0Var = (o4t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || o4t0Var.a != null) {
            b.g(serialDescriptor, 0, nor.a, o4t0Var.a);
        }
        if (b.F() || o4t0Var.b != null) {
            b.g(serialDescriptor, 1, b2t0.a, o4t0Var.b);
        }
        if (b.F() || o4t0Var.c != null) {
            b.g(serialDescriptor, 2, b2t0.a, o4t0Var.c);
        }
        if (b.F() || o4t0Var.d != null) {
            b.g(serialDescriptor, 3, r1t0.a, o4t0Var.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
