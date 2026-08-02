package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c2b0 implements Iterator, xfx {
    public final de11[] a;
    public int b;
    public boolean c = true;

    public c2b0(ce11 ce11Var, de11[] de11VarArr) {
        this.a = de11VarArr;
        de11VarArr[0].a(Integer.bitCount(ce11Var.a) * 2, 0, ce11Var.d);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        de11[] de11VarArr = this.a;
        de11 de11Var = de11VarArr[i];
        if (de11Var.c < de11Var.b) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                de11 de11Var2 = de11VarArr[i];
                int i2 = de11Var2.c;
                Object[] objArr = de11Var2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    de11Var2.c = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                de11 de11Var3 = de11VarArr[i - 1];
                int i3 = de11Var3.c;
                int length2 = de11Var3.a.length;
                de11Var3.c = i3 + 1;
            }
            de11VarArr[i].a(0, 0, ce11.e.d);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        de11[] de11VarArr = this.a;
        de11 de11Var = de11VarArr[i];
        int i2 = de11Var.c;
        if (i2 < de11Var.b) {
            return i;
        }
        Object[] objArr = de11Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        ce11 ce11Var = (ce11) objArr[i2];
        if (i == 6) {
            de11 de11Var2 = de11VarArr[i + 1];
            Object[] objArr2 = ce11Var.d;
            de11Var2.a(objArr2.length, 0, objArr2);
        } else {
            de11VarArr[i + 1].a(Integer.bitCount(ce11Var.a) * 2, 0, ce11Var.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            ny61.p();
            return null;
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
