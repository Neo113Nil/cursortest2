package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class k0e implements uxs {
    public static final k0e a;
    private static final SerialDescriptor descriptor;

    static {
        k0e k0eVar = new k0e();
        a = k0eVar;
        descriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.Configuration.List", k0eVar, 0);
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
            return new m0e((Object) null);
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
