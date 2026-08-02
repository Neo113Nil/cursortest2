package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q141;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1", f = "WalkNavGuidanceCameraInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class WalkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1 walkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1 = new WalkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        walkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        walkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return walkNavGuidanceCameraInteractor$availableFocusActionByCameraModeFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g92 g92Var;
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = q141.b[((CameraMode) obj2).ordinal()];
            if (i2 == 1 || i2 == 2) {
                g92Var = new g92(2, FocusAction.FOCUS_USER);
            } else if (i2 == 3) {
                g92Var = new g92(2, FocusAction.FOCUS_ROUTE);
            } else {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                tprVar = k.a(this.this$0);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            tprVar = g92Var;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
