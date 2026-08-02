package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogEventBusImpl.kt */
@b6l(c = "com.vk.games.event.GamesCatalogEventBusImpl$readAllNotification$1", f = "GamesCatalogEventBusImpl.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ rbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbt(rbt rbtVar, spj<? super qbt> spjVar) {
        super(2, spjVar);
        this.this$0 = rbtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qbt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            kdt kdtVar = this.this$0.a;
            this.label = 1;
            if (kdtVar.g(this) == coroutineSingletons) {
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
