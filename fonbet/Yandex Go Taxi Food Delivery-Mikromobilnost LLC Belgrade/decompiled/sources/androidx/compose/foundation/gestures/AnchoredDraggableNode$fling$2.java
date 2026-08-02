package androidx.compose.foundation.gestures;

import defpackage.m62;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o62;
import defpackage.snr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo62;", "Llah;", "it", "Lzy11;", "<anonymous>", "(Lo62;Llah;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {473}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements zls {
    final /* synthetic */ Ref$FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(d dVar, Ref$FloatRef ref$FloatRef, float f, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$leftoverVelocity = ref$FloatRef;
        this.$velocity = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, this.$leftoverVelocity, this.$velocity, (Continuation) obj3);
        anchoredDraggableNode$fling$2.L$0 = (o62) obj;
        return anchoredDraggableNode$fling$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o62 o62Var = (o62) this.L$0;
            d dVar = this.this$0;
            m62 m62Var = new m62(0, dVar, o62Var);
            snr snrVar = dVar.R;
            snr snrVar2 = snrVar != null ? snrVar : null;
            Ref$FloatRef ref$FloatRef2 = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            Object a = snrVar2.a(m62Var, f, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            kotlin.b.b(obj);
        }
        ref$FloatRef.element = ((Number) obj).floatValue();
        return zy11.a;
    }
}
