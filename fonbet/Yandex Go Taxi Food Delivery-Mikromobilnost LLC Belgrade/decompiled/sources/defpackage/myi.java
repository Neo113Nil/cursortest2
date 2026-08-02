package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes9.dex */
public interface myi {
    Object deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
