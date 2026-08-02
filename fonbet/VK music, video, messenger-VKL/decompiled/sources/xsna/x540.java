package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MultiProcessWorkDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.work.multiprocess.MultiProcessWorkDataSource$cancelUniqueWork$1", f = "MultiProcessWorkDataSource.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class x540 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ cxx0 $client;
    final /* synthetic */ String $uniqueWorkName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x540(cxx0 cxx0Var, String str, spj<? super x540> spjVar) {
        super(2, spjVar);
        this.$client = cxx0Var;
        this.$uniqueWorkName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x540(this.$client, this.$uniqueWorkName, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x540) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            cxx0 cxx0Var = this.$client;
            String str = this.$uniqueWorkName;
            this.label = 1;
            if (cxx0Var.o(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ((Result) obj).getClass();
        }
        return s3q0.a;
    }
}
