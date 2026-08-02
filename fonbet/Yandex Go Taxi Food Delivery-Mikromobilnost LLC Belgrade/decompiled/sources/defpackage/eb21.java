package defpackage;

import com.adjust.sdk.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class eb21 implements uxs {
    public static final eb21 a;
    private static final SerialDescriptor descriptor;

    static {
        eb21 eb21Var = new eb21();
        a = eb21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade.UpgradeSplitAction", eb21Var, 5);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, false);
        pluginGeneratedSerialDescriptor.j("onCanceled", true);
        pluginGeneratedSerialDescriptor.j("onFailure", true);
        pluginGeneratedSerialDescriptor.j("onInvalidDeeplink", true);
        pluginGeneratedSerialDescriptor.j("onSuccess", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gb21.f;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gb21.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        vm50 vm50Var3 = null;
        vm50 vm50Var4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                vm50Var = (vm50) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var);
                i |= 2;
            } else if (v == 2) {
                vm50Var2 = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var2);
                i |= 4;
            } else if (v == 3) {
                vm50Var3 = (vm50) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vm50Var3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                vm50Var4 = (vm50) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), vm50Var4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new gb21(i, str, vm50Var, vm50Var2, vm50Var3, vm50Var4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gb21 gb21Var = (gb21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gb21.f;
        String str = gb21Var.a;
        vm50 vm50Var = gb21Var.e;
        vm50 vm50Var2 = gb21Var.d;
        vm50 vm50Var3 = gb21Var.c;
        vm50 vm50Var4 = gb21Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || vm50Var4 != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vm50Var4);
        }
        if (b.F() || vm50Var3 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var3);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
