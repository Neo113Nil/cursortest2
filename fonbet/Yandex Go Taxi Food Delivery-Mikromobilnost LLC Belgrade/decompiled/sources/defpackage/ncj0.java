package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class ncj0 implements uxs {
    public static final ncj0 a;
    private static final SerialDescriptor descriptor;

    static {
        ncj0 ncj0Var = new ncj0();
        a = ncj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.RequirementAddressInputPromoblockDto", ncj0Var, 3);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, rcx.a};
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
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.A(serialDescriptor, 2, rcx.a, bVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pcj0(i, str, str2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pcj0 pcj0Var = (pcj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(pcj0Var.a, "")) {
            b.o(serialDescriptor, 0, pcj0Var.a);
        }
        if (b.F() || !jl40.l(pcj0Var.b, "")) {
            b.o(serialDescriptor, 1, pcj0Var.b);
        }
        if (b.F() || !jl40.l(pcj0Var.c, new c(kotlin.collections.b.f()))) {
            b.e(serialDescriptor, 2, rcx.a, pcj0Var.c);
        }
        b.c(serialDescriptor);
    }
}
