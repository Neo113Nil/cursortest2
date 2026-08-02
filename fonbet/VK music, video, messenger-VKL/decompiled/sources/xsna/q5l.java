package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DebugFileManagerScreen.kt */
@b6l(c = "com.vk.debug.design.DebugFileManagerScreenKt$DebugFileManagerScreen$2$1", f = "DebugFileManagerScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class q5l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<gzs<s3q0>> $goUp$delegate;
    final /* synthetic */ izs<gzs<s3q0>, s3q0> $onRegisterGoUp;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5l(spj spjVar, izs izsVar, mtk0 mtk0Var) {
        super(2, spjVar);
        this.$onRegisterGoUp = izsVar;
        this.$goUp$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q5l(spjVar, this.$onRegisterGoUp, this.$goUp$delegate);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q5l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        izs<gzs<s3q0>, s3q0> izsVar = this.$onRegisterGoUp;
        if (izsVar != null) {
            izsVar.invoke(new ncg(this.$goUp$delegate, 13));
        }
        return s3q0.a;
    }
}
