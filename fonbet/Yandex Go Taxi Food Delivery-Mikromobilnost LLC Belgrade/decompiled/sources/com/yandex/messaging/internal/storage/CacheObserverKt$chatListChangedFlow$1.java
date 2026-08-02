package com.yandex.messaging.internal.storage;

import android.os.Looper;
import defpackage.lu5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb7;
import defpackage.tb7;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.CacheObserverKt$chatListChangedFlow$1", f = "CacheObserver.kt", l = {549}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CacheObserverKt$chatListChangedFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ sb7 $this_chatListChangedFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheObserverKt$chatListChangedFlow$1(sb7 sb7Var, Continuation continuation) {
        super(2, continuation);
        this.$this_chatListChangedFlow = sb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CacheObserverKt$chatListChangedFlow$1 cacheObserverKt$chatListChangedFlow$1 = new CacheObserverKt$chatListChangedFlow$1(this.$this_chatListChangedFlow, continuation);
        cacheObserverKt$chatListChangedFlow$1.L$0 = obj;
        return cacheObserverKt$chatListChangedFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CacheObserverKt$chatListChangedFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            tb7 tb7Var = new tb7(y6f0Var);
            sb7 sb7Var = this.$this_chatListChangedFlow;
            z83.g(null, sb7Var.a, Looper.myLooper());
            sb7Var.i.b(tb7Var);
            lu5 lu5Var = new lu5(15, this.$this_chatListChangedFlow, tb7Var);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, lu5Var, this) == coroutineSingletons) {
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
