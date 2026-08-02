package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class o5z0 implements uxs {
    public static final o5z0 a;
    private static final SerialDescriptor descriptor;

    static {
        o5z0 o5z0Var = new o5z0();
        a = o5z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.Time", o5z0Var, 3);
        pluginGeneratedSerialDescriptor.j("ms", false);
        pluginGeneratedSerialDescriptor.j("us", true);
        pluginGeneratedSerialDescriptor.j("seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{pnzVar, pnzVar, pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j2 = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                j3 = b.f(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new w5z0(i, j, j2, j3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w5z0 w5z0Var = (w5z0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        long j = w5z0Var.a;
        long j2 = w5z0Var.c;
        long j3 = w5z0Var.b;
        b.s(serialDescriptor, 0, j);
        if (b.F() || j3 != j * 1000) {
            b.s(serialDescriptor, 1, j3);
        }
        if (b.F() || j2 != j / 1000) {
            b.s(serialDescriptor, 2, j2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
