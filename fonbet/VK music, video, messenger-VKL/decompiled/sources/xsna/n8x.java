package xsna;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;

/* compiled from: InstrumentOkHttpEnqueueCallback.java */
/* loaded from: classes13.dex */
public final class n8x implements lb9 {
    public final lb9 b;
    public final e560 c;
    public final Timer d;
    public final long e;

    public n8x(lb9 lb9Var, xop0 xop0Var, Timer timer, long j) {
        this.b = lb9Var;
        this.c = new e560(xop0Var);
        this.e = j;
        this.d = timer;
    }

    @Override // xsna.lb9
    public final void onFailure(okhttp3.d dVar, IOException iOException) {
        okhttp3.p request = dVar.request();
        e560 e560Var = this.c;
        if (request != null) {
            okhttp3.l lVar = request.a;
            if (lVar != null) {
                e560Var.n(lVar.j().toString());
            }
            String str = request.b;
            if (str != null) {
                e560Var.e(str);
            }
        }
        e560Var.i(this.e);
        kq.c(this.d, e560Var, e560Var);
        this.b.onFailure(dVar, iOException);
    }

    @Override // xsna.lb9
    public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) throws IOException {
        FirebasePerfOkHttpClient.a(uVar, this.c, this.e, this.d.d());
        this.b.onResponse(dVar, uVar);
    }
}
