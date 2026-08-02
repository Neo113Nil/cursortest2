package ru.mail.libverify.v;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
final class b implements Closeable {
    private final FileInputStream a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = fileInputStream;
        this.b = charset;
        this.c = new byte[8192];
    }

    public final boolean a() {
        return this.e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b() throws IOException {
        int i;
        synchronized (this.a) {
            try {
                byte[] bArr = this.c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.d >= this.e) {
                    int read = this.a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.e = read;
                }
                for (int i2 = this.d; i2 != this.e; i2++) {
                    byte[] bArr2 = this.c;
                    if (bArr2[i2] == 10) {
                        int i3 = this.d;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.b.name());
                                this.d = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.b.name());
                        this.d = i2 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.e - this.d) + 80);
                while (true) {
                    byte[] bArr3 = this.c;
                    int i4 = this.d;
                    aVar.write(bArr3, i4, this.e - i4);
                    this.e = -1;
                    FileInputStream fileInputStream = this.a;
                    byte[] bArr4 = this.c;
                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.e = read2;
                    for (int i5 = 0; i5 != this.e; i5++) {
                        byte[] bArr5 = this.c;
                        if (bArr5[i5] == 10) {
                            int i6 = this.d;
                            if (i5 != i6) {
                                aVar.write(bArr5, i6, i5 - i6);
                            }
                            this.d = i5 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
