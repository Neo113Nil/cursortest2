package defpackage;

import android.net.Uri;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class ng21 implements KSerializer {
    public final o2f0 a = d6z.a("android.net.Uri", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Uri.parse(decoder.p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((Uri) obj).toString());
    }
}
