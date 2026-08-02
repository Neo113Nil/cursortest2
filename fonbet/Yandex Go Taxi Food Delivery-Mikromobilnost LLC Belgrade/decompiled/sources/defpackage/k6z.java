package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class k6z implements uxs {
    public static final k6z a;
    private static final SerialDescriptor descriptor;

    static {
        k6z k6zVar = new k6z();
        a = k6zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eats_commons.Location", k6zVar, 2);
        pluginGeneratedSerialDescriptor.j("lat", true);
        pluginGeneratedSerialDescriptor.k(new i6z(new String[]{"latitude"}, 0));
        pluginGeneratedSerialDescriptor.j("lon", true);
        pluginGeneratedSerialDescriptor.k(new i6z(new String[]{"longitude"}, 0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new v6z(d, d2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v6z v6zVar = (v6z) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Double.compare(v6zVar.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, v6zVar.a);
        }
        if (b.F() || Double.compare(v6zVar.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, v6zVar.b);
        }
        b.c(serialDescriptor);
    }
}
