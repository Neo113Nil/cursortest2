package xsna;

/* compiled from: ReaderJsonLexer.kt */
/* loaded from: classes8.dex */
public final class hk3 implements CharSequence {
    public final char[] b;
    public int c;

    public hk3(char[] cArr) {
        this.b = cArr;
        this.c = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return brm0.q(this.b, i, Math.min(i2, this.c));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.c;
        return brm0.q(this.b, 0, Math.min(i, i));
    }
}
