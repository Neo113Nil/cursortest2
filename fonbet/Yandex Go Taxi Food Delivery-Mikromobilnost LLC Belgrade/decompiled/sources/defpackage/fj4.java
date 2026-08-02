package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class fj4 implements uxs {
    public static final fj4 a;
    private static final SerialDescriptor descriptor;

    static {
        fj4 fj4Var = new fj4();
        a = fj4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.BackwardAction", fj4Var, 2);
        pluginGeneratedSerialDescriptor.j("animated", false);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), r9i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        s9i0 s9i0Var = null;
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
                s9i0Var = (s9i0) b.A(serialDescriptor, 1, r9i0.a, s9i0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new hj4(i, bool, s9i0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (defpackage.jl40.l(r5, defpackage.s9i0.b) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        hj4 hj4Var = (hj4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        z96 z96Var = z96.a;
        Boolean bool = hj4Var.a;
        s9i0 s9i0Var = hj4Var.b;
        b.g(serialDescriptor, 0, z96Var, bool);
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, r9i0.a, s9i0Var);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
