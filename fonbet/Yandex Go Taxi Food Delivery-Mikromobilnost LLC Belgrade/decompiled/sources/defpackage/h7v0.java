package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.persuggest.api.suggest.Action;

/* loaded from: classes6.dex */
public final /* synthetic */ class h7v0 implements uxs {
    public static final h7v0 a;
    private static final SerialDescriptor descriptor;

    static {
        h7v0 h7v0Var = new h7v0();
        a = h7v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.suggest.SuggestParams", h7v0Var, 11);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("client_reqid", false);
        pluginGeneratedSerialDescriptor.j("part", true);
        pluginGeneratedSerialDescriptor.j("prev_log", true);
        pluginGeneratedSerialDescriptor.j("suggest_serpid", true);
        pluginGeneratedSerialDescriptor.j("client_choose_geocoder_override", true);
        pluginGeneratedSerialDescriptor.j("session_info", true);
        pluginGeneratedSerialDescriptor.j("event_number", true);
        pluginGeneratedSerialDescriptor.j("current_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{p7v0.l[0].getValue(), r03.a, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(m7v0.a), qke.n(j7v0.a), qke.n(h6w.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = p7v0.l;
        b.getClass();
        String str = null;
        Integer num = null;
        l7v0 l7v0Var = null;
        boolean z2 = true;
        o7v0 o7v0Var = null;
        int i = 0;
        Action action = null;
        v03 v03Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    action = (Action) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), action);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    v03Var = (v03) b.A(serialDescriptor, 1, r03.a, v03Var);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 2:
                    i3yVarArr2 = i3yVarArr3;
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr2;
                case 3:
                    i3yVarArr2 = i3yVarArr3;
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr2;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 6:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 7:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    o7v0Var = (o7v0) b.s(serialDescriptor, 7, m7v0.a, o7v0Var);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 8:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    l7v0Var = (l7v0) b.s(serialDescriptor, 8, j7v0.a, l7v0Var);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 9:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 9, h6w.a, num);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 10:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new p7v0(i, action, v03Var, str2, str3, str4, str5, str6, o7v0Var, l7v0Var, num, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p7v0 p7v0Var = (p7v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) p7v0.l[0].getValue();
        Action action = p7v0Var.a;
        String str = p7v0Var.k;
        Integer num = p7v0Var.j;
        l7v0 l7v0Var = p7v0Var.i;
        o7v0 o7v0Var = p7v0Var.h;
        String str2 = p7v0Var.g;
        String str3 = p7v0Var.f;
        String str4 = p7v0Var.e;
        b.e(serialDescriptor, 0, kSerializer, action);
        b.e(serialDescriptor, 1, r03.a, p7v0Var.b);
        b.o(serialDescriptor, 2, p7v0Var.c);
        b.o(serialDescriptor, 3, p7v0Var.d);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 4, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 5, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 6, auu0.a, str2);
        }
        if (b.F() || o7v0Var != null) {
            b.g(serialDescriptor, 7, m7v0.a, o7v0Var);
        }
        if (b.F() || l7v0Var != null) {
            b.g(serialDescriptor, 8, j7v0.a, l7v0Var);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 9, h6w.a, num);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 10, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
