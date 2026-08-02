package xsna;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: StickerCommonStyleValues.kt */
/* loaded from: classes5.dex */
public final class a3l0 {
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    public a3l0(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.a = context;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = i16;
        this.r = i17;
        this.s = i18;
    }

    public final float a(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public final float b(int i) {
        return this.a.getResources().getDimensionPixelSize(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3l0)) {
            return false;
        }
        a3l0 a3l0Var = (a3l0) obj;
        return epx.f(this.a, a3l0Var.a) && this.b == a3l0Var.b && this.c == a3l0Var.c && this.d == a3l0Var.d && this.e == a3l0Var.e && this.f == a3l0Var.f && this.g == a3l0Var.g && this.h == a3l0Var.h && this.i == a3l0Var.i && this.j == a3l0Var.j && this.k == a3l0Var.k && this.l == a3l0Var.l && this.m == a3l0Var.m && this.n == a3l0Var.n && this.o == a3l0Var.o && this.p == a3l0Var.p && this.q == a3l0Var.q && this.r == a3l0Var.r && this.s == a3l0Var.s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + shy.a(this.r, shy.a(this.q, shy.a(this.p, shy.a(this.o, shy.a(this.n, shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerCommonStyleValues(context=");
        sb.append(this.a);
        sb.append(", iconMarginStart=");
        sb.append(this.b);
        sb.append(", iconMarginEnd=");
        sb.append(this.c);
        sb.append(", iconMarginVertical=");
        sb.append(this.d);
        sb.append(", iconSize=");
        sb.append(this.e);
        sb.append(", iconVectorDrawableSize=");
        sb.append(this.f);
        sb.append(", textTypeface=");
        sb.append(this.g);
        sb.append(", textSizeMax=");
        sb.append(this.h);
        sb.append(", textSizeMin=");
        sb.append(this.i);
        sb.append(", textMarginTop=");
        sb.append(this.j);
        sb.append(", textMarginBottom=");
        sb.append(this.k);
        sb.append(", textMarginEnd=");
        sb.append(this.l);
        sb.append(", textLetterSpacing=");
        sb.append(this.m);
        sb.append(", metaTextTypeface=");
        sb.append(this.n);
        sb.append(", metaTextSize=");
        sb.append(this.o);
        sb.append(", metaTextMarginTop=");
        sb.append(this.p);
        sb.append(", metaTextMarginFromText=");
        sb.append(this.q);
        sb.append(", metaTextLetterSpacing=");
        sb.append(this.r);
        sb.append(", bgCornerRadius=");
        return vu5.b(sb, this.s, ')');
    }
}
