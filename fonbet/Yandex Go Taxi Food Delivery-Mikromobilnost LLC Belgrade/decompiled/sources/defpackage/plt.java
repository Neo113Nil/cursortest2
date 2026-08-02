package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class plt implements uxs {
    public static final plt a;
    private static final SerialDescriptor descriptor;

    static {
        plt pltVar = new plt();
        a = pltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.fingerprint.GnssSatelliteData", pltVar, 9);
        pluginGeneratedSerialDescriptor.j("svid", true);
        pluginGeneratedSerialDescriptor.j("constellation_type", true);
        pluginGeneratedSerialDescriptor.j("cn0_db_hz", true);
        pluginGeneratedSerialDescriptor.j("elevation_degrees", true);
        pluginGeneratedSerialDescriptor.j("azimuth_degrees", true);
        pluginGeneratedSerialDescriptor.j("carrier_frequency_hz", true);
        pluginGeneratedSerialDescriptor.j("used_in_fix", true);
        pluginGeneratedSerialDescriptor.j("has_almanac", true);
        pluginGeneratedSerialDescriptor.j("has_ephemeris", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        KSerializer n = qke.n(h6wVar);
        KSerializer n2 = qke.n(h6wVar);
        nor norVar = nor.a;
        KSerializer n3 = qke.n(norVar);
        KSerializer n4 = qke.n(norVar);
        KSerializer n5 = qke.n(norVar);
        KSerializer n6 = qke.n(norVar);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, qke.n(z96Var), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) b.s(serialDescriptor, 1, h6w.a, num2);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) b.s(serialDescriptor, 2, nor.a, f);
                    i |= 4;
                    break;
                case 3:
                    f2 = (Float) b.s(serialDescriptor, 3, nor.a, f2);
                    i |= 8;
                    break;
                case 4:
                    f3 = (Float) b.s(serialDescriptor, 4, nor.a, f3);
                    i |= 16;
                    break;
                case 5:
                    f4 = (Float) b.s(serialDescriptor, 5, nor.a, f4);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool2);
                    i |= 64;
                    break;
                case 7:
                    bool3 = (Boolean) b.s(serialDescriptor, 7, z96.a, bool3);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new rlt(i, num, num2, f, f2, f3, f4, bool2, bool3, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rlt rltVar = (rlt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || rltVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, rltVar.a);
        }
        if (b.F() || rltVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, rltVar.b);
        }
        if (b.F() || rltVar.c != null) {
            b.g(serialDescriptor, 2, nor.a, rltVar.c);
        }
        if (b.F() || rltVar.d != null) {
            b.g(serialDescriptor, 3, nor.a, rltVar.d);
        }
        if (b.F() || rltVar.e != null) {
            b.g(serialDescriptor, 4, nor.a, rltVar.e);
        }
        if (b.F() || rltVar.f != null) {
            b.g(serialDescriptor, 5, nor.a, rltVar.f);
        }
        if (b.F() || rltVar.g != null) {
            b.g(serialDescriptor, 6, z96.a, rltVar.g);
        }
        if (b.F() || rltVar.h != null) {
            b.g(serialDescriptor, 7, z96.a, rltVar.h);
        }
        if (b.F() || rltVar.i != null) {
            b.g(serialDescriptor, 8, z96.a, rltVar.i);
        }
        b.c(serialDescriptor);
    }
}
