package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class omj0 implements uxs {
    public static final omj0 a;
    private static final SerialDescriptor descriptor;

    static {
        omj0 omj0Var = new omj0();
        a = omj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsAddressInputCommentSection", omj0Var, 2);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("comment_input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, xmj0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        zmj0 zmj0Var = null;
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
                zmj0Var = (zmj0) b.A(serialDescriptor, 1, xmj0.a, zmj0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new qmj0(i, str, zmj0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.zmj0.b) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        qmj0 qmj0Var = (qmj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        pmj0 pmj0Var = qmj0.Companion;
        if (b.F() || !jl40.l(qmj0Var.a, "")) {
            b.o(serialDescriptor, 0, qmj0Var.a);
        }
        if (!b.F()) {
            zmj0 zmj0Var = qmj0Var.b;
            zmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, xmj0.a, qmj0Var.b);
        b.c(serialDescriptor);
    }
}
