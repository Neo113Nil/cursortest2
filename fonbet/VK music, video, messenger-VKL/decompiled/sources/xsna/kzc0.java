package xsna;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: PrefetchByNotListenedMsgPlugin.kt */
/* loaded from: classes.dex */
public final class kzc0 implements pr4 {
    public static final a e = new a();
    public static final atr f = new atr();
    public final gzs<a1w> a;
    public final long b;
    public final gzs<Boolean> c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: PrefetchByNotListenedMsgPlugin.kt */
    public static final class a implements bgk0 {
        public final String toString() {
            return "PREFETCH_BY_NOT_LISTENED_MSG_SOURCE";
        }
    }

    public kzc0(long j, gzs gzsVar, gzs gzsVar2) {
        this.a = gzsVar;
        this.b = j;
        this.c = gzsVar2;
    }

    public final io.reactivex.rxjava3.core.x<Collection<ur4>> a() {
        Object failure;
        gzs<a1w> gzsVar = this.a;
        try {
            failure = Boolean.valueOf(gzsVar.invoke().u());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        if (!((Boolean) failure).booleanValue()) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        xuo0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.c C = gzsVar.invoke().C(this, new ehr(false, xuo0.a() - this.b));
        final b1v b1vVar = new b1v(3);
        return C.l(new io.reactivex.rxjava3.functions.l() { // from class: xsna.hzc0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj2) {
                return (Collection) b1v.this.invoke(obj2);
            }
        });
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        ob60 ob60Var = new ob60(ir4Var, 1);
        qej qejVar = new qej(3);
        gzs<a1w> gzsVar = this.a;
        io.reactivex.rxjava3.internal.operators.observable.x1 O0 = new io.reactivex.rxjava3.internal.operators.observable.r1(new io.reactivex.rxjava3.internal.operators.observable.i0(gzsVar.invoke().l.a().b0(e980.class), new bej(new ezc0(this, 0), 2))).O0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.o0(O0.c(O0.y(1000L, timeUnit)).U(new dej(new ipo(4))), new x1w(new fzc0(this), 3)).subscribe(new f340(ob60Var, 1), new gzc0(qejVar, 0));
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        bVar.b(subscribe);
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.i0(gzsVar.invoke().l.a(), new d2w(new iqa(this, 1), 1)).A(1000L, timeUnit), new jzc0(new izc0(this, 0), 0)).subscribe(new dk40(ob60Var, 1), new kos(qejVar, 2)));
        if (this.c.invoke().booleanValue()) {
            bVar.b(a().subscribe(new ua3(ob60Var, 3), new va3(qejVar, 1)));
        }
    }
}
