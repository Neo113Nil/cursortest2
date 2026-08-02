package xsna;

/* compiled from: IdeasProgressDelegate.kt */
/* loaded from: classes6.dex */
public final class v3e0 {
    public final int a;
    public final int b;
    public final boolean c;

    public v3e0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e0)) {
            return false;
        }
        v3e0 v3e0Var = (v3e0) obj;
        return this.a == v3e0Var.a && this.b == v3e0Var.b && this.c == v3e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, 8000L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressViewState(pageIndex=");
        sb.append(this.a);
        sb.append(", pagesCount=");
        sb.append(this.b);
        sb.append(", durationMs=8000, isRunning=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
