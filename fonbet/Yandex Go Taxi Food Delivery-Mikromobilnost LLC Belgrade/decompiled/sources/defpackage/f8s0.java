package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f8s0 implements uxs {
    public static final f8s0 a;
    private static final SerialDescriptor descriptor;

    static {
        f8s0 f8s0Var = new f8s0();
        a = f8s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.ShowPolicy", f8s0Var, 4);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("max_widget_usage_count", true);
        pluginGeneratedSerialDescriptor.j("max_daily_show_count", true);
        pluginGeneratedSerialDescriptor.j("context_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar, n};
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
        int i4 = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new o8s0(i, i2, i3, i4, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o8s0 o8s0Var = (o8s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || o8s0Var.a != Integer.MAX_VALUE) {
            b.A(0, o8s0Var.a, serialDescriptor);
        }
        if (b.F() || o8s0Var.b != Integer.MAX_VALUE) {
            b.A(1, o8s0Var.b, serialDescriptor);
        }
        if (b.F() || o8s0Var.c != Integer.MAX_VALUE) {
            b.A(2, o8s0Var.c, serialDescriptor);
        }
        if (b.F() || o8s0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, o8s0Var.d);
        }
        b.c(serialDescriptor);
    }
}
