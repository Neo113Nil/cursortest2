package androidx.compose.foundation.gestures;

import defpackage.bms;
import defpackage.gxg;
import defpackage.jj2;
import defpackage.kj2;
import defpackage.l62;
import defpackage.lah;
import defpackage.mt71;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o62;
import defpackage.uh6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lo62;", "Llah;", "anchors", "latestTarget", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1425, 1443, 1467}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements bms {
    final /* synthetic */ gxg $decayAnimationSpec;
    final /* synthetic */ Ref$FloatRef $remainingVelocity;
    final /* synthetic */ jj2 $snapAnimationSpec;
    final /* synthetic */ e $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(e eVar, float f, jj2 jj2Var, Ref$FloatRef ref$FloatRef, gxg gxgVar, Continuation continuation) {
        super(4, continuation);
        this.$this_animateToWithDecay = eVar;
        this.$velocity = f;
        this.$snapAnimationSpec = jj2Var;
        this.$remainingVelocity = ref$FloatRef;
        this.$decayAnimationSpec = gxgVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, (Continuation) obj4);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = (o62) obj;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = (lah) obj2;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = obj3;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (androidx.compose.foundation.gestures.c.a(r7, r8, r9, r10, r11, r12, r13) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (androidx.compose.animation.core.e.d(r2, r4, false, r7, r14) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        if (androidx.compose.foundation.gestures.c.a(r7, r8, r9, r10, r11, r12, r13) == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2;
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$22;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o62 o62Var = (o62) this.L$0;
            lah lahVar = (lah) this.L$1;
            Object obj2 = this.L$2;
            float f = lahVar.f(obj2);
            if (!Float.isNaN(f)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float floatValue = Float.isNaN(this.$this_animateToWithDecay.j.getFloatValue()) ? 0.0f : this.$this_animateToWithDecay.j.getFloatValue();
                ref$FloatRef.element = floatValue;
                if (floatValue != f) {
                    float f2 = this.$velocity;
                    if ((f - floatValue) * f2 < 0.0f || f2 == 0.0f) {
                        anchoredDraggableKt$animateToWithDecay$2 = this;
                        e eVar = anchoredDraggableKt$animateToWithDecay$2.$this_animateToWithDecay;
                        jj2 jj2Var = anchoredDraggableKt$animateToWithDecay$2.$snapAnimationSpec;
                        anchoredDraggableKt$animateToWithDecay$2.L$0 = null;
                        anchoredDraggableKt$animateToWithDecay$2.L$1 = null;
                        anchoredDraggableKt$animateToWithDecay$2.label = 1;
                    } else {
                        float k = mt71.k(this.$decayAnimationSpec, floatValue, f2);
                        float f3 = this.$velocity;
                        if (f3 <= 0.0f ? k > f : k < f) {
                            e eVar2 = this.$this_animateToWithDecay;
                            jj2 jj2Var2 = this.$snapAnimationSpec;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            anchoredDraggableKt$animateToWithDecay$22 = this;
                        } else {
                            kj2 a = uh6.a(ref$FloatRef.element, f3, 28);
                            gxg gxgVar = this.$decayAnimationSpec;
                            l62 l62Var = new l62(f, ref$FloatRef, o62Var, this.$remainingVelocity);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
            anchoredDraggableKt$animateToWithDecay$2 = this;
            anchoredDraggableKt$animateToWithDecay$2.$remainingVelocity.element = 0.0f;
        } else if (i == 2) {
            kotlin.b.b(obj);
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            anchoredDraggableKt$animateToWithDecay$22 = this;
            anchoredDraggableKt$animateToWithDecay$22.$remainingVelocity.element = 0.0f;
        }
        return zy11.a;
    }
}
