package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class a770 implements uxs {
    public static final a770 a;
    private static final SerialDescriptor descriptor;

    static {
        a770 a770Var = new a770();
        a = a770Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open.OpenPayCardAction", a770Var, 3);
        pluginGeneratedSerialDescriptor.j("amount", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        pluginGeneratedSerialDescriptor.j("onFinish", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(e6m.a), qke.n(auu0.a), qke.n((KSerializer) c770.d[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c770.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        vm50 vm50Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new c770(i, d, str, vm50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c770 c770Var = (c770) obj;
        vm50 vm50Var = c770Var.c;
        String str = c770Var.b;
        Double d = c770Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c770.d;
        if (b.F() || d != null) {
            b.g(serialDescriptor, 0, e6m.a, d);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
