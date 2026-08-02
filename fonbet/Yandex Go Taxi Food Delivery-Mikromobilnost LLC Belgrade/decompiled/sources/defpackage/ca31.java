package defpackage;

import java.math.BigInteger;
import kotlin.a;

/* loaded from: classes10.dex */
public final class ca31 implements Comparable {
    public static final ca31 y;
    public final int a;
    public final int b;
    public final int c;
    public final String w;
    public final i3y x = a.a(new pv01(29, this));

    static {
        new ca31(0, 0, 0, "");
        y = new ca31(0, 1, 0, "");
        new ca31(1, 0, 0, "");
    }

    public ca31(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((BigInteger) this.x.getValue()).compareTo((BigInteger) ((ca31) obj).x.getValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ca31)) {
            return false;
        }
        ca31 ca31Var = (ca31) obj;
        return this.a == ca31Var.a && this.b == ca31Var.b && this.c == ca31Var.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str = this.w;
        String concat = !evu0.J(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        return oyr.m(this.c, concat, sb);
    }
}
