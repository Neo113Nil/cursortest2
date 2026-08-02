package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class kt {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int w = a(2, 2, 2, 0);
    public static final int x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    static {
        int a = a(0, 0, 0, 0);
        x = a;
        int a2 = a(0, 0, 0, 3);
        y = new int[]{0, 0, 0, 0, 0, 2, 0};
        z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{a, a2, a, a, a2, a, a};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{a, a, a, a, a, a2, a2};
    }

    public kt() {
        b();
    }

    public final void a(char c) {
        if (c != '\n') {
            this.b.append(c);
            return;
        }
        this.a.add(a());
        this.b.clear();
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.r != -1) {
            this.r = 0;
        }
        if (this.t != -1) {
            this.t = 0;
        }
        while (true) {
            if ((!this.k || this.a.size() < this.j) && this.a.size() < 15) {
                return;
            } else {
                this.a.remove(0);
            }
        }
    }

    public final void b() {
        this.a.clear();
        this.b.clear();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.t = -1;
        this.v = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        int i = x;
        this.o = i;
        this.s = w;
        this.u = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        ni.a(i, 4);
        ni.a(i2, 4);
        ni.a(i3, 4);
        ni.a(i4, 4);
        return Color.argb(i4 != 2 ? i4 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    public final void a(boolean z2, boolean z3) {
        if (this.p != -1) {
            if (!z2) {
                this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                this.p = -1;
            }
        } else if (z2) {
            this.p = this.b.length();
        }
        if (this.q == -1) {
            if (z3) {
                this.q = this.b.length();
            }
        } else {
            if (z3) {
                return;
            }
            this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
            this.q = -1;
        }
    }

    public final void a(int i, int i2) {
        if (this.r != -1 && this.s != i) {
            this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
        }
        if (i != w) {
            this.r = this.b.length();
            this.s = i;
        }
        if (this.t != -1 && this.u != i2) {
            this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
        }
        if (i2 != x) {
            this.t = this.b.length();
            this.u = i2;
        }
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
            }
            if (this.t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
