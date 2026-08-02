package defpackage;

/* loaded from: classes.dex */
public final class ol6 implements moy0 {
    public final zfr0 a;
    public final float b;

    public ol6(zfr0 zfr0Var, float f) {
        this.a = zfr0Var;
        this.b = f;
    }

    @Override // defpackage.moy0
    public final float a() {
        return this.b;
    }

    @Override // defpackage.moy0
    public final long b() {
        int i = ldc.n;
        return ldc.m;
    }

    @Override // defpackage.moy0
    public final ml6 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol6)) {
            return false;
        }
        ol6 ol6Var = (ol6) obj;
        return jl40.l(this.a, ol6Var.a) && Float.compare(this.b, ol6Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return n.n(sb, this.b, ')');
    }
}
