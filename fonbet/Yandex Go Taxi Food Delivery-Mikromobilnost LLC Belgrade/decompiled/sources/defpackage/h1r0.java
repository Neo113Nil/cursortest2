package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class h1r0 implements uxs {
    public static final h1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        h1r0 h1r0Var = new h1r0();
        a = h1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentInfoSpecialsDurations", h1r0Var, 3);
        pluginGeneratedSerialDescriptor.j("old_state_parking", true);
        pluginGeneratedSerialDescriptor.j("old_state_riding", true);
        pluginGeneratedSerialDescriptor.j("old_state_reservation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{qke.n(pnzVar), qke.n(pnzVar), qke.n(pnzVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else if (v == 1) {
                l2 = (Long) b.s(serialDescriptor, 1, pnz.a, l2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                l3 = (Long) b.s(serialDescriptor, 2, pnz.a, l3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new j1r0(i, l, l2, l3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j1r0 j1r0Var = (j1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || j1r0Var.a != null) {
            b.g(serialDescriptor, 0, pnz.a, j1r0Var.a);
        }
        if (b.F() || j1r0Var.b != null) {
            b.g(serialDescriptor, 1, pnz.a, j1r0Var.b);
        }
        if (b.F() || j1r0Var.c != null) {
            b.g(serialDescriptor, 2, pnz.a, j1r0Var.c);
        }
        b.c(serialDescriptor);
    }
}
