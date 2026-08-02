package com.yandex.go.masstransit.sdk.camera.ml;

import android.util.Size;
import androidx.camera.core.f;
import com.yandex.go.masstransit.sdk.camera.view.BaseCameraPreview;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.asj0;
import defpackage.bsj0;
import defpackage.co7;
import defpackage.csj0;
import defpackage.fr7;
import defpackage.m52;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.camera.ml.MlCameraController$start$1", f = "MlCameraController.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MlCameraController$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ Size $resolution;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlCameraController$start$1(Size size, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$resolution = size;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MlCameraController$start$1(this.$resolution, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MlCameraController$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MlCameraController$start$1 mlCameraController$start$1;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        co7 co7Var = null;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            Size size = this.$resolution;
            asj0 asj0Var = new asj0();
            asj0Var.b = new csj0(3, size);
            bsj0 a = asj0Var.a();
            v7v v7vVar = new v7v();
            v7vVar.h(a);
            f f = v7vVar.f();
            b bVar2 = this.this$0;
            bVar2.g = f;
            noh nohVar = bVar2.e;
            fr7 fr7Var = bVar2.f;
            xs7 xs7Var = xs7.c;
            BaseCameraPreview baseCameraPreview = bVar2.a;
            this.L$0 = null;
            this.L$1 = bVar2;
            this.label = 1;
            mlCameraController$start$1 = this;
            Object a2 = a.a(nohVar, fr7Var, xs7Var, baseCameraPreview, f, mlCameraController$start$1);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            obj = a2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$1;
            kotlin.b.b(obj);
            mlCameraController$start$1 = this;
        }
        co7 co7Var2 = (co7) obj;
        if (co7Var2 != null) {
            b bVar3 = mlCameraController$start$1.this$0;
            f fVar = bVar3.g;
            if (fVar != null) {
                fVar.N((ExecutorService) bVar3.h.getValue(), new m52(i2, bVar3));
            }
            co7Var = co7Var2;
        }
        bVar.i = co7Var;
        return zy11.a;
    }
}
