package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: LambdaSerializer.kt */
/* loaded from: classes17.dex */
public final class lly implements KSerializer<gzs<? extends s3q0>> {
    public static final lly a = new lly();
    public static final mbd0 b = cmi0.a("lambda", gbd0.i.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        decoder.x();
        return new uv0(20);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.r("empty lambda");
    }
}
