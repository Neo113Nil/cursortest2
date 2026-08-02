package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import android.graphics.drawable.Drawable;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconRepository$loadIcon$2", f = "RideCardDriverCarIconRepository.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverCarIconRepository$loadIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardDriverCarIconRepository$DriverCarType $driverCarType;
    final /* synthetic */ CarImageDto $dto;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverCarIconRepository$loadIcon$2(CarImageDto carImageDto, b bVar, RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType, Continuation continuation) {
        super(2, continuation);
        this.$dto = carImageDto;
        this.this$0 = bVar;
        this.$driverCarType = rideCardDriverCarIconRepository$DriverCarType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverCarIconRepository$loadIcon$2(this.$dto, this.this$0, this.$driverCarType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverCarIconRepository$loadIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CarImageDto.CarImageLayers carImageLayers;
        RideCardDriverCarIconRepository$loadIcon$2 rideCardDriverCarIconRepository$loadIcon$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CarImageDto carImageDto = this.$dto;
            if (carImageDto == null || (carImageLayers = carImageDto.b) == null) {
                return this.this$0.b(this.$driverCarType);
            }
            String str = carImageDto.a;
            if (str == null) {
                return this.this$0.b(this.$driverCarType);
            }
            Integer S = q5z.S(str);
            b bVar = this.this$0;
            RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType = this.$driverCarType;
            if (S == null) {
                return bVar.b(rideCardDriverCarIconRepository$DriverCarType);
            }
            int intValue = S.intValue();
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = intValue;
            this.label = 1;
            rideCardDriverCarIconRepository$loadIcon$2 = this;
            obj = b.a(bVar, carImageLayers, str, intValue, false, rideCardDriverCarIconRepository$DriverCarType, rideCardDriverCarIconRepository$loadIcon$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            rideCardDriverCarIconRepository$loadIcon$2 = this;
        }
        Drawable drawable = (Drawable) obj;
        return drawable == null ? rideCardDriverCarIconRepository$loadIcon$2.this$0.b(rideCardDriverCarIconRepository$loadIcon$2.$driverCarType) : drawable;
    }
}
