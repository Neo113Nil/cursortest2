package xsna;

import android.app.Activity;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import xsna.c63;

/* compiled from: EasterEggsModel.kt */
/* loaded from: classes14.dex */
public final class wuo extends c63.b {
    public final qkn0 b = new qkn0(xuo.e, io.reactivex.rxjava3.android.schedulers.a.b());
    public boolean c;
    public final /* synthetic */ xuo d;

    public wuo(xuo xuoVar) {
        this.d = xuoVar;
    }

    @Override // xsna.c63.b
    public final void u() {
        qkn0 qkn0Var = this.b;
        io.reactivex.rxjava3.disposables.c cVar = qkn0Var.e;
        if (cVar != null) {
            cVar.dispose();
        }
        qkn0Var.e = null;
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        boolean z = this.c;
        qkn0 qkn0Var = this.b;
        if (!z) {
            b25 a = o25.a();
            xuo xuoVar = this.d;
            a.b0(xuoVar.c);
            itg0.i(3, qkn0Var.d, new b1j(xuoVar, 12), null, null);
            this.c = true;
        }
        if (qkn0Var.e != null) {
            return;
        }
        if (qkn0Var.f == 0) {
            qkn0Var.f = SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = (qkn0Var.f + qkn0Var.a) - SystemClock.elapsedRealtime();
        qkn0Var.e = io.reactivex.rxjava3.core.q.Q(elapsedRealtime < 0 ? 0L : elapsedRealtime, qkn0Var.a, TimeUnit.MILLISECONDS, qkn0Var.b).subscribe(new qw40(new kvm0(qkn0Var, 1), 21));
    }
}
