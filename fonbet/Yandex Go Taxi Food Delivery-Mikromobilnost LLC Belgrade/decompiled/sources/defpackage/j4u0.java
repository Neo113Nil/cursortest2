package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class j4u0 implements uxs {
    public static final j4u0 a;
    private static final SerialDescriptor descriptor;

    static {
        j4u0 j4u0Var = new j4u0();
        a = j4u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.StateDto", j4u0Var, 6);
        pluginGeneratedSerialDescriptor.j("wallets", true);
        pluginGeneratedSerialDescriptor.j("subscription", true);
        pluginGeneratedSerialDescriptor.j("settings", true);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        pluginGeneratedSerialDescriptor.j("badge_style", true);
        pluginGeneratedSerialDescriptor.j("templates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = l4u0.g;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n(m0v0.a), qke.n(s7r0.a), qke.n(uk60.a), qke.n(nm4.a), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l4u0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        o0v0 o0v0Var = null;
        u7r0 u7r0Var = null;
        wk60 wk60Var = null;
        pm4 pm4Var = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    o0v0Var = (o0v0) b.s(serialDescriptor, 1, m0v0.a, o0v0Var);
                    i |= 2;
                    break;
                case 2:
                    u7r0Var = (u7r0) b.s(serialDescriptor, 2, s7r0.a, u7r0Var);
                    i |= 4;
                    break;
                case 3:
                    wk60Var = (wk60) b.s(serialDescriptor, 3, uk60.a, wk60Var);
                    i |= 8;
                    break;
                case 4:
                    pm4Var = (pm4) b.s(serialDescriptor, 4, nm4.a, pm4Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new l4u0(i, list, o0v0Var, u7r0Var, wk60Var, pm4Var, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l4u0 l4u0Var = (l4u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l4u0.g;
        if (b.F() || l4u0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), l4u0Var.a);
        }
        if (b.F() || l4u0Var.b != null) {
            b.g(serialDescriptor, 1, m0v0.a, l4u0Var.b);
        }
        if (b.F() || l4u0Var.c != null) {
            b.g(serialDescriptor, 2, s7r0.a, l4u0Var.c);
        }
        if (b.F() || l4u0Var.d != null) {
            b.g(serialDescriptor, 3, uk60.a, l4u0Var.d);
        }
        if (b.F() || l4u0Var.e != null) {
            b.g(serialDescriptor, 4, nm4.a, l4u0Var.e);
        }
        if (b.F() || l4u0Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), l4u0Var.f);
        }
        b.c(serialDescriptor);
    }
}
