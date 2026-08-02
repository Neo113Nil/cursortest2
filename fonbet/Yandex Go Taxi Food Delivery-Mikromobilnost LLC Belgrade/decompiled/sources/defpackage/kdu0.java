package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class kdu0 implements e1k {
    public final String a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Handler c;
    public ykn0 w;
    public xo3 x;
    public final /* synthetic */ ldu0 y;

    public kdu0(ldu0 ldu0Var, String str, ykn0 ykn0Var) {
        this.y = ldu0Var;
        Handler handler = new Handler(ldu0Var.a);
        this.c = handler;
        this.a = str;
        this.w = ykn0Var;
        handler.post(new tpt0(6, this, new ykn0(24, this)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.post(new m8t0(21, this));
        this.w = null;
    }
}
