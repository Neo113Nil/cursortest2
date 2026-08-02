package com.yandex.go.broadcast;

import android.content.Context;
import defpackage.eit;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wfi0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.broadcast.ActivityBroadcastsLifecycleListener$onActivityCreate$1", f = "ActivityBroadcastsLifecycleListener.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ActivityBroadcastsLifecycleListener$onActivityCreate$1 extends SuspendLambda implements wls {
    final /* synthetic */ LocalTimeChangedReceiver $timeChangedReceiver;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityBroadcastsLifecycleListener$onActivityCreate$1(a aVar, LocalTimeChangedReceiver localTimeChangedReceiver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$timeChangedReceiver = localTimeChangedReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActivityBroadcastsLifecycleListener$onActivityCreate$1(this.this$0, this.$timeChangedReceiver, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityBroadcastsLifecycleListener$onActivityCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            a aVar = this.this$0;
            wfi0 wfi0Var = aVar.c;
            Context context = aVar.a;
            LocalTimeChangedReceiver localTimeChangedReceiver = this.$timeChangedReceiver;
            ((eit) wfi0Var).getClass();
            context.unregisterReceiver(localTimeChangedReceiver);
            throw th;
        }
    }
}
