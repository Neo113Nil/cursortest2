package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.h1;

/* loaded from: classes6.dex */
public final /* synthetic */ class dsw0 implements uxs {
    public static final dsw0 a;
    private static final SerialDescriptor descriptor;

    static {
        dsw0 dsw0Var = new dsw0();
        a = dsw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.TextBlock", dsw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ttw0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vtw0 vtw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                vtw0Var = (vtw0) b.A(serialDescriptor, 0, ttw0.a, vtw0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new h1(i, vtw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h1 h1Var = (h1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(h1Var.a, new vtw0(0))) {
            b.e(serialDescriptor, 0, ttw0.a, h1Var.a);
        }
        b.c(serialDescriptor);
    }
}
