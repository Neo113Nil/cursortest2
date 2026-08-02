package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;

/* loaded from: classes15.dex */
public final class a1r {
    public final w53 a = new w53();
    public final w53 b = new w53();
    public final w53 c = new w53();
    public final Handler d;
    public final Looper e;
    public final oyq f;
    public final qzt0 g;

    public a1r(oyq oyqVar, Looper looper) {
        this.d = new Handler(looper);
        this.e = looper;
        this.f = oyqVar;
        this.g = new qzt0(looper);
    }

    public final void a(String str, IOException iOException) {
        this.d.post(new p7h(14, this, str, iOException));
    }

    public final void b(long j, long j2, String str) {
        ug3 ug3Var = new ug3(this, str, j, j2, 1);
        qzt0 qzt0Var = this.g;
        ((Handler) qzt0Var.x).post(new szy0(qzt0Var, ug3Var, 0));
    }
}
