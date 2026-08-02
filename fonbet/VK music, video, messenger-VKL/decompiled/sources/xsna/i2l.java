package xsna;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DebounceAnalyticsDelegate.kt */
/* loaded from: classes7.dex */
public final class i2l implements r200 {
    public final List<String> a;
    public final io.reactivex.rxjava3.subjects.f<t200> b;

    /* compiled from: DebounceAnalyticsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<t200, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(t200 t200Var) {
            ((jrj0) this.receiver).a(t200Var);
            return s3q0.a;
        }
    }

    public i2l(long j, List list) {
        this.a = list;
        jrj0 jrj0Var = new jrj0();
        io.reactivex.rxjava3.subjects.f<t200> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.internal.operators.observable.r1 r1Var = new io.reactivex.rxjava3.internal.operators.observable.r1(fVar);
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(r1Var, new rj4(new yad(this, 18), 8));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        ver0.a(hg1.h(io.reactivex.rxjava3.core.q.X(i0Var.z(j, timeUnit, asu0.i()), new io.reactivex.rxjava3.internal.operators.observable.i0(r1Var, new sj4(new iz0(this, 20), 10))).r0(asu0.i()).a0(asu0.i()), new a(1, jrj0Var, jrj0.class, "send", "send(Lcom/vk/bridges/LogoutData;)V", 0)));
        r1Var.N0(new io.reactivex.rxjava3.internal.util.d());
    }

    @Override // xsna.r200
    public final void a(t200 t200Var) {
        this.b.onNext(t200Var);
    }
}
