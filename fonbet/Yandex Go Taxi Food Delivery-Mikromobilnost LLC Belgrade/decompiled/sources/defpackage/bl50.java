package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class bl50 implements uxs {
    public static final bl50 a;
    private static final SerialDescriptor descriptor;

    static {
        bl50 bl50Var = new bl50();
        a = bl50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.NearestPositionParam", bl50Var, 5);
        pluginGeneratedSerialDescriptor.j("supported", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("ll", true);
        pluginGeneratedSerialDescriptor.j("not_sticky", true);
        pluginGeneratedSerialDescriptor.j("dx", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dl50.f[0].getValue(), qke.n(auu0.a), qke.n(b0t.a), qke.n(z96.a), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dl50.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        String str = null;
        zzs zzsVar = null;
        Boolean bool = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                zzsVar = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar);
                i |= 4;
            } else if (v == 3) {
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new dl50(i, set, str, zzsVar, bool, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dl50 dl50Var = (dl50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dl50.f;
        if (b.F() || !jl40.l(dl50Var.a, dl50.g)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), dl50Var.a);
        }
        if (b.F() || dl50Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, dl50Var.b);
        }
        if (b.F() || dl50Var.c != null) {
            b.g(serialDescriptor, 2, b0t.a, dl50Var.c);
        }
        if (b.F() || dl50Var.d != null) {
            b.g(serialDescriptor, 3, z96.a, dl50Var.d);
        }
        if (b.F() || dl50Var.e != null) {
            b.g(serialDescriptor, 4, h6w.a, dl50Var.e);
        }
        b.c(serialDescriptor);
    }
}
