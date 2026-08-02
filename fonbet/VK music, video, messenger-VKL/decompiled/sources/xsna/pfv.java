package xsna;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes11.dex */
public final class pfv implements loy {
    public final xgo0 a;
    public final int b;
    public final klp0 c;
    public final gzs<mjo0> d;

    public pfv(xgo0 xgo0Var, int i, klp0 klp0Var, gzs<mjo0> gzsVar) {
        this.a = xgo0Var;
        this.b = i;
        this.c = klp0Var;
        this.d = gzsVar;
    }

    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        long j2;
        if (zo10Var.l0(o6j.h(j)) < o6j.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = o6j.b(0, j2, Integer.MAX_VALUE, 0, 0, 13);
        }
        tra0 N = zo10Var.N(j);
        int min = Math.min(N.b, o6j.i(j2));
        return ep10Var.Q(min, N.c, jgp.b, new sqb(min, 1, this, ep10Var, N));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfv)) {
            return false;
        }
        pfv pfvVar = (pfv) obj;
        return epx.f(this.a, pfvVar.a) && this.b == pfvVar.b && epx.f(this.c, pfvVar.c) && epx.f(this.d, pfvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollLayoutModifier(scrollerPosition=");
        sb.append(this.a);
        sb.append(", cursorOffset=");
        sb.append(this.b);
        sb.append(", transformedText=");
        sb.append(this.c);
        sb.append(", textLayoutResultProvider=");
        return uf3.d(sb, this.d, ')');
    }
}
