package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.c63;

/* compiled from: StopPrefetchBySystemRequestPlugin.kt */
/* loaded from: classes.dex */
public final class dgl0 implements pr4 {
    public volatile ir4 a;
    public final b b = new b();
    public final a c = new a();

    /* compiled from: StopPrefetchBySystemRequestPlugin.kt */
    public final class a extends c63.b {
        public i0 b;

        public a() {
        }

        @Override // xsna.c63.b
        public final void u() {
            i0 i0Var = new i0(11, dgl0.this, this);
            new Handler(Looper.getMainLooper()).postDelayed(i0Var, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
            this.b = i0Var;
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            i0 i0Var = this.b;
            if (i0Var != null) {
                new Handler(Looper.getMainLooper()).removeCallbacks(i0Var);
                this.b = null;
            }
        }
    }

    /* compiled from: StopPrefetchBySystemRequestPlugin.kt */
    public final class b extends o56 {
        public b() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void v(ir4 ir4Var, bgk0 bgk0Var, Collection<ur4> collection) {
            c63 c63Var = c63.a;
            c63.a(dgl0.this.c);
        }
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        this.a = ir4Var;
        ir4Var.v(this.b);
    }
}
