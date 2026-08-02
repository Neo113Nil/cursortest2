package defpackage;

/* loaded from: classes.dex */
public final class gc90 implements fk2 {
    public final int a;
    public final int b;
    public final long c;
    public final apy0 d;
    public final tvc0 e;
    public final ehy f;
    public final int g;
    public final int h;
    public final try0 i;

    public gc90(int i, int i2, long j, apy0 apy0Var, tvc0 tvc0Var, ehy ehyVar, int i3, int i4, try0 try0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = apy0Var;
        this.e = tvc0Var;
        this.f = ehyVar;
        this.g = i3;
        this.h = i4;
        this.i = try0Var;
        if (sty0.a(j, sty0.c) || sty0.c(j) >= 0.0f) {
            return;
        }
        jxv.c("lineHeight can't be negative (" + sty0.c(j) + ')');
    }

    public final gc90 a(gc90 gc90Var) {
        return gc90Var == null ? this : hc90.a(this, gc90Var.a, gc90Var.b, gc90Var.c, gc90Var.d, gc90Var.e, gc90Var.f, gc90Var.g, gc90Var.h, gc90Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc90)) {
            return false;
        }
        gc90 gc90Var = (gc90) obj;
        return this.a == gc90Var.a && this.b == gc90Var.b && sty0.a(this.c, gc90Var.c) && jl40.l(this.d, gc90Var.d) && jl40.l(this.e, gc90Var.e) && jl40.l(this.f, gc90Var.f) && this.g == gc90Var.g && this.h == gc90Var.h && jl40.l(this.i, gc90Var.i);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        tty0[] tty0VarArr = sty0.b;
        int c = qv10.c(b, 31, this.c);
        apy0 apy0Var = this.d;
        int hashCode = (c + (apy0Var != null ? apy0Var.hashCode() : 0)) * 31;
        tvc0 tvc0Var = this.e;
        int hashCode2 = (hashCode + (tvc0Var != null ? tvc0Var.hashCode() : 0)) * 31;
        ehy ehyVar = this.f;
        int b2 = oyr.b(this.h, oyr.b(this.g, (hashCode2 + (ehyVar != null ? ehyVar.hashCode() : 0)) * 31, 31), 31);
        try0 try0Var = this.i;
        return b2 + (try0Var != null ? try0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) sjy0.a(this.a)) + ", textDirection=" + ((Object) vly0.a(this.b)) + ", lineHeight=" + ((Object) sty0.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) kgy.a(this.g)) + ", hyphens=" + ((Object) n2v.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
