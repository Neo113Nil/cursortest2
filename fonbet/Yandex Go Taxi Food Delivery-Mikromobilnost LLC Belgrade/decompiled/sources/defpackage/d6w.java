package defpackage;

/* loaded from: classes9.dex */
public final class d6w extends b6w implements a6c {
    public static final d6w w = new d6w(1, 0, 1);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6c
    public final /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return g(((Number) comparable).intValue());
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.b6w
    public final boolean equals(Object obj) {
        if (!(obj instanceof d6w)) {
            return false;
        }
        if (isEmpty() && ((d6w) obj).isEmpty()) {
            return true;
        }
        d6w d6wVar = (d6w) obj;
        return this.a == d6wVar.a && this.b == d6wVar.b;
    }

    public final boolean g(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.b6w
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.b6w, defpackage.a6c
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.b6w
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
