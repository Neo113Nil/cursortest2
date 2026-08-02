package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes9.dex */
public final class mjo extends fas {
    public final /* synthetic */ q66 A;
    public final long b;
    public final boolean c;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjo(q66 q66Var, uis0 uis0Var, long j, boolean z) {
        super(uis0Var);
        this.A = q66Var;
        this.b = j;
        this.c = z;
        this.y = z;
    }

    public final IOException a(IOException iOException) {
        if (this.w) {
            return iOException;
        }
        this.w = true;
        return q66.c(this.A, this.x, this.c, iOException, 4);
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.z) {
            return;
        }
        this.z = true;
        long j = this.b;
        if (j != -1 && this.x != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.fas, defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        if (this.z) {
            ny61.r("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.x + j > j2) {
            StringBuilder w = unr0.w(j2, "expected ", " bytes but received ");
            w.append(this.x + j);
            throw new ProtocolException(w.toString());
        }
        try {
            if (this.y) {
                this.y = false;
                q66 q66Var = this.A;
                ((bgo) q66Var.c).requestBodyStart((nci0) q66Var.b);
            }
            super.write(yp6Var, j);
            this.x += j;
        } catch (IOException e) {
            throw a(e);
        }
    }
}
