package androidx.compose.foundation.gestures;

import defpackage.gxg;
import defpackage.iip0;
import defpackage.kj2;
import defpackage.lc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)F"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1079}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ iip0 $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, g gVar, iip0 iip0Var, Continuation continuation) {
        super(2, continuation);
        this.$initialVelocity = f;
        this.this$0 = gVar;
        this.$this_performFling = iip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        kj2 kj2Var;
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (Math.abs(this.$initialVelocity) <= 1.0f) {
                f = this.$initialVelocity;
                return new Float(f);
            }
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.element = this.$initialVelocity;
            Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            kj2 a = uh6.a(0.0f, this.$initialVelocity, 28);
            try {
                g gVar = this.this$0;
                gxg gxgVar = gVar.a;
                lc0 lc0Var = new lc0(ref$FloatRef3, this.$this_performFling, ref$FloatRef2, gVar, 14);
                this.L$0 = ref$FloatRef2;
                this.L$1 = a;
                this.label = 1;
                if (androidx.compose.animation.core.e.d(a, gxgVar, false, lc0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
            } catch (CancellationException unused) {
                kj2Var = a;
                ref$FloatRef = ref$FloatRef2;
                ref$FloatRef.element = ((Number) kj2Var.e()).floatValue();
                f = ref$FloatRef.element;
                return new Float(f);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kj2Var = (kj2) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) kj2Var.e()).floatValue();
                f = ref$FloatRef.element;
                return new Float(f);
            }
        }
        f = ref$FloatRef.element;
        return new Float(f);
    }
}
