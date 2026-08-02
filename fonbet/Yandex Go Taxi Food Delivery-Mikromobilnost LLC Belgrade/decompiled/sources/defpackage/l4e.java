package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class l4e implements uxs {
    public static final l4e a;
    private static final SerialDescriptor descriptor;

    static {
        l4e l4eVar = new l4e();
        a = l4eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.ConnectToCourierRequest", l4eVar, 2);
        pluginGeneratedSerialDescriptor.j("serviceUuid", true);
        pluginGeneratedSerialDescriptor.j("timeout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(e6m.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
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
                d = (Double) b.s(serialDescriptor, 1, e6m.a, d);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new n4e(i, d, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n4e n4eVar = (n4e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || n4eVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, n4eVar.a);
        }
        if (b.F() || n4eVar.b != null) {
            b.g(serialDescriptor, 1, e6m.a, n4eVar.b);
        }
        b.c(serialDescriptor);
    }
}
