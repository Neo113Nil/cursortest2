package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class fr60 implements uxs {
    public static final fr60 a;
    private static final SerialDescriptor descriptor;

    static {
        fr60 fr60Var = new fr60();
        a = fr60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth.ObtainAuthAction", fr60Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, false);
        pluginGeneratedSerialDescriptor.j("customVariableName", true);
        pluginGeneratedSerialDescriptor.j("onError", true);
        pluginGeneratedSerialDescriptor.j("onSuccess", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = hr60.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hr60.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                vm50Var = (vm50) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vm50Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                vm50Var2 = (vm50) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), vm50Var2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new hr60(i, str, str2, str3, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hr60 hr60Var = (hr60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hr60.f;
        String str = hr60Var.a;
        vm50 vm50Var = hr60Var.e;
        vm50 vm50Var2 = hr60Var.d;
        String str2 = hr60Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, hr60Var.b);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
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
