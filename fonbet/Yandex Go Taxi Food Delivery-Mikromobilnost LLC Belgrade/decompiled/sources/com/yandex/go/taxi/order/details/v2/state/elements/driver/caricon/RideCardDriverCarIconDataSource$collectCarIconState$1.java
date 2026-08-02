package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogk0;
import defpackage.pkf;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Logk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon.RideCardDriverCarIconDataSource$collectCarIconState$1", f = "RideCardDriverCarIconDataSource.kt", l = {18, 20, 22, 23, 24}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverCarIconDataSource$collectCarIconState$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardDriverCarIconRepository$DriverCarType $driverCarType;
    final /* synthetic */ CarImageDto $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverCarIconDataSource$collectCarIconState$1(a aVar, CarImageDto carImageDto, RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = carImageDto;
        this.$driverCarType = rideCardDriverCarIconRepository$DriverCarType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDriverCarIconDataSource$collectCarIconState$1 rideCardDriverCarIconDataSource$collectCarIconState$1 = new RideCardDriverCarIconDataSource$collectCarIconState$1(this.this$0, this.$dto, this.$driverCarType, continuation);
        rideCardDriverCarIconDataSource$collectCarIconState$1.L$0 = obj;
        return rideCardDriverCarIconDataSource$collectCarIconState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverCarIconDataSource$collectCarIconState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e1, code lost:
    
        if (r0.emit(r2, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0.emit(r2, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r12 == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.a;
            CarImageDto carImageDto = this.$dto;
            RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType = this.$driverCarType;
            this.L$0 = vprVar;
            this.label = 1;
            bVar.d.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new RideCardDriverCarIconRepository$takeCachedIcon$2(carImageDto, bVar, rideCardDriverCarIconRepository$DriverCarType, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        b bVar2 = this.this$0.a;
                        CarImageDto carImageDto2 = this.$dto;
                        RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType2 = this.$driverCarType;
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.label = 4;
                        bVar2.d.getClass();
                        sjh sjhVar2 = uyj.a;
                        obj = tje.k0(mdh.b, new RideCardDriverCarIconRepository$loadIcon$2(carImageDto2, bVar2, rideCardDriverCarIconRepository$DriverCarType2, null), this);
                    } else if (i == 4) {
                        kotlin.b.b(obj);
                        a aVar = this.this$0;
                        CarImageDto carImageDto3 = this.$dto;
                        aVar.getClass();
                        ogk0 ogk0Var = new ogk0(pkf.g((Drawable) obj, String.valueOf(carImageDto3), null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            a aVar2 = this.this$0;
            CarImageDto carImageDto4 = this.$dto;
            aVar2.getClass();
            ogk0 ogk0Var2 = new ogk0(pkf.g(drawable, String.valueOf(carImageDto4), null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            ogk0 ogk0Var3 = ogk0.b;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
