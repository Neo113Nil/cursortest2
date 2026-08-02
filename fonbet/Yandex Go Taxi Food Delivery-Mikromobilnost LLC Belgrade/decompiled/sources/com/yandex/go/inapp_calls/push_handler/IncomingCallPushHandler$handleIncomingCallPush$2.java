package com.yandex.go.inapp_calls.push_handler;

import com.yandex.go.inapp_calls.repository.c;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.pjv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.push_handler.IncomingCallPushHandler$handleIncomingCallPush$2", f = "IncomingCallPushHandler.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IncomingCallPushHandler$handleIncomingCallPush$2 extends SuspendLambda implements wls {
    final /* synthetic */ pjv $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingCallPushHandler$handleIncomingCallPush$2(a aVar, pjv pjvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = pjvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IncomingCallPushHandler$handleIncomingCallPush$2(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IncomingCallPushHandler$handleIncomingCallPush$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = (c) this.this$0.a.get();
            pjv pjvVar = this.$payload;
            this.label = 1;
            d = cVar.d(pjvVar, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        Throwable a = Result.a(d);
        if (a != null) {
            aVar.e.getClass();
            njv.i(a);
        }
        return new Result(d);
    }
}
