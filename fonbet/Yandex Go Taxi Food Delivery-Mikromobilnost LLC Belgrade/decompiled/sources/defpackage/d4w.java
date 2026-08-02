package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class d4w implements uxs {
    public static final d4w a;
    private static final SerialDescriptor descriptor;

    static {
        d4w d4wVar = new d4w();
        a = d4wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.InstructionLabelKeys", d4wVar, 2);
        pluginGeneratedSerialDescriptor.j("instruction_label_key", true);
        pluginGeneratedSerialDescriptor.j("local_instruction_label_key", true);
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
        return new f4w(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f4w f4wVar = (f4w) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(f4wVar.a, "")) {
            b.o(serialDescriptor, 0, f4wVar.a);
        }
        if (b.F() || !jl40.l(f4wVar.b, "")) {
            b.o(serialDescriptor, 1, f4wVar.b);
        }
        b.c(serialDescriptor);
    }
}
