package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ObjectSerializer.kt */
/* loaded from: classes8.dex */
public final class zp70<T> implements KSerializer<T> {
    public final T a;
    public final EmptyList b = EmptyList.b;
    public final Object c = msy.a(LazyThreadSafetyMode.PUBLICATION, new l500(this, 18));

    /* JADX WARN: Multi-variable type inference failed */
    public zp70(Object obj) {
        this.a = obj;
    }

    @Override // xsna.a3m
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        ssi d = decoder.d(descriptor);
        int m = d.m(getDescriptor());
        if (m != -1) {
            throw new SerializationException(lhg.a(m, "Unexpected index "));
        }
        s3q0 s3q0Var = s3q0.a;
        d.e(descriptor);
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, T t) {
        encoder.d(getDescriptor()).e(getDescriptor());
    }
}
