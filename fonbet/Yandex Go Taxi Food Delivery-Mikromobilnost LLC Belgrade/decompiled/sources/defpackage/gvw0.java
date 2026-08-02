package defpackage;

import com.adjust.sdk.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class gvw0 implements uxs {
    public static final gvw0 a;
    private static final SerialDescriptor descriptor;

    static {
        gvw0 gvw0Var = new gvw0();
        a = gvw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeShortcutAction.Deeplink", gvw0Var, 1);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 0);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new ivw0(i, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ivw0 ivw0Var = (ivw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ivw0Var.a, "")) {
            b.o(serialDescriptor, 0, ivw0Var.a);
        }
        b.c(serialDescriptor);
    }
}
