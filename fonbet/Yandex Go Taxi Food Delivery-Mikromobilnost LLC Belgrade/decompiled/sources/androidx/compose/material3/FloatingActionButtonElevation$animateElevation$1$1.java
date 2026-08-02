package androidx.compose.material3;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uor;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {1310}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class FloatingActionButtonElevation$animateElevation$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d $animatable;
    int label;
    final /* synthetic */ uor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(d dVar, uor uorVar, Continuation continuation) {
        super(2, continuation);
        this.$animatable = dVar;
        this.this$0 = uorVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.$animatable, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.$animatable;
        uor uorVar = this.this$0;
        float f = uorVar.a;
        float f2 = uorVar.b;
        float f3 = uorVar.d;
        float f4 = uorVar.c;
        this.label = 1;
        dVar.a = f;
        dVar.b = f2;
        dVar.c = f3;
        dVar.d = f4;
        Object b = dVar.b(this);
        if (b != coroutineSingletons) {
            b = zy11Var;
        }
        return b == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
