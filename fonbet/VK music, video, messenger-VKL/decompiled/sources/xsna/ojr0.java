package xsna;

import io.opentelemetry.api.common.ValueType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

/* compiled from: ValueBytes.java */
/* loaded from: classes8.dex */
public final class ojr0 implements ljr0<ByteBuffer> {
    public final byte[] a;

    public ojr0(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ojr0) {
            return Arrays.equals(this.a, ((ojr0) obj).a);
        }
        return false;
    }

    @Override // xsna.ljr0
    public final ValueType getType() {
        return ValueType.BYTES;
    }

    @Override // xsna.ljr0
    public final ByteBuffer getValue() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ValueBytes{" + Base64.getEncoder().encodeToString(this.a) + "}";
    }
}
