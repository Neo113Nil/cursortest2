package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class n5p implements uxs {
    public static final n5p a;
    private static final SerialDescriptor descriptor;

    static {
        n5p n5pVar = new n5p();
        a = n5pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.authorize.FTAuthorizeAction", n5pVar, 2);
        pluginGeneratedSerialDescriptor.j("onFail", true);
        pluginGeneratedSerialDescriptor.j("onSuccess", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p5p.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p5p.c;
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
        return new p5p(i, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p5p p5pVar = (p5p) obj;
        vm50 vm50Var = p5pVar.b;
        vm50 vm50Var2 = p5pVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p5p.c;
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
