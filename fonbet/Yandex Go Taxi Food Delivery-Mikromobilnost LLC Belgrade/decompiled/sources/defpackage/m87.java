package defpackage;

import java.io.OutputStream;
import java.util.Collections;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class m87 extends OutputStream {
    public final ex61 a;
    public final jd4 b;
    public final jd4 c;
    public final jd4 w;
    public final /* synthetic */ n87 x;

    public m87(n87 n87Var, no6 no6Var, id4 id4Var, jd4 jd4Var, jd4 jd4Var2, jd4 jd4Var3) {
        this.x = n87Var;
        this.a = new ex61(no6Var, id4Var, (Cipher) no6Var.w);
        this.b = jd4Var;
        this.c = jd4Var2;
        this.w = jd4Var3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.w.b();
        i87 i87Var = this.x.b;
        jd4 jd4Var = this.c;
        if (i87Var != null) {
            new oqf(2, 128, 1, new rd4(i87Var.b(Collections.EMPTY_MAP).g(), false), 0).encodeTo(jd4Var.a);
        }
        jd4Var.b();
        this.b.b();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
