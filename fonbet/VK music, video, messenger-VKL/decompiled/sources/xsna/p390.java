package xsna;

import xsna.nz0;

/* compiled from: OverlayVisibilityMappingData.kt */
/* loaded from: classes17.dex */
public final class p390 {
    public final hw0 a;
    public final j4b0 b;
    public final ixp0 c;
    public final gvp d;

    public p390(nz0.a aVar) {
        hw0 hw0Var = aVar.b;
        j4b0 j4b0Var = aVar.e;
        ixp0 ixp0Var = aVar.f;
        gvp gvpVar = aVar.g;
        this.a = hw0Var;
        this.b = j4b0Var;
        this.c = ixp0Var;
        this.d = gvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p390)) {
            return false;
        }
        p390 p390Var = (p390) obj;
        return epx.f(this.a, p390Var.a) && epx.f(this.b, p390Var.b) && epx.f(this.c, p390Var.c) && epx.f(this.d, p390Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OverlayVisibilityMappingData(clipState=" + this.a + ", playerState=" + this.b + ", uiVisibilityConfig=" + this.c + ", errorData=" + this.d + ')';
    }
}
