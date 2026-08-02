package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;
import ru.yandex.taxi.eatskit.dto.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class f5p implements uxs {
    public static final f5p a;
    private static final SerialDescriptor descriptor;

    static {
        f5p f5pVar = new f5p();
        a = f5pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.push.model.Extras", f5pVar, 12);
        pluginGeneratedSerialDescriptor.j("chat_notify", true);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("msg_id", true);
        pluginGeneratedSerialDescriptor.j("save_promocode", true);
        pluginGeneratedSerialDescriptor.j("promocode", true);
        pluginGeneratedSerialDescriptor.j("show_ya_plus_fullscreen", true);
        pluginGeneratedSerialDescriptor.j("show_link_accounts", true);
        pluginGeneratedSerialDescriptor.j("external_service", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("external_service_data", true);
        pluginGeneratedSerialDescriptor.j("personal_wallet_balance_update", true);
        pluginGeneratedSerialDescriptor.j("fetch_widget", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(auu0Var);
        KSerializer n7 = qke.n(a.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, z96Var, n4, z96Var, z96Var, n5, n6, n7, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ExternalServiceData externalServiceData = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        boolean z3 = false;
        boolean z4 = false;
        String str6 = null;
        boolean z5 = false;
        boolean z6 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) b.s(serialDescriptor, 1, auu0.a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    externalServiceData = (ExternalServiceData) b.s(serialDescriptor, 9, a.a, externalServiceData);
                    i |= 512;
                    break;
                case 10:
                    z5 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    z6 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i5p(i, str2, str3, str4, z2, str5, z3, z4, str6, str, externalServiceData, z5, z6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i5p i5pVar = (i5p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || i5pVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, i5pVar.a);
        }
        if (b.F() || i5pVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, i5pVar.b);
        }
        if (b.F() || i5pVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, i5pVar.c);
        }
        if (b.F() || i5pVar.d) {
            b.n(serialDescriptor, 3, i5pVar.d);
        }
        if (b.F() || i5pVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, i5pVar.e);
        }
        if (b.F() || i5pVar.f) {
            b.n(serialDescriptor, 5, i5pVar.f);
        }
        if (b.F() || i5pVar.g) {
            b.n(serialDescriptor, 6, i5pVar.g);
        }
        if (b.F() || i5pVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, i5pVar.h);
        }
        if (b.F() || i5pVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, i5pVar.i);
        }
        if (b.F() || i5pVar.j != null) {
            b.g(serialDescriptor, 9, a.a, i5pVar.j);
        }
        if (b.F() || i5pVar.k) {
            b.n(serialDescriptor, 10, i5pVar.k);
        }
        if (b.F() || i5pVar.l) {
            b.n(serialDescriptor, 11, i5pVar.l);
        }
        b.c(serialDescriptor);
    }
}
