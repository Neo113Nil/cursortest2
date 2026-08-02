package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadScreenContent.kt */
@b6l(c = "com.vk.clips.upload.ui.impl.compose.views.content.ClipsUploadScreenContentKt$ClipsUploadScreenContent$2$1", f = "ClipsUploadScreenContent.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class jhf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rg50 $framesCount$delegate;
    final /* synthetic */ wh50<Boolean> $hasScrolled;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ zbj0 $sharingOptionsBlock;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhf(wh50<Boolean> wh50Var, zbj0 zbj0Var, rg50 rg50Var, xvy xvyVar, spj<? super jhf> spjVar) {
        super(2, spjVar);
        this.$hasScrolled = wh50Var;
        this.$sharingOptionsBlock = zbj0Var;
        this.$framesCount$delegate = rg50Var;
        this.$listState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jhf(this.$hasScrolled, this.$sharingOptionsBlock, this.$framesCount$delegate, this.$listState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jhf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        wh50<Boolean> wh50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.$hasScrolled.getValue().booleanValue() && !this.$sharingOptionsBlock.b.isEmpty() && this.$framesCount$delegate.getIntValue() > 2 && (num = this.$sharingOptionsBlock.c) != null) {
                xvy xvyVar = this.$listState;
                wh50<Boolean> wh50Var2 = this.$hasScrolled;
                int intValue = num.intValue();
                this.L$0 = wh50Var2;
                this.label = 1;
                fh9 fh9Var = xvy.y;
                if (xvyVar.f(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wh50Var = wh50Var2;
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wh50Var = (wh50) this.L$0;
        kotlin.a.a(obj);
        wh50Var.setValue(Boolean.TRUE);
        return s3q0.a;
    }
}
