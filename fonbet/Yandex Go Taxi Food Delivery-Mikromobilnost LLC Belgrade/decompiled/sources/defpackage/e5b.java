package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class e5b implements e1k {
    public final ServerMessageRef a;
    public c9v b;
    public final /* synthetic */ f5b c;

    public e5b(f5b f5bVar, ServerMessageRef serverMessageRef, c9v c9vVar) {
        this.c = f5bVar;
        this.a = serverMessageRef;
        this.b = c9vVar;
        f5bVar.x.h(serverMessageRef.getTimestamp(), this);
        if (f5bVar.y) {
            return;
        }
        f5bVar.y = true;
        f5bVar.c.post(new v4a(7, f5bVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Looper myLooper = Looper.myLooper();
        f5b f5bVar = this.c;
        Handler handler = f5bVar.c;
        z83.g(null, myLooper, handler.getLooper());
        this.b = null;
        rnz rnzVar = f5bVar.x;
        ServerMessageRef serverMessageRef = this.a;
        if (this != rnzVar.c(serverMessageRef.getTimestamp())) {
            return;
        }
        rnzVar.i(serverMessageRef.getTimestamp());
        if (f5bVar.w.f() && rnzVar.f()) {
            qp3 qp3Var = f5bVar.z;
            kgx kgxVar = f5b.C[0];
            qp3Var.b(null);
            f5bVar.A = null;
            handler.removeCallbacksAndMessages(null);
            f5bVar.y = false;
        }
    }
}
