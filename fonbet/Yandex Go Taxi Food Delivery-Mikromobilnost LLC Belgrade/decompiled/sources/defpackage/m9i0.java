package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class m9i0 extends n9i0 {
    public final byte[] a;
    public final byte[] b;

    public m9i0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final byte[] c() {
        return this.a;
    }

    public final byte[] d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m9i0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m9i0 m9i0Var = (m9i0) obj;
        return Arrays.equals(this.a, m9i0Var.a) && Arrays.equals(this.b, m9i0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(logList=" + Arrays.toString(this.a) + ", signature=" + Arrays.toString(this.b) + ')';
    }
}
