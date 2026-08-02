package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class m36 implements KSerializer {
    public static final m36 a = new m36();
    public static final asq0 b = d6z.i("BlockExecutorAction", esq0.g, new SerialDescriptor[0]);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("BlockExecutorAction is not supposed to be deserialized");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("BlockExecutorAction is not supposed to be serialized");
    }
}
