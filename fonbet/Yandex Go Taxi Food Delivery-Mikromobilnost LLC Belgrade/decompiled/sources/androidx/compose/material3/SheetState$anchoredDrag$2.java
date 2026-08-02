package androidx.compose.material3;

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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo62;", "Llah;", "Landroidx/compose/material3/SheetValue;", "it", "Lzy11;", "<anonymous>", "(Lo62;Llah;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.SheetState$anchoredDrag$2", f = "SheetDefaults.kt", l = {286}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SheetState$anchoredDrag$2 extends SuspendLambda implements zls {
    final /* synthetic */ Ref$FloatRef $consumedVelocity;
    final /* synthetic */ snr $flingBehavior;
    final /* synthetic */ float $initialVelocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDrag$2(Ref$FloatRef ref$FloatRef, snr snrVar, w wVar, float f, Continuation continuation) {
        super(3, continuation);
        this.$consumedVelocity = ref$FloatRef;
        this.$flingBehavior = snrVar;
        this.this$0 = wVar;
        this.$initialVelocity = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(this.$consumedVelocity, this.$flingBehavior, this.this$0, this.$initialVelocity, (Continuation) obj3);
        sheetState$anchoredDrag$2.L$0 = (o62) obj;
        return sheetState$anchoredDrag$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = 2;
            m62 m62Var = new m62(i2, this.this$0, (o62) this.L$0);
            Ref$FloatRef ref$FloatRef2 = this.$consumedVelocity;
            snr snrVar = this.$flingBehavior;
            float f = this.$initialVelocity;
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            Object a = snrVar.a(m62Var, f, this);
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
