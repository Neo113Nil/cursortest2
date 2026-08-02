package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class dj9 implements a6c, Iterable, xfx {
    public final char a;
    public final char b;
    public final int c = 1;

    static {
        new dj9((char) 1, (char) 0);
    }

    public dj9(char c, char c2) {
        this.a = c;
        this.b = (char) jx81.v(c, c2, 1);
    }

    @Override // defpackage.a6c
    public final boolean b(Comparable comparable) {
        char charValue = ((Character) comparable).charValue();
        return this.a <= charValue && charValue <= this.b;
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return Character.valueOf(this.b);
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return Character.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dj9)) {
            return false;
        }
        if (isEmpty() && ((dj9) obj).isEmpty()) {
            return true;
        }
        dj9 dj9Var = (dj9) obj;
        return this.a == dj9Var.a && this.b == dj9Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.a6c
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cj9(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
