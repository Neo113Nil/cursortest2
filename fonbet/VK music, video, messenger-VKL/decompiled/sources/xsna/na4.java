package xsna;

import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: AudienceResearchQueue.kt */
/* loaded from: classes.dex */
public final class na4 {
    public final ha4 a;
    public final ra4 b;
    public volatile io.reactivex.rxjava3.disposables.c c;

    public na4(ha4 ha4Var, ra4 ra4Var) {
        this.a = ha4Var;
        this.b = ra4Var;
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.b a() {
        io.reactivex.rxjava3.processors.c<x94> cVar = this.a.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.getClass();
        io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.schedulers.a.a();
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        Objects.requireNonNull(arrayListSupplier, "bufferSupplier is null");
        io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "count");
        io.reactivex.rxjava3.internal.operators.flowable.r rVar = new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.d(cVar, a, arrayListSupplier), new ca4(new ba4(0), 0));
        final da4 da4Var = new da4(0);
        io.reactivex.rxjava3.internal.operators.flowable.d0 j = new io.reactivex.rxjava3.internal.operators.flowable.a0(new io.reactivex.rxjava3.internal.operators.flowable.c0(rVar, new io.reactivex.rxjava3.functions.l() { // from class: xsna.ea4
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (List) da4.this.invoke(obj);
            }
        }).j(io.reactivex.rxjava3.schedulers.a.a())).m(io.reactivex.rxjava3.schedulers.a.b()).j(io.reactivex.rxjava3.schedulers.a.b());
        ka4 ka4Var = new ka4(new ta3(1), 0);
        int i = io.reactivex.rxjava3.core.g.b;
        io.reactivex.rxjava3.internal.functions.b.a(i, "bufferSize");
        io.reactivex.rxjava3.internal.operators.flowable.u uVar = new io.reactivex.rxjava3.internal.operators.flowable.u(j, ka4Var, i);
        ma4 ma4Var = new ma4(new la4(this, 0), 0);
        io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
        return new io.reactivex.rxjava3.internal.operators.mixed.b(uVar, ma4Var, ErrorMode.IMMEDIATE);
    }
}
