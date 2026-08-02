package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class b531 extends d531 implements Iterable, xfx {
    public final float A;
    public final List B;
    public final List C;
    public final String a;
    public final float b;
    public final float c;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public b531(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.w = f3;
        this.x = f4;
        this.y = f5;
        this.z = f6;
        this.A = f7;
        this.B = list;
        this.C = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b531)) {
            b531 b531Var = (b531) obj;
            return jl40.l(this.a, b531Var.a) && this.b == b531Var.b && this.c == b531Var.c && this.w == b531Var.w && this.x == b531Var.x && this.y == b531Var.y && this.z == b531Var.z && this.A == b531Var.A && jl40.l(this.B, b531Var.B) && jl40.l(this.C, b531Var.C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode() + unr0.c(g8e.c(this.A, g8e.c(this.z, g8e.c(this.y, g8e.c(this.x, g8e.c(this.w, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.B);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xab(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b531() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, r10, r10);
        int i = c531.a;
        EmptyList emptyList = EmptyList.a;
    }
}
