package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public final /* synthetic */ class b1r0 implements uxs {
    public static final b1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        b1r0 b1r0Var = new b1r0();
        a = b1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentInfo", b1r0Var, 2);
        pluginGeneratedSerialDescriptor.j("current_performing", true);
        pluginGeneratedSerialDescriptor.j("specials", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) d1r0.c[0].getValue()), qke.n(e1r0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d1r0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        EvolveState evolveState = null;
        g1r0 g1r0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                evolveState = (EvolveState) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), evolveState);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                g1r0Var = (g1r0) b.s(serialDescriptor, 1, e1r0.a, g1r0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new d1r0(i, evolveState, g1r0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d1r0 d1r0Var = (d1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d1r0.c;
        if (b.F() || d1r0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), d1r0Var.a);
        }
        if (b.F() || d1r0Var.b != null) {
            b.g(serialDescriptor, 1, e1r0.a, d1r0Var.b);
        }
        b.c(serialDescriptor);
    }
}
