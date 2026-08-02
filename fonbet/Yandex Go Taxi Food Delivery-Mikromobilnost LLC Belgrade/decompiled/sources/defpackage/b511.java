package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes12.dex */
public final /* synthetic */ class b511 implements uxs {
    public static final b511 a;
    private static final SerialDescriptor descriptor;

    static {
        b511 b511Var = new b511();
        a = b511Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.transport.nfc.TransportReadBlocksAction", b511Var, 3);
        pluginGeneratedSerialDescriptor.j(CSPDirectoryConstants.SUBDIRECTORY_KEYS, false);
        pluginGeneratedSerialDescriptor.j("onSuccess", false);
        pluginGeneratedSerialDescriptor.j("onError", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = f511.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f511.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
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
        return new f511(i, list, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f511 f511Var = (f511) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f511.d;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), f511Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), f511Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), f511Var.c);
        b.c(serialDescriptor);
    }
}
