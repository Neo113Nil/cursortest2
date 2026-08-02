package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyListState.kt */
@b6l(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class tvy extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xvy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvy(xvy xvyVar, int i, int i2, spj<? super tvy> spjVar) {
        super(2, spjVar);
        this.this$0 = xvyVar;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tvy tvyVar = new tvy(this.this$0, this.$index, this.$scrollOffset, spjVar);
        tvyVar.L$0 = obj;
        return tvyVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((tvy) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ggh0 ggh0Var = (ggh0) this.L$0;
            xvy xvyVar = this.this$0;
            pvy pvyVar = new pvy(ggh0Var, xvyVar);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            azl azlVar = ((hvy) ((zak0) xvyVar.f).getValue()).i;
            this.label = 1;
            if (kuy.a(pvyVar, i2, i3, 100, azlVar, this) == coroutineSingletons) {
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
