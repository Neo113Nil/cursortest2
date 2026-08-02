package defpackage;

/* loaded from: classes10.dex */
public final class dq6 extends m8 {
    public final /* synthetic */ int c = 0;
    public final Object w;

    public dq6(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.w = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                if (!hasNext()) {
                    ny61.p();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.w;
                    int i = this.a;
                    this.a = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    ny61.p();
                    break;
                } else {
                    this.a++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.c) {
            case 0:
                if (!hasPrevious()) {
                    ny61.p();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.w;
                    int i = this.a - 1;
                    this.a = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    ny61.p();
                    break;
                } else {
                    this.a--;
                    break;
                }
        }
        return null;
    }

    public dq6(int i, Object obj) {
        super(i, 1);
        this.w = obj;
    }
}
