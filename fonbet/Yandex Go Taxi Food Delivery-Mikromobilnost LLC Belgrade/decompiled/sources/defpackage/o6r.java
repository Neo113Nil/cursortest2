package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes9.dex */
public final /* synthetic */ class o6r implements uxs {
    public static final o6r a;
    private static final SerialDescriptor descriptor;

    static {
        o6r o6rVar = new o6r();
        a = o6rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.FinalSuggestParams", o6rVar, 13);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("position_update_time", false);
        pluginGeneratedSerialDescriptor.j("position_location_provider", false);
        pluginGeneratedSerialDescriptor.j("position_init_action", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("entrance", true);
        pluginGeneratedSerialDescriptor.j("prev_log", false);
        pluginGeneratedSerialDescriptor.j("sticky", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("layers_log", true);
        pluginGeneratedSerialDescriptor.j("geo_tap", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q6r.n;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), b0t.a, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), r03.a, qke.n(auu0Var), qke.n(auu0Var), z96Var, auu0Var, qke.n(auu0Var), z96Var, qke.n(id7.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = q6r.n;
        b.getClass();
        kd7 kd7Var = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Action action = null;
        zzs zzsVar = null;
        String str3 = null;
        LocationProvider locationProvider = null;
        PositionInitAction positionInitAction = null;
        v03 v03Var = null;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    action = (Action) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), action);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    locationProvider = (LocationProvider) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), locationProvider);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    positionInitAction = (PositionInitAction) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), positionInitAction);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    v03Var = (v03) b.A(serialDescriptor, 5, r03.a, v03Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    z3 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    i3yVarArr = i3yVarArr2;
                    kd7Var = (kd7) b.s(serialDescriptor, 12, id7.a, kd7Var);
                    i |= 4096;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new q6r(i, action, zzsVar, str3, locationProvider, positionInitAction, v03Var, str4, str2, z2, str5, str, z3, kd7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q6r q6rVar = (q6r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q6r.n;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        Action action = q6rVar.a;
        kd7 kd7Var = q6rVar.m;
        boolean z = q6rVar.l;
        String str = q6rVar.k;
        String str2 = q6rVar.g;
        b.e(serialDescriptor, 0, kSerializer, action);
        b.e(serialDescriptor, 1, b0t.a, q6rVar.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, q6rVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), q6rVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), q6rVar.e);
        b.e(serialDescriptor, 5, r03.a, q6rVar.f);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 6, auu0Var, str2);
        }
        b.g(serialDescriptor, 7, auu0Var, q6rVar.h);
        b.n(serialDescriptor, 8, q6rVar.i);
        b.o(serialDescriptor, 9, q6rVar.j);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 10, auu0Var, str);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 11, z);
        }
        if (b.F() || kd7Var != null) {
            b.g(serialDescriptor, 12, id7.a, kd7Var);
        }
        b.c(serialDescriptor);
    }
}
