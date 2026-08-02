package defpackage;

import defpackage.khp;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class dhp implements uxs {
    public static final dhp a;
    private static final SerialDescriptor descriptor;

    static {
        dhp dhpVar = new dhp();
        a = dhpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.FavoriteRidesAndAddressesResponse", dhpVar, 2);
        pluginGeneratedSerialDescriptor.j("addresses", true);
        pluginGeneratedSerialDescriptor.j("rides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(cfp.a), qke.n(fhp.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        efp efpVar = null;
        khp.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                efpVar = (efp) b.s(serialDescriptor, 0, cfp.a, efpVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (khp.a) b.s(serialDescriptor, 1, fhp.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new khp(i, efpVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        khp khpVar = (khp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || khpVar.a != null) {
            b.g(serialDescriptor, 0, cfp.a, khpVar.a);
        }
        if (b.F() || khpVar.b != null) {
            b.g(serialDescriptor, 1, fhp.a, khpVar.b);
        }
        b.c(serialDescriptor);
    }
}
