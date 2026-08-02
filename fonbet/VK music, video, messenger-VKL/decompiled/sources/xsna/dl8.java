package xsna;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes11.dex */
public final class dl8 implements vho0 {
    public final n4j0 a;
    public final float b;

    public dl8(n4j0 n4j0Var, float f) {
        this.a = n4j0Var;
        this.b = f;
    }

    @Override // xsna.vho0
    public final float a() {
        return this.b;
    }

    @Override // xsna.vho0
    public final long c() {
        int i = l5g.l;
        return l5g.k;
    }

    @Override // xsna.vho0
    public final yk8 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl8)) {
            return false;
        }
        dl8 dl8Var = (dl8) obj;
        return epx.f(this.a, dl8Var.a) && Float.compare(this.b, dl8Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return xq.c(')', this.b, sb);
    }
}
