package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;

/* compiled from: RxConvert.kt */
@b6l(c = "kotlinx.coroutines.rx3.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {JsonToken.BEGIN_ARRAY}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ctg0 extends SuspendLambda implements wzs<zhd0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ io.reactivex.rxjava3.core.t<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: RxConvert.kt */
    public static final class a implements io.reactivex.rxjava3.core.v<Object> {
        public final /* synthetic */ zhd0<Object> b;
        public final /* synthetic */ AtomicReference<io.reactivex.rxjava3.disposables.c> c;

        public a(zhd0<Object> zhd0Var, AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference) {
            this.b = zhd0Var;
            this.c = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.b.B(null);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.B(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            try {
                zfb.a(obj, this.b);
            } catch (InterruptedException unused) {
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference;
            do {
                atomicReference = this.c;
                if (atomicReference.compareAndSet(null, cVar)) {
                    return;
                }
            } while (atomicReference.get() == null);
            cVar.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctg0(io.reactivex.rxjava3.core.t<Object> tVar, spj<? super ctg0> spjVar) {
        super(2, spjVar);
        this.$this_asFlow = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ctg0 ctg0Var = new ctg0(this.$this_asFlow, spjVar);
        ctg0Var.L$0 = obj;
        return ctg0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<Object> zhd0Var, spj<? super s3q0> spjVar) {
        return ((ctg0) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            AtomicReference atomicReference = new AtomicReference();
            this.$this_asFlow.subscribe(new a(zhd0Var, atomicReference));
            z56 z56Var = new z56(atomicReference, 8);
            this.label = 1;
            if (phd0.a(zhd0Var, z56Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
