package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p85;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uph;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed.DelayedActionHandler$handle$1", f = "DelayedActionHandler.kt", l = {20, 37}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class DelayedActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ uph $action;
    final /* synthetic */ n6u $context;
    int label;
    final /* synthetic */ DelayedActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayedActionHandler$handle$1(uph uphVar, DelayedActionHandler delayedActionHandler, n6u n6uVar, Continuation<? super DelayedActionHandler$handle$1> continuation) {
        super(2, continuation);
        this.$action = uphVar;
        this.this$0 = delayedActionHandler;
        this.$context = n6uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new DelayedActionHandler$handle$1(this.$action, this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((DelayedActionHandler$handle$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (androidx.lifecycle.m0.a(r3, r4, r5, r6, r7, r9) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r9) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p85 p85Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.$action.a;
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
        p85Var = this.this$0.activityProvider;
        Lifecycle lifecycle = ((FragmentActivity) p85Var.b()).getLifecycle();
        final n6u n6uVar = this.$context;
        final uph uphVar = this.$action;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a.x;
        boolean G = g6uVar.G(get_context());
        if (!G) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                n6uVar.c.b(uphVar.b, n6uVar.b, n6uVar.e);
                return zy11.a;
            }
        }
        sls slsVar = new sls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed.DelayedActionHandler$handle$1$invokeSuspend$$inlined$withResumed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final zy11 invoke() {
                n6u n6uVar2 = n6u.this;
                n6uVar2.c.b(uphVar.b, n6uVar2.b, n6uVar2.e);
                return zy11.a;
            }
        };
        this.label = 2;
    }
}
