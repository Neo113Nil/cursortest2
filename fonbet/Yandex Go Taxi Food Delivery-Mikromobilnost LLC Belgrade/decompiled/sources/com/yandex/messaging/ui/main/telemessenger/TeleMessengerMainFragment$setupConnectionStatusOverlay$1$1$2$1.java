package com.yandex.messaging.ui.main.telemessenger;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc020;", "<anonymous>", "()Lc020;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1", f = "TeleMessengerMainFragment.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ TeleMessengerMainFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1(TeleMessengerMainFragment teleMessengerMainFragment, Continuation continuation) {
        super(1, continuation);
        this.this$0 = teleMessengerMainFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh activityComponentAsync;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        activityComponentAsync = this.this$0.getActivityComponentAsync();
        this.label = 1;
        Object k = activityComponentAsync.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
