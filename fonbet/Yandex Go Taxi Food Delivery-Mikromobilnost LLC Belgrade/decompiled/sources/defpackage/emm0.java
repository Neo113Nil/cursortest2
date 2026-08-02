package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class emm0 implements uxs {
    public static final emm0 a;
    private static final SerialDescriptor descriptor;

    static {
        emm0 emm0Var = new emm0();
        a = emm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.scenario.ScenarioAction", emm0Var, 2);
        pluginGeneratedSerialDescriptor.j("scenario", false);
        pluginGeneratedSerialDescriptor.j("effects", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gmm0.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gmm0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        v5x v5xVar = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                v5xVar = (v5x) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), v5xVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new gmm0(i, v5xVar, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gmm0 gmm0Var = (gmm0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gmm0.c;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), gmm0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), gmm0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
