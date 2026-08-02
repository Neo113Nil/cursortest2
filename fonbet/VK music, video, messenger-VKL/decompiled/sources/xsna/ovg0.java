package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;

/* compiled from: RxScheduler.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class ovg0 extends FunctionReferenceImpl implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ kotlin.coroutines.d $ctx;
    final /* synthetic */ Runnable $decoratedBlock;
    final /* synthetic */ io.reactivex.rxjava3.disposables.c $disposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovg0(io.reactivex.rxjava3.disposables.f fVar, kotlin.coroutines.d dVar, Runnable runnable) {
        super(1, epx.a.class, "task", "scheduleTask$task(Lio/reactivex/rxjava3/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$disposable = fVar;
        this.$ctx = dVar;
        this.$decoratedBlock = runnable;
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return edi.k(this.$disposable, this.$ctx, this.$decoratedBlock, spjVar);
    }
}
