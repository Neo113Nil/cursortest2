package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class m060 implements uxs {
    public static final m060 a;
    private static final SerialDescriptor descriptor;

    static {
        m060 m060Var = new m060();
        a = m060Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkSimplePlaqueModel", m060Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("feedbackToken", false);
        pluginGeneratedSerialDescriptor.j("rootWidgetId", false);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("serviceMeta", true);
        pluginGeneratedSerialDescriptor.j("metricContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = o060.g;
        KSerializer n = qke.n(sx50.Companion.serializer());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[5].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n, n2, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = o060.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        sx50 sx50Var = null;
        Map map = null;
        Map map2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    sx50Var = (sx50) b.s(serialDescriptor, 3, sx50.Companion.serializer(), sx50Var);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    map2 = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new o060(i, str, str2, str3, sx50Var, map, map2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o060 o060Var = (o060) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = o060.g;
        String str = o060Var.a;
        Map map = o060Var.f;
        Map map2 = o060Var.e;
        sx50 sx50Var = o060Var.d;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, o060Var.b);
        b.o(serialDescriptor, 2, o060Var.c);
        if (b.F() || sx50Var != null) {
            b.g(serialDescriptor, 3, sx50.Companion.serializer(), sx50Var);
        }
        if (b.F() || map2 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), map2);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
