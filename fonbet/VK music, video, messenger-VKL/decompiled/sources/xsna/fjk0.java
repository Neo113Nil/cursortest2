package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SpecialEventControllerImpl.kt */
/* loaded from: classes.dex */
public final class fjk0 {
    public final Object a;
    public Object b;

    public fjk0() {
        this.a = new AtomicBoolean(false);
    }

    public void a() {
        wmi0.a.c("special_events");
    }

    public io.reactivex.rxjava3.internal.operators.completable.p b(int i) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(((a1w) this.a).C(this, new iyi0(i)).q(asu0.a.c()), new np3(new dib(this, i, 0), 5)));
    }

    public fjk0(a1w a1wVar) {
        this.a = a1wVar;
        this.b = new io.reactivex.rxjava3.subjects.f();
    }
}
