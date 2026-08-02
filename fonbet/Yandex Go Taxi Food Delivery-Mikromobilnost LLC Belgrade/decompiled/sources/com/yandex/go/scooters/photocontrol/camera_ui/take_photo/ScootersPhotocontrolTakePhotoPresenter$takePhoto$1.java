package com.yandex.go.scooters.photocontrol.camera_ui.take_photo;

import com.yandex.go.scooters.photocontrol.domain.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fjo0;
import defpackage.gio0;
import defpackage.gjo0;
import defpackage.iio0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qan0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoPresenter$takePhoto$1", f = "ScootersPhotocontrolTakePhotoPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolTakePhotoPresenter$takePhoto$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gjo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolTakePhotoPresenter$takePhoto$1(gjo0 gjo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gjo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotocontrolTakePhotoPresenter$takePhoto$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolTakePhotoPresenter$takePhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iio0 iio0Var;
        gjo0 gjo0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                gjo0 gjo0Var2 = this.this$0;
                iio0 iio0Var2 = gjo0Var2.B;
                try {
                    h hVar = gjo0Var2.x;
                    qan0 qan0Var = new qan0(1, gjo0Var2.A);
                    this.L$0 = gjo0Var2;
                    this.L$1 = iio0Var2;
                    this.label = 1;
                    if (hVar.a(qan0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gjo0Var = gjo0Var2;
                    iio0Var = iio0Var2;
                } catch (Throwable th) {
                    th = th;
                    iio0Var = iio0Var2;
                    ((gio0) iio0Var).a(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iio0Var = (iio0) this.L$1;
                gjo0Var = (gjo0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    ((gio0) iio0Var).a(th);
                    return zy11.a;
                }
            }
            ((fjo0) gjo0Var.Dg()).e();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
