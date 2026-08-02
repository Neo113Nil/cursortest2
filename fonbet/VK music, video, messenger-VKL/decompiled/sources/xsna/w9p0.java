package xsna;

/* compiled from: TopshelfCardBackground.kt */
/* loaded from: classes2.dex */
public final class w9p0 {
    public final Float a;
    public final long b;

    public w9p0(long j, Float f, jgz jgzVar) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9p0)) {
            return false;
        }
        w9p0 w9p0Var = (w9p0) obj;
        w9p0Var.getClass();
        return epx.f(null, null) && epx.f(this.a, w9p0Var.a) && l5g.d(this.b, w9p0Var.b);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfBlurredImageOverlayParams(appearance=");
        sb.append((Object) null);
        sb.append(", scrimBlurStartY=");
        sb.append(this.a);
        sb.append(", resolvedScrimColor=");
        return pm0.d(')', this.b, sb);
    }
}
