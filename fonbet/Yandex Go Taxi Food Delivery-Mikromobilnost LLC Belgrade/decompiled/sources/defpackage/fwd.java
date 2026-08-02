package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class fwd {
    public static final Handler d = new Handler(Looper.getMainLooper());
    public static final ExecutorService e = Executors.newFixedThreadPool(8);
    public ba20 a;
    public boolean b;
    public final x920 c;

    public fwd(x920 x920Var, ba20 ba20Var) {
        this.a = ba20Var;
        this.c = x920Var;
    }

    public final void a(Serializable serializable) {
        if (this.b) {
            return;
        }
        this.b = true;
        ba20 ba20Var = this.a;
        this.a = null;
        d.post(new xmf0(21, ba20Var, serializable));
    }
}
