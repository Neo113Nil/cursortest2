package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public final class gsu0 extends ByteArrayOutputStream {
    public final /* synthetic */ int a;
    public final Object b;

    public gsu0(gd81 gd81Var, int i) {
        this.a = 2;
        this.b = gd81Var;
        ((ByteArrayOutputStream) this).buf = gd81Var.b(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 2:
                ((gd81) this.b).a(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() {
        switch (this.a) {
            case 2:
                ((gd81) this.b).a(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ((ByteArrayOutputStream) this).count;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                        i2 = i3;
                    }
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i2, ((Charset) ((hsu0) obj).c).name());
                } catch (UnsupportedEncodingException e) {
                    ny61.f(e);
                    return null;
                }
            case 1:
                int i4 = ((ByteArrayOutputStream) this).count;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (((ByteArrayOutputStream) this).buf[i5] == 13) {
                        i4 = i5;
                    }
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i4, ((Charset) ((hsu0) obj).c).name());
                } catch (UnsupportedEncodingException e2) {
                    ny61.f(e2);
                    return null;
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.a) {
            case 2:
                synchronized (this) {
                    int i2 = ((ByteArrayOutputStream) this).count + 1;
                    if (i2 > ((ByteArrayOutputStream) this).buf.length) {
                        byte[] b = ((gd81) this.b).b(i2 * 2);
                        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
                        ((gd81) this.b).a(((ByteArrayOutputStream) this).buf);
                        ((ByteArrayOutputStream) this).buf = b;
                    }
                    super.write(i);
                }
                return;
            default:
                super.write(i);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsu0(Closeable closeable, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = closeable;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 2:
                synchronized (this) {
                    int i3 = ((ByteArrayOutputStream) this).count + i2;
                    if (i3 > ((ByteArrayOutputStream) this).buf.length) {
                        byte[] b = ((gd81) this.b).b(i3 * 2);
                        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
                        ((gd81) this.b).a(((ByteArrayOutputStream) this).buf);
                        ((ByteArrayOutputStream) this).buf = b;
                    }
                    super.write(bArr, i, i2);
                }
                return;
            default:
                super.write(bArr, i, i2);
                return;
        }
    }
}
