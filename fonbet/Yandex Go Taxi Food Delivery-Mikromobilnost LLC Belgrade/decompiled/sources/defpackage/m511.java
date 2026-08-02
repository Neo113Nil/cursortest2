package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class m511 implements uxs {
    public static final m511 a;
    private static final SerialDescriptor descriptor;

    static {
        m511 m511Var = new m511();
        a = m511Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.actions.TransportReadCardAction", m511Var, 3);
        pluginGeneratedSerialDescriptor.j("strategy", false);
        pluginGeneratedSerialDescriptor.j("onSuccess", false);
        pluginGeneratedSerialDescriptor.j("onError", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q511.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q511.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        kr krVar = null;
        kr krVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                krVar = (kr) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                krVar2 = (kr) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), krVar2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new q511(i, str, krVar, krVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q511 q511Var = (q511) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q511.d;
        b.o(serialDescriptor, 0, q511Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), q511Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), q511Var.c);
        b.c(serialDescriptor);
    }
}
