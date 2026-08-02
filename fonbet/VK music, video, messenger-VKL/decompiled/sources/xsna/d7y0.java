package xsna;

/* compiled from: ZoomStatEvents.kt */
/* loaded from: classes4.dex */
public final class d7y0 {
    public final a7y0 a;

    public d7y0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7y0) && epx.f(this.a, ((d7y0) obj).a);
    }

    public final int hashCode() {
        a7y0 a7y0Var = this.a;
        return (a7y0Var == null ? 0 : a7y0Var.hashCode()) * 31;
    }

    public final String toString() {
        return "ZoomStatEvents(zoom=" + this.a + ", unZoom=null)";
    }

    public d7y0(a7y0 a7y0Var, int i) {
        this.a = (i & 1) != 0 ? null : a7y0Var;
    }
}
