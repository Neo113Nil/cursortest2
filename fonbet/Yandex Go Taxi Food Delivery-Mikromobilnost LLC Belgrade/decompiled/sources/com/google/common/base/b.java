package com.google.common.base;

import defpackage.bj9;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.qgn0;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class b implements Iterator {
    public String b;
    public final CharSequence c;
    public final /* synthetic */ bj9 y;
    public AbstractIterator$State a = AbstractIterator$State.NOT_READY;
    public int w = 0;
    public int x = Integer.MAX_VALUE;

    public b(qgn0 qgn0Var, CharSequence charSequence, bj9 bj9Var) {
        this.y = bj9Var;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        AbstractIterator$State abstractIterator$State = this.a;
        AbstractIterator$State abstractIterator$State2 = AbstractIterator$State.FAILED;
        if (abstractIterator$State == abstractIterator$State2) {
            ny61.k();
            return false;
        }
        int ordinal = abstractIterator$State.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.a = abstractIterator$State2;
            int i = this.w;
            while (true) {
                int i2 = this.w;
                if (i2 == -1) {
                    this.a = AbstractIterator$State.DONE;
                    str = null;
                    break;
                }
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                ffx.p(i2, length);
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (this.y.a(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    i2 = charSequence.length();
                    this.w = -1;
                } else {
                    this.w = i2 + 1;
                }
                int i3 = this.w;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.w = i4;
                    if (i4 > charSequence.length()) {
                        this.w = -1;
                    }
                } else {
                    if (i < i2) {
                        charSequence.charAt(i);
                    }
                    if (i2 > i) {
                        charSequence.charAt(i2 - 1);
                    }
                    int i5 = this.x;
                    if (i5 == 1) {
                        i2 = charSequence.length();
                        this.w = -1;
                        if (i2 > i) {
                            charSequence.charAt(i2 - 1);
                        }
                    } else {
                        this.x = i5 - 1;
                    }
                    str = charSequence.subSequence(i, i2).toString();
                }
            }
            this.b = str;
            if (this.a != AbstractIterator$State.DONE) {
                this.a = AbstractIterator$State.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.a = AbstractIterator$State.NOT_READY;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
