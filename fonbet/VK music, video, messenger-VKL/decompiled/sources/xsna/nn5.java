package xsna;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class nn5 extends oy90 {
    public final long a;
    public final sop0 b;
    public final a0q c;

    public nn5(long j, sop0 sop0Var, a0q a0qVar) {
        this.a = j;
        if (sop0Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = sop0Var;
        if (a0qVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = a0qVar;
    }

    @Override // xsna.oy90
    public final a0q a() {
        return this.c;
    }

    @Override // xsna.oy90
    public final long b() {
        return this.a;
    }

    @Override // xsna.oy90
    public final sop0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oy90)) {
            return false;
        }
        oy90 oy90Var = (oy90) obj;
        return this.a == oy90Var.b() && this.b.equals(oy90Var.c()) && this.c.equals(oy90Var.a());
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
