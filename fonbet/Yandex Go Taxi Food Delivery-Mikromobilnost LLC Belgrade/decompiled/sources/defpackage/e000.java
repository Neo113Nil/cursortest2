package defpackage;

import defpackage.i000;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class e000 implements uxs {
    public static final e000 a;
    private static final SerialDescriptor descriptor;

    static {
        e000 e000Var = new e000();
        a = e000Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.Maas", e000Var, 2);
        pluginGeneratedSerialDescriptor.j("menu_button", true);
        pluginGeneratedSerialDescriptor.j("coupon_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g000.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        i000.a aVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (i000.a) b.A(serialDescriptor, 0, g000.a, aVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new i000(i, aVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i000 i000Var = (i000) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        f000 f000Var = i000.Companion;
        if (b.F() || !jl40.l(i000Var.a, i000.a.e)) {
            b.e(serialDescriptor, 0, g000.a, i000Var.a);
        }
        if (b.F() || !jl40.l(i000Var.b, "")) {
            b.o(serialDescriptor, 1, i000Var.b);
        }
        b.c(serialDescriptor);
    }
}
