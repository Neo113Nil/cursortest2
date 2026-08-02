package defpackage;

/* loaded from: classes10.dex */
public class e2b0 extends c2b0 {
    public final d2b0 w;
    public Object x;
    public boolean y;
    public int z;

    public e2b0(d2b0 d2b0Var, de11[] de11VarArr) {
        super(d2b0Var.c, de11VarArr);
        this.w = d2b0Var;
        this.z = d2b0Var.x;
    }

    public final void c(int i, ce11 ce11Var, Object obj, int i2) {
        int i3 = i2 * 5;
        de11[] de11VarArr = this.a;
        if (i3 <= 30) {
            int B = 1 << udq0.B(i, i3);
            if (ce11Var.h(B)) {
                de11VarArr[i2].a(Integer.bitCount(ce11Var.a) * 2, ce11Var.f(B), ce11Var.d);
                this.b = i2;
                return;
            }
            int t = ce11Var.t(B);
            ce11 s = ce11Var.s(t);
            de11VarArr[i2].a(Integer.bitCount(ce11Var.a) * 2, t, ce11Var.d);
            c(i, s, obj, i2 + 1);
            return;
        }
        de11 de11Var = de11VarArr[i2];
        Object[] objArr = ce11Var.d;
        de11Var.a(objArr.length, 0, objArr);
        while (true) {
            de11 de11Var2 = de11VarArr[i2];
            if (jl40.l(de11Var2.a[de11Var2.c], obj)) {
                this.b = i2;
                return;
            } else {
                de11VarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.c2b0, java.util.Iterator
    public final Object next() {
        if (this.w.x != this.z) {
            ny61.y();
            return null;
        }
        if (!this.c) {
            ny61.p();
            return null;
        }
        de11 de11Var = this.a[this.b];
        this.x = de11Var.a[de11Var.c];
        this.y = true;
        return super.next();
    }

    @Override // defpackage.c2b0, java.util.Iterator
    public final void remove() {
        if (!this.y) {
            ny61.k();
            return;
        }
        boolean z = this.c;
        d2b0 d2b0Var = this.w;
        if (!z) {
            ym11.c(d2b0Var).remove(this.x);
        } else {
            if (!z) {
                ny61.p();
                return;
            }
            de11 de11Var = this.a[this.b];
            Object obj = de11Var.a[de11Var.c];
            ym11.c(d2b0Var).remove(this.x);
            c(obj != null ? obj.hashCode() : 0, d2b0Var.c, obj, 0);
        }
        this.x = null;
        this.y = false;
        this.z = d2b0Var.x;
    }
}
