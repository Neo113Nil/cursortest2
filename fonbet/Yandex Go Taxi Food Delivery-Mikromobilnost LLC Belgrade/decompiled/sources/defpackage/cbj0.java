package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class cbj0 implements uxs {
    public static final cbj0 a;
    private static final SerialDescriptor descriptor;

    static {
        cbj0 cbj0Var = new cbj0();
        a = cbj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.Requirement", cbj0Var, 4);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("dialog", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ebj0.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, xcj.a, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ebj0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        adj adjVar = null;
        String str2 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                adjVar = (adj) b.A(serialDescriptor, 1, xcj.a, adjVar);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
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
        return new ebj0(i, str, adjVar, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ebj0 ebj0Var = (ebj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ebj0.e;
        if (b.F() || !jl40.l(ebj0Var.a, "")) {
            b.o(serialDescriptor, 0, ebj0Var.a);
        }
        if (b.F() || !jl40.l(ebj0Var.b, new adj(0))) {
            b.e(serialDescriptor, 1, xcj.a, ebj0Var.b);
        }
        if (b.F() || ebj0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, ebj0Var.c);
        }
        if (b.F() || ebj0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), ebj0Var.d);
        }
        b.c(serialDescriptor);
    }
}
