package com.yandex.go.masstransit.sdk.client_api.data.repository;

import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResponseDto;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljo2;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResponseDto;", "<anonymous>", "(Ltse;)Ljo2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.client_api.data.repository.MasstransitClientApiRepository$searchFull$2", f = "MasstransitClientApiRepository.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MasstransitClientApiRepository$searchFull$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $location;
    final /* synthetic */ SearchRequestDto $request;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitClientApiRepository$searchFull$2(a aVar, String str, SearchRequestDto searchRequestDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$location = str;
        this.$request = searchRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitClientApiRepository$searchFull$2(this.this$0, this.$location, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitClientApiRepository$searchFull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                    cmt<SearchResponseDto> c = a.a(aVar2).c(this.$location, this.$request);
                    ws00 ws00Var = new ws00(12);
                    this.L$0 = aVar2;
                    this.label = 1;
                    Object b = ru.yandex.taxi.network.api.a.b(c, ws00Var, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    aVar = aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    xby.d.h("MasstransitCheckout", "Failed masstransit checkout search", th);
                    aVar.getClass();
                    return new jo2(new Result.Failure(th), gtq0.y(s8o.O(th)));
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
                    xby.d.h("MasstransitCheckout", "Failed masstransit checkout search", th);
                    aVar.getClass();
                    return new jo2(new Result.Failure(th), gtq0.y(s8o.O(th)));
                }
            }
            fmt fmtVar = (fmt) obj;
            return new jo2(fmtVar.a, fmtVar.e.a("X-YaMasstransitRequestId"));
        } catch (CancellationException e) {
            throw e;
        }
    }
}
