package xsna;

/* compiled from: StencilStorageModel.kt */
/* loaded from: classes2.dex */
public final class j0l0 {
    public final int a;
    public final String b;
    public final long c;
    public final long d;

    public j0l0(long j, long j2, int i, String str) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0l0)) {
            return false;
        }
        j0l0 j0l0Var = (j0l0) obj;
        return this.a == j0l0Var.a && epx.f(this.b, j0l0Var.b) && this.c == j0l0Var.c && this.d == j0l0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StencilStorageModel(id=");
        sb.append(this.a);
        sb.append(", rawPath=");
        sb.append(this.b);
        sb.append(", startDateMs=");
        sb.append(this.c);
        sb.append(", endDateMs=");
        return vu5.a(')', this.d, sb);
    }
}
