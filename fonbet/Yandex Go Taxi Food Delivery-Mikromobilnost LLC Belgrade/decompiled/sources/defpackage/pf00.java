package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class pf00 implements uxs {
    public static final pf00 a;
    private static final SerialDescriptor descriptor;

    static {
        pf00 pf00Var = new pf00();
        a = pf00Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.MapBubble", pf00Var, 4);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("selected_title", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(c7v.a);
        KSerializer n2 = qke.n(kj4.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, auu0Var, auu0Var, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        n7v n7vVar = null;
        String str = null;
        String str2 = null;
        oj4 oj4Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                n7vVar = (n7v) b.s(serialDescriptor, 0, c7v.a, n7vVar);
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
                oj4Var = (oj4) b.s(serialDescriptor, 3, kj4.a, oj4Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new rf00(i, n7vVar, str, str2, oj4Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rf00 rf00Var = (rf00) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || rf00Var.a != null) {
            b.g(serialDescriptor, 0, c7v.a, rf00Var.a);
        }
        if (b.F() || !jl40.l(rf00Var.b, "")) {
            b.o(serialDescriptor, 1, rf00Var.b);
        }
        if (b.F() || !jl40.l(rf00Var.c, "")) {
            b.o(serialDescriptor, 2, rf00Var.c);
        }
        if (b.F() || rf00Var.d != null) {
            b.g(serialDescriptor, 3, kj4.a, rf00Var.d);
        }
        b.c(serialDescriptor);
    }
}
