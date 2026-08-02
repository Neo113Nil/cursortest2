package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.h0;

/* loaded from: classes5.dex */
public final /* synthetic */ class ocq0 implements uxs {
    public static final ocq0 a;
    private static final SerialDescriptor descriptor;

    static {
        ocq0 ocq0Var = new ocq0();
        a = ocq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.SelectNddPickupPointAction", ocq0Var, 1);
        pluginGeneratedSerialDescriptor.j("address", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bji.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        dji djiVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                djiVar = (dji) b.A(serialDescriptor, 0, bji.a, djiVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new h0(i, djiVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h0 h0Var = (h0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(h0Var.a, new dji(0))) {
            b.e(serialDescriptor, 0, bji.a, h0Var.a);
        }
        b.c(serialDescriptor);
    }
}
