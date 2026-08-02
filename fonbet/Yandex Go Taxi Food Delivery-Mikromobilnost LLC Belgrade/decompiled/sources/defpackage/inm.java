package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes5.dex */
public final /* synthetic */ class inm implements uxs {
    public static final inm a;
    private static final SerialDescriptor descriptor;

    static {
        inm inmVar = new inm();
        a = inmVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.DropoffPointDto", inmVar, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, true);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, nud0.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        pud0 pud0Var = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                pud0Var = (pud0) b.A(serialDescriptor, 1, nud0.a, pud0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new knm(i, pud0Var, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        knm knmVar = (knm) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(knmVar.a, "")) {
            b.o(serialDescriptor, 0, knmVar.a);
        }
        if (b.F() || !jl40.l(knmVar.b, new pud0(0))) {
            b.e(serialDescriptor, 1, nud0.a, knmVar.b);
        }
        if (b.F() || !jl40.l(knmVar.c, "")) {
            b.o(serialDescriptor, 2, knmVar.c);
        }
        b.c(serialDescriptor);
    }
}
