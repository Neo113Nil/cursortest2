package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class n1r0 implements uxs {
    public static final n1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        n1r0 n1r0Var = new n1r0();
        a = n1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentInfoSpecialsOfferPrices", n1r0Var, 3);
        pluginGeneratedSerialDescriptor.j("free_reservation", true);
        pluginGeneratedSerialDescriptor.j("parking", true);
        pluginGeneratedSerialDescriptor.j("riding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                num2 = (Integer) b.s(serialDescriptor, 1, h6w.a, num2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num3 = (Integer) b.s(serialDescriptor, 2, h6w.a, num3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new p1r0(i, num, num2, num3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p1r0 p1r0Var = (p1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || p1r0Var.a != null) {
            b.g(serialDescriptor, 0, h6w.a, p1r0Var.a);
        }
        if (b.F() || p1r0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, p1r0Var.b);
        }
        if (b.F() || p1r0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, p1r0Var.c);
        }
        b.c(serialDescriptor);
    }
}
