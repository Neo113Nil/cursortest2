package xsna;

import java.util.HashSet;

/* compiled from: StickersCounter.kt */
/* loaded from: classes5.dex */
public final class k9l0 {
    public final HashSet a;
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

    public k9l0(HashSet hashSet, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.a = hashSet;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9l0)) {
            return false;
        }
        k9l0 k9l0Var = (k9l0) obj;
        return this.a.equals(k9l0Var.a) && this.b == k9l0Var.b && this.c == k9l0Var.c && this.d == k9l0Var.d && this.e == k9l0Var.e && this.f == k9l0Var.f && this.g == k9l0Var.g && this.h == k9l0Var.h && this.i == k9l0Var.i && this.j == k9l0Var.j && this.k == k9l0Var.k && this.l == k9l0Var.l && this.m == k9l0Var.m && this.n == k9l0Var.n && this.o == k9l0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + shy.a(this.n, shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersCounter(mentionProfileIds=");
        sb.append(this.a);
        sb.append(", hashtagCount=");
        sb.append(this.b);
        sb.append(", nonNativeLinksCount=");
        sb.append(this.c);
        sb.append(", nativeLinksCount=");
        sb.append(this.d);
        sb.append(", questionsCount=");
        sb.append(this.e);
        sb.append(", musicCount=");
        sb.append(this.f);
        sb.append(", marketCount=");
        sb.append(this.g);
        sb.append(", replyCount=");
        sb.append(this.h);
        sb.append(", timeItemCount=");
        sb.append(this.i);
        sb.append(", gifCount=");
        sb.append(this.j);
        sb.append(", pollsCount=");
        sb.append(this.k);
        sb.append(", marketServicesCount=");
        sb.append(this.l);
        sb.append(", ycServicesCount=");
        sb.append(this.m);
        sb.append(", geoCount=");
        sb.append(this.n);
        sb.append(", reactionCount=");
        return vu5.b(sb, this.o, ')');
    }
}
