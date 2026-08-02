package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class huq implements uxs {
    public static final huq a;
    private static final SerialDescriptor descriptor;

    static {
        huq huqVar = new huq();
        a = huqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackScreenSettings", huqVar, 3);
        pluginGeneratedSerialDescriptor.j("rating_enabled", true);
        pluginGeneratedSerialDescriptor.j("on_rating", true);
        pluginGeneratedSerialDescriptor.j("default", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, juq.d[1].getValue(), qke.n(ruq.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = juq.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        tuq tuqVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                tuqVar = (tuq) b.s(serialDescriptor, 2, ruq.a, tuqVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new juq(i, z2, list, tuqVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        juq juqVar = (juq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = juq.d;
        if (b.F() || juqVar.a) {
            b.n(serialDescriptor, 0, juqVar.a);
        }
        if (b.F() || !jl40.l(juqVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), juqVar.b);
        }
        if (b.F() || juqVar.c != null) {
            b.g(serialDescriptor, 2, ruq.a, juqVar.c);
        }
        b.c(serialDescriptor);
    }
}
