package xsna;

/* compiled from: VideoCoverage.kt */
/* loaded from: classes8.dex */
public final class tds0 {
    public long a;
    public long b;

    public tds0() {
        this(0);
    }

    public final void a() {
        this.a = -1L;
        this.b = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tds0)) {
            return false;
        }
        tds0 tds0Var = (tds0) obj;
        return this.a == tds0Var.a && this.b == tds0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return efz.b(this.b, ")", fp.b(this.a, "VideoCoverage(videoCoverageStart=", ", videoCoverageEnd="));
    }

    public tds0(int i) {
        this.a = -1L;
        this.b = -1L;
    }
}
