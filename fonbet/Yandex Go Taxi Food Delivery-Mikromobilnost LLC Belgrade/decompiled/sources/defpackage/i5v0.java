package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class i5v0 implements uxs {
    public static final i5v0 a;
    private static final SerialDescriptor descriptor;

    static {
        i5v0 i5v0Var = new i5v0();
        a = i5v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment", i5v0Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("heuristics", true);
        pluginGeneratedSerialDescriptor.j("point_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SuggestHeuristicsExperiment.e;
        return new KSerializer[]{z96.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuggestHeuristicsExperiment.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        jsq0 jsq0Var = null;
        jsq0 jsq0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                jsq0Var = (jsq0) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                jsq0Var2 = (jsq0) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), jsq0Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SuggestHeuristicsExperiment(i, z2, jsq0Var, jsq0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SuggestHeuristicsExperiment suggestHeuristicsExperiment = (SuggestHeuristicsExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuggestHeuristicsExperiment.e;
        if (b.F() || suggestHeuristicsExperiment.b) {
            b.n(serialDescriptor, 0, suggestHeuristicsExperiment.b);
        }
        if (b.F() || suggestHeuristicsExperiment.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), suggestHeuristicsExperiment.c);
        }
        if (b.F() || suggestHeuristicsExperiment.d != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), suggestHeuristicsExperiment.d);
        }
        b.c(serialDescriptor);
    }
}
