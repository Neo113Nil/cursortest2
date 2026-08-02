package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq50 implements uxs {
    public static final aq50 a;
    private static final SerialDescriptor descriptor;

    static {
        aq50 aq50Var = new aq50();
        a = aq50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkConditionalPlaqueModel", aq50Var, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("feedbackToken", false);
        pluginGeneratedSerialDescriptor.j("rootWidgetId", false);
        pluginGeneratedSerialDescriptor.j("predicatesTree", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("showAfterMillis", false);
        pluginGeneratedSerialDescriptor.j("closeAfterMillis", false);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("serviceMeta", true);
        pluginGeneratedSerialDescriptor.j("metricContext", true);
        pluginGeneratedSerialDescriptor.j("seenContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cq50.l;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(sx50.Companion.serializer());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[8].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[9].getValue());
        KSerializer n4 = qke.n(auu0Var);
        pnz pnzVar = pnz.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, ty50.a, h6w.a, pnzVar, pnzVar, n, n2, n3, n4};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = cq50.l;
        b.getClass();
        long j = 0;
        long j2 = 0;
        String str = null;
        Map map = null;
        boolean z = true;
        sx50 sx50Var = null;
        Map map2 = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        vy50 vy50Var = null;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    vy50Var = (vy50) b.A(serialDescriptor, 3, ty50.a, vy50Var);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    j = b.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    j2 = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    sx50Var = (sx50) b.s(serialDescriptor, 7, sx50.Companion.serializer(), sx50Var);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    map2 = (Map) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), map2);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), map);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new cq50(i, str2, str3, str4, vy50Var, i2, j, j2, sx50Var, map2, map, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cq50 cq50Var = (cq50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cq50.l;
        String str = cq50Var.a;
        String str2 = cq50Var.k;
        Map map = cq50Var.j;
        Map map2 = cq50Var.i;
        sx50 sx50Var = cq50Var.h;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, cq50Var.b);
        b.o(serialDescriptor, 2, cq50Var.c);
        b.e(serialDescriptor, 3, ty50.a, cq50Var.d);
        b.A(4, cq50Var.e, serialDescriptor);
        b.s(serialDescriptor, 5, cq50Var.f);
        b.s(serialDescriptor, 6, cq50Var.g);
        if (b.F() || sx50Var != null) {
            b.g(serialDescriptor, 7, sx50.Companion.serializer(), sx50Var);
        }
        if (b.F() || map2 != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), map2);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), map);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 10, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
