package com.ybsdk.utils.poller;

import defpackage.mvg;
import defpackage.nop0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.poller.LifecycleAwarePollerLauncher$launch$2", f = "PollerLauncher.kt", l = {27, 27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LifecycleAwarePollerLauncher$launch$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleAwarePollerLauncher$launch$2(a aVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LifecycleAwarePollerLauncher$launch$2(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleAwarePollerLauncher$launch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (androidx.lifecycle.x.a(((defpackage.pey) r5).getLifecycle(), androidx.lifecycle.Lifecycle.State.RESUMED, r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nop0 nop0Var = this.this$0.b;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(nop0Var.a, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        wls wlsVar = this.$block;
        this.label = 2;
    }
}
