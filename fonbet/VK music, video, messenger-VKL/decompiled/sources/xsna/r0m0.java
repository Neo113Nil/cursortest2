package xsna;

/* compiled from: StoryControlsTipsHelper.kt */
/* loaded from: classes16.dex */
public final class r0m0 {
    public final int a;
    public final long b;
    public final long c;
    public final int d;

    public r0m0(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0m0)) {
            return false;
        }
        r0m0 r0m0Var = (r0m0) obj;
        return this.a == r0m0Var.a && this.b == r0m0Var.b && this.c == r0m0Var.c && this.d == r0m0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TipsParams(timesShown=");
        sb.append(this.a);
        sb.append(", delayMs=");
        sb.append(this.b);
        sb.append(", timeVisibleMs=");
        sb.append(this.c);
        sb.append(", resetEditorTips=");
        return vu5.b(sb, this.d, ')');
    }
}
