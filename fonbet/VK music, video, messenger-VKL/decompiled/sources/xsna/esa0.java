package xsna;

/* compiled from: Placeholder.kt */
/* loaded from: classes11.dex */
public final class esa0 {
    public final long a;
    public final long b;
    public final int c;

    public esa0(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
        gno0[] gno0VarArr = fno0.b;
        if ((j & 1095216660480L) == 0) {
            vzw.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            vzw.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esa0)) {
            return false;
        }
        esa0 esa0Var = (esa0) obj;
        return fno0.b(this.a, esa0Var.a) && fno0.b(this.b, esa0Var.b) && this.c == esa0Var.c;
    }

    public final int hashCode() {
        gno0[] gno0VarArr = fno0.b;
        return Integer.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) fno0.f(this.a));
        sb.append(", height=");
        sb.append((Object) fno0.f(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        return tq.f(sb, i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid", ')');
    }
}
