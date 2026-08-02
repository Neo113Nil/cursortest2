package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.util.Size;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1z0;
import defpackage.tse;
import defpackage.v1z0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1", f = "TicketActivationScanModalScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ MtQRCameraPreview $cameraPreviewView;
    final /* synthetic */ boolean $isMlDetectionActive;
    final /* synthetic */ com.yandex.go.masstransit.sdk.camera.ml.b $mlCameraController;
    final /* synthetic */ v1z0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1(boolean z, MtQRCameraPreview mtQRCameraPreview, com.yandex.go.masstransit.sdk.camera.ml.b bVar, v1z0 v1z0Var, Continuation continuation) {
        super(2, continuation);
        this.$isMlDetectionActive = z;
        this.$cameraPreviewView = mtQRCameraPreview;
        this.$mlCameraController = bVar;
        this.$state = v1z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1(this.$isMlDetectionActive, this.$cameraPreviewView, this.$mlCameraController, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1 = (TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ticketActivationScanModalScreenKt$TicketActivationScanModalScreen$2$1.invokeSuspend(zy11Var);
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
        if (this.$isMlDetectionActive) {
            this.$cameraPreviewView.leaveQrRect();
            this.$cameraPreviewView.setActive(true);
            this.$mlCameraController.c(new Size(this.$cameraPreviewView.getWidth() != 0 ? this.$cameraPreviewView.getWidth() : 1080, this.$cameraPreviewView.getHeight() != 0 ? this.$cameraPreviewView.getHeight() : 2080));
        } else if (!(this.$state instanceof t1z0)) {
            this.$cameraPreviewView.setActive(false);
        }
        return zy11.a;
    }
}
