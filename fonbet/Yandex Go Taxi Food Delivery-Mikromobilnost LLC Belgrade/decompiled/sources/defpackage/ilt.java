package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class ilt implements uxs {
    public static final ilt a;
    private static final SerialDescriptor descriptor;

    static {
        ilt iltVar = new ilt();
        a = iltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.GnssMeasurementParams", iltVar, 21);
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
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    z8 = b.C(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    z9 = b.C(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    z10 = b.C(serialDescriptor, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    z11 = b.C(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    z12 = b.C(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    z13 = b.C(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    z14 = b.C(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    z15 = b.C(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    z16 = b.C(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    z17 = b.C(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    z18 = b.C(serialDescriptor, 16);
                    i = 65536;
                    break;
                case 17:
                    z19 = b.C(serialDescriptor, 17);
                    i = 131072;
                    break;
                case 18:
                    z20 = b.C(serialDescriptor, 18);
                    i = 262144;
                    break;
                case 19:
                    z21 = b.C(serialDescriptor, 19);
                    i = 524288;
                    break;
                case 20:
                    z22 = b.C(serialDescriptor, 20);
                    i = 1048576;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i2 |= i;
        }
        b.c(serialDescriptor);
        return new klt(i2, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        klt kltVar = (klt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || kltVar.a) {
            b.n(serialDescriptor, 0, kltVar.a);
        }
        if (b.F() || kltVar.b) {
            b.n(serialDescriptor, 1, kltVar.b);
        }
        if (b.F() || kltVar.c) {
            b.n(serialDescriptor, 2, kltVar.c);
        }
        if (b.F() || kltVar.d) {
            b.n(serialDescriptor, 3, kltVar.d);
        }
        if (b.F() || kltVar.e) {
            b.n(serialDescriptor, 4, kltVar.e);
        }
        if (b.F() || kltVar.f) {
            b.n(serialDescriptor, 5, kltVar.f);
        }
        if (b.F() || kltVar.g) {
            b.n(serialDescriptor, 6, kltVar.g);
        }
        if (b.F() || kltVar.h) {
            b.n(serialDescriptor, 7, kltVar.h);
        }
        if (b.F() || kltVar.i) {
            b.n(serialDescriptor, 8, kltVar.i);
        }
        if (b.F() || kltVar.j) {
            b.n(serialDescriptor, 9, kltVar.j);
        }
        if (b.F() || kltVar.k) {
            b.n(serialDescriptor, 10, kltVar.k);
        }
        if (b.F() || kltVar.l) {
            b.n(serialDescriptor, 11, kltVar.l);
        }
        if (b.F() || kltVar.m) {
            b.n(serialDescriptor, 12, kltVar.m);
        }
        if (b.F() || kltVar.n) {
            b.n(serialDescriptor, 13, kltVar.n);
        }
        if (b.F() || kltVar.o) {
            b.n(serialDescriptor, 14, kltVar.o);
        }
        if (b.F() || kltVar.p) {
            b.n(serialDescriptor, 15, kltVar.p);
        }
        if (b.F() || kltVar.q) {
            b.n(serialDescriptor, 16, kltVar.q);
        }
        if (b.F() || kltVar.r) {
            b.n(serialDescriptor, 17, kltVar.r);
        }
        if (b.F() || kltVar.s) {
            b.n(serialDescriptor, 18, kltVar.s);
        }
        if (b.F() || kltVar.t) {
            b.n(serialDescriptor, 19, kltVar.t);
        }
        if (b.F() || kltVar.u) {
            b.n(serialDescriptor, 20, kltVar.u);
        }
        b.c(serialDescriptor);
    }
}
