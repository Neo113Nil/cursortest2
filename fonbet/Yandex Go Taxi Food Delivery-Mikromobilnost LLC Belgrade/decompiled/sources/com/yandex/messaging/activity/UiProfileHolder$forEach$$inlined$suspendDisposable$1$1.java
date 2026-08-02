package com.yandex.messaging.activity;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.activity.UiProfileHolder$forEach$$inlined$suspendDisposable$1$1", f = "UiProfileHolder.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class UiProfileHolder$forEach$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $listener$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiProfileHolder$forEach$$inlined$suspendDisposable$1$1(tls tlsVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$listener$inlined = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UiProfileHolder$forEach$$inlined$suspendDisposable$1$1 uiProfileHolder$forEach$$inlined$suspendDisposable$1$1 = new UiProfileHolder$forEach$$inlined$suspendDisposable$1$1(this.$listener$inlined, this.this$0, continuation);
        uiProfileHolder$forEach$$inlined$suspendDisposable$1$1.L$0 = obj;
        return uiProfileHolder$forEach$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UiProfileHolder$forEach$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = this.this$0.b;
            t24 t24Var = new t24(23, this.$listener$inlined);
            this.label = 1;
            if (mthVar.collect(t24Var, this) == coroutineSingletons) {
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
