package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes10.dex */
public final class n20 {
    public CharSequence a = null;
    public final Bitmap b = null;
    public Layout.Alignment c = null;
    public Layout.Alignment d = null;
    public float e = -3.4028235E38f;
    public int f = Integer.MIN_VALUE;
    public int g = Integer.MIN_VALUE;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;
    public float k = -3.4028235E38f;
    public float l = -3.4028235E38f;
    public final float m = -3.4028235E38f;
    public boolean n = false;
    public int o = -16777216;
    public int p = Integer.MIN_VALUE;
    public float q;

    public final n20 a(float f) {
        this.e = f;
        this.f = 0;
        return this;
    }

    public final n20 b(float f) {
        this.h = f;
        return this;
    }

    public final void c(int i) {
        this.o = i;
        this.n = true;
    }

    public final n20 b(int i) {
        this.i = i;
        return this;
    }

    public final n20 a(int i) {
        this.g = i;
        return this;
    }

    public final n20 b() {
        this.l = -3.4028235E38f;
        return this;
    }

    public final n20 a(SpannableStringBuilder spannableStringBuilder) {
        this.a = spannableStringBuilder;
        return this;
    }

    public final n20 a(Layout.Alignment alignment) {
        this.c = alignment;
        return this;
    }

    public final o20 a() {
        return new o20(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
}
