package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.r7d0;

/* compiled from: PrimaryBlockGoodsContentImpl.kt */
@b6l(c = "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl$Content$1$1", f = "PrimaryBlockGoodsContentImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class w7d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Boolean> $reachedEnd$delegate;
    int label;
    final /* synthetic */ d8d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7d0(d8d0 d8d0Var, mtk0<Boolean> mtk0Var, spj<? super w7d0> spjVar) {
        super(2, spjVar);
        this.this$0 = d8d0Var;
        this.$reachedEnd$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new w7d0(this.this$0, this.$reachedEnd$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((w7d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$reachedEnd$delegate.getValue().booleanValue()) {
            this.this$0.w().invoke(r7d0.h.a);
        }
        return s3q0.a;
    }
}
