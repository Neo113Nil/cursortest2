package defpackage;

/* loaded from: classes9.dex */
public final class o43 implements CharSequence {
    public final char[] a;
    public int b;

    public o43(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return cvu0.o(this.a, i, Math.min(i2, this.b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        return cvu0.o(this.a, 0, Math.min(i, i));
    }
}
