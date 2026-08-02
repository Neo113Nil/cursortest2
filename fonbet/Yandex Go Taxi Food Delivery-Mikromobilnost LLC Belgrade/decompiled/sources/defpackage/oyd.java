package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class oyd implements uxs {
    public static final oyd a;
    private static final SerialDescriptor descriptor;

    static {
        oyd oydVar = new oyd();
        a = oydVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ConditionalPlaqueDto", oydVar, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("rootWidget", false);
        pluginGeneratedSerialDescriptor.j("metricContext", false);
        pluginGeneratedSerialDescriptor.j("notification", false);
        pluginGeneratedSerialDescriptor.j("serviceMeta", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("showAfter", false);
        pluginGeneratedSerialDescriptor.j("closeAfter", false);
        pluginGeneratedSerialDescriptor.j("seenContext", false);
        pluginGeneratedSerialDescriptor.j("rootPredicate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = qyd.k;
        auu0 auu0Var = auu0.a;
        x3n x3nVar = x3n.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), i3yVarArr[4].getValue(), h6w.a, qke.n(x3nVar), qke.n(x3nVar), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[9].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = qyd.k;
        b.getClass();
        hle0 hle0Var = null;
        String str = null;
        boolean z = true;
        e3n e3nVar = null;
        int i = 0;
        String str2 = null;
        y251 y251Var = null;
        Map map = null;
        rh60 rh60Var = null;
        Map map2 = null;
        int i2 = 0;
        e3n e3nVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr2 = i3yVarArr;
                    z = false;
                    break;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr2 = i3yVarArr;
                    y251Var = (y251) b.A(serialDescriptor, 1, (myi) i3yVarArr2[1].getValue(), y251Var);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    map = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr2[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    rh60Var = (rh60) b.s(serialDescriptor, 3, (myi) i3yVarArr2[3].getValue(), rh60Var);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr2 = i3yVarArr;
                    map2 = (Map) b.A(serialDescriptor, 4, (myi) i3yVarArr2[4].getValue(), map2);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    e3nVar2 = (e3n) b.s(serialDescriptor, 6, x3n.a, e3nVar2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    e3nVar = (e3n) b.s(serialDescriptor, 7, x3n.a, e3nVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    hle0Var = (hle0) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), hle0Var);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr = i3yVarArr2;
        }
        b.c(serialDescriptor);
        return new qyd(i, str2, y251Var, map, rh60Var, map2, i2, e3nVar2, e3nVar, str, hle0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        qyd.l((qyd) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
