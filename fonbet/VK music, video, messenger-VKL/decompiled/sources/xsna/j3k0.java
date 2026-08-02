package xsna;

/* compiled from: MediaStoreEntry.kt */
/* loaded from: classes3.dex */
public final class j3k0 {
    public final boolean a;
    public final long b;
    public final String c;
    public final String d;

    public j3k0(long j, String str, String str2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3k0)) {
            return false;
        }
        j3k0 j3k0Var = (j3k0) obj;
        return this.a == j3k0Var.a && this.b == j3k0Var.b && epx.f(this.c, j3k0Var.c) && epx.f(this.d, j3k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmallMediaEntry(isFavorite=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", bucketName=");
        return ho8.a(sb, this.d, ')');
    }
}
