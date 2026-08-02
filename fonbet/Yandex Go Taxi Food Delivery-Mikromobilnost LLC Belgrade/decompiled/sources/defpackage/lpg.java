package defpackage;

import java.io.InputStream;

/* loaded from: classes10.dex */
public final class lpg extends InputStream {
    public final kpg a;
    public final npg b;
    public boolean w = false;
    public boolean x = false;
    public final byte[] c = new byte[1];

    public lpg(kpg kpgVar, npg npgVar) {
        this.a = kpgVar;
        this.b = npgVar;
    }

    public final void a() {
        if (this.w) {
            return;
        }
        this.a.open(this.b);
        this.w = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.a.close();
        this.x = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        d6z.x(!this.x);
        a();
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
