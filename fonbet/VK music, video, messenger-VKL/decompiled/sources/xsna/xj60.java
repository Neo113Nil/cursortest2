package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedFreshTimerInteractor.kt */
/* loaded from: classes4.dex */
public final class xj60 {
    public final io.reactivex.rxjava3.core.w a;
    public final ts60 b;
    public final Object c;
    public long d;
    public long e;
    public io.reactivex.rxjava3.disposables.c f;

    public xj60(ts60 ts60Var) {
        asu0.a.getClass();
        this.a = asu0.i();
        this.b = ts60Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new w9(22));
    }

    public final void a(long j, gzs<s3q0> gzsVar) {
        if (this.f != null) {
            return;
        }
        qye qyeVar = new qye(this, gzsVar);
        this.b.m("Schedule task with delay=" + j);
        this.f = this.a.d(qyeVar, j, TimeUnit.MILLISECONDS);
        if (this.e == 0) {
            this.e = System.currentTimeMillis();
        }
    }

    public final void b() {
        this.b.m("Stop task");
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
    }
}
