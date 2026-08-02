package xsna;

import kotlinx.serialization.KSerializer;

/* compiled from: BuiltinSerializers.kt */
/* loaded from: classes8.dex */
public final class xn8 {
    public static final <T> KSerializer<T> a(KSerializer<T> kSerializer) {
        return kSerializer.getDescriptor().b() ? kSerializer : new bn70(kSerializer);
    }
}
