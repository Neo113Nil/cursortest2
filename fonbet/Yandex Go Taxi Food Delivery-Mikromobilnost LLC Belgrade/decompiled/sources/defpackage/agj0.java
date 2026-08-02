package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class agj0 implements uxs {
    public static final agj0 a;
    private static final SerialDescriptor descriptor;

    static {
        agj0 agj0Var = new agj0();
        a = agj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.RequirementDetailsSection", agj0Var, 2);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, cgj0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cgj0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
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
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new cgj0(i, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cgj0 cgj0Var = (cgj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cgj0.c;
        if (b.F() || !jl40.l(cgj0Var.a, "")) {
            b.o(serialDescriptor, 0, cgj0Var.a);
        }
        if (b.F() || !jl40.l(cgj0Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cgj0Var.b);
        }
        b.c(serialDescriptor);
    }
}
