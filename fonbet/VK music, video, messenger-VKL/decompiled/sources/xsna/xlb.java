package xsna;

import java.text.CharacterIterator;

/* compiled from: CharSequenceCharacterIterator.android.kt */
/* loaded from: classes11.dex */
public final class xlb implements CharacterIterator {
    public final CharSequence b;
    public final int c;
    public int d = 0;

    public xlb(int i, CharSequence charSequence) {
        this.b = charSequence;
        this.c = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.d;
        if (i == this.c) {
            return (char) 65535;
        }
        return this.b.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.d = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.c;
        if (i == 0) {
            this.d = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.d = i2;
        return this.b.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.d + 1;
        this.d = i;
        int i2 = this.c;
        if (i < i2) {
            return this.b.charAt(i);
        }
        this.d = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.d;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.d = i2;
        return this.b.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.c || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.d = i;
        return current();
    }
}
