package androidx.compose.animation;

import androidx.compose.animation.core.AnimationEndReason;
import defpackage.ejs0;
import defpackage.jj2;
import defpackage.k6w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wi2;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ ejs0 $this_apply;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(ejs0 ejs0Var, long j, n nVar, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = ejs0Var;
        this.$targetSize = j;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SizeAnimationModifierNode$animateTo$data$1$1 sizeAnimationModifierNode$animateTo$data$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.$this_apply.a;
            k6w k6wVar = new k6w(this.$targetSize);
            jj2 jj2Var = this.this$0.a;
            this.label = 1;
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = androidx.compose.animation.core.a.d(aVar, k6wVar, jj2Var, null, null, sizeAnimationModifierNode$animateTo$data$1$1, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
        }
        if (((wi2) obj).b == AnimationEndReason.Finished) {
            sizeAnimationModifierNode$animateTo$data$1$1.this$0.getClass();
        }
        return zy11.a;
    }
}
