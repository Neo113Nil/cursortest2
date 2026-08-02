package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ds50 implements uxs {
    public static final ds50 a;
    private static final SerialDescriptor descriptor;

    static {
        ds50 ds50Var = new ds50();
        a = ds50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkEnabledContentDescriptionModel", ds50Var, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("actionText", true);
        pluginGeneratedSerialDescriptor.j("templates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = fs50.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fs50.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new fs50(str, i, str2, str3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fs50 fs50Var = (fs50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fs50.e;
        String str = fs50Var.a;
        List list = fs50Var.d;
        String str2 = fs50Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, fs50Var.b);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
