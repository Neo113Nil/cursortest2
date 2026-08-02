package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class h2q0 implements uxs {
    public static final h2q0 a;
    private static final SerialDescriptor descriptor;

    static {
        h2q0 h2q0Var = new h2q0();
        a = h2q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.model.SectionOnLoadMore", h2q0Var, 3);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("isDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) j2q0.d[1].getValue()), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j2q0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        kr krVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                krVar = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new j2q0(i, str, krVar, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j2q0 j2q0Var = (j2q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j2q0.d;
        String str = j2q0Var.a;
        boolean z = j2q0Var.c;
        b.o(serialDescriptor, 0, str);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), j2q0Var.b);
        if (b.F() || z) {
            b.n(serialDescriptor, 2, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
