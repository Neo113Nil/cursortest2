package com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import defpackage.g6u;
import defpackage.ig5;
import defpackage.m18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wm50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable.CancellableDelayedActionHandler$handle$1$1", f = "CancellableDelayedActionHandler.kt", l = {36, 54}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CancellableDelayedActionHandler$handle$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ wm50 $actionsDispatcher;
    final /* synthetic */ FragmentActivity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableDelayedActionHandler$handle$1$1(ig5 ig5Var, FragmentActivity fragmentActivity, wm50 wm50Var, Continuation continuation) {
        super(2, continuation);
        this.$action = ig5Var;
        this.$activity = fragmentActivity;
        this.$actionsDispatcher = wm50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancellableDelayedActionHandler$handle$1$1(this.$action, this.$activity, this.$actionsDispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancellableDelayedActionHandler$handle$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (androidx.lifecycle.m0.a(r3, r4, r5, r6, r7, r9) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r9) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = ((m18) this.$action).a.a;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Lifecycle lifecycle = this.$activity.getLifecycle();
        final wm50 wm50Var = this.$actionsDispatcher;
        final ig5 ig5Var = this.$action;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a.x;
        boolean G = g6uVar.G(get_context());
        if (!G) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                wm50Var.dispatch(((m18) ig5Var).a.c);
                return zy11.a;
            }
        }
        sls slsVar = new sls() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable.CancellableDelayedActionHandler$handle$1$1$invokeSuspend$$inlined$withResumed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                wm50.this.dispatch(((m18) ig5Var).a.c);
                return zy11.a;
            }
        };
        this.label = 2;
    }
}
