package com.yandex.go.taxi.order.chat.domain;

import defpackage.a3y0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.domain.TaxiOrderChatMessagesRepositoryImpl$postAction$1", f = "TaxiOrderChatMessagesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderChatMessagesRepositoryImpl$postAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $action;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderChatMessagesRepositoryImpl$postAction$1(Runnable runnable, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$action = runnable;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderChatMessagesRepositoryImpl$postAction$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderChatMessagesRepositoryImpl$postAction$1 taxiOrderChatMessagesRepositoryImpl$postAction$1 = (TaxiOrderChatMessagesRepositoryImpl$postAction$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderChatMessagesRepositoryImpl$postAction$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Runnable runnable = this.$action;
        a aVar = this.this$0;
        try {
            runnable.run();
            aVar.m.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar = jst.e;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            aVar.m.b("postAction", th, new mpx0(8));
        }
        return zy11.a;
    }
}
