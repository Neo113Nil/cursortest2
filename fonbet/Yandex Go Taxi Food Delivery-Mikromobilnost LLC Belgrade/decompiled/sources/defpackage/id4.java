package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class id4 extends OutputStream {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public final Object w;
    public final Object x;

    public id4(FileOutputStream fileOutputStream, g63 g63Var) {
        this.a = 1;
        this.w = fileOutputStream;
        this.x = g63Var;
        this.b = (byte[]) ((izz) g63Var).c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    ((fqf) obj2).J(this.b, 4, 0, i2, true);
                }
                ((fqf) obj2).getClass();
                ((jd4) obj).b();
                return;
            default:
                FileOutputStream fileOutputStream = (FileOutputStream) obj2;
                try {
                    flush();
                    fileOutputStream.close();
                    byte[] bArr = this.b;
                    if (bArr != null) {
                        ((izz) ((g63) obj)).g(bArr);
                        this.b = null;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.a) {
            case 1:
                FileOutputStream fileOutputStream = (FileOutputStream) this.w;
                int i = this.c;
                if (i > 0) {
                    fileOutputStream.write(this.b, 0, i);
                    this.c = 0;
                }
                fileOutputStream.flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.w;
        switch (i3) {
            case 0:
                byte[] bArr2 = this.b;
                int length = bArr2.length;
                int i4 = this.c;
                int i5 = length - i4;
                if (i2 >= i5) {
                    if (i4 > 0) {
                        System.arraycopy(bArr, i, bArr2, i4, i5);
                        ((fqf) obj).J(this.b, 4, 0, length, true);
                    } else {
                        i5 = 0;
                    }
                    while (true) {
                        int i6 = i2 - i5;
                        if (i6 < length) {
                            System.arraycopy(bArr, i + i5, bArr2, 0, i6);
                            this.c = i6;
                            break;
                        } else {
                            ((fqf) obj).J(bArr, 4, i + i5, length, true);
                            i5 += length;
                        }
                    }
                } else {
                    System.arraycopy(bArr, i, bArr2, i4, i2);
                    this.c += i2;
                    break;
                }
            default:
                FileOutputStream fileOutputStream = (FileOutputStream) obj;
                int i7 = 0;
                do {
                    int i8 = i2 - i7;
                    int i9 = i + i7;
                    int i10 = this.c;
                    if (i10 == 0 && i8 >= this.b.length) {
                        fileOutputStream.write(bArr, i9, i8);
                        break;
                    } else {
                        int min = Math.min(i8, this.b.length - i10);
                        System.arraycopy(bArr, i9, this.b, this.c, min);
                        int i11 = this.c + min;
                        this.c = i11;
                        i7 += min;
                        byte[] bArr3 = this.b;
                        if (i11 == bArr3.length && i11 > 0) {
                            fileOutputStream.write(bArr3, 0, i11);
                            this.c = 0;
                        }
                    }
                } while (i7 < i2);
                break;
        }
    }

    public id4(jd4 jd4Var, byte[] bArr) {
        this.a = 0;
        this.x = jd4Var;
        this.b = bArr;
        this.c = 0;
        this.w = new fqf(5, jd4Var.a);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 1:
                write(bArr, 0, bArr.length);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
        Object obj = this.w;
        switch (i2) {
            case 0:
                byte[] bArr = this.b;
                int i3 = this.c;
                int i4 = i3 + 1;
                this.c = i4;
                bArr[i3] = (byte) i;
                if (i4 == bArr.length) {
                    ((fqf) obj).J(bArr, 4, 0, bArr.length, true);
                    this.c = 0;
                    break;
                }
                break;
            default:
                byte[] bArr2 = this.b;
                int i5 = this.c;
                int i6 = i5 + 1;
                this.c = i6;
                bArr2[i5] = (byte) i;
                if (i6 == bArr2.length && i6 > 0) {
                    ((FileOutputStream) obj).write(bArr2, 0, i6);
                    this.c = 0;
                    break;
                }
                break;
        }
    }
}
