package androidx.compose.material;

import defpackage.mah;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmah;", "Lzy11;", "<anonymous>", "(Lmah;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$target = f;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, continuation);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = (SwipeableState$snapInternalToOffset$2) create((mah) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        swipeableState$snapInternalToOffset$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((mah) this.L$0).a.a.invoke(Float.valueOf(this.$target - this.this$0.f.getFloatValue()));
        return zy11.a;
    }
}
