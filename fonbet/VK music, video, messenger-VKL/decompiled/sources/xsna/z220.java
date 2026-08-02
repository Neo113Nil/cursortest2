package xsna;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* compiled from: MemoryMappedString.kt */
/* loaded from: classes6.dex */
public final class z220 implements CharSequence {
    public final CharBuffer b;
    public final Charset c;
    public final int d;

    public z220(int i, ByteBuffer byteBuffer) {
        Charset charset = emb.b;
        this.d = i;
        CharBuffer allocate = CharBuffer.allocate(i);
        this.b = allocate;
        this.c = charset;
        charset.newDecoder().decode(byteBuffer, allocate, true);
        allocate.position(0);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= this.d || i < 0) {
            throw new IndexOutOfBoundsException(tgw.b(i, "index=", " out of char sequence range"));
        }
        return this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z220.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        z220 z220Var = (z220) obj;
        return epx.f(this.b, z220Var.b) && epx.f(this.c, z220Var.c) && this.d == z220Var.d;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.d * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(efz.a(i2, i, "endIndex=", " have to be bigger than startIndex="));
        }
        CharBuffer charBuffer = this.b;
        charBuffer.position(i);
        return new z220(i2 - i, charBuffer.slice());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.toString();
    }

    public z220(int i, CharBuffer charBuffer) {
        Charset charset = emb.b;
        this.d = i;
        this.c = charset;
        this.b = charBuffer;
    }
}
