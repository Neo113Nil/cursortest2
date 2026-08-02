package xsna;

import java.util.ArrayList;
import xsna.at80;
import xsna.ss80;

/* compiled from: ComposerChangeListWriter.kt */
/* loaded from: classes11.dex */
public final class sri {
    public final androidx.compose.runtime.c a;
    public csa b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final s9x d = new s9x();
    public boolean e = true;
    public final ArrayList<Object> h = new ArrayList<>();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public sri(androidx.compose.runtime.c cVar, csa csaVar) {
        this.a = cVar;
        this.b = csaVar;
    }

    public final void a() {
        c();
        ArrayList<Object> arrayList = this.h;
        if (znk0.E(arrayList)) {
            znk0.J(arrayList);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            at80 at80Var = this.b.b;
            at80Var.b0(ss80.i0.c);
            at80Var.d[at80Var.e - at80Var.b[at80Var.c - 1].a] = i;
            this.g = 0;
        }
        ArrayList<Object> arrayList = this.h;
        if (znk0.E(arrayList)) {
            csa csaVar = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            csaVar.getClass();
            if (size != 0) {
                at80 at80Var2 = csaVar.b;
                at80Var2.b0(ss80.h.c);
                at80.b.a(at80Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                at80 at80Var = this.b.b;
                at80Var.b0(ss80.y.c);
                int i3 = at80Var.e - at80Var.b[at80Var.c - 1].a;
                int[] iArr = at80Var.d;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                at80 at80Var2 = this.b.b;
                at80Var2.b0(ss80.s.c);
                int i6 = at80Var2.e - at80Var2.b[at80Var2.c - 1].a;
                int[] iArr2 = at80Var2.d;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        androidx.compose.runtime.c cVar = this.a;
        int i = z ? cVar.G.i : cVar.G.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            androidx.compose.runtime.b.a("Tried to seek backward");
        }
        if (i2 > 0) {
            at80 at80Var = this.b.b;
            at80Var.b0(ss80.a.c);
            at80Var.d[at80Var.e - at80Var.b[at80Var.c - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        r2k0 r2k0Var = this.a.G;
        if (r2k0Var.c > 0) {
            int i = r2k0Var.i;
            s9x s9xVar = this.d;
            if (s9xVar.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.b.b0(ss80.n.c);
                    this.c = true;
                }
                if (i > 0) {
                    rgt a = r2k0Var.a(i);
                    s9xVar.c(i);
                    d(false);
                    at80 at80Var = this.b.b;
                    at80Var.b0(ss80.m.c);
                    at80.b.a(at80Var, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                androidx.compose.runtime.b.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
