package defpackage;

/* loaded from: classes10.dex */
public final class be11 extends m8 {
    public int c;
    public Object[] w;
    public boolean x;

    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public be11(int i, int i2, int i3, Object[] objArr) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.w = objArr2;
        ?? r4 = i == i2 ? 1 : 0;
        this.x = r4;
        objArr2[0] = objArr;
        b(i - r4, 1);
    }

    public final Object a() {
        return ((Object[]) this.w[this.c - 1])[this.a & 31];
    }

    public final void b(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.w;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[dai0.v(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (dai0.v(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        Object a = a();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.x = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        this.a--;
        if (this.x) {
            this.x = false;
            return a();
        }
        c(31);
        return a();
    }
}
