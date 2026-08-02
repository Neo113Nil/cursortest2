package defpackage;

import defpackage.jl90;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class fl90 implements uxs {
    public static final fl90 a;
    private static final SerialDescriptor descriptor;

    static {
        fl90 fl90Var = new fl90();
        a = fl90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.PassengerProfile", fl90Var, 4);
        pluginGeneratedSerialDescriptor.j("first_name", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("photo", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(hq21.a), hl90.a};
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
        jq21 jq21Var = null;
        jl90.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                jq21Var = (jq21) b.s(serialDescriptor, 2, hq21.a, jq21Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (jl90.a) b.A(serialDescriptor, 3, hl90.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new jl90(i, str, str2, jq21Var, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jl90 jl90Var = (jl90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        gl90 gl90Var = jl90.Companion;
        if (b.F() || jl90Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, jl90Var.a);
        }
        if (b.F() || jl90Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, jl90Var.b);
        }
        if (b.F() || jl90Var.c != null) {
            b.g(serialDescriptor, 2, hq21.a, jl90Var.c);
        }
        if (b.F() || !jl40.l(jl90Var.d, new jl90.a(0))) {
            b.e(serialDescriptor, 3, hl90.a, jl90Var.d);
        }
        b.c(serialDescriptor);
    }
}
