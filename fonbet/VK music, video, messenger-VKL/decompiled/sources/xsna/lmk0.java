package xsna;

/* compiled from: SportAdvertBannerStateLoader.kt */
/* loaded from: classes18.dex */
public final class lmk0 {
    public final wc0 a;
    public final wc0 b;

    public lmk0(wc0 wc0Var, wc0 wc0Var2) {
        this.a = wc0Var;
        this.b = wc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmk0)) {
            return false;
        }
        lmk0 lmk0Var = (lmk0) obj;
        return epx.f(this.a, lmk0Var.a) && epx.f(this.b, lmk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportAdTrackers(videoTracker=" + this.a + ", liveTracker=" + this.b + ')';
    }
}
