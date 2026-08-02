package com.yandex.go.scooters.ble.data.ninebot;

import defpackage.k2o0;
import defpackage.ka;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zom0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ble.data.ninebot.ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1", f = "ScootersBleNinebotRepository.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ zom0 $connection;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1(zom0 zom0Var, Continuation continuation) {
        super(2, continuation);
        this.$connection = zom0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1(this.$connection, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersBleNinebotRepository$sendCommandWaitingResponse$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ka kaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ka b = k2o0.c().b();
            lz40 lz40Var = this.$connection.d;
            this.L$0 = b;
            this.label = 1;
            Object y = e.y(lz40Var, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = y;
            kaVar = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kaVar = (ka) this.L$0;
            b.b(obj);
        }
        return kaVar.g((byte[]) obj);
    }
}
