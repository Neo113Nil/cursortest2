package xsna;

/* compiled from: ManagedGroupsCountersObserverImpl.kt */
/* loaded from: classes3.dex */
public final class hi00 implements gi00 {
    public final mbl a;
    public final ji00 b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<ei00> d;
    public final io.reactivex.rxjava3.subjects.d e;

    /* compiled from: ManagedGroupsCountersObserverImpl.kt */
    public static abstract class a {

        /* compiled from: ManagedGroupsCountersObserverImpl.kt */
        /* renamed from: xsna.hi00$a$a, reason: collision with other inner class name */
        public static final class C2999a extends a {
            public static final C2999a a = new C2999a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2999a);
            }

            public final int hashCode() {
                return 2019265896;
            }

            public final String toString() {
                return "Invalidate";
            }
        }

        /* compiled from: ManagedGroupsCountersObserverImpl.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 735228790;
            }

            public final String toString() {
                return "Update";
            }
        }
    }

    public hi00(mbl mblVar, ji00 ji00Var) {
        this.a = mblVar;
        this.b = ji00Var;
        io.reactivex.rxjava3.subjects.d<ei00> O0 = io.reactivex.rxjava3.subjects.d.O0(ei00.d);
        this.d = O0;
        this.e = O0;
    }

    @Override // xsna.gi00
    public final io.reactivex.rxjava3.core.q<ei00> H() {
        return this.e;
    }

    @Override // xsna.gi00
    public final void a() {
        this.c.e();
        this.b.h();
    }

    @Override // xsna.gi00
    public final void c() {
        a();
        this.d.onNext(ei00.d);
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        ji00 ji00Var = this.b;
        ji00Var.c();
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(3, ji00Var.b(), null, null, new rmg(new xgv(fVar, 9), 20));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.b(f);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.o0(fVar.a0(asu0.a.c()), new yzt(new f0z(this, 3), 4)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new viu(4), new x2e(this, 27)));
        fVar.onNext(a.b.a);
    }
}
