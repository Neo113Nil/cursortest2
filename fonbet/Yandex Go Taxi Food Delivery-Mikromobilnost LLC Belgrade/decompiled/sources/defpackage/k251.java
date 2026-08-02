package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class k251 implements uxs {
    public static final k251 a;
    private static final SerialDescriptor descriptor;

    static {
        k251 k251Var = new k251();
        a = k251Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Icon", k251Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = m251.f;
        KSerializer n = qke.n(qfe.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[2].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, n2, nzj.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = m251.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        sfe sfeVar = null;
        wv wvVar = null;
        wzj wzjVar = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                sfeVar = (sfe) b.s(serialDescriptor, 1, qfe.a, sfeVar);
                i |= 2;
            } else if (v == 2) {
                wvVar = (wv) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), wvVar);
                i |= 4;
            } else if (v == 3) {
                wzjVar = (wzj) b.A(serialDescriptor, 3, nzj.a, wzjVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new m251(i, str, sfeVar, wvVar, wzjVar, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        m251.f((m251) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
