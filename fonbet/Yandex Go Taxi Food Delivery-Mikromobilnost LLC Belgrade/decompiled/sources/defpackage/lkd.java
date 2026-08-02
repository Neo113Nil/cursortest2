package defpackage;

/* loaded from: classes2.dex */
public final class lkd {
    public final long a;
    public final pkd b;

    public lkd(long j, pkd pkdVar) {
        this.a = j;
        this.b = pkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd)) {
            return false;
        }
        lkd lkdVar = (lkd) obj;
        return this.a == lkdVar.a && this.b.equals(lkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Invoice(timestamp=" + this.a + ", totalPrice=" + this.b + ')';
    }
}
