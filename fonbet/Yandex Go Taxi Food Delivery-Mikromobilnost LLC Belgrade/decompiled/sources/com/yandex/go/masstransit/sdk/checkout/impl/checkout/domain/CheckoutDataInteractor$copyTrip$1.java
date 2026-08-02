package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import defpackage.afp0;
import defpackage.akb;
import defpackage.b64;
import defpackage.cnb;
import defpackage.enb;
import defpackage.fnb;
import defpackage.jo2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rmb;
import defpackage.tse;
import defpackage.wls;
import defpackage.xmb;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.CheckoutDataInteractor$copyTrip$1", f = "CheckoutDataInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CheckoutDataInteractor$copyTrip$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tripId;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDataInteractor$copyTrip$1(k kVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$tripId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDataInteractor$copyTrip$1(this.this$0, this.$tripId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDataInteractor$copyTrip$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cnb c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.a.e(rmb.a);
            com.yandex.go.masstransit.sdk.client_api.a aVar = this.this$0.e;
            String str = this.$tripId;
            this.label = 1;
            obj = aVar.c(str, this);
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
        jo2 jo2Var = (jo2) obj;
        k kVar = this.this$0;
        fnb fnbVar = kVar.a;
        enb enbVar = kVar.c;
        String str2 = this.$tripId;
        Object obj2 = jo2Var.a;
        Throwable a = Result.a(obj2);
        String str3 = jo2Var.b;
        if (a == null) {
            c = enb.f(enbVar, (afp0) obj2, false, str3, null, 10);
        } else {
            c = enb.c(str2, str3, a);
            if (c == null) {
                c = new xmb(str2, str3, new akb(CheckoutErrorReason.TripCopyFailure, str3, str2, null, b64.l("trip_copy:", str2, ":", str3)));
            }
        }
        fnbVar.e(c);
        return zy11.a;
    }
}
