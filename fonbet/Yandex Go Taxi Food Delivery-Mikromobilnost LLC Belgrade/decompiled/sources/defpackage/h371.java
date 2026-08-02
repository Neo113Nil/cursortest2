package defpackage;

/* loaded from: classes11.dex */
public final class h371 extends h671 {
    public final int a = 3;
    public final long b;

    public h371(long j) {
        this.b = j;
    }

    @Override // defpackage.h671
    public final int a() {
        return this.a;
    }

    @Override // defpackage.h671
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h671)) {
            return false;
        }
        h671 h671Var = (h671) obj;
        return this.a == h671Var.a() && this.b == h671Var.b();
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return oyr.n(this.b, "}", sb);
    }
}
