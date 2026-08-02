package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class hh60 implements uxs {
    public static final hh60 a;
    private static final SerialDescriptor descriptor;

    static {
        hh60 hh60Var = new hh60();
        a = hh60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.api.network.objects.NotificationDisplayLimit", hh60Var, 3);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("range_days", true);
        pluginGeneratedSerialDescriptor.j("limit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(auu0.a), h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jh60(i, i2, i3, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jh60 jh60Var = (jh60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || jh60Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, jh60Var.a);
        }
        if (b.F() || jh60Var.b != 0) {
            b.A(1, jh60Var.b, serialDescriptor);
        }
        if (b.F() || jh60Var.c != 0) {
            b.A(2, jh60Var.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
