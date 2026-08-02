package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.g49;

/* compiled from: CallLifecycleListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class q49 implements h49 {
    public final CopyOnWriteArraySet<g49> b = new CopyOnWriteArraySet<>();

    public static void c(gzs gzsVar) {
        i0q0.i(0L, new v86(2, gzsVar));
    }

    @Override // xsna.g49
    public final void a(String str, boolean z, CallId callId) {
        c(new k49(this, str, z, callId));
    }

    @Override // xsna.g49
    public final void b(final dhw0 dhw0Var, final boolean z, final Throwable th) {
        c(new gzs() { // from class: xsna.p49
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49.this.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().b(dhw0Var, z, th);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.g49
    public final void f(g49.b bVar) {
        c(new ge0(3, this, bVar));
    }

    @Override // xsna.g49
    public final void i(g49.a aVar) {
        c(new p5(4, this, aVar));
    }

    @Override // xsna.g49
    public final void k(CallId callId, String str) {
        c(new j49(this, str, callId, 0));
    }

    @Override // xsna.g49
    public final void l(final int i, final boolean z, final boolean z2, final CallId callId) {
        c(new gzs() { // from class: xsna.m49
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49.this.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().l(i, z, z2, callId);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.g49
    public final void p(CallId callId, boolean z) {
        c(new o49(this, callId, z));
    }

    @Override // xsna.g49
    public final void q() {
        c(new ng1(this, 12));
    }

    @Override // xsna.g49
    public final void r(boolean z) {
        c(new i49(this, z, 0));
    }

    @Override // xsna.g49
    public final void u(final CallId callId, final boolean z, final boolean z2) {
        c(new gzs() { // from class: xsna.n49
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49.this.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().u(callId, z, z2);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.g49
    public final void v(CallId callId, String str) {
        c(new l49(this, str, callId, 0));
    }

    @Override // xsna.g49
    public final void w(mlp mlpVar) {
        c(new uh3(5, this, mlpVar));
    }
}
