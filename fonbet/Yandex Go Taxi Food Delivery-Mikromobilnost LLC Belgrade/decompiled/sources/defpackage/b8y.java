package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class b8y implements uxs {
    public static final b8y a;
    private static final SerialDescriptor descriptor;

    static {
        b8y b8yVar = new b8y();
        a = b8yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.location.dto.LbsParams.WifiNetwork", b8yVar, 2);
        pluginGeneratedSerialDescriptor.j("mac", false);
        pluginGeneratedSerialDescriptor.j("signal_strength", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new d8y(i, str, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d8y d8yVar = (d8y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, d8yVar.a);
        b.A(1, d8yVar.b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
