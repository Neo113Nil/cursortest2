package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class lez {
    public final byte[] a;

    public lez(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return lez.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.a, ((lez) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "LogId(keyId=" + Arrays.toString(this.a) + ')';
    }
}
