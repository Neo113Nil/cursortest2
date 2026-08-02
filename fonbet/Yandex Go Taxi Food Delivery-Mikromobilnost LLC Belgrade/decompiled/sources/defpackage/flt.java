package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class flt implements uxs {
    public static final flt a;
    private static final SerialDescriptor descriptor;

    static {
        flt fltVar = new flt();
        a = fltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.fingerprint.GnssMeasurementData", fltVar, 21);
        pluginGeneratedSerialDescriptor.j("svid", true);
        pluginGeneratedSerialDescriptor.j("constellation_type", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("received_sv_time_nanos", true);
        pluginGeneratedSerialDescriptor.j("received_sv_time_uncertainty_nanos", true);
        pluginGeneratedSerialDescriptor.j("time_offset_nanos", true);
        pluginGeneratedSerialDescriptor.j("cn0_db_hz", true);
        pluginGeneratedSerialDescriptor.j("snr_db", true);
        pluginGeneratedSerialDescriptor.j("agc_level_db", true);
        pluginGeneratedSerialDescriptor.j("baseband_cn0_db_hz", true);
        pluginGeneratedSerialDescriptor.j("carrier_frequency_hz", true);
        pluginGeneratedSerialDescriptor.j("pseudorange_rate_mps", true);
        pluginGeneratedSerialDescriptor.j("pseudorange_rate_uncertainty_mps", true);
        pluginGeneratedSerialDescriptor.j("adr_state", true);
        pluginGeneratedSerialDescriptor.j("adr_meters", true);
        pluginGeneratedSerialDescriptor.j("adr_uncertainty_meters", true);
        pluginGeneratedSerialDescriptor.j("multipath_indicator", true);
        pluginGeneratedSerialDescriptor.j("full_isb_nanos", true);
        pluginGeneratedSerialDescriptor.j("full_isb_uncertainty_nanos", true);
        pluginGeneratedSerialDescriptor.j("satellite_isb_nanos", true);
        pluginGeneratedSerialDescriptor.j("satellite_isb_uncertainty_nanos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        KSerializer n = qke.n(h6wVar);
        KSerializer n2 = qke.n(h6wVar);
        KSerializer n3 = qke.n(h6wVar);
        pnz pnzVar = pnz.a;
        KSerializer n4 = qke.n(pnzVar);
        KSerializer n5 = qke.n(pnzVar);
        e6m e6mVar = e6m.a;
        return new KSerializer[]{n, n2, n3, n4, n5, qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(nor.a), qke.n(e6mVar), qke.n(e6mVar), qke.n(h6wVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(h6wVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Double d;
        Double d2;
        int i;
        Double d3;
        Integer num;
        Double d4;
        Double d5;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Double d6 = null;
        Float f = null;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        int i2 = 0;
        Integer num2 = null;
        Double d10 = null;
        Double d11 = null;
        Integer num3 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        boolean z = true;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Long l = null;
        Long l2 = null;
        Double d16 = null;
        Double d17 = null;
        Double d18 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    d3 = d6;
                    num = num4;
                    z = false;
                    f = f;
                    d9 = d9;
                    num4 = num;
                    d6 = d3;
                case 0:
                    d3 = d6;
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num4);
                    i2 |= 1;
                    f = f;
                    d9 = d9;
                    d7 = d7;
                    num4 = num;
                    d6 = d3;
                case 1:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    num5 = (Integer) b.s(serialDescriptor, 1, h6w.a, num5);
                    i2 |= 2;
                    num6 = num6;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 2:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    num6 = (Integer) b.s(serialDescriptor, 2, h6w.a, num6);
                    i2 |= 4;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 3:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    l = (Long) b.s(serialDescriptor, 3, pnz.a, l);
                    i2 |= 8;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 4:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    l2 = (Long) b.s(serialDescriptor, 4, pnz.a, l2);
                    i2 |= 16;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 5:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    d16 = (Double) b.s(serialDescriptor, 5, e6m.a, d16);
                    i2 |= 32;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 6:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    d17 = (Double) b.s(serialDescriptor, 6, e6m.a, d17);
                    i2 |= 64;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 7:
                    d3 = d6;
                    d4 = d7;
                    d5 = d9;
                    d18 = (Double) b.s(serialDescriptor, 7, e6m.a, d18);
                    i2 |= 128;
                    d9 = d5;
                    d7 = d4;
                    d6 = d3;
                case 8:
                    d3 = d6;
                    d4 = d7;
                    d9 = (Double) b.s(serialDescriptor, 8, e6m.a, d9);
                    i2 |= 256;
                    d7 = d4;
                    d6 = d3;
                case 9:
                    d3 = d6;
                    d7 = (Double) b.s(serialDescriptor, 9, e6m.a, d7);
                    i2 |= 512;
                    d9 = d9;
                    d6 = d3;
                case 10:
                    d = d7;
                    d2 = d9;
                    f = (Float) b.s(serialDescriptor, 10, nor.a, f);
                    i2 |= 1024;
                    d9 = d2;
                    d7 = d;
                case 11:
                    d = d7;
                    d2 = d9;
                    d6 = (Double) b.s(serialDescriptor, 11, e6m.a, d6);
                    i2 |= 2048;
                    d9 = d2;
                    d7 = d;
                case 12:
                    d = d7;
                    d2 = d9;
                    d8 = (Double) b.s(serialDescriptor, 12, e6m.a, d8);
                    i2 |= 4096;
                    d9 = d2;
                    d7 = d;
                case 13:
                    d = d7;
                    d2 = d9;
                    num2 = (Integer) b.s(serialDescriptor, 13, h6w.a, num2);
                    i2 |= 8192;
                    d9 = d2;
                    d7 = d;
                case 14:
                    d = d7;
                    d2 = d9;
                    d10 = (Double) b.s(serialDescriptor, 14, e6m.a, d10);
                    i2 |= 16384;
                    d9 = d2;
                    d7 = d;
                case 15:
                    d = d7;
                    d2 = d9;
                    d11 = (Double) b.s(serialDescriptor, 15, e6m.a, d11);
                    i = 32768;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                case 16:
                    d = d7;
                    d2 = d9;
                    num3 = (Integer) b.s(serialDescriptor, 16, h6w.a, num3);
                    i = 65536;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                case 17:
                    d = d7;
                    d2 = d9;
                    d12 = (Double) b.s(serialDescriptor, 17, e6m.a, d12);
                    i = 131072;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                case 18:
                    d = d7;
                    d2 = d9;
                    d13 = (Double) b.s(serialDescriptor, 18, e6m.a, d13);
                    i = 262144;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                case 19:
                    d = d7;
                    d2 = d9;
                    d14 = (Double) b.s(serialDescriptor, 19, e6m.a, d14);
                    i = 524288;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                case 20:
                    d2 = d9;
                    d = d7;
                    d15 = (Double) b.s(serialDescriptor, 20, e6m.a, d15);
                    i = 1048576;
                    i2 |= i;
                    d9 = d2;
                    d7 = d;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        Double d19 = d6;
        Double d20 = d9;
        Integer num7 = num4;
        Integer num8 = num5;
        Integer num9 = num6;
        b.c(serialDescriptor);
        Double d21 = d15;
        Double d22 = d14;
        return new hlt(i2, num7, num8, num9, l, l2, d16, d17, d18, d20, d7, f, d19, d8, num2, d10, d11, num3, d12, d13, d22, d21);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hlt hltVar = (hlt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || hltVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, hltVar.a);
        }
        if (b.F() || hltVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, hltVar.b);
        }
        if (b.F() || hltVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, hltVar.c);
        }
        if (b.F() || hltVar.d != null) {
            b.g(serialDescriptor, 3, pnz.a, hltVar.d);
        }
        if (b.F() || hltVar.e != null) {
            b.g(serialDescriptor, 4, pnz.a, hltVar.e);
        }
        if (b.F() || hltVar.f != null) {
            b.g(serialDescriptor, 5, e6m.a, hltVar.f);
        }
        if (b.F() || hltVar.g != null) {
            b.g(serialDescriptor, 6, e6m.a, hltVar.g);
        }
        if (b.F() || hltVar.h != null) {
            b.g(serialDescriptor, 7, e6m.a, hltVar.h);
        }
        if (b.F() || hltVar.i != null) {
            b.g(serialDescriptor, 8, e6m.a, hltVar.i);
        }
        if (b.F() || hltVar.j != null) {
            b.g(serialDescriptor, 9, e6m.a, hltVar.j);
        }
        if (b.F() || hltVar.k != null) {
            b.g(serialDescriptor, 10, nor.a, hltVar.k);
        }
        if (b.F() || hltVar.l != null) {
            b.g(serialDescriptor, 11, e6m.a, hltVar.l);
        }
        if (b.F() || hltVar.m != null) {
            b.g(serialDescriptor, 12, e6m.a, hltVar.m);
        }
        if (b.F() || hltVar.n != null) {
            b.g(serialDescriptor, 13, h6w.a, hltVar.n);
        }
        if (b.F() || hltVar.o != null) {
            b.g(serialDescriptor, 14, e6m.a, hltVar.o);
        }
        if (b.F() || hltVar.p != null) {
            b.g(serialDescriptor, 15, e6m.a, hltVar.p);
        }
        if (b.F() || hltVar.q != null) {
            b.g(serialDescriptor, 16, h6w.a, hltVar.q);
        }
        if (b.F() || hltVar.r != null) {
            b.g(serialDescriptor, 17, e6m.a, hltVar.r);
        }
        if (b.F() || hltVar.s != null) {
            b.g(serialDescriptor, 18, e6m.a, hltVar.s);
        }
        if (b.F() || hltVar.t != null) {
            b.g(serialDescriptor, 19, e6m.a, hltVar.t);
        }
        if (b.F() || hltVar.u != null) {
            b.g(serialDescriptor, 20, e6m.a, hltVar.u);
        }
        b.c(serialDescriptor);
    }
}
