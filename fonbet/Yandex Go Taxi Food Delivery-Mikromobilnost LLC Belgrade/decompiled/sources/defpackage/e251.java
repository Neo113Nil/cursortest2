package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class e251 implements uxs {
    public static final e251 a;
    private static final SerialDescriptor descriptor;

    static {
        e251 e251Var = new e251();
        a = e251Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Balance", e251Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("templates", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = g251.i;
        return new KSerializer[]{auu0.a, qke.n(qfe.a), qke.n((KSerializer) i3yVarArr[2].getValue()), nzj.a, qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue(), i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = g251.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        sfe sfeVar = null;
        wv wvVar = null;
        wzj wzjVar = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    sfeVar = (sfe) b.s(serialDescriptor, 1, qfe.a, sfeVar);
                    i |= 2;
                    break;
                case 2:
                    wvVar = (wv) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), wvVar);
                    i |= 4;
                    break;
                case 3:
                    wzjVar = (wzj) b.A(serialDescriptor, 3, nzj.a, wzjVar);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new g251(i, str, sfeVar, wvVar, wzjVar, list2, list3, list4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        g251.i((g251) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
