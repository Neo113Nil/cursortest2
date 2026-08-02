package androidx.compose.foundation.gestures;

import defpackage.bms;
import defpackage.jj2;
import defpackage.lah;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o62;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lo62;", "Llah;", "anchors", "latestTarget", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1378}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements bms {
    final /* synthetic */ jj2 $animationSpec;
    final /* synthetic */ e $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(e eVar, jj2 jj2Var, Continuation continuation) {
        super(4, continuation);
        this.$this_animateTo = eVar;
        this.$animationSpec = jj2Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.$this_animateTo, this.$animationSpec, (Continuation) obj4);
        anchoredDraggableKt$animateTo$4.L$0 = (o62) obj;
        anchoredDraggableKt$animateTo$4.L$1 = (lah) obj2;
        anchoredDraggableKt$animateTo$4.L$2 = obj3;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o62 o62Var = (o62) this.L$0;
            lah lahVar = (lah) this.L$1;
            Object obj2 = this.L$2;
            e eVar = this.$this_animateTo;
            float floatValue = eVar.k.getFloatValue();
            jj2 jj2Var = this.$animationSpec;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c.a(eVar, floatValue, o62Var, lahVar, obj2, jj2Var, this) == coroutineSingletons) {
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
