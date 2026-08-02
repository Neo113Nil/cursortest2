package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public abstract class h implements Iterator {
    public int b = 2;
    public String c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int a;
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int a2 = hg0.a(i);
        if (a2 == 0) {
            return true;
        }
        if (a2 != 2) {
            this.b = 4;
            y33 y33Var = (y33) this;
            int i2 = y33Var.g;
            while (true) {
                int i3 = y33Var.g;
                if (i3 == -1) {
                    y33Var.b = 3;
                    str = null;
                    break;
                }
                a = y33Var.i.a.a(y33Var.d, i3);
                if (a == -1) {
                    a = y33Var.d.length();
                    y33Var.g = -1;
                } else {
                    y33Var.g = a + 1;
                }
                int i4 = y33Var.g;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    y33Var.g = i5;
                    if (i5 > y33Var.d.length()) {
                        y33Var.g = -1;
                    }
                } else {
                    while (i2 < a && y33Var.e.a(y33Var.d.charAt(i2))) {
                        i2++;
                    }
                    while (a > i2 && y33Var.e.a(y33Var.d.charAt(a - 1))) {
                        a--;
                    }
                    if (!y33Var.f || i2 != a) {
                        break;
                    }
                    i2 = y33Var.g;
                }
            }
            int i6 = y33Var.h;
            if (i6 == 1) {
                a = y33Var.d.length();
                y33Var.g = -1;
                while (a > i2 && y33Var.e.a(y33Var.d.charAt(a - 1))) {
                    a--;
                }
            } else {
                y33Var.h = i6 - 1;
            }
            str = y33Var.d.subSequence(i2, a).toString();
            this.c = str;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        String str = this.c;
        this.c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
