package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$executeWithProgress$1$1", f = "LoadDelegate.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class voz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
    final /* synthetic */ izs<Boolean, s3q0> $onExecutionStatusChanged;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public voz(izs<? super Boolean, s3q0> izsVar, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super voz> spjVar) {
        super(2, spjVar);
        this.$onExecutionStatusChanged = izsVar;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        voz vozVar = new voz(this.$onExecutionStatusChanged, this.$block, spjVar);
        vozVar.L$0 = obj;
        return vozVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((voz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.$onExecutionStatusChanged.invoke(Boolean.TRUE);
                wzs<yvj, spj<? super s3q0>, Object> wzsVar = this.$block;
                this.L$0 = null;
                this.label = 1;
                if (wzsVar.invoke(yvjVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$onExecutionStatusChanged.invoke(Boolean.FALSE);
            return s3q0.a;
        } catch (Throwable th) {
            this.$onExecutionStatusChanged.invoke(Boolean.FALSE);
            throw th;
        }
    }
}
