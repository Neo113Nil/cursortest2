package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class iw50 implements uxs {
    public static final iw50 a;
    private static final SerialDescriptor descriptor;

    static {
        iw50 iw50Var = new iw50();
        a = iw50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkLinearGradientModel", iw50Var, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("colors", false);
        pluginGeneratedSerialDescriptor.j("startPoint", false);
        pluginGeneratedSerialDescriptor.j("endPoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kw50.e;
        qu50 qu50Var = qu50.a;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), qu50Var, qu50Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kw50.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        su50 su50Var = null;
        su50 su50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                su50Var = (su50) b.A(serialDescriptor, 2, qu50.a, su50Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                su50Var2 = (su50) b.A(serialDescriptor, 3, qu50.a, su50Var2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new kw50(i, str, list, su50Var, su50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kw50 kw50Var = (kw50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kw50.e;
        b.o(serialDescriptor, 0, kw50Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kw50Var.b);
        qu50 qu50Var = qu50.a;
        b.e(serialDescriptor, 2, qu50Var, kw50Var.c);
        b.e(serialDescriptor, 3, qu50Var, kw50Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
