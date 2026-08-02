package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class fpj0 implements uxs {
    public static final fpj0 a;
    private static final SerialDescriptor descriptor;

    static {
        fpj0 fpj0Var = new fpj0();
        a = fpj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsOrderButtonDto", fpj0Var, 4);
        pluginGeneratedSerialDescriptor.j("__requirements__", true);
        pluginGeneratedSerialDescriptor.j("one", true);
        pluginGeneratedSerialDescriptor.j("many", true);
        pluginGeneratedSerialDescriptor.j("some", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{hpj0.f[0].getValue(), auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hpj0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new hpj0(map, str, str2, str3, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hpj0 hpj0Var = (hpj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hpj0.f;
        if (b.F() || !jl40.l(hpj0Var.a, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), hpj0Var.a);
        }
        if (b.F() || !jl40.l(hpj0Var.b, "")) {
            b.o(serialDescriptor, 1, hpj0Var.b);
        }
        if (b.F() || !jl40.l(hpj0Var.c, "")) {
            b.o(serialDescriptor, 2, hpj0Var.c);
        }
        if (b.F() || hpj0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, hpj0Var.d);
        }
        b.c(serialDescriptor);
    }
}
