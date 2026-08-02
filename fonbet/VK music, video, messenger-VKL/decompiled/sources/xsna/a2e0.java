package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ProgressDialogHolder.kt */
/* loaded from: classes6.dex */
public final class a2e0 {
    public final Handler a;
    public bqu0 b;

    public a2e0(gzs<? extends bqu0> gzsVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        qro0.b(handler, new defpackage.e0(20, this, gzsVar));
    }

    public final void a() {
        Handler handler = this.a;
        try {
            handler.removeCallbacksAndMessages(null);
            handler.post(new tw3(this, 19));
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(io.reactivex.rxjava3.disposables.c cVar) {
        qro0.b(this.a, new rs0(15, this, cVar));
    }

    public final void c(long j) {
        try {
            bpn0 bpn0Var = qro0.a;
            qro0.d(new x1e0(this, 0), j, this.a);
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
        }
    }
}
