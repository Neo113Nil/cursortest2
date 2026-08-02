package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class kee0 implements uxs {
    public static final kee0 a;
    private static final SerialDescriptor descriptor;

    static {
        kee0 kee0Var = new kee0();
        a = kee0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.PostMessageAction", kee0Var, 3);
        pluginGeneratedSerialDescriptor.j("messageName", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("parametersMapping", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, elk.a, qke.n((KSerializer) mee0.d[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mee0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ilk ilkVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                ilkVar = (ilk) b.A(serialDescriptor, 1, elk.a, ilkVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new mee0(i, str, ilkVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mee0 mee0Var = (mee0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mee0.d;
        String str = mee0Var.a;
        List list = mee0Var.c;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, elk.a, mee0Var.b);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
