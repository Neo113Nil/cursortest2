package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ActionSynchronizerInteractorImpl.kt */
/* loaded from: classes.dex */
public final class r60 implements w50 {
    public final v30 a;
    public final com.vk.core.utils.newtork.b b;
    public final l40 c;
    public final Object d = new Object();
    public boolean e;
    public io.reactivex.rxjava3.disposables.b f;

    public r60(v30 v30Var, com.vk.core.utils.newtork.b bVar, l40 l40Var) {
        this.a = v30Var;
        this.b = bVar;
        this.c = l40Var;
    }

    @Override // xsna.w50
    public final void a() {
        synchronized (this.d) {
            try {
                if (this.e) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Asked to start, but I'm already running."});
                    }
                } else {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Launch."});
                    }
                    io.reactivex.rxjava3.disposables.b bVar = this.f;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
                    this.f = bVar2;
                    c(bVar2);
                    d(bVar2);
                    this.e = true;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.w50
    public final io.reactivex.rxjava3.disposables.c b() {
        final v30 v30Var = this.a;
        v30Var.getClass();
        io.reactivex.rxjava3.internal.operators.completable.y q = io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.s30
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                v30.this.b().a.delete("actions_with_offline_support", null, null);
            }
        }).q(v30Var.d);
        m60 m60Var = new m60(new l60(0), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.completable.u o = new io.reactivex.rxjava3.internal.operators.completable.w(q, m60Var, lVar, kVar, kVar, kVar, kVar).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.schedulers.a.b());
        n60 n60Var = new n60();
        final im imVar = new im(1);
        return o.subscribe(n60Var, new io.reactivex.rxjava3.functions.f() { // from class: xsna.o60
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                im.this.invoke(obj);
            }
        });
    }

    public final void c(io.reactivex.rxjava3.disposables.b bVar) {
        v30 v30Var = this.a;
        v30Var.getClass();
        io.reactivex.rxjava3.internal.operators.completable.y q = io.reactivex.rxjava3.core.a.l(new u30(v30Var, 0)).q(v30Var.d);
        int i = 0;
        y50 y50Var = new y50(new p60(i), i);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        bVar.b(new io.reactivex.rxjava3.internal.operators.completable.w(q, y50Var, lVar, kVar, kVar, kVar, kVar).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.z50
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Synced actions successfully deleted."});
            }
        }, new b60(new a60(0), 0)));
    }

    public final void d(io.reactivex.rxjava3.disposables.b bVar) {
        io.reactivex.rxjava3.subjects.f<b70> fVar = this.a.c;
        this.b.getClass();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        int i = 1;
        io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.G0(dVar, new e8(new i60(0), 1)), new h8(new g8(1), 2)).U(new j8(new i8(2), 2)), new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new l8(new j60(0), 2)).U(new sq(new k60(0), 1)));
        c60 c60Var = new c60(new ht(1), 0);
        X.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.mixed.i x = new io.reactivex.rxjava3.internal.operators.observable.p0(new io.reactivex.rxjava3.internal.operators.observable.c0(X, c60Var, kVar).x(new w7(new g60(this, 0), i)), new y7(new ot(1), i)).x(new v20(new com.vk.im.ui.fragments.b(this, 2), i));
        int i2 = 0;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.l0(x.E(new h60(new q60(this), i2), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar), new c8(new com.vk.movika.sdk.base.observable.a(this, 2), 1)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new d60(0), new f60(new e60(0), i2)));
    }

    @Override // xsna.w50
    public final void shutdown() {
        synchronized (this.d) {
            try {
                this.e = false;
                io.reactivex.rxjava3.disposables.b bVar = this.f;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f = null;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Shutdown."});
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
