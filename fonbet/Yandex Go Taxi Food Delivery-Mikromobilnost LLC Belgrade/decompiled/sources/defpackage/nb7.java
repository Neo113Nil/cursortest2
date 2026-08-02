package defpackage;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class nb7 implements y9t0 {
    public boolean a;
    public final /* synthetic */ qq6 b;
    public final /* synthetic */ q66 c;
    public final /* synthetic */ ici0 w;

    public nb7(qq6 qq6Var, q66 q66Var, ici0 ici0Var) {
        this.b = qq6Var;
        this.c = q66Var;
        this.w = ici0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.a) {
            try {
                z = bg61.h(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.a = true;
                this.c.a();
            }
        }
        this.b.close();
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        try {
            long read = this.b.read(yp6Var, j);
            ici0 ici0Var = this.w;
            if (read != -1) {
                yp6Var.d(ici0Var.b, yp6Var.b - read, read);
                ici0Var.a();
                return read;
            }
            if (!this.a) {
                this.a = true;
                ici0Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.a();
            throw e;
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.b.timeout();
    }
}
