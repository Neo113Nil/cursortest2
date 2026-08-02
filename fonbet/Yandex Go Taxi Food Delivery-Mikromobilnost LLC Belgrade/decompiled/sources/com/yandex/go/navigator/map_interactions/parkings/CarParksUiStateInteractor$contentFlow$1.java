package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.CarParksUiStateInteractor$contentFlow$1", f = "CarParksUiStateInteractor.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksUiStateInteractor$contentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarParksUiStateInteractor$contentFlow$1(h hVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarParksUiStateInteractor$contentFlow$1 carParksUiStateInteractor$contentFlow$1 = new CarParksUiStateInteractor$contentFlow$1(this.this$0, this.$geoPoint, continuation);
        carParksUiStateInteractor$contentFlow$1.L$0 = obj;
        return carParksUiStateInteractor$contentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarParksUiStateInteractor$contentFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7 == r1) goto L15;
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
            com.yandex.go.navigator.utils.d dVar = this.this$0.b;
            Point d = cwa1.d(this.$geoPoint);
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = dVar.b(d, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
