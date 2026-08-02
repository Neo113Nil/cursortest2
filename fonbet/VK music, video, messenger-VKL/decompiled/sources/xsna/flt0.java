package xsna;

/* compiled from: VideoTopshelfUiViewedTimeChecker.kt */
/* loaded from: classes16.dex */
public final class flt0 {
    public final int a;
    public final String b;

    public flt0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flt0)) {
            return false;
        }
        flt0 flt0Var = (flt0) obj;
        return this.a == flt0Var.a && epx.f(this.b, flt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTopshelfKey(position=");
        sb.append(this.a);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
