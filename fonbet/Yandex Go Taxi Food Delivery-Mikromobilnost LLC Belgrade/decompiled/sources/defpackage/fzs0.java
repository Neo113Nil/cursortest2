package defpackage;

import defpackage.jzs0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class fzs0 implements uxs {
    public static final fzs0 a;
    private static final SerialDescriptor descriptor;

    static {
        fzs0 fzs0Var = new fzs0();
        a = fzs0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.SmartNotification", fzs0Var, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, hzs0.a};
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
        jzs0.a aVar = null;
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
                aVar = (jzs0.a) b.A(serialDescriptor, 2, hzs0.a, aVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jzs0(i, str, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jzs0 jzs0Var = (jzs0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(jzs0Var.a, "")) {
            b.o(serialDescriptor, 0, jzs0Var.a);
        }
        if (b.F() || !jl40.l(jzs0Var.b, "")) {
            b.o(serialDescriptor, 1, jzs0Var.b);
        }
        if (b.F() || !jl40.l(jzs0Var.c, new jzs0.a(0))) {
            b.e(serialDescriptor, 2, hzs0.a, jzs0Var.c);
        }
        b.c(serialDescriptor);
    }
}
