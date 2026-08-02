package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.e0;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0j0 implements uxs {
    public static final q0j0 a;
    private static final SerialDescriptor descriptor;

    static {
        q0j0 q0j0Var = new q0j0();
        a = q0j0Var;
        descriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.RepeatRequestAction", q0j0Var, 0);
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int v = b.v(serialDescriptor);
        if (v == -1) {
            b.c(serialDescriptor);
            return new e0();
        }
        ny61.c(v);
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        encoder.b(serialDescriptor).c(serialDescriptor);
    }
}
