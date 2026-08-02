package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.mapkit.navigation.guidance_camera.Camera;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isGuidanceInIndoorMode", "isCameraMovedRecently", "isRouteAvailable", "Lzy11;", "<anonymous>", "(ZZZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1", f = "WalkNavGuidanceCameraInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1 extends SuspendLambda implements bms {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1(k kVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1 walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1 = new WalkNavGuidanceCameraInteractor$dispatchAutoFollowing$1(this.this$0, (Continuation) obj4);
        walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1.Z$0 = booleanValue;
        walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1.Z$1 = booleanValue2;
        walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1.Z$2 = booleanValue3;
        zy11 zy11Var = zy11.a;
        walkNavGuidanceCameraInteractor$dispatchAutoFollowing$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k kVar;
        Camera camera;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z && !z2 && z3 && (camera = (kVar = this.this$0).h) != null && camera.isValid()) {
            kVar.e(camera);
        }
        return zy11.a;
    }
}
