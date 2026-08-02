package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: UTF8Writer.java */
/* loaded from: classes12.dex */
public final class dyp0 extends Writer {
    public final tnv b;
    public OutputStream c;
    public byte[] d;
    public final int e;
    public int f;
    public int g;

    public dyp0(tnv tnvVar, OutputStream outputStream) {
        this.b = tnvVar;
        this.c = outputStream;
        tnv.a(tnvVar.h);
        im8 im8Var = tnvVar.e;
        int i = im8.c[1];
        i = i <= 0 ? 0 : i;
        byte[] andSet = im8Var.a.getAndSet(1, null);
        andSet = (andSet == null || andSet.length < i) ? new byte[i] : andSet;
        tnvVar.h = andSet;
        this.d = andSet;
        this.e = andSet.length - 4;
        this.f = 0;
    }

    public static void c(int i) throws IOException {
        throw new IOException(h(i));
    }

    public static String h(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    public final int b(int i) throws IOException {
        int i2 = this.g;
        this.g = 0;
        if (i >= 56320 && i <= 57343) {
            return (i - 56320) + ((i2 - 55296) << 10) + 65536;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            int i = this.f;
            if (i > 0) {
                outputStream.write(this.d, 0, i);
                this.f = 0;
            }
            OutputStream outputStream2 = this.c;
            this.c = null;
            byte[] bArr = this.d;
            if (bArr != null) {
                this.d = null;
                tnv tnvVar = this.b;
                byte[] bArr2 = tnvVar.h;
                if (bArr != bArr2 && bArr.length < bArr2.length) {
                    throw new IllegalArgumentException("Trying to release buffer smaller than original");
                }
                tnvVar.h = null;
                tnvVar.e.a.set(1, bArr);
            }
            outputStream2.close();
            int i2 = this.g;
            this.g = 0;
            if (i2 <= 0) {
                return;
            }
            c(i2);
            throw null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            int i = this.f;
            if (i > 0) {
                outputStream.write(this.d, 0, i);
                this.f = 0;
            }
            this.c.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        write(c);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0023, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.g > 0) {
            i2--;
            write(b(cArr[i]));
            i++;
        }
        int i3 = this.f;
        byte[] bArr = this.d;
        int i4 = i2 + i;
        while (i < i4) {
            int i5 = this.e;
            if (i3 >= i5) {
                this.c.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i4 - i6;
                int i9 = i5 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        break;
                    }
                    i6 = i + 1;
                    c = cArr[i];
                    if (c >= 128) {
                        break;
                    }
                    i7 = i3 + 1;
                    bArr[i3] = (byte) c;
                }
            }
            if (c < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | PsExtractor.AUDIO_STREAM);
                i3 += 2;
                bArr[i11] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                bArr[i3] = (byte) ((c >> '\f') | 224);
                int i12 = i3 + 2;
                bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                i3 += 3;
                bArr[i12] = (byte) ((c & '?') | 128);
            } else {
                if (c > 56319) {
                    this.f = i3;
                    c(c);
                    throw null;
                }
                this.g = c;
                if (i6 >= i4) {
                    break;
                }
                i = i6 + 1;
                int b = b(cArr[i6]);
                if (b > 1114111) {
                    this.f = i3;
                    c(b);
                    throw null;
                }
                bArr[i3] = (byte) ((b >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i3 + 1] = (byte) (((b >> 12) & 63) | 128);
                int i13 = i3 + 3;
                bArr[i3 + 2] = (byte) (((b >> 6) & 63) | 128);
                i3 += 4;
                bArr[i13] = (byte) ((b & 63) | 128);
            }
            i = i6;
        }
        this.f = i3;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        int i2;
        if (this.g > 0) {
            i = b(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i <= 56319) {
                this.g = i;
                return;
            } else {
                c(i);
                throw null;
            }
        }
        int i3 = this.f;
        if (i3 >= this.e) {
            this.c.write(this.d, 0, i3);
            this.f = 0;
        }
        if (i < 128) {
            byte[] bArr = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f;
        if (i < 2048) {
            byte[] bArr2 = this.d;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.d;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else if (i <= 1114111) {
            byte[] bArr4 = this.d;
            bArr4[i5] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        } else {
            c(i);
            throw null;
        }
        this.f = i2;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0027, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.g > 0) {
            i2--;
            write(b(str.charAt(i)));
            i++;
        }
        int i3 = this.f;
        byte[] bArr = this.d;
        int i4 = i2 + i;
        while (i < i4) {
            int i5 = this.e;
            if (i3 >= i5) {
                this.c.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) charAt;
                int i8 = i4 - i6;
                int i9 = i5 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        break;
                    }
                    i6 = i + 1;
                    charAt = str.charAt(i);
                    if (charAt >= 128) {
                        break;
                    }
                    i7 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                }
            }
            if (charAt < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | PsExtractor.AUDIO_STREAM);
                i3 += 2;
                bArr[i11] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                bArr[i3] = (byte) ((charAt >> '\f') | 224);
                int i12 = i3 + 2;
                bArr[i3 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                i3 += 3;
                bArr[i12] = (byte) ((charAt & '?') | 128);
            } else if (charAt <= 56319) {
                this.g = charAt;
                if (i6 >= i4) {
                    break;
                }
                i = i6 + 1;
                int b = b(str.charAt(i6));
                if (b <= 1114111) {
                    bArr[i3] = (byte) ((b >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    bArr[i3 + 1] = (byte) (((b >> 12) & 63) | 128);
                    int i13 = i3 + 3;
                    bArr[i3 + 2] = (byte) (((b >> 6) & 63) | 128);
                    i3 += 4;
                    bArr[i13] = (byte) ((b & 63) | 128);
                } else {
                    this.f = i3;
                    c(b);
                    throw null;
                }
            } else {
                this.f = i3;
                c(charAt);
                throw null;
            }
            i = i6;
        }
        this.f = i3;
    }
}
