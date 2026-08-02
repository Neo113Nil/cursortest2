package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: KSerializer.kt */
/* loaded from: classes8.dex */
public interface mmi0<T> {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, T t);
}
