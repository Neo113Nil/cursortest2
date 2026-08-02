package xsna;

import java.util.List;

/* compiled from: TimelineImages.kt */
/* loaded from: classes8.dex */
public final class owo0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final List<String> f;
    public final int g;
    public final int h;
    public final float i;

    public owo0(int i, int i2, int i3, int i4, int i5, List<String> list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = list;
        this.g = i3 * i4;
        this.h = list.size();
        this.i = (i3 * i) / (i4 * i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owo0)) {
            return false;
        }
        owo0 owo0Var = (owo0) obj;
        return this.a == owo0Var.a && this.b == owo0Var.b && this.c == owo0Var.c && this.d == owo0Var.d && this.e == owo0Var.e && epx.f(this.f, owo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder a = odj.a(this.a, this.b, "TimelineImages(frameWidth=", ", frameHeight=", ", cols=");
        cgn.a(this.c, this.d, ", rows=", ", framesCount=", a);
        a.append(this.e);
        a.append(", links=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
