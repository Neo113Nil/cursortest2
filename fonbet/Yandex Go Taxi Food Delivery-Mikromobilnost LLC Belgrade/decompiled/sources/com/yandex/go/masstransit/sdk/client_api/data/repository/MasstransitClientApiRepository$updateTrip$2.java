package com.yandex.go.masstransit.sdk.client_api.data.repository;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.TripUpdateRequestDto;
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
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Ljo2;", "Lkotlin/Pair;", "", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "<anonymous>", "(Ltse;)Ljo2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.client_api.data.repository.MasstransitClientApiRepository$updateTrip$2", f = "MasstransitClientApiRepository.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MasstransitClientApiRepository$updateTrip$2 extends SuspendLambda implements wls {
    final /* synthetic */ TripUpdateRequestDto $body;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $tripId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitClientApiRepository$updateTrip$2(a aVar, String str, String str2, TripUpdateRequestDto tripUpdateRequestDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tripId = str;
        this.$idempotencyToken = str2;
        this.$body = tripUpdateRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitClientApiRepository$updateTrip$2(this.this$0, this.$tripId, this.$idempotencyToken, this.$body, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitClientApiRepository$updateTrip$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                String str = this.$tripId;
                String str2 = this.$idempotencyToken;
                try {
                    cmt<CheckoutScreenStateDto> g = a.a(aVar2).g(str, a.c(aVar2, str2), this.$body);
                    ws00 ws00Var = new ws00(13);
                    this.L$0 = aVar2;
                    this.label = 1;
                    Object b = ru.yandex.taxi.network.api.a.b(g, ws00Var, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    aVar = aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    xby.d.h("MasstransitCheckout", "Failed to update masstransit checkout trip", th);
                    Throwable b2 = a.b(aVar, th);
                    return new jo2(new Result.Failure(b2), gtq0.y(s8o.O(th)));
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
                    xby.d.h("MasstransitCheckout", "Failed to update masstransit checkout trip", th);
                    Throwable b22 = a.b(aVar, th);
                    return new jo2(new Result.Failure(b22), gtq0.y(s8o.O(th)));
                }
            }
            fmt fmtVar = (fmt) obj;
            return new jo2(new Pair(new Integer(fmtVar.b), fmtVar.a), fmtVar.e.a("X-YaMasstransitRequestId"));
        } catch (CancellationException e) {
            throw e;
        }
    }
}
