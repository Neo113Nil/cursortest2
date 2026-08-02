package com.bumptech.glide.load.resource.bitmap;

import defpackage.g63;
import defpackage.izz;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class h extends FilterInputStream {
    public volatile byte[] a;
    public int b;
    public int c;
    public int w;
    public int x;
    public final g63 y;

    public h(InputStream inputStream, g63 g63Var) {
        super(inputStream);
        this.w = -1;
        this.y = g63Var;
        this.a = (byte[]) ((izz) g63Var).c(65536, byte[].class);
    }

    public static void d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i = this.w;
        if (i != -1) {
            int i2 = this.x - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) ((izz) this.y).c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    ((izz) this.y).g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.x - this.w;
                this.x = i4;
                this.w = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.x;
                if (read > 0) {
                    i5 += read;
                }
                this.b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.w = -1;
            this.x = 0;
            this.b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.b - this.x) + inputStream.available();
    }

    public final synchronized void c() {
        if (this.a != null) {
            ((izz) this.y).g(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            ((izz) this.y).g(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.w = this.x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i5 = this.x;
        int i6 = this.b;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.x += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.w == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.a && (bArr2 = this.a) == null) {
                    d();
                    throw null;
                }
                int i8 = this.b;
                int i9 = this.x;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.x += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.w;
        if (-1 == i) {
            throw new RecyclableBufferedInputStream$InvalidMarkException("Mark has been invalidated, pos: " + this.x + " markLimit: " + this.c);
        }
        this.x = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i = this.b;
        int i2 = this.x;
        if (i - i2 >= j) {
            this.x = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.x = i;
        if (this.w == -1 || j > this.c) {
            long skip = inputStream.skip(j - j2);
            if (skip > 0) {
                this.w = -1;
            }
            return j2 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.b;
        int i4 = this.x;
        if (i3 - i4 >= j - j2) {
            this.x = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.x = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.x >= this.b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.a && (bArr = this.a) == null) {
                d();
                throw null;
            }
            int i = this.b;
            int i2 = this.x;
            if (i - i2 <= 0) {
                return -1;
            }
            this.x = i2 + 1;
            return bArr[i2] & 255;
        }
        d();
        throw null;
    }
}
