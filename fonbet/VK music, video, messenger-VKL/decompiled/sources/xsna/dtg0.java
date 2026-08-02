package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RxConvert.kt */
@b6l(c = "kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class dtg0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ io.reactivex.rxjava3.core.r<Object> $emitter;
    final /* synthetic */ ksr<Object> $this_asObservable;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: RxConvert.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ io.reactivex.rxjava3.core.r<T> b;

        public a(io.reactivex.rxjava3.core.r<T> rVar) {
            this.b = rVar;
        }

        @Override // xsna.lsr
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            this.b.onNext(t);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtg0(ksr<Object> ksrVar, io.reactivex.rxjava3.core.r<Object> rVar, spj<? super dtg0> spjVar) {
        super(2, spjVar);
        this.$this_asObservable = ksrVar;
        this.$emitter = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dtg0 dtg0Var = new dtg0(this.$this_asObservable, this.$emitter, spjVar);
        dtg0Var.L$0 = obj;
        return dtg0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dtg0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar2 = (yvj) this.L$0;
            try {
                ksr<Object> ksrVar = this.$this_asObservable;
                a aVar = new a(this.$emitter);
                this.L$0 = yvjVar2;
                this.label = 1;
                if (ksrVar.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                yvjVar = yvjVar2;
            } catch (Throwable th2) {
                yvjVar = yvjVar2;
                th = th2;
                if (!(th instanceof CancellationException)) {
                }
                return s3q0.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yvjVar = (yvj) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th3) {
                th = th3;
                if (!(th instanceof CancellationException)) {
                    this.$emitter.onComplete();
                } else if (!this.$emitter.b(th)) {
                    xx1.p(yvjVar.getCoroutineContext(), th);
                }
                return s3q0.a;
            }
        }
        this.$emitter.onComplete();
        return s3q0.a;
    }
}
