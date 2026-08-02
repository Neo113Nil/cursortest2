package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.graphics.Rect;
import androidx.lifecycle.Lifecycle;
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
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1", f = "TicketActivationScanModalScreen.kt", l = {149}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ MtQRCameraPreview $cameraPreviewView;
    final /* synthetic */ com.yandex.go.masstransit.sdk.camera.ml.b $mlCameraController;
    final /* synthetic */ int $qrTargetMarginPx;
    final /* synthetic */ v1z0 $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1(v1z0 v1z0Var, MtQRCameraPreview mtQRCameraPreview, com.yandex.go.masstransit.sdk.camera.ml.b bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.$state = v1z0Var;
        this.$cameraPreviewView = mtQRCameraPreview;
        this.$mlCameraController = bVar;
        this.$qrTargetMarginPx = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1(this.$state, this.$cameraPreviewView, this.$mlCameraController, this.$qrTargetMarginPx, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketActivationScanModalScreenKt$TicketActivationScanModalScreen$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v1z0 v1z0Var = this.$state;
            if ((v1z0Var instanceof t1z0) && ((t1z0) v1z0Var).a != null) {
                Rect rect = new Rect(((t1z0) this.$state).a);
                int i2 = this.$qrTargetMarginPx;
                rect.set(rect.left + i2, rect.top + i2, rect.right - i2, rect.bottom - i2);
                this.$cameraPreviewView.grabQrRect(rect);
                this.$mlCameraController.f.a.i(Lifecycle.State.CREATED);
                this.L$0 = null;
                this.label = 1;
                if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$cameraPreviewView.leaveQrRect();
        return zy11.a;
    }
}
