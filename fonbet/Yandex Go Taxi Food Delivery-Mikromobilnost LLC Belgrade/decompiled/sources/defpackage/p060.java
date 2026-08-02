package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class p060 implements uxs {
    public static final p060 a;
    private static final SerialDescriptor descriptor;

    static {
        p060 p060Var = new p060();
        a = p060Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkSpacerWidgetModel", p060Var, 6);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = r060.g;
        KSerializer serializer = pq50.Companion.serializer();
        KSerializer n = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n2 = qke.n(co50.Companion.serializer());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{wr50.a, serializer, auu0Var, auu0Var, n, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r060.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        yr50 yr50Var = null;
        pq50 pq50Var = null;
        String str = null;
        String str2 = null;
        List list = null;
        co50 co50Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
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
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new r060(i, yr50Var, pq50Var, str, str2, list, co50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r060 r060Var = (r060) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r060.g;
        wr50 wr50Var = wr50.a;
        yr50 yr50Var = r060Var.a;
        co50 co50Var = r060Var.f;
        List list = r060Var.e;
        b.e(serialDescriptor, 0, wr50Var, yr50Var);
        b.e(serialDescriptor, 1, pq50.Companion.serializer(), r060Var.b);
        b.o(serialDescriptor, 2, r060Var.c);
        b.o(serialDescriptor, 3, r060Var.d);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), list);
        }
        if (b.F() || co50Var != null) {
            b.g(serialDescriptor, 5, co50.Companion.serializer(), co50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
