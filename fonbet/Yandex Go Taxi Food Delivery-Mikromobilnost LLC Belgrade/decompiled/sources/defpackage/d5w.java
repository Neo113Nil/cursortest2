package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h5w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class d5w implements uxs {
    public static final d5w a;
    private static final SerialDescriptor descriptor;

    static {
        d5w d5wVar = new d5w();
        a = d5wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.InsuranceV3", d5wVar, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("insurance_description", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("offer_list_item", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(z96.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), qke.n(i5w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        h5w.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bVar = (h5w.b) b.s(serialDescriptor, 3, i5w.a, bVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new h5w(i, bool, str, str2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h5w h5wVar = (h5w) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || h5wVar.a != null) {
            b.g(serialDescriptor, 0, z96.a, h5wVar.a);
        }
        if (b.F() || h5wVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, h5wVar.b);
        }
        if (b.F() || h5wVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, h5wVar.c);
        }
        if (b.F() || h5wVar.d != null) {
            b.g(serialDescriptor, 3, i5w.a, h5wVar.d);
        }
        b.c(serialDescriptor);
    }
}
