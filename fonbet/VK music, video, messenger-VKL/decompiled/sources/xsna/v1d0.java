package xsna;

import java.util.HashMap;

/* compiled from: PreloadScrollListener.java */
/* loaded from: classes3.dex */
public final class v1d0 implements df90 {
    public final int b;
    public final s0d0 c;
    public final HashMap d = new HashMap();
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = 0;
    public boolean i = false;

    public v1d0(int i, s0d0 s0d0Var) {
        this.b = i;
        this.c = s0d0Var;
    }

    public final void a(int i) {
        u0d0 u0d0Var = (u0d0) this.d.remove(Integer.valueOf(i));
        if (u0d0Var != null) {
            u0d0Var.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        u0d0 a;
        u0d0 u0d0Var;
        Integer valueOf = Integer.valueOf(i);
        s0d0 s0d0Var = this.c;
        if (s0d0Var != null) {
            try {
                a = s0d0Var.a(i);
            } catch (Exception unused) {
            }
            u0d0Var = (u0d0) this.d.put(valueOf, a);
            if (u0d0Var == null) {
                u0d0Var.cancel();
                return;
            }
            return;
        }
        a = u0d0.a;
        u0d0Var = (u0d0) this.d.put(valueOf, a);
        if (u0d0Var == null) {
        }
    }

    public final void c() {
        int i;
        int i2;
        this.i = true;
        if (this.e == 0 || this.h == 2) {
            return;
        }
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i3 >= i || (i2 = this.f - i3) < 0) {
                break;
            }
            b(i2);
            i3++;
        }
        int i4 = this.f;
        for (int i5 = 0; i5 < i4 - i; i5++) {
            a(i5);
        }
        for (int i6 = this.g; i6 < this.e; i6++) {
            a(i6);
        }
    }

    public final void d() {
        int i;
        int i2;
        this.i = false;
        if (this.e == 0 || this.h == 2) {
            return;
        }
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i3 >= i || (i2 = this.g + i3) >= this.e) {
                break;
            }
            b(i2);
            i3++;
        }
        int i4 = this.f;
        int i5 = this.g;
        for (int i6 = 0; i6 < i4; i6++) {
            a(i6);
        }
        for (int i7 = i5 + i; i7 < this.e; i7++) {
            a(i7);
        }
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= i) {
            i3 = i - 1;
        }
        if (this.e == i && this.f == i2 && this.g == i3) {
            return;
        }
        this.e = i;
        this.f = i2;
        this.g = i3;
        if (Math.abs(i4) > 2) {
            if (i4 > 0) {
                d();
            } else {
                c();
            }
        }
    }

    @Override // xsna.df90
    public final void l(int i) {
        this.h = i;
        if (i == 0) {
            if (this.i) {
                c();
            } else {
                d();
            }
        }
    }
}
