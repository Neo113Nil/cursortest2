package xsna;

/* compiled from: SearchFeatureCatalogStateSnapshot.kt */
/* loaded from: classes5.dex */
public final class yqh0 {
    public final int a;
    public final int b;
    public final zfa c;

    public yqh0(int i, int i2, zfa zfaVar) {
        this.a = i;
        this.b = i2;
        this.c = zfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqh0)) {
            return false;
        }
        yqh0 yqh0Var = (yqh0) obj;
        return this.a == yqh0Var.a && this.b == yqh0Var.b && this.c.equals(yqh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "SearchFeatureCatalogStateSnapshot(firstVisibleItemPosition=" + this.a + ", firstVisibleItemOffset=" + this.b + ", dataSnapshot=" + this.c + ')';
    }
}
