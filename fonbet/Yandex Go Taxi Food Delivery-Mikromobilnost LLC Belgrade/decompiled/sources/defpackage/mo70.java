package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class mo70 implements uxs {
    public static final mo70 a;
    private static final SerialDescriptor descriptor;

    static {
        mo70 mo70Var = new mo70();
        a = mo70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.order.analytics.marknotify.OrderClickInfo", mo70Var, 8);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("widget_id", true);
        pluginGeneratedSerialDescriptor.j("button_name", true);
        pluginGeneratedSerialDescriptor.j("button_id", true);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("order_status", true);
        pluginGeneratedSerialDescriptor.j("action_type", true);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) b.s(serialDescriptor, 6, auu0.a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new oo70(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oo70 oo70Var = (oo70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || oo70Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, oo70Var.a);
        }
        if (b.F() || oo70Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, oo70Var.b);
        }
        if (b.F() || oo70Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, oo70Var.c);
        }
        if (b.F() || oo70Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, oo70Var.d);
        }
        if (b.F() || oo70Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, oo70Var.e);
        }
        if (b.F() || oo70Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, oo70Var.f);
        }
        if (b.F() || oo70Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, oo70Var.g);
        }
        if (b.F() || !jl40.l(oo70Var.h, "")) {
            b.o(serialDescriptor, 7, oo70Var.h);
        }
        b.c(serialDescriptor);
    }
}
