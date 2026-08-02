package com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import androidx.camera.core.f;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.camera.ml.b;
import com.yandex.go.masstransit.sdk.camera.ml.c;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import defpackage.m52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tse;
import defpackage.ueg0;
import defpackage.ugd0;
import defpackage.weg0;
import defpackage.wls;
import defpackage.xeg0;
import defpackage.ycg0;
import defpackage.yeg0;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.QrScanCameraHostKt$QrScanCameraHost$3$1", f = "QrScanCameraHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class QrScanCameraHostKt$QrScanCameraHost$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $cameraPreview$delegate;
    final /* synthetic */ oz40 $mlCameraController$delegate;
    final /* synthetic */ tls $onAction;
    final /* synthetic */ ycg0 $qrRecognitionInteractor;
    final /* synthetic */ yeg0 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrScanCameraHostKt$QrScanCameraHost$3$1(yeg0 yeg0Var, ycg0 ycg0Var, oz40 oz40Var, oz40 oz40Var2, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$uiState = yeg0Var;
        this.$qrRecognitionInteractor = ycg0Var;
        this.$cameraPreview$delegate = oz40Var;
        this.$mlCameraController$delegate = oz40Var2;
        this.$onAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrScanCameraHostKt$QrScanCameraHost$3$1(this.$uiState, this.$qrRecognitionInteractor, this.$cameraPreview$delegate, this.$mlCameraController$delegate, this.$onAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        QrScanCameraHostKt$QrScanCameraHost$3$1 qrScanCameraHostKt$QrScanCameraHost$3$1 = (QrScanCameraHostKt$QrScanCameraHost$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        qrScanCameraHostKt$QrScanCameraHost$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) this.$cameraPreview$delegate.getValue();
        zy11 zy11Var = zy11.a;
        if (mtQRCameraPreview != null && (bVar = (b) this.$mlCameraController$delegate.getValue()) != null) {
            xeg0 xeg0Var = this.$uiState.a;
            if (xeg0Var instanceof weg0) {
                mtQRCameraPreview.leaveQrRect();
                mtQRCameraPreview.setActive(true);
                bVar.d = new c(this.$qrRecognitionInteractor, new ugd0(22, mtQRCameraPreview, this.$onAction));
                if (!mtQRCameraPreview.isLaidOut() || mtQRCameraPreview.isLayoutRequested()) {
                    mtQRCameraPreview.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.QrScanCameraHostKt$QrScanCameraHost$3$1$invokeSuspend$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            b.this.c(new Size(mtQRCameraPreview.getWidth() != 0 ? mtQRCameraPreview.getWidth() : 1080, mtQRCameraPreview.getHeight() != 0 ? mtQRCameraPreview.getHeight() : 2080));
                            b bVar2 = b.this;
                            f fVar = bVar2.g;
                            if (fVar != null) {
                                fVar.N((ExecutorService) bVar2.h.getValue(), new m52(1, bVar2));
                            }
                        }
                    });
                    return zy11Var;
                }
                bVar.c(new Size(mtQRCameraPreview.getWidth() != 0 ? mtQRCameraPreview.getWidth() : 1080, mtQRCameraPreview.getHeight() != 0 ? mtQRCameraPreview.getHeight() : 2080));
                f fVar = bVar.g;
                if (fVar != null) {
                    fVar.N((ExecutorService) bVar.h.getValue(), new m52(1, bVar));
                    return zy11Var;
                }
            } else if (xeg0Var instanceof ueg0) {
                Rect rect = ((ueg0) xeg0Var).a;
                rect.set(rect.left + 8, rect.top + 8, rect.right - 8, rect.bottom - 8);
                mtQRCameraPreview.grabQrRect(rect);
                bVar.f.a.i(Lifecycle.State.CREATED);
            }
        }
        return zy11Var;
    }
}
