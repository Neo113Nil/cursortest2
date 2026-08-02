package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class jko implements uxs {
    public static final jko a;
    private static final SerialDescriptor descriptor;

    static {
        jko jkoVar = new jko();
        a = jkoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.executeflexactiononscreen.ExecuteFlexActionOnScreenAction", jkoVar, 4);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("screen_id", false);
        pluginGeneratedSerialDescriptor.j("on_fail", true);
        pluginGeneratedSerialDescriptor.j("on_screen_not_found", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = lko.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0.a, qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lko.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        vm50 vm50Var = null;
        String str = null;
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
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                vm50Var2 = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                vm50Var3 = (vm50) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vm50Var3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new lko(i, vm50Var, str, vm50Var2, vm50Var3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lko lkoVar = (lko) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lko.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        vm50 vm50Var = lkoVar.a;
        vm50 vm50Var2 = lkoVar.d;
        vm50 vm50Var3 = lkoVar.c;
        b.e(serialDescriptor, 0, kSerializer, vm50Var);
        b.o(serialDescriptor, 1, lkoVar.b);
        if (b.F() || vm50Var3 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var3);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), vm50Var2);
        }
        b.c(serialDescriptor);
    }
}
