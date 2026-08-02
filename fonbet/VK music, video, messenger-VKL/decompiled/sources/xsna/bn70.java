package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: NullableSerializer.kt */
/* loaded from: classes8.dex */
public final class bn70<T> implements KSerializer<T> {
    public final KSerializer<T> a;
    public final yli0 b;

    public bn70(KSerializer<T> kSerializer) {
        this.a = kSerializer;
        this.b = new yli0(kSerializer.getDescriptor());
    }

    @Override // xsna.a3m
    public final T deserialize(Decoder decoder) {
        if (decoder.G()) {
            return (T) decoder.h(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bn70.class == obj.getClass() && epx.f(this.a, ((bn70) obj).a);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, T t) {
        if (t == null) {
            encoder.J();
        } else {
            encoder.N();
            encoder.B(this.a, t);
        }
    }
}
