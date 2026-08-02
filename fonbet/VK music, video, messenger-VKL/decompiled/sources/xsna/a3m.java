package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: KSerializer.kt */
/* loaded from: classes8.dex */
public interface a3m<T> {
    T deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
