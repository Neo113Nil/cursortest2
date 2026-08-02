package com.yandex.go.pickup_from_photo.presentation;

import defpackage.er7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.camera.CameraPreview;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.CameraController$start$2", f = "CameraController.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CameraController$start$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraController$start$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraController$start$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraController$start$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            er7 er7Var = bVar2.i;
            xs7 xs7Var = bVar2.h;
            CameraPreview cameraPreview = bVar2.c;
            w8v w8vVar = bVar2.d;
            this.L$0 = bVar2;
            this.label = 1;
            obj = b.a(bVar2, er7Var, xs7Var, cameraPreview, w8vVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        bVar.getClass();
        return zy11.a;
    }
}
