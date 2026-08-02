package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class n511 implements uxs {
    public static final n511 a;
    private static final SerialDescriptor descriptor;

    static {
        n511 n511Var = new n511();
        a = n511Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.transport.nfc.TransportReadCardAction", n511Var, 3);
        pluginGeneratedSerialDescriptor.j("strategy", false);
        pluginGeneratedSerialDescriptor.j("onSuccess", false);
        pluginGeneratedSerialDescriptor.j("onError", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = r511.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r511.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                vm50Var = (vm50) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var2 = (vm50) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new r511(i, str, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r511 r511Var = (r511) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r511.d;
        b.o(serialDescriptor, 0, r511Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), r511Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), r511Var.c);
        b.c(serialDescriptor);
    }
}
