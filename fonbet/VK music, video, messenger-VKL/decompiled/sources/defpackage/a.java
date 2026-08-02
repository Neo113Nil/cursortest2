package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xsna.gcy;

/* compiled from: EmojiUtils.kt */
/* loaded from: classes17.dex */
public final class a implements Iterable<Integer>, gcy {
    public final /* synthetic */ CharSequence b;

    /* compiled from: EmojiUtils.kt */
    /* renamed from: a$a, reason: collision with other inner class name */
    public static final class C0000a implements Iterator<Integer>, gcy {
        public int b;
        public final /* synthetic */ CharSequence c;

        public C0000a(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.c.length();
        }

        @Override // java.util.Iterator
        public final Integer next() {
            int i;
            CharSequence charSequence = this.c;
            int length = charSequence.length();
            int i2 = this.b;
            if (i2 >= length) {
                throw new NoSuchElementException();
            }
            this.b = i2 + 1;
            char charAt = charSequence.charAt(i2);
            if (Character.isHighSurrogate(charAt) && (i = this.b) < length) {
                char charAt2 = charSequence.charAt(i);
                if (Character.isLowSurrogate(charAt2)) {
                    this.b++;
                    return Integer.valueOf(Character.toCodePoint(charAt, charAt2));
                }
            }
            return Integer.valueOf(charAt);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(String str) {
        this.b = str;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0000a(this.b);
    }
}
