package xsna;

import java.util.ArrayList;

/* compiled from: Intervals.kt */
/* loaded from: classes8.dex */
public final class sox {
    public final ArrayList a;
    public final long b;

    /* compiled from: Intervals.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final String c;

        public a(long j, long j2, String str) {
            this.a = j;
            this.b = j2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder b = fp.b(this.a, "Item(startPosition=", ", endPosition=");
            b.append(this.b);
            b.append(", title=");
            b.append(this.c);
            b.append(")");
            return b.toString();
        }
    }

    public sox(ArrayList arrayList, long j) {
        this.a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sox)) {
            return false;
        }
        sox soxVar = (sox) obj;
        return this.a.equals(soxVar.a) && this.b == soxVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Intervals(intervals=" + this.a + ", duration=" + this.b + ")";
    }
}
