package xsna;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class ybl {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ybl(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ybl.class != obj.getClass()) {
            return false;
        }
        ybl yblVar = (ybl) obj;
        return l5g.d(this.a, yblVar.a) && l5g.d(this.b, yblVar.b) && l5g.d(this.c, yblVar.c) && l5g.d(this.d, yblVar.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
