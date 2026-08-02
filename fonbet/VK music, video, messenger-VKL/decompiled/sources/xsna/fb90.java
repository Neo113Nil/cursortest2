package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PagerIndicator.kt */
@b6l(c = "com.vk.clips.design.compose.pager.PagerIndicatorKt$PagerIndicator$1$1", f = "PagerIndicator.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class fb90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ ib90 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb90(int i, ib90 ib90Var, xvy xvyVar, spj<? super fb90> spjVar) {
        super(2, spjVar);
        this.$currentPage = i;
        this.$state = ib90Var;
        this.$listState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fb90(this.$currentPage, this.$state, this.$listState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fb90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = this.$currentPage;
            boolean z = this.$state.c;
            xvy xvyVar = this.$listState;
            this.label = 1;
            if (hb90.b(i2, z, xvyVar, 3, this) == coroutineSingletons) {
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
