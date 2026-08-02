package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class j160 implements uxs {
    public static final j160 a;
    private static final SerialDescriptor descriptor;

    static {
        j160 j160Var = new j160();
        a = j160Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkSwitchWidgetModel", j160Var, 7);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("textItems", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = l160.h;
        KSerializer serializer = pq50.Companion.serializer();
        KSerializer n = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n2 = qke.n(co50.Companion.serializer());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[6].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{wr50.a, serializer, auu0Var, auu0Var, n, n2, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l160.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        co50 co50Var = null;
        pq50 pq50Var = null;
        yr50 yr50Var = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    yr50Var = (yr50) b.A(serialDescriptor, 0, wr50.a, yr50Var);
                    i |= 1;
                    break;
                case 1:
                    pq50Var = (pq50) b.A(serialDescriptor, 1, pq50.Companion.serializer(), pq50Var);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    co50Var = (co50) b.s(serialDescriptor, 5, co50.Companion.serializer(), co50Var);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new l160(i, co50Var, pq50Var, yr50Var, str, str2, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l160 l160Var = (l160) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l160.h;
        wr50 wr50Var = wr50.a;
        yr50 yr50Var = l160Var.a;
        List list = l160Var.g;
        co50 co50Var = l160Var.f;
        List list2 = l160Var.e;
        b.e(serialDescriptor, 0, wr50Var, yr50Var);
        b.e(serialDescriptor, 1, pq50.Companion.serializer(), l160Var.b);
        b.o(serialDescriptor, 2, l160Var.c);
        b.o(serialDescriptor, 3, l160Var.d);
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), list2);
        }
        if (b.F() || co50Var != null) {
            b.g(serialDescriptor, 5, co50.Companion.serializer(), co50Var);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
