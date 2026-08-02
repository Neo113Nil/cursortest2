package xsna;

import java.util.Arrays;

/* compiled from: EncryptionManager.kt */
/* loaded from: classes17.dex */
public final class vjp {
    public final byte[] a;
    public final byte[] b;

    public vjp(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vjp.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vjp vjpVar = (vjp) obj;
        return Arrays.equals(this.a, vjpVar.a) && Arrays.equals(this.b, vjpVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
