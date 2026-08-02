package defpackage;

/* loaded from: classes10.dex */
public final class p62 extends meb1 {
    public final int a;

    public p62(int i) {
        this.a = i;
    }

    @Override // defpackage.meb1
    public final Object c(sus0 sus0Var) {
        return sus0Var.f(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p62) && ((p62) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
