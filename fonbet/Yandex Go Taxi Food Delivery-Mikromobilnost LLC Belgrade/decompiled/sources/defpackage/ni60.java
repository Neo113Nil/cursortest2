package defpackage;

import defpackage.ri60;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ni60 implements uxs {
    public static final ni60 a;
    private static final SerialDescriptor descriptor;

    static {
        ni60 ni60Var = new ni60();
        a = ni60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.api.network.objects.NotificationOption", ni60Var, 2);
        pluginGeneratedSerialDescriptor.j("on", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(pi60.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ri60.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (ri60.a) b.s(serialDescriptor, 1, pi60.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ri60(i, str, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ri60 ri60Var = (ri60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ri60Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ri60Var.a);
        }
        if (b.F() || ri60Var.b != null) {
            b.g(serialDescriptor, 1, pi60.a, ri60Var.b);
        }
        b.c(serialDescriptor);
    }
}
