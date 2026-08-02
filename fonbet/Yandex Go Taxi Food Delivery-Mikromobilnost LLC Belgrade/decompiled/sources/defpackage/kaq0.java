package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.f0;

/* loaded from: classes5.dex */
public final /* synthetic */ class kaq0 implements uxs {
    public static final kaq0 a;
    private static final SerialDescriptor descriptor;

    static {
        kaq0 kaq0Var = new kaq0();
        a = kaq0Var;
        descriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.SelectAsDestinationAction", kaq0Var, 0);
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
            return new f0();
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
