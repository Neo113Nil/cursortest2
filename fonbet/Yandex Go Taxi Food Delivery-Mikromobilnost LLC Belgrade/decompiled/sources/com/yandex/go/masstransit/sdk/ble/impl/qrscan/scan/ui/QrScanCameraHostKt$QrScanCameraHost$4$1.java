package com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yeg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.QrScanCameraHostKt$QrScanCameraHost$4$1", f = "QrScanCameraHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class QrScanCameraHostKt$QrScanCameraHost$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $mlCameraController$delegate;
    final /* synthetic */ yeg0 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrScanCameraHostKt$QrScanCameraHost$4$1(yeg0 yeg0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$uiState = yeg0Var;
        this.$mlCameraController$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrScanCameraHostKt$QrScanCameraHost$4$1(this.$uiState, this.$mlCameraController$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        QrScanCameraHostKt$QrScanCameraHost$4$1 qrScanCameraHostKt$QrScanCameraHost$4$1 = (QrScanCameraHostKt$QrScanCameraHost$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        qrScanCameraHostKt$QrScanCameraHost$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.go.masstransit.sdk.camera.ml.b bVar = (com.yandex.go.masstransit.sdk.camera.ml.b) this.$mlCameraController$delegate.getValue();
        if (bVar != null) {
            bVar.b(this.$uiState.c);
        }
        return zy11.a;
    }
}
