package com.yandex.go.taxi.order.chat.data;

import defpackage.hzx0;
import defpackage.mpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.data.TaxiOrderChatRepository$AutoPolling$nextPull$2", f = "TaxiOrderChatRepository.kt", l = {417}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderChatRepository$AutoPolling$nextPull$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderChatRepository$AutoPolling$nextPull$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderChatRepository$AutoPolling$nextPull$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderChatRepository$AutoPolling$nextPull$2) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                try {
                    hzx0 j = bVar2.j();
                    this.L$0 = bVar2;
                    this.L$1 = null;
                    this.label = 1;
                    if (bVar2.f(j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    bVar.i.b("nextPull", th, new mpx0(9));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    bVar.i.b("nextPull", th, new mpx0(9));
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
