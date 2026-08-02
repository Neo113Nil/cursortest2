package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class j13 implements uxs {
    public static final j13 a;
    private static final SerialDescriptor descriptor;

    static {
        j13 j13Var = new j13();
        a = j13Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.ApplicationWifiNetwork", j13Var, 5);
        pluginGeneratedSerialDescriptor.j("is_connected", true);
        pluginGeneratedSerialDescriptor.j("bssid", true);
        pluginGeneratedSerialDescriptor.j("ssid", true);
        pluginGeneratedSerialDescriptor.j("signal_strength", true);
        pluginGeneratedSerialDescriptor.j("timestamp_millis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, qke.n(auu0Var), qke.n(auu0Var), h6w.a, pnz.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z2 = false;
            } else if (v == 0) {
                z = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new l13(i, z, str, str2, i2, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l13 l13Var = (l13) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || l13Var.a) {
            b.n(serialDescriptor, 0, l13Var.a);
        }
        if (b.F() || l13Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, l13Var.b);
        }
        if (b.F() || l13Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, l13Var.c);
        }
        if (b.F() || l13Var.d != 0) {
            b.A(3, l13Var.d, serialDescriptor);
        }
        if (b.F() || l13Var.f != 0) {
            b.s(serialDescriptor, 4, l13Var.f);
        }
        b.c(serialDescriptor);
    }
}
