package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class gyj implements uxs {
    public static final gyj a;
    private static final SerialDescriptor descriptor;

    static {
        gyj gyjVar = new gyj();
        a = gyjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.DismissAction", gyjVar, 3);
        pluginGeneratedSerialDescriptor.j("animated", false);
        pluginGeneratedSerialDescriptor.j("completionAction", true);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n((KSerializer) iyj.d[1].getValue()), r9i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = iyj.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        kr krVar = null;
        s9i0 s9i0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                krVar = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                s9i0Var = (s9i0) b.A(serialDescriptor, 2, r9i0.a, s9i0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new iyj(i, bool, krVar, s9i0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (defpackage.jl40.l(r3, defpackage.s9i0.b) == false) goto L12;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        iyj iyjVar = (iyj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iyj.d;
        z96 z96Var = z96.a;
        Boolean bool = iyjVar.a;
        s9i0 s9i0Var = iyjVar.c;
        kr krVar = iyjVar.b;
        b.g(serialDescriptor, 0, z96Var, bool);
        if (b.F() || krVar != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), krVar);
        }
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, r9i0.a, s9i0Var);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
