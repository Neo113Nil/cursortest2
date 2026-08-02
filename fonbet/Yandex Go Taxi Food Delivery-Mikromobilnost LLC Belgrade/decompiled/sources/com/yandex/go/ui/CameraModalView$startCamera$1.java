package com.yandex.go.ui;

import defpackage.co7;
import defpackage.er7;
import defpackage.mvg;
import defpackage.noh;
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
@mvg(c = "com.yandex.go.ui.CameraModalView$startCamera$1", f = "CameraModalView.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CameraModalView$startCamera$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ CameraModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraModalView$startCamera$1(CameraModalView cameraModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cameraModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraModalView$startCamera$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraModalView$startCamera$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        er7 er7Var;
        xs7 xs7Var;
        CameraPreview cameraPreview;
        w8v imageCapture;
        CameraModalView cameraModalView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CameraModalView cameraModalView2 = this.this$0;
            nohVar = cameraModalView2.cameraProviderDeferred;
            er7Var = this.this$0.cameraLifecycleOwner;
            xs7Var = this.this$0.cameraSelector;
            cameraPreview = this.this$0.cameraPreview;
            imageCapture = this.this$0.getImageCapture();
            this.L$0 = cameraModalView2;
            this.label = 1;
            Object e = ru.yandex.taxi.camera.ml.a.e(nohVar, er7Var, xs7Var, cameraPreview, imageCapture, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = e;
            cameraModalView = cameraModalView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cameraModalView = (CameraModalView) this.L$0;
            kotlin.b.b(obj);
        }
        cameraModalView.camera = (co7) obj;
        return zy11.a;
    }
}
