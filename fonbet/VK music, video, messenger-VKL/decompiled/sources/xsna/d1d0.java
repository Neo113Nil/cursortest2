package xsna;

import xsna.j1d0;

/* compiled from: PreloadItem.kt */
/* loaded from: classes8.dex */
public final class d1d0 {
    public final sht0 a;
    public final j1d0.b b;
    public q1d0 c;

    public d1d0(sht0 sht0Var, j1d0.b bVar) {
        this.a = sht0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1d0)) {
            return false;
        }
        d1d0 d1d0Var = (d1d0) obj;
        return epx.f(this.a, d1d0Var.a) && epx.f(this.b, d1d0Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "PreloadItem(videoSource=" + this.a + ", preloadParams=" + this.b + ", viewportSize=null)";
    }
}
