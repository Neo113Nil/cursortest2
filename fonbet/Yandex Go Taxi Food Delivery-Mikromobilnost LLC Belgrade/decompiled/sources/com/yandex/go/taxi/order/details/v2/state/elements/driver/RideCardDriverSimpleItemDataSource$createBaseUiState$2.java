package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DriverInfoSimple;
import defpackage.hgk0;
import defpackage.jik0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogk0;
import defpackage.s9k0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljik0;", "<anonymous>", "(Ltse;)Ljik0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.RideCardDriverSimpleItemDataSource$createBaseUiState$2", f = "RideCardDriverSimpleItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSimpleItemDataSource$createBaseUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$DriverInfoSimple $dto;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSimpleItemDataSource$createBaseUiState$2(RideCardItemDto$DriverInfoSimple rideCardItemDto$DriverInfoSimple, Continuation continuation) {
        super(2, continuation);
        this.$dto = rideCardItemDto$DriverInfoSimple;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSimpleItemDataSource$createBaseUiState$2(this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverSimpleItemDataSource$createBaseUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        RideCardItemDto$DriverInfoSimple rideCardItemDto$DriverInfoSimple = this.$dto;
        String str = rideCardItemDto$DriverInfoSimple.a;
        String str2 = rideCardItemDto$DriverInfoSimple.b;
        String str3 = rideCardItemDto$DriverInfoSimple.e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        ogk0 ogk0Var = ogk0.b;
        ogk0 ogk0Var2 = ogk0.b;
        hgk0 hgk0Var = hgk0.c;
        return new jik0(str, str2, str4, ogk0Var2, hgk0.c, s9k0.a);
    }
}
