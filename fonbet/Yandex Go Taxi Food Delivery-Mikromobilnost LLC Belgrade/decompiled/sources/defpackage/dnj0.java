package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class dnj0 implements uxs {
    public static final dnj0 a;
    private static final SerialDescriptor descriptor;

    static {
        dnj0 dnj0Var = new dnj0();
        a = dnj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsAddressInputSummary", dnj0Var, 2);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("blocking_strategy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cmj0.a, u56.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        emj0 emj0Var = null;
        w56 w56Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                emj0Var = (emj0) b.A(serialDescriptor, 0, cmj0.a, emj0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                w56Var = (w56) b.A(serialDescriptor, 1, u56.a, w56Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new fnj0(i, emj0Var, w56Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.emj0.b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.w56.d) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        fnj0 fnj0Var = (fnj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        enj0 enj0Var = fnj0.Companion;
        if (!b.F()) {
            emj0 emj0Var = fnj0Var.a;
            emj0.Companion.getClass();
        }
        b.e(serialDescriptor, 0, cmj0.a, fnj0Var.a);
        if (!b.F()) {
            w56 w56Var = fnj0Var.b;
            w56.Companion.getClass();
        }
        b.e(serialDescriptor, 1, u56.a, fnj0Var.b);
        b.c(serialDescriptor);
    }
}
