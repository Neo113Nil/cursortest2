package xsna;

/* compiled from: PostsButtons.kt */
/* loaded from: classes5.dex */
public final class stc0 {
    public final int a;
    public final int b;
    public final int c;

    public stc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stc0)) {
            return false;
        }
        stc0 stc0Var = (stc0) obj;
        return this.a == stc0Var.a && this.b == stc0Var.b && this.c == stc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostsButtons(postponedCount=");
        sb.append(this.a);
        sb.append(", suggestedCount=");
        sb.append(this.b);
        sb.append(", draftsCount=");
        return vu5.b(sb, this.c, ')');
    }
}
