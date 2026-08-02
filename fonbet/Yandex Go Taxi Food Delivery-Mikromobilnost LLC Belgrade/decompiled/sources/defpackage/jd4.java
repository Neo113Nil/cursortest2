package defpackage;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class jd4 {
    public final OutputStream a;
    public boolean b;
    public final boolean c;

    public jd4(OutputStream outputStream) {
        this(outputStream, (byte) 0);
        this.b = false;
        c(48);
    }

    public void a(b3 b3Var) {
        b3Var.encodeTo(this.a);
    }

    public final void b() {
        OutputStream outputStream = this.a;
        outputStream.write(0);
        outputStream.write(0);
        if (this.b && this.c) {
            outputStream.write(0);
            outputStream.write(0);
        }
    }

    public final void c(int i) {
        if (!this.b) {
            d(i);
            return;
        }
        boolean z = this.c;
        d(160);
        if (z) {
            d(i);
        }
    }

    public final void d(int i) {
        OutputStream outputStream = this.a;
        outputStream.write(i);
        outputStream.write(128);
    }

    public jd4(OutputStream outputStream, byte b) {
        this.a = outputStream;
    }

    public jd4(OutputStream outputStream, int i) {
        this(outputStream, true);
        c(48);
    }

    public jd4(OutputStream outputStream, boolean z) {
        this(outputStream, (byte) 0);
        this.b = true;
        this.c = z;
    }
}
