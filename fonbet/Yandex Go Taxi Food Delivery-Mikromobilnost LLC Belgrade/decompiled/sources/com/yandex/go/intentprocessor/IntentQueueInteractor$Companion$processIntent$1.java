package com.yandex.go.intentprocessor;

import android.content.Intent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.x7w;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loep0;", "Landroid/content/Intent;", "intent", "Lo5u;", "<anonymous>", "(Loep0;Landroid/content/Intent;)Lo5u;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.IntentQueueInteractor$Companion$processIntent$1", f = "IntentQueueInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class IntentQueueInteractor$Companion$processIntent$1 extends SuspendLambda implements zls {
    final /* synthetic */ x7w $this_processIntent;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentQueueInteractor$Companion$processIntent$1(x7w x7wVar, Continuation continuation) {
        super(3, continuation);
        this.$this_processIntent = x7wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntentQueueInteractor$Companion$processIntent$1 intentQueueInteractor$Companion$processIntent$1 = new IntentQueueInteractor$Companion$processIntent$1(this.$this_processIntent, (Continuation) obj3);
        intentQueueInteractor$Companion$processIntent$1.L$0 = (oep0) obj;
        intentQueueInteractor$Companion$processIntent$1.L$1 = (Intent) obj2;
        return intentQueueInteractor$Companion$processIntent$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oep0 oep0Var = (oep0) this.L$0;
        Intent intent = (Intent) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x7w x7wVar = this.$this_processIntent;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = x7wVar.a(oep0Var, intent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (o5u) obj;
    }
}
