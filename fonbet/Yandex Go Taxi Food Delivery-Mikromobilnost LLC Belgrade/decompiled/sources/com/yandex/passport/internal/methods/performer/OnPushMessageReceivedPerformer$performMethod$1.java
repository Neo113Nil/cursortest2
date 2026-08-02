package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.push.PushPayload;
import com.yandex.passport.internal.push.PushPayloadHolder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/push/PushPayloadHolder;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/push/PushPayloadHolder;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.OnPushMessageReceivedPerformer$performMethod$1", f = "OnPushMessageReceivedPerformer.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class OnPushMessageReceivedPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ c2 $method;
    long J$0;
    int label;
    final /* synthetic */ a1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnPushMessageReceivedPerformer$performMethod$1(a1 a1Var, c2 c2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a1Var;
        this.$method = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnPushMessageReceivedPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnPushMessageReceivedPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            com.yandex.passport.internal.push.h hVar = this.this$0.a;
            Bundle bundle = (Bundle) this.$method.b.c;
            this.J$0 = elapsedRealtimeNanos;
            this.label = 1;
            obj = hVar.i(bundle, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = elapsedRealtimeNanos;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.J$0;
            kotlin.b.b(obj);
            j = j2;
        }
        return new PushPayloadHolder((PushPayload) obj, j, SystemClock.elapsedRealtimeNanos());
    }
}
