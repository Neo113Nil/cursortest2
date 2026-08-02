package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes6.dex */
public final /* synthetic */ class h3o implements uxs {
    public static final h3o a;
    private static final SerialDescriptor descriptor;

    static {
        h3o h3oVar = new h3o();
        a = h3oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.EntranceItem", h3oVar, 4);
        pluginGeneratedSerialDescriptor.j("entrance_number", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(b0t.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new j3o(i, zzsVar, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j3o j3oVar = (j3o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || j3oVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, j3oVar.a);
        }
        if (b.F() || j3oVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, j3oVar.b);
        }
        if (b.F() || j3oVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, j3oVar.c);
        }
        if (b.F() || j3oVar.d != null) {
            b.g(serialDescriptor, 3, b0t.a, j3oVar.d);
        }
        b.c(serialDescriptor);
    }
}
