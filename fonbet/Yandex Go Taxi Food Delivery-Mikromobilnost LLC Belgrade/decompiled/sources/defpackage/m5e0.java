package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class m5e0 implements uxs {
    public static final m5e0 a;
    private static final SerialDescriptor descriptor;

    static {
        m5e0 m5e0Var = new m5e0();
        a = m5e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolylinesResponse", m5e0Var, 6);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        pluginGeneratedSerialDescriptor.j("clean_sec", true);
        pluginGeneratedSerialDescriptor.j("throttle_ms", true);
        pluginGeneratedSerialDescriptor.j("validity_sec", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = o5e0.i;
        KSerializer n = qke.n(uc4.Companion.serializer());
        pnz pnzVar = pnz.a;
        return new KSerializer[]{n, qke.n(pnzVar), qke.n(pnzVar), qke.n(pnzVar), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = o5e0.i;
        b.getClass();
        boolean z = true;
        int i = 0;
        uc4 uc4Var = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Float[] fArr = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    uc4Var = (uc4) b.s(serialDescriptor, 0, uc4.Companion.serializer(), uc4Var);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) b.s(serialDescriptor, 1, pnz.a, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) b.s(serialDescriptor, 3, pnz.a, l3);
                    i |= 8;
                    break;
                case 4:
                    fArr = (Float[]) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), fArr);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new o5e0(i, uc4Var, l, l2, l3, fArr, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o5e0 o5e0Var = (o5e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = o5e0.i;
        if (b.F() || o5e0Var.a != null) {
            b.g(serialDescriptor, 0, uc4.Companion.serializer(), o5e0Var.a);
        }
        if (b.F() || o5e0Var.b != null) {
            b.g(serialDescriptor, 1, pnz.a, o5e0Var.b);
        }
        if (b.F() || o5e0Var.c != null) {
            b.g(serialDescriptor, 2, pnz.a, o5e0Var.c);
        }
        if (b.F() || o5e0Var.d != null) {
            b.g(serialDescriptor, 3, pnz.a, o5e0Var.d);
        }
        if (b.F() || o5e0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), o5e0Var.e);
        }
        if (b.F() || o5e0Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), o5e0Var.f);
        }
        b.c(serialDescriptor);
    }
}
