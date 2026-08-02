package defpackage;

/* loaded from: classes10.dex */
public final class e3b0 extends m8 {
    public final c3b0 c;
    public int w;
    public be11 x;
    public int y;

    public e3b0(c3b0 c3b0Var, int i) {
        super(i, c3b0Var.size());
        this.c = c3b0Var;
        this.w = c3b0Var.f();
        this.y = -1;
        b();
    }

    public final void a() {
        if (this.w == this.c.f()) {
            return;
        }
        ny61.y();
    }

    @Override // defpackage.m8, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.a;
        c3b0 c3b0Var = this.c;
        c3b0Var.add(i, obj);
        this.a++;
        this.b = c3b0Var.size();
        this.w = c3b0Var.f();
        this.y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        c3b0 c3b0Var = this.c;
        Object[] objArr = c3b0Var.y;
        if (objArr == null) {
            this.x = null;
            return;
        }
        int size = (c3b0Var.size() - 1) & (-32);
        int i = this.a;
        if (i > size) {
            i = size;
        }
        int i2 = (c3b0Var.w / 5) + 1;
        be11 be11Var = this.x;
        if (be11Var == null) {
            this.x = new be11(i, size, i2, objArr);
            return;
        }
        be11Var.a = i;
        be11Var.b = size;
        be11Var.c = i2;
        if (be11Var.w.length < i2) {
            be11Var.w = new Object[i2];
        }
        be11Var.w[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        be11Var.x = r0;
        be11Var.b(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        int i = this.a;
        this.y = i;
        be11 be11Var = this.x;
        c3b0 c3b0Var = this.c;
        if (be11Var == null) {
            Object[] objArr = c3b0Var.z;
            this.a = i + 1;
            return objArr[i];
        }
        if (be11Var.hasNext()) {
            this.a++;
            return be11Var.next();
        }
        Object[] objArr2 = c3b0Var.z;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - be11Var.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            ny61.p();
            return null;
        }
        int i = this.a;
        this.y = i - 1;
        be11 be11Var = this.x;
        c3b0 c3b0Var = this.c;
        if (be11Var == null) {
            Object[] objArr = c3b0Var.z;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = be11Var.b;
        if (i <= i3) {
            this.a = i - 1;
            return be11Var.previous();
        }
        Object[] objArr2 = c3b0Var.z;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.m8, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.y;
        if (i == -1) {
            ny61.k();
            return;
        }
        c3b0 c3b0Var = this.c;
        c3b0Var.remove(i);
        int i2 = this.y;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = c3b0Var.size();
        this.w = c3b0Var.f();
        this.y = -1;
        b();
    }

    @Override // defpackage.m8, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.y;
        if (i == -1) {
            ny61.k();
            return;
        }
        c3b0 c3b0Var = this.c;
        c3b0Var.set(i, obj);
        this.w = c3b0Var.f();
        b();
    }
}
