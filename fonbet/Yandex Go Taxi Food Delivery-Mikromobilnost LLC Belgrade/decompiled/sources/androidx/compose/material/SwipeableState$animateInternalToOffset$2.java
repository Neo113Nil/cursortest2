package androidx.compose.material;

import defpackage.id00;
import defpackage.jj2;
import defpackage.lzu0;
import defpackage.mah;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmah;", "Lzy11;", "<anonymous>", "(Lmah;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {217}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements wls {
    final /* synthetic */ jj2 $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(e eVar, float f, jj2 jj2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$target = f;
        this.$spec = jj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, continuation);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableState$animateInternalToOffset$2) create((mah) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2;
        androidx.compose.animation.core.a a;
        Throwable th;
        Float f;
        jj2 jj2Var;
        lzu0 lzu0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mah mahVar = (mah) this.L$0;
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = this.this$0.f.getFloatValue();
            this.this$0.g.setValue(new Float(this.$target));
            this.this$0.c.setValue(Boolean.TRUE);
            try {
                a = id00.a(ref$FloatRef.element);
            } catch (Throwable th2) {
                th = th2;
                swipeableState$animateInternalToOffset$2 = this;
                th = th;
                swipeableState$animateInternalToOffset$2.this$0.g.setValue(null);
                swipeableState$animateInternalToOffset$2.this$0.c.setValue(Boolean.FALSE);
                throw th;
            }
            try {
                f = new Float(this.$target);
                jj2Var = this.$spec;
                lzu0Var = new lzu0(15, mahVar, ref$FloatRef);
                this.label = 1;
                swipeableState$animateInternalToOffset$2 = this;
            } catch (Throwable th3) {
                swipeableState$animateInternalToOffset$2 = this;
                th = th3;
                swipeableState$animateInternalToOffset$2.this$0.g.setValue(null);
                swipeableState$animateInternalToOffset$2.this$0.c.setValue(Boolean.FALSE);
                throw th;
            }
            try {
                obj = androidx.compose.animation.core.a.d(a, f, jj2Var, null, lzu0Var, swipeableState$animateInternalToOffset$2, 4);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                swipeableState$animateInternalToOffset$2.this$0.g.setValue(null);
                swipeableState$animateInternalToOffset$2.this$0.c.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                kotlin.b.b(obj);
                swipeableState$animateInternalToOffset$2 = this;
            } catch (Throwable th5) {
                th = th5;
                swipeableState$animateInternalToOffset$2 = this;
                swipeableState$animateInternalToOffset$2.this$0.g.setValue(null);
                swipeableState$animateInternalToOffset$2.this$0.c.setValue(Boolean.FALSE);
                throw th;
            }
        }
        swipeableState$animateInternalToOffset$2.this$0.g.setValue(null);
        swipeableState$animateInternalToOffset$2.this$0.c.setValue(Boolean.FALSE);
        return zy11.a;
    }
}
