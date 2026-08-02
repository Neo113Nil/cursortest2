package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dbe0;

/* compiled from: Title.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.TitleKt$Title$1$1", f = "Title.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class szo0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Boolean> $isFocused$delegate;
    final /* synthetic */ izs<dbe0.o, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szo0(spj spjVar, izs izsVar, mtk0 mtk0Var) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$isFocused$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new szo0(spjVar, this.$onAction, this.$isFocused$delegate);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((szo0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(new dbe0.o.b(this.$isFocused$delegate.getValue().booleanValue()));
        return s3q0.a;
    }
}
