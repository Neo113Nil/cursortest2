package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class p160 implements uxs {
    public static final p160 a;
    private static final SerialDescriptor descriptor;

    static {
        p160 p160Var = new p160();
        a = p160Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkTextWidgetModel", p160Var, 8);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("textItems", false);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("lineHeight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = r160.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{wr50.a, pq50.Companion.serializer(), auu0Var, auu0Var, i3yVarArr[4].getValue(), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(co50.Companion.serializer()), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r160.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Integer num = null;
        yr50 yr50Var = null;
        pq50 pq50Var = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        co50 co50Var = null;
        int i = 0;
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
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    co50Var = (co50) b.s(serialDescriptor, 6, co50.Companion.serializer(), co50Var);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new r160(i, yr50Var, pq50Var, str, str2, list, list2, co50Var, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r160 r160Var = (r160) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r160.i;
        wr50 wr50Var = wr50.a;
        yr50 yr50Var = r160Var.a;
        Integer num = r160Var.h;
        co50 co50Var = r160Var.g;
        List list = r160Var.f;
        b.e(serialDescriptor, 0, wr50Var, yr50Var);
        b.e(serialDescriptor, 1, pq50.Companion.serializer(), r160Var.b);
        b.o(serialDescriptor, 2, r160Var.c);
        b.o(serialDescriptor, 3, r160Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), r160Var.e);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), list);
        }
        if (b.F() || co50Var != null) {
            b.g(serialDescriptor, 6, co50.Companion.serializer(), co50Var);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 7, h6w.a, num);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
