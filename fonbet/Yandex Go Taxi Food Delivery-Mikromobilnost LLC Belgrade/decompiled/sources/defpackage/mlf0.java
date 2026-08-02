package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class mlf0 implements uxs {
    public static final mlf0 a;
    private static final SerialDescriptor descriptor;

    static {
        mlf0 mlf0Var = new mlf0();
        a = mlf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.common.experiments.PromoBadgesExperiment", mlf0Var, 1);
        pluginGeneratedSerialDescriptor.j("banners", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{olf0.c[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = olf0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new olf0(i, set);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        olf0 olf0Var = (olf0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = olf0.c;
        if (b.F() || !jl40.l(olf0Var.b, EmptySet.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), olf0Var.b);
        }
        b.c(serialDescriptor);
    }
}
