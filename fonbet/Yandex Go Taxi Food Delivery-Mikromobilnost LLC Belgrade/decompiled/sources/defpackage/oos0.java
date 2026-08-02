package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.communications.model.widgets.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class oos0 implements uxs {
    public static final oos0 a;
    private static final SerialDescriptor descriptor;

    static {
        oos0 oos0Var = new oos0();
        a = oos0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.Slider", oos0Var, 3);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(c.e);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        b bVar = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (b) b.s(serialDescriptor, 0, c.e, bVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qos0(i, bVar, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qos0 qos0Var = (qos0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || qos0Var.a != null) {
            b.g(serialDescriptor, 0, c.e, qos0Var.a);
        }
        if (b.F() || !jl40.l(qos0Var.b, "")) {
            b.o(serialDescriptor, 1, qos0Var.b);
        }
        if (b.F() || qos0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, qos0Var.c);
        }
        b.c(serialDescriptor);
    }
}
