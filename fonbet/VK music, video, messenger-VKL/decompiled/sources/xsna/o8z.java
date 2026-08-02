package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Strings.kt */
/* loaded from: classes11.dex */
public final class o8z implements Iterator<String>, gcy {
    public final CharSequence b;
    public int c;
    public int d;
    public int e;
    public int f;

    public o8z(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.c;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f < 0) {
            this.c = 2;
            return false;
        }
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.d; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.c = 1;
                this.f = i;
                this.e = length;
                return true;
            }
        }
        i = -1;
        this.c = 1;
        this.f = i;
        this.e = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = 0;
        int i = this.e;
        int i2 = this.d;
        this.d = this.f + i;
        return this.b.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
