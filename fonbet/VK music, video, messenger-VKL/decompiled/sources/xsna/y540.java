package xsna;

import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.work.WorkModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MultiProcessWorkDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.work.multiprocess.MultiProcessWorkDataSource$enqueueWork$1", f = "MultiProcessWorkDataSource.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class y540 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ cxx0 $client;
    final /* synthetic */ WorkModel $workModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y540(cxx0 cxx0Var, WorkModel workModel, spj<? super y540> spjVar) {
        super(2, spjVar);
        this.$client = cxx0Var;
        this.$workModel = workModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y540(this.$client, this.$workModel, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y540) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            cxx0 cxx0Var = this.$client;
            WorkModel workModel = this.$workModel;
            this.label = 1;
            cxx0Var.getClass();
            Object makeAsyncRequest$default = BaseIPCClient.makeAsyncRequest$default(cxx0Var, new zwx0(workModel), "registerWork", axx0.i, bxx0.i, new q69(cxx0Var, 16), 0L, this, 32, null);
            if (makeAsyncRequest$default != obj2) {
                makeAsyncRequest$default = s3q0.a;
            }
            if (makeAsyncRequest$default == obj2) {
                return obj2;
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
