package xsna;

import xsna.z2d;

/* compiled from: OverlayVisibilityMappingData.kt */
/* loaded from: classes17.dex */
public final class m390 {
    public final m0d a;
    public final j4b0 b;
    public final ixp0 c;
    public final boolean d;
    public final gvp e;
    public final n0x f;

    public m390(z2d.a aVar) {
        m0d m0dVar = aVar.b;
        j4b0 j4b0Var = aVar.n;
        ixp0 ixp0Var = aVar.q;
        boolean z = aVar.p;
        gvp gvpVar = aVar.r;
        n0x n0xVar = aVar.v;
        this.a = m0dVar;
        this.b = j4b0Var;
        this.c = ixp0Var;
        this.d = z;
        this.e = gvpVar;
        this.f = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m390)) {
            return false;
        }
        m390 m390Var = (m390) obj;
        return epx.f(this.a, m390Var.a) && epx.f(this.b, m390Var.b) && epx.f(this.c, m390Var.c) && this.d == m390Var.d && epx.f(this.e, m390Var.e) && epx.f(this.f, m390Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "OverlayVisibilityMappingData(clipState=" + this.a + ", playerState=" + this.b + ", uiVisibilityConfig=" + this.c + ", seeking=" + this.d + ", errorData=" + this.e + ", inlineNpsState=" + this.f + ')';
    }
}
