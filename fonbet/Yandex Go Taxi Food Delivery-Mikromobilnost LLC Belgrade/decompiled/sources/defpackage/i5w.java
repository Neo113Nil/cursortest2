package defpackage;

import defpackage.h5w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class i5w implements uxs {
    public static final i5w a;
    private static final SerialDescriptor descriptor;

    static {
        i5w i5wVar = new i5w();
        a = i5wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.InsuranceV3.OfferListItem", i5wVar, 2);
        pluginGeneratedSerialDescriptor.j("on_active", true);
        pluginGeneratedSerialDescriptor.j("on_inactive", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        f5w f5wVar = f5w.a;
        return new KSerializer[]{qke.n(f5wVar), qke.n(f5wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        h5w.a aVar = null;
        h5w.a aVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (h5w.a) b.s(serialDescriptor, 0, f5w.a, aVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar2 = (h5w.a) b.s(serialDescriptor, 1, f5w.a, aVar2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new h5w.b(i, aVar, aVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h5w.b bVar = (h5w.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, f5w.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, f5w.a, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
