package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class l2u0 implements uxs {
    public static final l2u0 a;
    private static final SerialDescriptor descriptor;

    static {
        l2u0 l2u0Var = new l2u0();
        a = l2u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.StartVerificationResponse", l2u0Var, 2);
        pluginGeneratedSerialDescriptor.j("taskId", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n((KSerializer) n2u0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = n2u0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        a831 a831Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                a831Var = (a831) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), a831Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new n2u0(i, str, a831Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n2u0 n2u0Var = (n2u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = n2u0.c;
        if (b.F() || n2u0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, n2u0Var.a);
        }
        if (b.F() || n2u0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), n2u0Var.b);
        }
        b.c(serialDescriptor);
    }
}
