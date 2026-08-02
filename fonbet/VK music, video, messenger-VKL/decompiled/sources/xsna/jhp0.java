package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TrackableGiftView.kt */
@b6l(c = "com.vk.stickers.views.gift.TrackableGiftView$startImpressionTimer$1", f = "TrackableGiftView.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class jhp0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ khp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhp0(khp0 khp0Var, spj<? super jhp0> spjVar) {
        super(2, spjVar);
        this.this$0 = khp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jhp0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jhp0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.this$0.d;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        khp0 khp0Var = this.this$0;
        if (!khp0Var.e && khp0Var.b(khp0Var.c, khp0Var)) {
            khp0 khp0Var2 = this.this$0;
            khp0Var2.e = true;
            gzs<s3q0> visibilityListener = khp0Var2.getVisibilityListener();
            if (visibilityListener != null) {
                visibilityListener.invoke();
            }
        }
        return s3q0.a;
    }
}
