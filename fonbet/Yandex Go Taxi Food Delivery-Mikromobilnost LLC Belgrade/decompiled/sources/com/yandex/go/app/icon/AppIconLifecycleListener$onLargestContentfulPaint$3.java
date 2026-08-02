package com.yandex.go.app.icon;

import androidx.lifecycle.Lifecycle;
import defpackage.b7;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.app.icon.AppIconLifecycleListener$onLargestContentfulPaint$3", f = "AppIconLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AppIconLifecycleListener$onLargestContentfulPaint$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIconLifecycleListener$onLargestContentfulPaint$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppIconLifecycleListener$onLargestContentfulPaint$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AppIconLifecycleListener$onLargestContentfulPaint$3 appIconLifecycleListener$onLargestContentfulPaint$3 = (AppIconLifecycleListener$onLargestContentfulPaint$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        appIconLifecycleListener$onLargestContentfulPaint$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        cey.a(cVar.a, Lifecycle.Event.ON_STOP, new b7(9, cVar));
        return zy11.a;
    }
}
