package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class jjy implements Iterator, xfx {
    public final CharSequence a;
    public int b;
    public int c;
    public int w;
    public int x;

    public jjy(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.x < 0) {
            this.b = 2;
            return false;
        }
        CharSequence charSequence = this.a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.c; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.b = 1;
                this.x = i;
                this.w = length;
                return true;
            }
        }
        i = -1;
        this.b = 1;
        this.x = i;
        this.w = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.b = 0;
        int i = this.w;
        int i2 = this.c;
        this.c = this.x + i;
        return this.a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
