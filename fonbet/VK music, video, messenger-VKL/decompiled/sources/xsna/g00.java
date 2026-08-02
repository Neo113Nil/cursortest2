package xsna;

import com.squareup.wire.Message;

/* compiled from: ActionEntitySerializer.kt */
/* loaded from: classes4.dex */
public interface g00 {
    byte[] a(Message message);

    Object b(byte[] bArr);

    default void c(Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Serializer isn't defined.");
        }
    }

    default void d(byte[] bArr) {
        if (bArr != null) {
            throw new UnsupportedOperationException("Serializer isn't defined.");
        }
    }
}
