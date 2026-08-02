package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class lne0 implements uxs {
    public static final lne0 a;
    private static final SerialDescriptor descriptor;

    static {
        lne0 lne0Var = new lne0();
        a = lne0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.prefetch.document.action.PrefetchDocumentAction", lne0Var, 3);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("force", false);
        pluginGeneratedSerialDescriptor.j("useCache", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{nne0.d[0].getValue(), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nne0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        u1m u1mVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u1mVar = (u1m) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new nne0(i, u1mVar, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nne0 nne0Var = (nne0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) nne0.d[0].getValue(), nne0Var.a);
        b.n(serialDescriptor, 1, nne0Var.b);
        b.n(serialDescriptor, 2, nne0Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
