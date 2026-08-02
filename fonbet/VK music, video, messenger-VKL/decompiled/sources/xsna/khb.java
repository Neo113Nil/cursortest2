package xsna;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.b25;

/* compiled from: ChannelsNotificationsImEngineEventsSource.kt */
/* loaded from: classes.dex */
public final class khb implements b25.a {
    public final b7b b;
    public final a1w c;
    public final b25 d;
    public io.reactivex.rxjava3.disposables.c e = EmptyDisposable.INSTANCE;

    public khb(b7b b7bVar, a1w a1wVar, b25 b25Var) {
        this.b = b7bVar;
        this.c = a1wVar;
        this.d = b25Var;
    }

    public final void a() {
        if (this.d.b()) {
            if (this.e.h()) {
                io.reactivex.rxjava3.internal.operators.observable.m1 a = this.c.l.a();
                int i = kwg0.a;
                this.e = io.reactivex.rxjava3.kotlin.c.f(2, a, null, new nu2("ChannelsNotificationsEventsSource", 2), new op1(this, 18));
                return;
            }
            return;
        }
        this.e.dispose();
        b7b b7bVar = this.b;
        a7b a7bVar = b7bVar.a;
        a7bVar.i.e();
        a7bVar.b();
        b7bVar.b.c.e();
        b7bVar.c.e.e();
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        a();
    }
}
