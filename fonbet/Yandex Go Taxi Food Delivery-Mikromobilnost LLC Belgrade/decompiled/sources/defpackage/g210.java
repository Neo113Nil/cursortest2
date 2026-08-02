package defpackage;

import defpackage.i210;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class g210 implements uxs {
    public static final g210 a;
    private static final SerialDescriptor descriptor;

    static {
        g210 g210Var = new g210();
        a = g210Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.MasstransitBleScanningScreenSettingsDto.BleScanSettings", g210Var, 7);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("max_vehicles_count", true);
        pluginGeneratedSerialDescriptor.j("batch_size", true);
        pluginGeneratedSerialDescriptor.j("beacon_ttl_seconds", true);
        pluginGeneratedSerialDescriptor.j("rssi_threshold", true);
        pluginGeneratedSerialDescriptor.j("enable_ibeacon", true);
        pluginGeneratedSerialDescriptor.j("enable_eddystone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        KSerializer n = qke.n(z96Var);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) b.s(serialDescriptor, 4, h6w.a, num4);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) b.s(serialDescriptor, 5, z96.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    bool3 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i210.a(i, bool, num, num2, num3, num4, bool2, bool3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i210.a aVar = (i210.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, z96.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, h6w.a, aVar.e);
        }
        if (b.F() || aVar.f != null) {
            b.g(serialDescriptor, 5, z96.a, aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, z96.a, aVar.g);
        }
        b.c(serialDescriptor);
    }
}
