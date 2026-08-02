package xsna;

/* compiled from: Shapes.kt */
/* loaded from: classes11.dex */
public final class n6j0 {
    public final quj a;
    public final quj b;
    public final quj c;
    public final quj d;
    public final quj e;
    public final quj f;
    public final quj g;
    public final quj h;

    public n6j0(quj qujVar, quj qujVar2, quj qujVar3, quj qujVar4, quj qujVar5, quj qujVar6, quj qujVar7, quj qujVar8) {
        this.a = qujVar;
        this.b = qujVar2;
        this.c = qujVar3;
        this.d = qujVar4;
        this.e = qujVar5;
        this.f = qujVar6;
        this.g = qujVar7;
        this.h = qujVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6j0)) {
            return false;
        }
        n6j0 n6j0Var = (n6j0) obj;
        return epx.f(this.a, n6j0Var.a) && epx.f(this.b, n6j0Var.b) && epx.f(this.c, n6j0Var.c) && epx.f(this.d, n6j0Var.d) && epx.f(this.e, n6j0Var.e) && epx.f(this.f, n6j0Var.f) && epx.f(this.g, n6j0Var.g) && epx.f(this.h, n6j0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    public n6j0() {
        this(x5j0.a, x5j0.b, x5j0.c, x5j0.d, x5j0.f, x5j0.e, x5j0.g, x5j0.h);
    }
}
