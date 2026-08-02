package defpackage;

import java.io.InputStream;

/* loaded from: classes7.dex */
public final class ef71 extends InputStream {
    public final u871 a;
    public final no71 b;
    public boolean w = false;
    public boolean x = false;
    public final byte[] c = new byte[1];

    public ef71(u871 u871Var, no71 no71Var) {
        this.a = u871Var;
        this.b = no71Var;
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
        if (this.x) {
            ny61.k();
            return 0;
        }
        boolean z = this.w;
        u871 u871Var = this.a;
        if (!z) {
            u871Var.Q(this.b);
            this.w = true;
        }
        int v = u871Var.v(i, i2, bArr);
        if (v == -1) {
            return -1;
        }
        return v;
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
