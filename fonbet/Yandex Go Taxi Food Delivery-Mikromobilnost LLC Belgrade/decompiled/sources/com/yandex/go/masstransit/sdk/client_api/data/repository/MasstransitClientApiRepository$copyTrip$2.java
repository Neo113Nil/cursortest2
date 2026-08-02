package com.yandex.go.masstransit.sdk.client_api.data.repository;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.gtq0;
import defpackage.jo2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.ws00;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljo2;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "<anonymous>", "(Ltse;)Ljo2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.client_api.data.repository.MasstransitClientApiRepository$copyTrip$2", f = "MasstransitClientApiRepository.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MasstransitClientApiRepository$copyTrip$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $tripId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitClientApiRepository$copyTrip$2(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tripId = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitClientApiRepository$copyTrip$2(this.this$0, this.$tripId, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitClientApiRepository$copyTrip$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                try {
                    cmt<CheckoutScreenStateDto> b = a.a(aVar2).b(this.$tripId, a.c(aVar2, this.$idempotencyToken));
                    ws00 ws00Var = new ws00(8);
                    this.L$0 = aVar2;
                    this.label = 1;
                    Object b2 = ru.yandex.taxi.network.api.a.b(b, ws00Var, this);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b2;
                    aVar = aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    xby.d.h("MasstransitCheckout", "Failed masstransit checkout trip copy", th);
                    Throwable b3 = a.b(aVar, th);
                    return new jo2(new Result.Failure(b3), gtq0.y(s8o.O(th)));
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    xby.d.h("MasstransitCheckout", "Failed masstransit checkout trip copy", th);
                    Throwable b32 = a.b(aVar, th);
                    return new jo2(new Result.Failure(b32), gtq0.y(s8o.O(th)));
                }
            }
            fmt fmtVar = (fmt) obj;
            return new jo2(fmtVar.a, fmtVar.e.a("X-YaMasstransitRequestId"));
        } catch (CancellationException e) {
            throw e;
        }
    }
}
