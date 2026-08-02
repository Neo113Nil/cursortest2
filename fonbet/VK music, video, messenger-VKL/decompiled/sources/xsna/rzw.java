package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: InlineClassDescriptor.kt */
/* loaded from: classes8.dex */
public final class rzw implements vht<Object> {
    public final /* synthetic */ KSerializer<Object> a;

    public rzw(KSerializer<Object> kSerializer) {
        this.a = kSerializer;
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // xsna.vht
    public final KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
