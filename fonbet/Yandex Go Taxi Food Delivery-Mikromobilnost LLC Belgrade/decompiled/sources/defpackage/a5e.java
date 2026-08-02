package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class a5e {
    public final zq60 a;
    public final sq60 b;
    public final Looper c;
    public wor0 d;

    public a5e(Looper looper) {
        zq60 zq60Var = new zq60();
        this.a = zq60Var;
        this.b = new sq60(zq60Var);
        z83.g(null, looper, Looper.myLooper());
        this.c = looper;
    }

    public final void a(y4e y4eVar) {
        z83.g(null, this.c, Looper.myLooper());
        this.a.b(y4eVar);
        wor0 wor0Var = this.d;
        if (wor0Var != null) {
            y4eVar.c(wor0Var);
        }
    }

    public final void b(wor0 wor0Var) {
        z83.g(null, this.c, Looper.myLooper());
        sq60 sq60Var = this.b;
        if (wor0Var != null) {
            this.d = wor0Var;
            sq60Var.rewind();
            while (sq60Var.hasNext()) {
                ((y4e) sq60Var.next()).c(this.d);
            }
            return;
        }
        this.d = null;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((y4e) sq60Var.next()).onConnectionClosed();
        }
    }
}
