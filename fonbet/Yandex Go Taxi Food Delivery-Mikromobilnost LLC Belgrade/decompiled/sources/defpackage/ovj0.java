package defpackage;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public final class ovj0 extends Reader {
    public final qq6 a;
    public final Charset b;
    public boolean c;
    public InputStreamReader w;

    public ovj0(qq6 qq6Var, Charset charset) {
        this.a = qq6Var;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = true;
        InputStreamReader inputStreamReader = this.w;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (this.c) {
            ny61.v("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.w;
        if (inputStreamReader == null) {
            qq6 qq6Var = this.a;
            inputStreamReader = new InputStreamReader(qq6Var.p2(), bg61.g(qq6Var, this.b));
            this.w = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
