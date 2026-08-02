package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class e6p implements uxs {
    public static final e6p a;
    private static final SerialDescriptor descriptor;

    static {
        e6p e6pVar = new e6p();
        a = e6pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.actions.FTRequestAction", e6pVar, 13);
        pluginGeneratedSerialDescriptor.j("method", false);
        pluginGeneratedSerialDescriptor.j("baseURL", false);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("timeout", false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        pluginGeneratedSerialDescriptor.j("queryItems", false);
        pluginGeneratedSerialDescriptor.j("requestMap", false);
        pluginGeneratedSerialDescriptor.j("responseMap", false);
        pluginGeneratedSerialDescriptor.j("failedResponseMap", false);
        pluginGeneratedSerialDescriptor.j("successAction", false);
        pluginGeneratedSerialDescriptor.j("failureAction", false);
        pluginGeneratedSerialDescriptor.j("statusCodeVarPath", false);
        pluginGeneratedSerialDescriptor.j("errorVarPath", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = i6p.n;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0Var, auu0Var, e6m.a, qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue(), i3yVarArr[7].getValue(), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n((KSerializer) i3yVarArr[10].getValue()), qke.n((KSerializer) i3yVarArr[11].getValue()), qke.n((KSerializer) i3yVarArr[12].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        double d;
        String str;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i6p.n;
        b.getClass();
        double d2 = 0.0d;
        kr krVar = null;
        kr krVar2 = null;
        Map map = null;
        Map map2 = null;
        List list = null;
        Map map3 = null;
        Map map4 = null;
        int i = 0;
        RestMethod restMethod = null;
        List list2 = null;
        String str3 = null;
        Map map5 = null;
        boolean z = true;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    d = d2;
                    z = false;
                    d2 = d;
                case 0:
                    str = str3;
                    d = d2;
                    restMethod = (RestMethod) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), restMethod);
                    i |= 1;
                    str3 = str;
                    d2 = d;
                case 1:
                    str2 = str3;
                    str4 = b.k(serialDescriptor, 1);
                    i |= 2;
                    str3 = str2;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                case 3:
                    str2 = str3;
                    d2 = b.E(serialDescriptor, 3);
                    i |= 8;
                    str3 = str2;
                case 4:
                    str = str3;
                    d = d2;
                    map5 = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map5);
                    i |= 16;
                    str3 = str;
                    d2 = d;
                case 5:
                    str = str3;
                    d = d2;
                    map3 = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map3);
                    i |= 32;
                    str3 = str;
                    d2 = d;
                case 6:
                    str = str3;
                    d = d2;
                    map4 = (Map) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map4);
                    i |= 64;
                    str3 = str;
                    d2 = d;
                case 7:
                    str = str3;
                    d = d2;
                    map2 = (Map) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map2);
                    i |= 128;
                    str3 = str;
                    d2 = d;
                case 8:
                    str = str3;
                    d = d2;
                    map = (Map) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), map);
                    i |= 256;
                    str3 = str;
                    d2 = d;
                case 9:
                    str = str3;
                    d = d2;
                    krVar2 = (kr) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), krVar2);
                    i |= 512;
                    str3 = str;
                    d2 = d;
                case 10:
                    str = str3;
                    d = d2;
                    krVar = (kr) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), krVar);
                    i |= 1024;
                    str3 = str;
                    d2 = d;
                case 11:
                    str = str3;
                    d = d2;
                    list = (List) b.s(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list);
                    i |= 2048;
                    str3 = str;
                    d2 = d;
                case 12:
                    str = str3;
                    d = d2;
                    list2 = (List) b.s(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list2);
                    i |= 4096;
                    str3 = str;
                    d2 = d;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i6p(i, restMethod, str4, str3, d2, map5, map3, map4, map2, map, krVar2, krVar, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i6p i6pVar = (i6p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i6p.n;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), i6pVar.a);
        b.o(serialDescriptor, 1, i6pVar.b);
        b.o(serialDescriptor, 2, i6pVar.c);
        b.E(serialDescriptor, 3, i6pVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), i6pVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), i6pVar.f);
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), i6pVar.g);
        b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), i6pVar.h);
        b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), i6pVar.i);
        b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), i6pVar.j);
        b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), i6pVar.k);
        b.g(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), i6pVar.l);
        b.g(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), i6pVar.m);
        b.c(serialDescriptor);
    }
}
