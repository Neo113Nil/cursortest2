package defpackage;

import com.adjust.sdk.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class ju7 implements uxs {
    public static final ju7 a;
    private static final SerialDescriptor descriptor;

    static {
        ju7 ju7Var = new ju7();
        a = ju7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.redirect.canmake.CanMakeExternalRedirectAction", ju7Var, 3);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, false);
        pluginGeneratedSerialDescriptor.j("packageName", false);
        pluginGeneratedSerialDescriptor.j("boolVariableName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new lu7(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lu7 lu7Var = (lu7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, lu7Var.a);
        b.o(serialDescriptor, 1, lu7Var.b);
        b.o(serialDescriptor, 2, lu7Var.c);
        b.c(serialDescriptor);
    }
}
