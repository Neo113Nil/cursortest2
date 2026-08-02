package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class hbi0 implements uxs {
    public static final hbi0 a;
    private static final SerialDescriptor descriptor;

    static {
        hbi0 hbi0Var = new hbi0();
        a = hbi0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.actions.ReadCardKey", hbi0Var, 5);
        pluginGeneratedSerialDescriptor.j("block", false);
        pluginGeneratedSerialDescriptor.j("read_key_id", false);
        pluginGeneratedSerialDescriptor.j("read_key_version", false);
        pluginGeneratedSerialDescriptor.j("read_key_type", false);
        pluginGeneratedSerialDescriptor.j("read_key_value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar, auu0Var, auu0Var};
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
        String str2 = null;
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
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new lbi0(i, i2, i3, i4, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lbi0 lbi0Var = (lbi0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.A(0, lbi0Var.a, serialDescriptor);
        b.A(1, lbi0Var.b, serialDescriptor);
        b.A(2, lbi0Var.c, serialDescriptor);
        b.o(serialDescriptor, 3, lbi0Var.d);
        b.o(serialDescriptor, 4, lbi0Var.e);
        b.c(serialDescriptor);
    }
}
