package xsna;

import android.text.Layout;
import androidx.annotation.Nullable;

/* compiled from: TtmlStyle.java */
/* loaded from: classes12.dex */
public final class xsp0 {

    @Nullable
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;

    @Nullable
    public String l;

    @Nullable
    public Layout.Alignment o;

    @Nullable
    public Layout.Alignment p;

    @Nullable
    public ifo0 r;

    @Nullable
    public String t;

    @Nullable
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(@Nullable xsp0 xsp0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (xsp0Var != null) {
            if (!this.c && xsp0Var.c) {
                this.b = xsp0Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = xsp0Var.h;
            }
            if (this.i == -1) {
                this.i = xsp0Var.i;
            }
            if (this.a == null && (str = xsp0Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = xsp0Var.f;
            }
            if (this.g == -1) {
                this.g = xsp0Var.g;
            }
            if (this.n == -1) {
                this.n = xsp0Var.n;
            }
            if (this.o == null && (alignment2 = xsp0Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = xsp0Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = xsp0Var.q;
            }
            if (this.j == -1) {
                this.j = xsp0Var.j;
                this.k = xsp0Var.k;
            }
            if (this.r == null) {
                this.r = xsp0Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = xsp0Var.s;
            }
            if (this.t == null) {
                this.t = xsp0Var.t;
            }
            if (this.u == null) {
                this.u = xsp0Var.u;
            }
            if (!this.e && xsp0Var.e) {
                this.d = xsp0Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = xsp0Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
