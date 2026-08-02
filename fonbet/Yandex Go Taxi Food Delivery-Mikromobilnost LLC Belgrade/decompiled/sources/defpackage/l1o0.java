package defpackage;

import defpackage.n1o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class l1o0 implements uxs {
    public static final l1o0 a;
    private static final SerialDescriptor descriptor;

    static {
        l1o0 l1o0Var = new l1o0();
        a = l1o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersNewbieFlowExperiment.FeedbackHeader", l1o0Var, 3);
        pluginGeneratedSerialDescriptor.j("first_ride", true);
        pluginGeneratedSerialDescriptor.j("second_ride", true);
        pluginGeneratedSerialDescriptor.j("third_ride", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        q1o0 q1o0Var = q1o0.a;
        return new KSerializer[]{qke.n(q1o0Var), qke.n(q1o0Var), qke.n(q1o0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        n1o0.c cVar = null;
        n1o0.c cVar2 = null;
        n1o0.c cVar3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (n1o0.c) b.s(serialDescriptor, 0, q1o0.a, cVar);
                i |= 1;
            } else if (v == 1) {
                cVar2 = (n1o0.c) b.s(serialDescriptor, 1, q1o0.a, cVar2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                cVar3 = (n1o0.c) b.s(serialDescriptor, 2, q1o0.a, cVar3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new n1o0.a(i, cVar, cVar2, cVar3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1o0.a aVar = (n1o0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, q1o0.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, q1o0.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, q1o0.a, aVar.c);
        }
        b.c(serialDescriptor);
    }
}
