package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ca7 implements uxs {
    public static final ca7 a;
    private static final SerialDescriptor descriptor;

    static {
        ca7 ca7Var = new ca7();
        a = ca7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.CableFeatureDto.Properties.CodeLock", ca7Var, 1);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
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
        return new ea7(i, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ea7 ea7Var = (ea7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ea7Var.a, "")) {
            b.o(serialDescriptor, 0, ea7Var.a);
        }
        b.c(serialDescriptor);
    }
}
