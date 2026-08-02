package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gid {
    public final bts a;
    public bb9 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final m6w d = new m6w();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public gid(bts btsVar, bb9 bb9Var) {
        this.a = btsVar;
        this.b = bb9Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            wc70 wc70Var = this.b.a;
            wc70Var.d(cc70.c);
            wc70Var.c[wc70Var.d - wc70Var.a[wc70Var.b - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        bb9 bb9Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        bb9Var.getClass();
        if (size != 0) {
            wc70 wc70Var2 = bb9Var.a;
            wc70Var2.d(cb70.c);
            rzo.U(wc70Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                wc70 wc70Var = this.b.a;
                wc70Var.d(sb70.c);
                int i3 = wc70Var.d - wc70Var.a[wc70Var.b - 1].a;
                int[] iArr = wc70Var.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                wc70 wc70Var2 = this.b.a;
                wc70Var2.d(nb70.c);
                int i6 = wc70Var2.d - wc70Var2.a[wc70Var2.b - 1].a;
                int[] iArr2 = wc70Var2.c;
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
        dus0 dus0Var = this.a.G;
        int i = z ? dus0Var.i : dus0Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            lid.a("Tried to seek backward");
        }
        if (i2 > 0) {
            wc70 wc70Var = this.b.a;
            wc70Var.d(ua70.c);
            wc70Var.c[wc70Var.d - wc70Var.a[wc70Var.b - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        dus0 dus0Var = this.a.G;
        if (dus0Var.c > 0) {
            int i = dus0Var.i;
            m6w m6wVar = this.d;
            if (m6wVar.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.a.d(ib70.c);
                    this.c = true;
                }
                if (i > 0) {
                    yss a = dus0Var.a(i);
                    m6wVar.c(i);
                    d(false);
                    wc70 wc70Var = this.b.a;
                    wc70Var.d(hb70.c);
                    rzo.U(wc70Var, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                lid.a("Invalid remove index " + i);
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
