package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ktq implements uxs {
    public static final ktq a;
    private static final SerialDescriptor descriptor;

    static {
        ktq ktqVar = new ktq();
        a = ktqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackOnRatingItem", ktqVar, 2);
        pluginGeneratedSerialDescriptor.j("rating_values", true);
        pluginGeneratedSerialDescriptor.j("feedback_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mtq.c[0].getValue(), qke.n(ruq.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mtq.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        tuq tuqVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                tuqVar = (tuq) b.s(serialDescriptor, 1, ruq.a, tuqVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new mtq(i, list, tuqVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mtq mtqVar = (mtq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mtq.c;
        if (b.F() || !jl40.l(mtqVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mtqVar.a);
        }
        if (b.F() || mtqVar.b != null) {
            b.g(serialDescriptor, 1, ruq.a, mtqVar.b);
        }
        b.c(serialDescriptor);
    }
}
