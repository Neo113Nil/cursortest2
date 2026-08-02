package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadTicketActionButtonTooltip$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class kcf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcf(wcf wcfVar, spj<? super kcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kcf(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wcf wcfVar = this.this$0;
        q7v0 q7v0Var = wcfVar.t;
        q7v0Var.c(new n0(11, wcfVar, q7v0Var));
        return s3q0.a;
    }
}
