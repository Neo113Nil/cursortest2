package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class x3q0 implements KSerializer<s3q0> {
    public static final x3q0 b = new x3q0();
    public final /* synthetic */ zp70<s3q0> a = new zp70<>(s3q0.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return s3q0.a;
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        this.a.serialize(encoder, (s3q0) obj);
    }
}
