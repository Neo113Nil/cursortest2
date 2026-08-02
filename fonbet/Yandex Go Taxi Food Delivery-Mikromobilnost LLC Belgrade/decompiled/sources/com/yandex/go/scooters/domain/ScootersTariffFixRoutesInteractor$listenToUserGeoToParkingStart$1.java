package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmo21;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1", f = "ScootersTariffFixRoutesInteractor.kt", l = {30, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1(f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1 scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1 = new ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1(this.this$0, continuation);
        scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1.L$0 = obj;
        return scootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffFixRoutesInteractor$listenToUserGeoToParkingStart$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
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
            po21 po21Var = this.this$0.c;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
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
