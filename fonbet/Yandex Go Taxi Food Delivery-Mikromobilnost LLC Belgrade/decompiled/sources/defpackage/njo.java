package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes9.dex */
public final class njo extends gas {
    public final /* synthetic */ q66 A;
    public final long b;
    public final boolean c;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njo(q66 q66Var, y9t0 y9t0Var, long j, boolean z) {
        super(y9t0Var);
        this.A = q66Var;
        this.b = j;
        this.c = z;
        this.x = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.y) {
            return iOException;
        }
        this.y = true;
        q66 q66Var = this.A;
        if (iOException == null && this.x) {
            this.x = false;
            ((bgo) q66Var.c).responseBodyStart((nci0) q66Var.b);
        }
        return q66.c(q66Var, this.w, this.c, iOException, 8);
    }

    @Override // defpackage.gas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.z) {
            return;
        }
        this.z = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.gas, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (this.z) {
            ny61.r("closed");
            return 0L;
        }
        try {
            long read = this.a.read(yp6Var, j);
            boolean z = this.x;
            q66 q66Var = this.A;
            if (z) {
                this.x = false;
                ((bgo) q66Var.c).responseBodyStart((nci0) q66Var.b);
            }
            if (read == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.w + read;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.w = j2;
                if (((pjo) q66Var.x).g()) {
                    a(null);
                }
                return read;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
