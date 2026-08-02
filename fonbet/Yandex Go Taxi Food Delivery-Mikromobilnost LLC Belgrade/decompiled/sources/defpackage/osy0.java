package defpackage;

/* loaded from: classes.dex */
public final class osy0 {
    public final long a;
    public final long b;

    public osy0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osy0)) {
            return false;
        }
        osy0 osy0Var = (osy0) obj;
        return ldc.c(this.a, osy0Var.a) && ldc.c(this.b, osy0Var.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        xvz.w(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) ldc.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
