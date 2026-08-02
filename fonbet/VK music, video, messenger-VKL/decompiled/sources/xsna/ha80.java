package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: OnProcessStartedUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.util.OnProcessStartedUseCase$invoke$1", f = "OnProcessStartedUseCase.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ha80 extends SuspendLambda implements wzs<zhd0<? super s3q0>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ia80 this$0;

    /* compiled from: OnProcessStartedUseCase.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ zhd0<s3q0> $$this$callbackFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zhd0<? super s3q0> zhd0Var) {
            super(0);
            this.$$this$callbackFlow = zhd0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            zhd0<s3q0> zhd0Var = this.$$this$callbackFlow;
            s3q0 s3q0Var = s3q0.a;
            zfb.a(s3q0Var, zhd0Var);
            return s3q0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha80(ia80 ia80Var, spj<? super ha80> spjVar) {
        super(2, spjVar);
        this.this$0 = ia80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ha80 ha80Var = new ha80(this.this$0, spjVar);
        ha80Var.L$0 = obj;
        return ha80Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super s3q0> zhd0Var, spj<? super s3q0> spjVar) {
        return ((ha80) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            this.this$0.a.a(new a(zhd0Var));
            this.label = 1;
            if (phd0.a(zhd0Var, new ob0(25), this) == coroutineSingletons) {
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
