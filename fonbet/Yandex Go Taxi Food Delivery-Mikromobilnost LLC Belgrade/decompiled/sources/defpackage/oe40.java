package defpackage;

import defpackage.qe40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class oe40 implements uxs {
    public static final oe40 a;
    private static final SerialDescriptor descriptor;

    static {
        oe40 oe40Var = new oe40();
        a = oe40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainDateSelectorDto", oe40Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("accessibility_text", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(w7s.a);
        KSerializer n2 = qke.n(re40.e);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, auu0Var, auu0Var, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        String str = null;
        String str2 = null;
        qe40.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (qe40.a) b.s(serialDescriptor, 3, re40.e, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qe40(i, formattedText, str, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qe40 qe40Var = (qe40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || qe40Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, qe40Var.a);
        }
        if (b.F() || !jl40.l(qe40Var.b, "")) {
            b.o(serialDescriptor, 1, qe40Var.b);
        }
        if (b.F() || !jl40.l(qe40Var.c, "")) {
            b.o(serialDescriptor, 2, qe40Var.c);
        }
        if (b.F() || qe40Var.d != null) {
            b.g(serialDescriptor, 3, re40.e, qe40Var.d);
        }
        b.c(serialDescriptor);
    }
}
