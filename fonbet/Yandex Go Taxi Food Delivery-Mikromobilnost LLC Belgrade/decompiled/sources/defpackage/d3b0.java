package defpackage;

/* loaded from: classes10.dex */
public final class d3b0 extends m8 {
    public final Object[] c;
    public final be11 w;

    public d3b0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.w = new be11(i > i4 ? i4 : i, i4, i3, objArr);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        be11 be11Var = this.w;
        if (be11Var.hasNext()) {
            this.a++;
            return be11Var.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - be11Var.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        int i = this.a;
        be11 be11Var = this.w;
        int i2 = be11Var.b;
        if (i <= i2) {
            this.a = i - 1;
            return be11Var.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
