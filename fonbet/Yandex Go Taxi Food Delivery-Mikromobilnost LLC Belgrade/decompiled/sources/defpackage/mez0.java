package defpackage;

import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class mez0 implements uxs {
    public static final mez0 a;
    private static final SerialDescriptor descriptor;

    static {
        mez0 mez0Var = new mez0();
        a = mez0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.TimerStateUpdate", mez0Var, 2);
        pluginGeneratedSerialDescriptor.j("title_with_timer", true);
        pluginGeneratedSerialDescriptor.j("until_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(aob.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Date date = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                date = (Date) b.s(serialDescriptor, 1, aob.a, date);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new oez0(i, str, date);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oez0 oez0Var = (oez0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(oez0Var.a, "")) {
            b.o(serialDescriptor, 0, oez0Var.a);
        }
        if (b.F() || oez0Var.b != null) {
            b.g(serialDescriptor, 1, aob.a, oez0Var.b);
        }
        b.c(serialDescriptor);
    }
}
