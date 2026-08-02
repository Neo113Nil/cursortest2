package defpackage;

import android.os.Looper;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class nk21 {
    public final Looper a;
    public final rj21 b;
    public final yo3 c;

    public nk21(rj21 rj21Var, Looper looper, yo3 yo3Var) {
        this.b = rj21Var;
        this.a = looper;
        this.c = yo3Var;
    }

    public final xo3 a(w920 w920Var) {
        z83.g(null, this.a, Looper.myLooper());
        return b(UUID.randomUUID().toString(), new mk21(this, w920Var));
    }

    public final xo3 b(String str, w920 w920Var) {
        z83.g(null, this.a, Looper.myLooper());
        mk21 mk21Var = new mk21(this, w920Var);
        yo3 yo3Var = this.c;
        z83.g(null, yo3Var.a, Looper.myLooper());
        new hfy();
        return yo3Var.a(str, mk21Var);
    }
}
