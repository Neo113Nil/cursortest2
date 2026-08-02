package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class n18 implements uxs {
    public static final n18 a;
    private static final SerialDescriptor descriptor;

    static {
        n18 n18Var = new n18();
        a = n18Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable.CancellableDelayedActionParams", n18Var, 3);
        pluginGeneratedSerialDescriptor.j("mills", false);
        pluginGeneratedSerialDescriptor.j("cancelTag", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, auu0.a, p18.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p18.d;
        b.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        vm50 vm50Var = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var = (vm50) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new p18(i, j, str, vm50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p18 p18Var = (p18) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p18.d;
        b.s(serialDescriptor, 0, p18Var.a);
        b.o(serialDescriptor, 1, p18Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), p18Var.c);
        b.c(serialDescriptor);
    }
}
