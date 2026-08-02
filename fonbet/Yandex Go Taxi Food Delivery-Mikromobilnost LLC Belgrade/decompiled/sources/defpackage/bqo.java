package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class bqo implements uxs {
    public static final bqo a;
    private static final SerialDescriptor descriptor;

    static {
        bqo bqoVar = new bqo();
        a = bqoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.ExpectedDestinationsParam", bqoVar, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("ll", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("current_mode", false);
        pluginGeneratedSerialDescriptor.j("with_userplaces", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, b0t.a, auu0Var, qke.n(auu0Var), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        zzs zzsVar = null;
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
                zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new dqo(i, str, zzsVar, str2, str3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dqo dqoVar = (dqo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = dqoVar.a;
        boolean z = dqoVar.e;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, b0t.a, dqoVar.b);
        b.o(serialDescriptor, 2, dqoVar.c);
        b.g(serialDescriptor, 3, auu0.a, dqoVar.d);
        if (b.F() || !z) {
            b.n(serialDescriptor, 4, z);
        }
        b.c(serialDescriptor);
    }
}
