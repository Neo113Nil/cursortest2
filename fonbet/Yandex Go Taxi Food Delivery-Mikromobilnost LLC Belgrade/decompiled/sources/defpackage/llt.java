package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class llt implements uxs {
    public static final llt a;
    private static final SerialDescriptor descriptor;

    static {
        llt lltVar = new llt();
        a = lltVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.GnssParamsExperiment", lltVar, 7);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("clock", true);
        pluginGeneratedSerialDescriptor.j("measurement", true);
        pluginGeneratedSerialDescriptor.j("satellite", true);
        pluginGeneratedSerialDescriptor.j("is_spoofed", true);
        pluginGeneratedSerialDescriptor.j("max_count_satellites", true);
        pluginGeneratedSerialDescriptor.j("max_count_frequencies", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, clt.a, ilt.a, slt.a, z96Var, h6wVar, h6wVar};
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
        int i2 = 0;
        int i3 = 0;
        elt eltVar = null;
        klt kltVar = null;
        ult ultVar = null;
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
                    eltVar = (elt) b.A(serialDescriptor, 1, clt.a, eltVar);
                    i |= 2;
                    break;
                case 2:
                    kltVar = (klt) b.A(serialDescriptor, 2, ilt.a, kltVar);
                    i |= 4;
                    break;
                case 3:
                    ultVar = (ult) b.A(serialDescriptor, 3, slt.a, ultVar);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new nlt(i, z2, eltVar, kltVar, ultVar, z3, i2, i3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nlt nltVar = (nlt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        mlt mltVar = nlt.Companion;
        if (b.F() || nltVar.b) {
            b.n(serialDescriptor, 0, nltVar.b);
        }
        if (b.F() || !jl40.l(nltVar.c, new elt(0))) {
            b.e(serialDescriptor, 1, clt.a, nltVar.c);
        }
        if (b.F() || !jl40.l(nltVar.d, new klt(0))) {
            b.e(serialDescriptor, 2, ilt.a, nltVar.d);
        }
        if (b.F() || !jl40.l(nltVar.e, new ult(0))) {
            b.e(serialDescriptor, 3, slt.a, nltVar.e);
        }
        if (b.F() || nltVar.f) {
            b.n(serialDescriptor, 4, nltVar.f);
        }
        if (b.F() || nltVar.g != 0) {
            b.A(5, nltVar.g, serialDescriptor);
        }
        if (b.F() || nltVar.h != 0) {
            b.A(6, nltVar.h, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
