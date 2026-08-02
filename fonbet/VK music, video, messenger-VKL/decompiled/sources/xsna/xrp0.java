package xsna;

/* compiled from: TrimmerViewState.kt */
/* loaded from: classes2.dex */
public final class xrp0 {
    public final q500 a;
    public final q500 b;
    public final long c;
    public final ttk0<Long> d;
    public final owo0 e;
    public final zjw f;
    public final long g;

    public xrp0(q500 q500Var, q500 q500Var2, long j, xh50 xh50Var, owo0 owo0Var, zjw zjwVar, long j2) {
        this.a = q500Var;
        this.b = q500Var2;
        this.c = j;
        this.d = xh50Var;
        this.e = owo0Var;
        this.f = zjwVar;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrp0)) {
            return false;
        }
        xrp0 xrp0Var = (xrp0) obj;
        return epx.f(this.a, xrp0Var.a) && epx.f(this.b, xrp0Var.b) && this.c == xrp0Var.c && epx.f(this.d, xrp0Var.d) && epx.f(this.e, xrp0Var.e) && epx.f(this.f, xrp0Var.f) && this.g == xrp0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        owo0 owo0Var = this.e;
        return Long.hashCode(this.g) + ((this.f.hashCode() + ((hashCode + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmerViewState(boundsInitialMs=");
        sb.append(this.a);
        sb.append(", durationAvailableMs=");
        sb.append(this.b);
        sb.append(", durationTotalMs=");
        sb.append(this.c);
        sb.append(", sliderMs=");
        sb.append(this.d);
        sb.append(", thumbs=");
        sb.append(this.e);
        sb.append(", thumbsImageLoader=");
        sb.append(this.f);
        sb.append(", thumbsOffsetInitialMs=");
        return vu5.a(')', this.g, sb);
    }
}
