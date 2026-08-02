package defpackage;

import java.io.IOException;

/* loaded from: classes15.dex */
public final class ch7 implements yf7 {
    public final yf7 a;

    public ch7(yf7 yf7Var) {
        this.a = yf7Var;
    }

    @Override // defpackage.yf7
    public final void I(al7 al7Var) {
        boolean z;
        Throwable th;
        IOException e;
        yf7 yf7Var = this.a;
        try {
            z = true;
        } catch (IOException e2) {
            z = false;
            e = e2;
        } catch (Throwable th2) {
            z = false;
            th = th2;
        }
        try {
            al7Var.onResponse(yf7Var, yf7Var.execute());
        } catch (IOException e3) {
            e = e3;
            if (z) {
                return;
            }
            al7Var.onFailure(yf7Var, e);
        } catch (Throwable th3) {
            th = th3;
            yf7Var.cancel();
            if (z) {
                return;
            }
            IOException iOException = new IOException("canceled due to " + th);
            ljo.a(iOException, th);
            al7Var.onFailure(yf7Var, iOException);
        }
    }

    @Override // defpackage.yf7
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.yf7
    public final yf7 clone() {
        return new ch7(this.a.clone());
    }

    @Override // defpackage.yf7
    public final kvj0 execute() {
        return this.a.execute();
    }

    @Override // defpackage.yf7
    public final d5j0 k() {
        return this.a.k();
    }

    @Override // defpackage.yf7
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.yf7
    public final ydz0 timeout() {
        return this.a.timeout();
    }
}
