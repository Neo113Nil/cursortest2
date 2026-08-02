package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes11.dex */
public final class h6a1 extends s7a1 {
    public final long a;

    public h6a1(long j) {
        this.a = j;
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d(this.a >= 0 ? (byte) 0 : BlobHeaderStructure.BLOB_VERSION);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s7a1 s7a1Var = (s7a1) obj;
        if (a() != s7a1Var.a()) {
            return a() - s7a1Var.a();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((h6a1) s7a1Var).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h6a1.class == obj.getClass() && this.a == ((h6a1) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
