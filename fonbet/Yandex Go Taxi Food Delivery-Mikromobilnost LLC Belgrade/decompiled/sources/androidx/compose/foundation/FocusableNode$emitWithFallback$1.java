package androidx.compose.foundation;

import defpackage.ay40;
import defpackage.g8w;
import defpackage.m1k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ m1k $handler;
    final /* synthetic */ g8w $interaction;
    final /* synthetic */ zx40 $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(zx40 zx40Var, g8w g8wVar, m1k m1kVar, Continuation continuation) {
        super(2, continuation);
        this.$this_emitWithFallback = zx40Var;
        this.$interaction = g8wVar;
        this.$handler = m1kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableNode$emitWithFallback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zx40 zx40Var = this.$this_emitWithFallback;
            g8w g8wVar = this.$interaction;
            this.label = 1;
            if (((ay40) zx40Var).a(g8wVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        m1k m1kVar = this.$handler;
        if (m1kVar != null) {
            m1kVar.dispose();
        }
        return zy11.a;
    }
}
