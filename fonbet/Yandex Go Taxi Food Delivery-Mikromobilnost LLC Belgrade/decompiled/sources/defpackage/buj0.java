package defpackage;

/* loaded from: classes.dex */
public final class buj0 implements yxr {
    public final int a;
    public final lzr b;
    public final int c;
    public final kzr d;

    public buj0(int i, lzr lzrVar, int i2, kzr kzrVar) {
        this.a = i;
        this.b = lzrVar;
        this.c = i2;
        this.d = kzrVar;
    }

    @Override // defpackage.yxr
    public final int a() {
        return 0;
    }

    @Override // defpackage.yxr
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buj0)) {
            return false;
        }
        buj0 buj0Var = (buj0) obj;
        return this.a == buj0Var.a && jl40.l(this.b, buj0Var.b) && this.c == buj0Var.c && this.d.equals(buj0Var.d);
    }

    @Override // defpackage.yxr
    public final lzr getWeight() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + oyr.b(0, oyr.b(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) hzr.a(this.c)) + ", loadingStrategy=Blocking)";
    }
}
