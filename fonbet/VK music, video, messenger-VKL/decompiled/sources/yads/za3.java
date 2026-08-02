package yads;

import android.text.Layout;

/* loaded from: classes10.dex */
public final class za3 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public z63 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final za3 a(za3 za3Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (za3Var != null) {
            if (!this.c && za3Var.c) {
                this.b = za3Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = za3Var.h;
            }
            if (this.i == -1) {
                this.i = za3Var.i;
            }
            if (this.a == null && (str = za3Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = za3Var.f;
            }
            if (this.g == -1) {
                this.g = za3Var.g;
            }
            if (this.n == -1) {
                this.n = za3Var.n;
            }
            if (this.o == null && (alignment2 = za3Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = za3Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = za3Var.q;
            }
            if (this.j == -1) {
                this.j = za3Var.j;
                this.k = za3Var.k;
            }
            if (this.r == null) {
                this.r = za3Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = za3Var.s;
            }
            if (!this.e && za3Var.e) {
                this.d = za3Var.d;
                this.e = true;
            }
            if (this.m == -1 && (i = za3Var.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }
}
