package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class out implements uxs {
    public static final out a;
    private static final SerialDescriptor descriptor;

    static {
        out outVar = new out();
        a = outVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.googlepay.GooglePayAction", outVar, 3);
        pluginGeneratedSerialDescriptor.j("cancelAction", false);
        pluginGeneratedSerialDescriptor.j("failureAction", false);
        pluginGeneratedSerialDescriptor.j("successAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qut.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qut.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        vm50 vm50Var3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                vm50Var = (vm50) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), vm50Var);
                i |= 1;
            } else if (v == 1) {
                vm50Var2 = (vm50) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var3 = (vm50) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qut(i, vm50Var, vm50Var2, vm50Var3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qut qutVar = (qut) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qut.d;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), qutVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qutVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), qutVar.c);
        b.c(serialDescriptor);
    }
}
