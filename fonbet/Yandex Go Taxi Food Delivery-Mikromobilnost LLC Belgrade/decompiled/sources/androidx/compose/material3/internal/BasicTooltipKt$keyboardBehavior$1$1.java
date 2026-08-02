package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.a0;
import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.ivr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.svz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {319}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ivr $it;
    final /* synthetic */ oz40 $receivedKeyboardFocus;
    final /* synthetic */ svz0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(ivr ivrVar, oz40 oz40Var, svz0 svz0Var, Continuation continuation) {
        super(2, continuation);
        this.$it = ivrVar;
        this.$receivedKeyboardFocus = oz40Var;
        this.$state = svz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.$it, this.$receivedKeyboardFocus, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((FocusStateImpl) this.$it).b()) {
                this.$receivedKeyboardFocus.setValue(Boolean.TRUE);
                svz0 svz0Var = this.$state;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.label = 1;
                if (((a0) svz0Var).c(mutatePriority, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) this.$receivedKeyboardFocus.getValue()).booleanValue() && ((a0) this.$state).b() && !((FocusStateImpl) this.$it).b()) {
            this.$receivedKeyboardFocus.setValue(Boolean.FALSE);
            ((a0) this.$state).a();
        }
        return zy11.a;
    }
}
