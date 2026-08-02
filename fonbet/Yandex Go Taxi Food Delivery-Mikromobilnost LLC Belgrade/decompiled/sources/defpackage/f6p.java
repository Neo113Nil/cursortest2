package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class f6p implements uxs {
    public static final f6p a;
    private static final SerialDescriptor descriptor;

    static {
        f6p f6pVar = new f6p();
        a = f6pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.FTRequestAction", f6pVar, 14);
        pluginGeneratedSerialDescriptor.j("baseURL", false);
        pluginGeneratedSerialDescriptor.j("errorBodyLoggingRule", false);
        pluginGeneratedSerialDescriptor.j("errorVarPath", false);
        pluginGeneratedSerialDescriptor.j("failedResponseMap", false);
        pluginGeneratedSerialDescriptor.j("failureAction", false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        pluginGeneratedSerialDescriptor.j("method", false);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("queryItems", false);
        pluginGeneratedSerialDescriptor.j("requestMap", false);
        pluginGeneratedSerialDescriptor.j("responseMap", false);
        pluginGeneratedSerialDescriptor.j("statusCodeVarPath", false);
        pluginGeneratedSerialDescriptor.j("successAction", false);
        pluginGeneratedSerialDescriptor.j("timeout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = j6p.o;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(y5o.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue(), auu0Var, qke.n((KSerializer) i3yVarArr[8].getValue()), i3yVarArr[9].getValue(), i3yVarArr[10].getValue(), qke.n((KSerializer) i3yVarArr[11].getValue()), qke.n((KSerializer) i3yVarArr[12].getValue()), e6m.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j6p.o;
        b.getClass();
        double d = 0.0d;
        vm50 vm50Var = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        boolean z3 = true;
        RestMethod restMethod = null;
        Map map3 = null;
        int i = 0;
        String str2 = null;
        a6o a6oVar = null;
        List list2 = null;
        Map map4 = null;
        vm50 vm50Var2 = null;
        Map map5 = null;
        String str3 = null;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                case 0:
                    z = z3;
                    i |= 1;
                    str2 = b.k(serialDescriptor, 0);
                    z3 = z;
                case 1:
                    z2 = z3;
                    str = str2;
                    a6oVar = (a6o) b.s(serialDescriptor, 1, y5o.a, a6oVar);
                    i |= 2;
                    z3 = z2;
                    str2 = str;
                case 2:
                    z2 = z3;
                    str = str2;
                    list2 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                    i |= 4;
                    z3 = z2;
                    str2 = str;
                case 3:
                    z2 = z3;
                    str = str2;
                    map4 = (Map) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map4);
                    i |= 8;
                    z3 = z2;
                    str2 = str;
                case 4:
                    z2 = z3;
                    str = str2;
                    vm50Var2 = (vm50) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), vm50Var2);
                    i |= 16;
                    z3 = z2;
                    str2 = str;
                case 5:
                    z2 = z3;
                    str = str2;
                    map5 = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map5);
                    i |= 32;
                    z3 = z2;
                    str2 = str;
                case 6:
                    z2 = z3;
                    str = str2;
                    restMethod = (RestMethod) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), restMethod);
                    i |= 64;
                    z3 = z2;
                    str2 = str;
                case 7:
                    z = z3;
                    str3 = b.k(serialDescriptor, 7);
                    i |= 128;
                    z3 = z;
                case 8:
                    z2 = z3;
                    str = str2;
                    map3 = (Map) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), map3);
                    i |= 256;
                    z3 = z2;
                    str2 = str;
                case 9:
                    z2 = z3;
                    str = str2;
                    map2 = (Map) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), map2);
                    i |= 512;
                    z3 = z2;
                    str2 = str;
                case 10:
                    z2 = z3;
                    str = str2;
                    map = (Map) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), map);
                    i |= 1024;
                    z3 = z2;
                    str2 = str;
                case 11:
                    z2 = z3;
                    str = str2;
                    list = (List) b.s(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list);
                    i |= 2048;
                    z3 = z2;
                    str2 = str;
                case 12:
                    z2 = z3;
                    str = str2;
                    vm50Var = (vm50) b.s(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), vm50Var);
                    i |= 4096;
                    z3 = z2;
                    str2 = str;
                case 13:
                    z = z3;
                    d = b.E(serialDescriptor, 13);
                    i |= 8192;
                    z3 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new j6p(i, str2, a6oVar, list2, map4, vm50Var2, map5, restMethod, str3, map3, map2, map, list, vm50Var, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j6p j6pVar = (j6p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j6p.o;
        b.o(serialDescriptor, 0, j6pVar.a);
        b.g(serialDescriptor, 1, y5o.a, j6pVar.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), j6pVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), j6pVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), j6pVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), j6pVar.f);
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), j6pVar.g);
        b.o(serialDescriptor, 7, j6pVar.h);
        b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), j6pVar.i);
        b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), j6pVar.j);
        b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), j6pVar.k);
        b.g(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), j6pVar.l);
        b.g(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), j6pVar.m);
        b.E(serialDescriptor, 13, j6pVar.n);
        b.c(serialDescriptor);
    }
}
