package com.yandex.go.scooters.offer_on_camera.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qpo0;
import defpackage.uoo0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqpo0;", "qrScanNumber", "", "cardHeight", "<anonymous>", "(Lqpo0;I)Lqpo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offer_on_camera.domain.ScootersOfferOnCameraInteractor$listenQrNumberResult$1", f = "ScootersOfferOnCameraInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferOnCameraInteractor$listenQrNumberResult$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferOnCameraInteractor$listenQrNumberResult$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ScootersOfferOnCameraInteractor$listenQrNumberResult$1 scootersOfferOnCameraInteractor$listenQrNumberResult$1 = new ScootersOfferOnCameraInteractor$listenQrNumberResult$1(this.this$0, (Continuation) obj3);
        scootersOfferOnCameraInteractor$listenQrNumberResult$1.L$0 = (qpo0) obj;
        scootersOfferOnCameraInteractor$listenQrNumberResult$1.I$0 = intValue;
        return scootersOfferOnCameraInteractor$listenQrNumberResult$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qpo0 qpo0Var = (qpo0) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                b.b(obj);
                return qpo0Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        uoo0 uoo0Var = this.this$0.c;
        this.L$0 = qpo0Var;
        this.I$0 = i;
        this.label = 1;
        uoo0Var.Cg(Integer.valueOf(i), this);
        return zy11.a == coroutineSingletons ? coroutineSingletons : qpo0Var;
    }
}
