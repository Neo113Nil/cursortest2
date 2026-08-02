package xsna;

/* compiled from: VideoDiskCacheTrackSelectionConfig.kt */
/* loaded from: classes8.dex */
public final class dhs0 {
    public final r8l a;
    public final xgp0 b;
    public final hk0 c;

    public dhs0(r8l r8lVar, xgp0 xgp0Var, hk0 hk0Var) {
        this.a = r8lVar;
        this.b = xgp0Var;
        this.c = hk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhs0)) {
            return false;
        }
        dhs0 dhs0Var = (dhs0) obj;
        return epx.f(this.a, dhs0Var.a) && epx.f(this.b, dhs0Var.b) && epx.f(this.c, dhs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoDiskCacheTrackSelectionConfig(decodersConfig=" + this.a + ", trackSelectionConfig=" + this.b + ", adaptiveTrackSelectionConfig=" + this.c + ")";
    }
}
