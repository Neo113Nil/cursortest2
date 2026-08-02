package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class pej0 implements uxs {
    public static final pej0 a;
    private static final SerialDescriptor descriptor;

    static {
        pej0 pej0Var = new pej0();
        a = pej0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.RequirementCommentDto", pej0Var, 2);
        pluginGeneratedSerialDescriptor.j("placeholder", true);
        pluginGeneratedSerialDescriptor.j("save_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
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
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new rej0(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rej0 rej0Var = (rej0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(rej0Var.a, "")) {
            b.o(serialDescriptor, 0, rej0Var.a);
        }
        if (b.F() || !jl40.l(rej0Var.b, "")) {
            b.o(serialDescriptor, 1, rej0Var.b);
        }
        b.c(serialDescriptor);
    }
}
