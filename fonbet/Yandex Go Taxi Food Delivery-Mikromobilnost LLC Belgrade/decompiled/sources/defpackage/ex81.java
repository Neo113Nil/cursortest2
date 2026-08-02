package defpackage;

import android.text.Layout;

/* loaded from: classes7.dex */
public final class ex81 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public ww81 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(ex81 ex81Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ex81Var != null) {
            if (!this.c && ex81Var.c) {
                this.b = ex81Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ex81Var.h;
            }
            if (this.i == -1) {
                this.i = ex81Var.i;
            }
            if (this.a == null && (str = ex81Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ex81Var.f;
            }
            if (this.g == -1) {
                this.g = ex81Var.g;
            }
            if (this.n == -1) {
                this.n = ex81Var.n;
            }
            if (this.o == null && (alignment2 = ex81Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ex81Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ex81Var.q;
            }
            if (this.j == -1) {
                this.j = ex81Var.j;
                this.k = ex81Var.k;
            }
            if (this.r == null) {
                this.r = ex81Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ex81Var.s;
            }
            if (!this.e && ex81Var.e) {
                this.d = ex81Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = ex81Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
