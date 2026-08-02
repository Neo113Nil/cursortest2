package xsna;

/* compiled from: CommentsContentState.kt */
/* loaded from: classes16.dex */
public final class deg {
    public final boolean a;
    public final int b;

    public deg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deg)) {
            return false;
        }
        deg degVar = (deg) obj;
        return this.a == degVar.a && this.b == degVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentsContentState(isAvailable=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }

    public /* synthetic */ deg(int i) {
        this(true, 0);
    }

    public deg(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
