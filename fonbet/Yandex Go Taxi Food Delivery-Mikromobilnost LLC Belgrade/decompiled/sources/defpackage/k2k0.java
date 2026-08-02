package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class k2k0 extends BufferedOutputStream {
    public final /* synthetic */ int a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2k0(qb3 qb3Var) {
        super(qb3Var);
        this.a = 0;
    }

    public void a(OutputStream outputStream) {
        if (!this.b) {
            ny61.k();
            return;
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.b = false;
    }

    public void c(OutputStream outputStream) {
        d6z.x(this.b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = null;
        switch (this.a) {
            case 0:
                this.b = true;
                try {
                    flush();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ((BufferedOutputStream) this).out.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                if (th == null) {
                    return;
                }
                int i = tw21.a;
                throw th;
            default:
                this.b = true;
                try {
                    flush();
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    ((BufferedOutputStream) this).out.close();
                } catch (Throwable th5) {
                    if (th == null) {
                        th = th5;
                    }
                }
                if (th == null) {
                    return;
                }
                int i2 = rf71.a;
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2k0(OutputStream outputStream, int i, int i2) {
        super(outputStream, i);
        this.a = i2;
    }
}
