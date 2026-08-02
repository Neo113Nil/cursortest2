package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: SafeHandlerProvider.kt */
/* loaded from: classes3.dex */
public final class kzg0 implements gzs<Handler> {
    public final gzs<Looper> b;
    public Handler c;

    public kzg0() {
        this(null);
    }

    @Override // xsna.gzs
    public final Handler invoke() {
        if (!this.c.getLooper().getThread().isAlive()) {
            this.c = new Handler(this.b.invoke());
        }
        return this.c;
    }

    public kzg0(Object obj) {
        jzg0 jzg0Var = jzg0.b;
        this.b = jzg0Var;
        jzg0Var.getClass();
        this.c = new Handler(Looper.getMainLooper());
    }
}
