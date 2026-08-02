package xsna;

/* compiled from: RadioButton.kt */
/* loaded from: classes11.dex */
public final class ill {
    public final long a;
    public final long b;
    public final long c;

    public ill(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ill.class != obj.getClass()) {
            return false;
        }
        ill illVar = (ill) obj;
        return l5g.d(this.a, illVar.a) && l5g.d(this.b, illVar.b) && l5g.d(this.c, illVar.c);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
