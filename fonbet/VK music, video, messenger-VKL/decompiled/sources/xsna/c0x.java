package xsna;

/* compiled from: NewsfeedListScreenContext.kt */
/* loaded from: classes4.dex */
public final class c0x {
    public final float a;
    public final long b;
    public final long c;

    public c0x() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0x)) {
            return false;
        }
        c0x c0xVar = (c0x) obj;
        return Float.compare(this.a, c0xVar.a) == 0 && this.b == c0xVar.b && this.c == c0xVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + bh10.a(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineCommentConfig(visibilityPostPercent=");
        sb.append(this.a);
        sb.append(", visibilityCommentMs=");
        sb.append(this.b);
        sb.append(", visibilityInputMs=");
        return vu5.a(')', this.c, sb);
    }

    public c0x(int i) {
        long j = (i & 2) != 0 ? 1500L : 0L;
        long j2 = (i & 4) != 0 ? 4500L : 1500L;
        this.a = 0.75f;
        this.b = j;
        this.c = j2;
    }
}
