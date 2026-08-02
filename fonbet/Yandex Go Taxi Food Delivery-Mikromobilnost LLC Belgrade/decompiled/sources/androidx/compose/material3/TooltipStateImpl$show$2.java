package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1068, 1070}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TooltipStateImpl$show$2 extends SuspendLambda implements tls {
    final /* synthetic */ tls $cancellableShow;
    final /* synthetic */ MutatePriority $mutatePriority;
    int label;
    final /* synthetic */ a0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1070}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$cancellableShow = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$cancellableShow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar = this.$cancellableShow;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$2(a0 a0Var, MutatePriority mutatePriority, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = a0Var;
        this.$mutatePriority = mutatePriority;
        this.$cancellableShow = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TooltipStateImpl$show$2(this.this$0, this.$mutatePriority, this.$cancellableShow, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (kotlinx.coroutines.a.u(1500, r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } finally {
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
            if (this.$mutatePriority == MutatePriority.UserInput) {
                tls tlsVar = this.$cancellableShow;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellableShow, null);
                this.label = 2;
            }
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
                this.this$0.a();
            }
        }
        if (i != 1 && i != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$mutatePriority != MutatePriority.PreventUserInput) {
            this.this$0.a();
        }
        return zy11.a;
    }
}
