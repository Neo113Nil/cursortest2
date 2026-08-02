package xsna;

/* compiled from: VideoAdvertisementsRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class kmk0 {
    public final wc0 a;
    public final wc0 b;

    public kmk0(wc0 wc0Var, wc0 wc0Var2) {
        this.a = wc0Var;
        this.b = wc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmk0)) {
            return false;
        }
        kmk0 kmk0Var = (kmk0) obj;
        return epx.f(this.a, kmk0Var.a) && epx.f(this.b, kmk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportAdTrackers(videoTracker=" + this.a + ", liveTracker=" + this.b + ')';
    }
}
