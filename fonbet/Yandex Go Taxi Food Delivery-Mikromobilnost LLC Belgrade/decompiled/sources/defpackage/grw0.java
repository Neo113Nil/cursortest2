package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.i0;
import ru.yandex.taxi.surge.models.dto.l0;
import ru.yandex.taxi.surge.models.dto.y0;

/* loaded from: classes6.dex */
public final /* synthetic */ class grw0 implements uxs {
    public static final grw0 a;
    private static final SerialDescriptor descriptor;

    static {
        grw0 grw0Var = new grw0();
        a = grw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.Chart", grw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        l0 l0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                l0Var = (l0) b.A(serialDescriptor, 0, i0.a, l0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new y0(i, l0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y0 y0Var = (y0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(y0Var.a, new l0(0))) {
            b.e(serialDescriptor, 0, i0.a, y0Var.a);
        }
        b.c(serialDescriptor);
    }
}
