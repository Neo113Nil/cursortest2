package com.yandex.messaging.activity.calls;

import defpackage.fcg;
import defpackage.mt11;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p020;
import defpackage.pi00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.activity.calls.MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1", f = "MessengerCallFeedbackActivity.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ MessengerCallFeedbackActivity this$0;
    final /* synthetic */ p020 this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1(p020 p020Var, Continuation continuation, MessengerCallFeedbackActivity messengerCallFeedbackActivity) {
        super(2, continuation);
        this.this$0$inline_fun = p020Var;
        this.this$0 = messengerCallFeedbackActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1(this.this$0$inline_fun, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerCallFeedbackActivity$onCreate$$inlined$forEachComponent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        p020 p020Var = this.this$0$inline_fun;
        MessengerCallFeedbackActivity messengerCallFeedbackActivity = p020Var.a;
        mth mthVar = ((fcg) mt11.a(messengerCallFeedbackActivity)).b().b;
        MessengerCallFeedbackActivity messengerCallFeedbackActivity2 = p020Var.c;
        pi00 pi00Var = new pi00(4, this.this$0);
        this.label = 1;
        Object collect = mthVar.collect(new a(pi00Var, messengerCallFeedbackActivity2, messengerCallFeedbackActivity, p020Var), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
