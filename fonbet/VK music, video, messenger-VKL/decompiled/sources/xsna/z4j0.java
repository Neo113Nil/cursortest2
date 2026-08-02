package xsna;

/* compiled from: Shadow.kt */
/* loaded from: classes11.dex */
public final class z4j0 extends d730<cf7> {
    public final float a;
    public final r5j0 b;
    public final boolean c;
    public final long d;
    public final long e;

    public z4j0(float f, r5j0 r5j0Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = r5j0Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4j0)) {
            return false;
        }
        z4j0 z4j0Var = (z4j0) obj;
        return pco.b(this.a, z4j0Var.a) && epx.f(this.b, z4j0Var.b) && this.c == z4j0Var.c && l5g.d(this.d, z4j0Var.d) && l5g.d(this.e, z4j0Var.e);
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = l5g.l;
        return Long.hashCode(this.e) + bh10.a(b, 31, this.d);
    }

    @Override // xsna.d730
    public final cf7 r() {
        return new cf7(new y4j0(this));
    }

    @Override // xsna.d730
    public final void s(cf7 cf7Var) {
        androidx.compose.ui.node.o oVar;
        cf7 cf7Var2 = cf7Var;
        y4j0 y4j0Var = new y4j0(this);
        cf7Var2.p = y4j0Var;
        if (cf7Var2.b.o && (oVar = itl.d(cf7Var2, 2).t) != null) {
            oVar.j2(y4j0Var, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        oq.f(this.a, ", shape=", sb);
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        dn.h(this.d, ", spotColor=", sb);
        return pm0.d(')', this.e, sb);
    }
}
