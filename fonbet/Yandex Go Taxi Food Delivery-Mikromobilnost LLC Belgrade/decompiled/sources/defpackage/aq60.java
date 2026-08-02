package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class aq60 implements uxs {
    public static final aq60 a;
    private static final SerialDescriptor descriptor;

    static {
        aq60 aq60Var = new aq60();
        a = aq60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.ObjectsResponse", aq60Var, 12);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        pluginGeneratedSerialDescriptor.j("clean_sec", true);
        pluginGeneratedSerialDescriptor.j("throttle_ms", true);
        pluginGeneratedSerialDescriptor.j("validity_sec", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("optimal_view", true);
        pluginGeneratedSerialDescriptor.j("features", true);
        pluginGeneratedSerialDescriptor.j("selected_object_id", true);
        pluginGeneratedSerialDescriptor.j("disable_intersection_check", true);
        pluginGeneratedSerialDescriptor.j("status_view", true);
        pluginGeneratedSerialDescriptor.j("state_requirements_failed", true);
        pluginGeneratedSerialDescriptor.j("masstransit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cq60.o;
        KSerializer n = qke.n(uc4.Companion.serializer());
        pnz pnzVar = pnz.a;
        return new KSerializer[]{n, qke.n(pnzVar), qke.n(pnzVar), qke.n(pnzVar), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(ad70.a), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(auu0.a), qke.n(z96.a), qke.n(m9u0.a), qke.n(q5u0.a), qke.n(u210.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        uc4 uc4Var;
        w210 w210Var;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cq60.o;
        b.getClass();
        w210 w210Var2 = null;
        s5u0 s5u0Var = null;
        o9u0 o9u0Var = null;
        Boolean bool = null;
        boolean z2 = true;
        String str = null;
        int i = 0;
        uc4 uc4Var2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Float[] fArr = null;
        cd70 cd70Var = null;
        List list = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    w210Var = w210Var2;
                    z2 = false;
                    w210Var2 = w210Var;
                case 0:
                    w210Var = w210Var2;
                    uc4Var2 = (uc4) b.s(serialDescriptor, 0, uc4.Companion.serializer(), uc4Var2);
                    i |= 1;
                    z2 = z2;
                    w210Var2 = w210Var;
                case 1:
                    z = z2;
                    uc4Var = uc4Var2;
                    l = (Long) b.s(serialDescriptor, 1, pnz.a, l);
                    i |= 2;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 2:
                    z = z2;
                    uc4Var = uc4Var2;
                    l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                    i |= 4;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 3:
                    z = z2;
                    uc4Var = uc4Var2;
                    l3 = (Long) b.s(serialDescriptor, 3, pnz.a, l3);
                    i |= 8;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 4:
                    z = z2;
                    uc4Var = uc4Var2;
                    fArr = (Float[]) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), fArr);
                    i |= 16;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 5:
                    z = z2;
                    uc4Var = uc4Var2;
                    cd70Var = (cd70) b.s(serialDescriptor, 5, ad70.a, cd70Var);
                    i |= 32;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 6:
                    z = z2;
                    uc4Var = uc4Var2;
                    list = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 7:
                    z = z2;
                    uc4Var = uc4Var2;
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 8:
                    z = z2;
                    uc4Var = uc4Var2;
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 9:
                    z = z2;
                    uc4Var = uc4Var2;
                    o9u0Var = (o9u0) b.s(serialDescriptor, 9, m9u0.a, o9u0Var);
                    i |= 512;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 10:
                    z = z2;
                    uc4Var = uc4Var2;
                    s5u0Var = (s5u0) b.s(serialDescriptor, 10, q5u0.a, s5u0Var);
                    i |= 1024;
                    z2 = z;
                    uc4Var2 = uc4Var;
                case 11:
                    z = z2;
                    uc4Var = uc4Var2;
                    w210Var2 = (w210) b.s(serialDescriptor, 11, u210.a, w210Var2);
                    i |= 2048;
                    z2 = z;
                    uc4Var2 = uc4Var;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new cq60(i, uc4Var2, l, l2, l3, fArr, cd70Var, list, str, bool, o9u0Var, s5u0Var, w210Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cq60 cq60Var = (cq60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cq60.o;
        if (b.F() || cq60Var.a != null) {
            b.g(serialDescriptor, 0, uc4.Companion.serializer(), cq60Var.a);
        }
        if (b.F() || cq60Var.b != null) {
            b.g(serialDescriptor, 1, pnz.a, cq60Var.b);
        }
        if (b.F() || cq60Var.c != null) {
            b.g(serialDescriptor, 2, pnz.a, cq60Var.c);
        }
        if (b.F() || cq60Var.d != null) {
            b.g(serialDescriptor, 3, pnz.a, cq60Var.d);
        }
        if (b.F() || cq60Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), cq60Var.e);
        }
        if (b.F() || cq60Var.f != null) {
            b.g(serialDescriptor, 5, ad70.a, cq60Var.f);
        }
        if (b.F() || cq60Var.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), cq60Var.g);
        }
        if (b.F() || cq60Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, cq60Var.h);
        }
        if (b.F() || cq60Var.i != null) {
            b.g(serialDescriptor, 8, z96.a, cq60Var.i);
        }
        if (b.F() || cq60Var.j != null) {
            b.g(serialDescriptor, 9, m9u0.a, cq60Var.j);
        }
        if (b.F() || cq60Var.k != null) {
            b.g(serialDescriptor, 10, q5u0.a, cq60Var.k);
        }
        if (b.F() || cq60Var.l != null) {
            b.g(serialDescriptor, 11, u210.a, cq60Var.l);
        }
        b.c(serialDescriptor);
    }
}
