package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q2f0 implements Comparable {
    public final byte[] a;

    public q2f0(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q2f0 q2f0Var = (q2f0) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = q2f0Var.a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = q2f0Var.a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q2f0) {
            return Arrays.equals(this.a, ((q2f0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return s8o.j(this.a);
    }
}
