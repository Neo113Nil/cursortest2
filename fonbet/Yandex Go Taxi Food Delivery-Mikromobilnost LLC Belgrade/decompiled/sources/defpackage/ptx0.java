package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ptx0 implements uxs {
    public static final ptx0 a;
    private static final SerialDescriptor descriptor;

    static {
        ptx0 ptx0Var = new ptx0();
        a = ptx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.Taxi", ptx0Var, 3);
        pluginGeneratedSerialDescriptor.j("available", true);
        pluginGeneratedSerialDescriptor.j("nearest_zone", true);
        pluginGeneratedSerialDescriptor.j("unavailability_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n(auu0.a), qke.n(iw11.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        kw11 kw11Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                kw11Var = (kw11) b.s(serialDescriptor, 2, iw11.a, kw11Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rtx0(i, bool, str, kw11Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rtx0 rtx0Var = (rtx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || rtx0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, rtx0Var.a);
        }
        if (b.F() || rtx0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, rtx0Var.b);
        }
        if (b.F() || rtx0Var.c != null) {
            b.g(serialDescriptor, 2, iw11.a, rtx0Var.c);
        }
        b.c(serialDescriptor);
    }
}
