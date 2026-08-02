package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class bb40 implements uxs {
    public static final bb40 a;
    private static final SerialDescriptor descriptor;

    static {
        bb40 bb40Var = new bb40();
        a = bb40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutOrderInfo", bb40Var, 5);
        pluginGeneratedSerialDescriptor.j("back_and_forth", true);
        pluginGeneratedSerialDescriptor.j("selected_tariff_id", true);
        pluginGeneratedSerialDescriptor.j("adult_count", true);
        pluginGeneratedSerialDescriptor.j("child_count", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n(gef.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96.a, n, h6wVar, h6wVar, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i3 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 4, gef.a, iefVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new db40(i, z2, str, i2, i3, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        db40 db40Var = (db40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !db40Var.a) {
            b.n(serialDescriptor, 0, db40Var.a);
        }
        if (b.F() || db40Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, db40Var.b);
        }
        if (b.F() || db40Var.c != 0) {
            b.A(2, db40Var.c, serialDescriptor);
        }
        if (b.F() || db40Var.d != 0) {
            b.A(3, db40Var.d, serialDescriptor);
        }
        if (b.F() || db40Var.e != null) {
            b.g(serialDescriptor, 4, gef.a, db40Var.e);
        }
        b.c(serialDescriptor);
    }
}
