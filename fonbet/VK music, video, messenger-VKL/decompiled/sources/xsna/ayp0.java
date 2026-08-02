package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: UTF32Reader.java */
/* loaded from: classes12.dex */
public final class ayp0 extends Reader {
    public final tnv b;
    public InputStream c;
    public byte[] d;
    public int e;
    public int f;
    public final boolean g;
    public char h = 0;
    public int i;
    public int j;
    public final boolean k;
    public char[] l;

    public ayp0(tnv tnvVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.b = tnvVar;
        this.c = inputStream;
        this.d = bArr;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.k = inputStream != null;
    }

    public final void b(int i) throws IOException {
        throw new CharConversionException(h5s.c(this.j + i, ")", odj.a(i, this.i, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", ", needed 4, at char #", ", byte #")));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            this.c = null;
            byte[] bArr = this.d;
            if (bArr != null) {
                this.d = null;
                tnv tnvVar = this.b;
                if (tnvVar != null) {
                    tnvVar.b(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (this.l == null) {
            this.l = new char[1];
        }
        if (read(this.l, 0, 1) < 1) {
            return -1;
        }
        return this.l[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x016e, code lost:
    
        r0 = r0 - r14;
        r12.i += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0174, code lost:
    
        return r0;
     */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6;
        byte[] bArr3 = this.d;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i >= 0 && (i3 = i + i2) <= cArr.length) {
            char c = this.h;
            if (c != 0) {
                i4 = i + 1;
                cArr[i] = c;
                this.h = (char) 0;
            } else {
                int i7 = this.f;
                int i8 = this.e;
                int i9 = i7 - i8;
                if (i9 < 4) {
                    InputStream inputStream = this.c;
                    if (inputStream != null) {
                        this.j = (i7 - i9) + this.j;
                        tnv tnvVar = this.b;
                        boolean z = this.k;
                        if (i9 > 0) {
                            if (i8 > 0) {
                                System.arraycopy(bArr3, i8, bArr3, 0, i9);
                                this.e = 0;
                            }
                            this.f = i9;
                        } else {
                            this.e = 0;
                            int read = inputStream.read(bArr3);
                            if (read < 1) {
                                this.f = 0;
                                if (read >= 0) {
                                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                                }
                                if (z && (bArr = this.d) != null) {
                                    this.d = null;
                                    if (tnvVar != null) {
                                        tnvVar.b(bArr);
                                    }
                                }
                            } else {
                                this.f = read;
                            }
                        }
                        while (true) {
                            int i10 = this.f;
                            if (i10 >= 4) {
                                break;
                            }
                            InputStream inputStream2 = this.c;
                            byte[] bArr4 = this.d;
                            int read2 = inputStream2.read(bArr4, i10, bArr4.length - i10);
                            if (read2 < 1) {
                                if (read2 < 0) {
                                    if (z && (bArr2 = this.d) != null) {
                                        this.d = null;
                                        if (tnvVar != null) {
                                            tnvVar.b(bArr2);
                                        }
                                    }
                                    b(this.f);
                                    throw null;
                                }
                                throw new IOException("Strange I/O stream, returned 0 bytes on read");
                            }
                            this.f += read2;
                        }
                    }
                    if (i9 == 0) {
                        return -1;
                    }
                    b(this.f - this.e);
                    throw null;
                }
                i4 = i;
            }
            int i11 = this.f - 4;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                int i12 = this.e;
                if (i12 > i11) {
                    break;
                }
                if (this.g) {
                    byte[] bArr5 = this.d;
                    i5 = (bArr5[i12] << 8) | (bArr5[i12 + 1] & 255);
                    i6 = (bArr5[i12 + 3] & 255) | ((bArr5[i12 + 2] & 255) << 8);
                } else {
                    byte[] bArr6 = this.d;
                    int i13 = (bArr6[i12] & 255) | ((bArr6[i12 + 1] & 255) << 8);
                    i5 = (bArr6[i12 + 3] << 8) | (bArr6[i12 + 2] & 255);
                    i6 = i13;
                }
                this.e = i12 + 4;
                if (i5 != 0) {
                    int i14 = 65535 & i5;
                    int i15 = i6 | ((i14 - 1) << 16);
                    if (i14 <= 16) {
                        int i16 = i4 + 1;
                        cArr[i4] = (char) ((i15 >> 10) + 55296);
                        int i17 = (i15 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | 56320;
                        if (i16 >= i3) {
                            this.h = (char) i15;
                            i4 = i16;
                            break;
                        }
                        i6 = i17;
                        i4 = i16;
                    } else {
                        int i18 = i4 - i;
                        String format = String.format(" (above 0x%08x)", 1114111);
                        int i19 = (this.j + this.e) - 1;
                        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i15) + format + " at char #" + (this.i + i18) + ", byte #" + i19 + ")");
                    }
                }
                cArr[i4] = (char) i6;
                i4++;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
        }
    }
}
