package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes8.dex */
public final class k770 implements KSerializer {
    public static final k770 a = new k770();
    public static final j770 b = j770.a;

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
