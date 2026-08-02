package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconRepository$takeCachedIcon$2", f = "RideCardDriverCarIconRepository.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverCarIconRepository$takeCachedIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardDriverCarIconRepository$DriverCarType $driverCarType;
    final /* synthetic */ CarImageDto $dto;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverCarIconRepository$takeCachedIcon$2(CarImageDto carImageDto, b bVar, RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType, Continuation continuation) {
        super(2, continuation);
        this.$dto = carImageDto;
        this.this$0 = bVar;
        this.$driverCarType = rideCardDriverCarIconRepository$DriverCarType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverCarIconRepository$takeCachedIcon$2(this.$dto, this.this$0, this.$driverCarType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverCarIconRepository$takeCachedIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CarImageDto.CarImageLayers carImageLayers;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        CarImageDto carImageDto = this.$dto;
        if (carImageDto != null && (carImageLayers = carImageDto.b) != null && (str = carImageDto.a) != null) {
            if (str.equals(this.this$0.g.a)) {
                return this.this$0.g.b;
            }
            Integer S = q5z.S(str);
            if (S != null) {
                int intValue = S.intValue();
                b bVar = this.this$0;
                RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType = this.$driverCarType;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = intValue;
                this.label = 1;
                Object a = b.a(bVar, carImageLayers, str, intValue, true, rideCardDriverCarIconRepository$DriverCarType, this);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        return null;
    }
}
