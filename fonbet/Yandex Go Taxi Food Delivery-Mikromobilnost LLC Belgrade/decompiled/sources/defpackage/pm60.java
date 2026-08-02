package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class pm60 implements KSerializer {
    public final KSerializer a;
    public final zrq0 b;

    public pm60(KSerializer kSerializer) {
        this.a = kSerializer;
        this.b = new zrq0(kSerializer.getDescriptor());
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return decoder.D() ? decoder.B(this.a) : decoder.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pm60.class == obj.getClass() && jl40.l(this.a, ((pm60) obj).a);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj == null) {
            encoder.y();
        } else {
            encoder.C();
            encoder.j(obj, this.a);
        }
    }
}
