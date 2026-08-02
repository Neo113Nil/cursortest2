package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class lc61 implements uxs {
    public static final lc61 a;
    private static final SerialDescriptor descriptor;

    static {
        lc61 lc61Var = new lc61();
        a = lc61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.ZeroSuggestParams", lc61Var, 4);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("sections", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(b0t.a), r03.a, auu0.a, qke.n(i5q0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        v03 v03Var = null;
        String str = null;
        k5q0 k5q0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.s(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                v03Var = (v03) b.A(serialDescriptor, 1, r03.a, v03Var);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                k5q0Var = (k5q0) b.s(serialDescriptor, 3, i5q0.a, k5q0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new nc61(i, zzsVar, v03Var, str, k5q0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nc61 nc61Var = (nc61) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || nc61Var.a != null) {
            b.g(serialDescriptor, 0, b0t.a, nc61Var.a);
        }
        r03 r03Var = r03.a;
        v03 v03Var = nc61Var.b;
        k5q0 k5q0Var = nc61Var.d;
        b.e(serialDescriptor, 1, r03Var, v03Var);
        b.o(serialDescriptor, 2, nc61Var.c);
        if (b.F() || k5q0Var != null) {
            b.g(serialDescriptor, 3, i5q0.a, k5q0Var);
        }
        b.c(serialDescriptor);
    }
}
