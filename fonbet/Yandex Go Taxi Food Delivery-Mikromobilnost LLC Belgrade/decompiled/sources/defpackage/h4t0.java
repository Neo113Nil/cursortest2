package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class h4t0 implements uxs {
    public static final h4t0 a;
    private static final SerialDescriptor descriptor;

    static {
        h4t0 h4t0Var = new h4t0();
        a = h4t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.snippet.behaviour.SnippetBehaviour.SafeAreaSettings", h4t0Var, 2);
        pluginGeneratedSerialDescriptor.j("isTopInsetNeeded", true);
        pluginGeneratedSerialDescriptor.j("isBottomInsetNeeded", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
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
                bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j4t0(i, bool, bool2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j4t0 j4t0Var = (j4t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || j4t0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, j4t0Var.a);
        }
        if (b.F() || j4t0Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, j4t0Var.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
