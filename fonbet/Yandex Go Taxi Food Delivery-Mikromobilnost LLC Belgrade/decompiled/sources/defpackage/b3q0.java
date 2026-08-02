package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class b3q0 implements uxs {
    public static final b3q0 a;
    private static final SerialDescriptor descriptor;

    static {
        b3q0 b3q0Var = new b3q0();
        a = b3q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.SectionPatchParams", b3q0Var, 1);
        pluginGeneratedSerialDescriptor.j("operation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d3q0.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d3q0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        w2q0 w2q0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                w2q0Var = (w2q0) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), w2q0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new d3q0(i, w2q0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) d3q0.b[0].getValue(), ((d3q0) obj).a);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
