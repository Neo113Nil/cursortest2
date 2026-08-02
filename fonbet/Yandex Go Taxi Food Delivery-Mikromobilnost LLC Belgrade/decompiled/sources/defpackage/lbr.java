package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class lbr implements uxs {
    public static final lbr a;
    private static final SerialDescriptor descriptor;

    static {
        lbr lbrVar = new lbr();
        a = lbrVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FintechRemoteAction", lbrVar, 3);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("fallback", true);
        pluginGeneratedSerialDescriptor.j("on_success", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = nbr.d;
        return new KSerializer[]{pbr.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nbr.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        rbr rbrVar = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                rbrVar = (rbr) b.A(serialDescriptor, 0, pbr.a, rbrVar);
                i |= 1;
            } else if (v == 1) {
                vm50Var = (vm50) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var2 = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new nbr(i, rbrVar, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nbr nbrVar = (nbr) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nbr.d;
        pbr pbrVar = pbr.a;
        rbr rbrVar = nbrVar.a;
        vm50 vm50Var = nbrVar.c;
        vm50 vm50Var2 = nbrVar.b;
        b.e(serialDescriptor, 0, pbrVar, rbrVar);
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
