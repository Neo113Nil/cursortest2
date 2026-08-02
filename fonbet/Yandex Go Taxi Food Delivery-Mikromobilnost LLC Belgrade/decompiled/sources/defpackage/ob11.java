package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class ob11 implements uxs {
    public static final ob11 a;
    private static final SerialDescriptor descriptor;

    static {
        ob11 ob11Var = new ob11();
        a = ob11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.actions.TransportWriteBlocksAction", ob11Var, 3);
        pluginGeneratedSerialDescriptor.j(CSPDirectoryConstants.SUBDIRECTORY_KEYS, false);
        pluginGeneratedSerialDescriptor.j("onSuccess", false);
        pluginGeneratedSerialDescriptor.j("onError", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = sb11.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = sb11.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        kr krVar = null;
        kr krVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
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
        return new sb11(i, list, krVar, krVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sb11 sb11Var = (sb11) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = sb11.d;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), sb11Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), sb11Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), sb11Var.c);
        b.c(serialDescriptor);
    }
}
