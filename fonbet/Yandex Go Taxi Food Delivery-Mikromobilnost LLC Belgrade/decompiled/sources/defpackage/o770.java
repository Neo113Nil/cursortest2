package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class o770 implements uxs {
    public static final o770 a;
    private static final SerialDescriptor descriptor;

    static {
        o770 o770Var = new o770();
        a = o770Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus.OpenPlusAction", o770Var, 2);
        pluginGeneratedSerialDescriptor.j("onPlusOpened", true);
        pluginGeneratedSerialDescriptor.j("onCancelled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q770.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q770.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                vm50Var = (vm50) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), vm50Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                vm50Var2 = (vm50) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q770(i, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q770 q770Var = (q770) obj;
        vm50 vm50Var = q770Var.b;
        vm50 vm50Var2 = q770Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q770.c;
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
