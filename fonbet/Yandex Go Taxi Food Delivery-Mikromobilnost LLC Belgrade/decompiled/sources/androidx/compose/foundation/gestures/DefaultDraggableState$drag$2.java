package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.mah;
import defpackage.mvg;
import defpackage.nah;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {1088}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DefaultDraggableState$drag$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ nah this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggableState$drag$2(nah nahVar, MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nahVar;
        this.$dragPriority = mutatePriority;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDraggableState$drag$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nah nahVar = this.this$0;
            androidx.compose.foundation.j jVar = nahVar.c;
            mah mahVar = nahVar.b;
            MutatePriority mutatePriority = this.$dragPriority;
            wls wlsVar = this.$block;
            this.label = 1;
            if (jVar.c(mahVar, mutatePriority, wlsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
