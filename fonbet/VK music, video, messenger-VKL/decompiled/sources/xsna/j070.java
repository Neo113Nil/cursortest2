package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: NewsfeedStoriesDaemonImpl.kt */
/* loaded from: classes6.dex */
public final class j070 implements i070, w8i {
    public final fsl0 b;
    public final io.reactivex.rxjava3.core.w c;
    public a d;
    public io.reactivex.rxjava3.disposables.c e;
    public final long f;
    public final float g;
    public long h;
    public boolean i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;

    /* compiled from: NewsfeedStoriesDaemonImpl.kt */
    public static final class a implements Runnable {
        public final otl0 b;
        public final fsl0 c;
        public final sb d;
        public boolean e;

        public a(otl0 otl0Var, fsl0 fsl0Var, sb sbVar) {
            this.b = otl0Var;
            this.c = fsl0Var;
            this.d = sbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e) {
                return;
            }
            this.c.c();
            itg0.h(this.b.b("feed", true), new owv(this, 17), new l6u(this, 21));
        }
    }

    public j070(fsl0 fsl0Var) {
        this.b = fsl0Var;
        asu0.a.getClass();
        this.c = asu0.r();
        this.i = true;
        this.j = new bpn0(new vv20(this, 7));
        this.k = new bpn0(new vex(this, 12));
        this.l = new bpn0(new nly(this, 19));
        new bpn0(new da50(this, 4));
        this.m = new bpn0(new io60(this, 3));
        new bpn0(new v3n(this, 29));
        this.n = new bpn0(new q010(this, 12));
        m6r0 a2 = hd60.a().a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(a2.c(m6r0.e1, -1));
        millis = millis < 0 ? timeUnit.toMillis(600L) : millis;
        this.f = millis;
        this.h = millis;
        this.g = ((Number) a2.b(m6r0.f1, Float.valueOf(1.0f))).floatValue();
    }

    @Override // xsna.i070
    public final io.reactivex.rxjava3.disposables.c a() {
        long currentTimeMillis = System.currentTimeMillis() - ((de60) this.n.getValue()).d();
        long j = this.h;
        long j2 = j - currentTimeMillis;
        if (j2 <= 0) {
            j2 = 0;
        }
        return b(j2, j);
    }

    public final io.reactivex.rxjava3.disposables.c b(long j, long j2) {
        stop();
        a aVar = new a((otl0) this.m.getValue(), this.b, new sb(this, 7));
        io.reactivex.rxjava3.disposables.c e = this.c.e(aVar, j, j2, TimeUnit.MILLISECONDS);
        this.e = e;
        this.d = aVar;
        return e;
    }

    @Override // xsna.i070
    public final void f(boolean z) {
        long j = this.f;
        this.h = j;
        b(0L, j);
    }

    @Override // xsna.i070
    public final void onPause() {
        if (this.i) {
            this.i = false;
        }
    }

    @Override // xsna.i070
    public final void onResume() {
        if (this.i) {
            return;
        }
        this.i = true;
        long j = this.h;
        long j2 = this.f;
        if (j != j2) {
            this.h = j2;
            a();
        }
    }

    @Override // xsna.i070
    public final void stop() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.e = true;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
