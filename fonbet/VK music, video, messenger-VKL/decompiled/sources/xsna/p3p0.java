package xsna;

/* compiled from: PostViewState.kt */
/* loaded from: classes4.dex */
public final class p3p0 {
    public final int a;

    public p3p0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3p0) && this.a == ((p3p0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ToolbarState(title="), this.a, ')');
    }
}
