package com.yandex.go.scooters.parking;

import defpackage.bco0;
import defpackage.eco0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xbo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.parking.ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1", f = "ScootersParkingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ eco0 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1(tls tlsVar, eco0 eco0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$uiState = eco0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1(this.$action, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1 scootersParkingScreenKt$ScootersParkingScreen$1$1$2$1 = (ScootersParkingScreenKt$ScootersParkingScreen$1$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersParkingScreenKt$ScootersParkingScreen$1$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = this.$action;
        eco0 eco0Var = this.$uiState;
        tlsVar.invoke(new xbo0(eco0Var.d instanceof bco0, eco0Var.e));
        return zy11.a;
    }
}
