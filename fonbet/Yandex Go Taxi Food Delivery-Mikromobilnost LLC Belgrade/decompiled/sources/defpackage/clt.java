package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class clt implements uxs {
    public static final clt a;
    private static final SerialDescriptor descriptor;

    static {
        clt cltVar = new clt();
        a = cltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.GnssClockParams", cltVar, 9);
        pluginGeneratedSerialDescriptor.j("time_nanos", true);
        pluginGeneratedSerialDescriptor.j("hw_clock_discontinuity_count", true);
        pluginGeneratedSerialDescriptor.j("full_bias_nanos", true);
        pluginGeneratedSerialDescriptor.j("bias_nanos", true);
        pluginGeneratedSerialDescriptor.j("bias_uncertainty_nanos", true);
        pluginGeneratedSerialDescriptor.j("drift_nanos_per_second", true);
        pluginGeneratedSerialDescriptor.j("drift_uncertainty_nanos_per_second", true);
        pluginGeneratedSerialDescriptor.j("leap_second", true);
        pluginGeneratedSerialDescriptor.j("time_uncertainty_nanos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z8 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z9 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z10 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new elt(i, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        elt eltVar = (elt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || eltVar.a) {
            b.n(serialDescriptor, 0, eltVar.a);
        }
        if (b.F() || eltVar.b) {
            b.n(serialDescriptor, 1, eltVar.b);
        }
        if (b.F() || eltVar.c) {
            b.n(serialDescriptor, 2, eltVar.c);
        }
        if (b.F() || eltVar.d) {
            b.n(serialDescriptor, 3, eltVar.d);
        }
        if (b.F() || eltVar.e) {
            b.n(serialDescriptor, 4, eltVar.e);
        }
        if (b.F() || eltVar.f) {
            b.n(serialDescriptor, 5, eltVar.f);
        }
        if (b.F() || eltVar.g) {
            b.n(serialDescriptor, 6, eltVar.g);
        }
        if (b.F() || eltVar.h) {
            b.n(serialDescriptor, 7, eltVar.h);
        }
        if (b.F() || eltVar.i) {
            b.n(serialDescriptor, 8, eltVar.i);
        }
        b.c(serialDescriptor);
    }
}
