package defpackage;

import defpackage.a1t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class b1t implements uxs {
    public static final b1t a;
    private static final SerialDescriptor descriptor;

    static {
        b1t b1tVar = new b1t();
        a = b1tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.object.GeoSharingConfig.TrackingParams", b1tVar, 3);
        pluginGeneratedSerialDescriptor.j("show", true);
        pluginGeneratedSerialDescriptor.j("max_requests", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, h6w.a, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new a1t.b(i, str, z2, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a1t.b bVar = (a1t.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a) {
            b.n(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || bVar.b != 0) {
            b.A(1, bVar.b, serialDescriptor);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bVar.c);
        }
        b.c(serialDescriptor);
    }
}
