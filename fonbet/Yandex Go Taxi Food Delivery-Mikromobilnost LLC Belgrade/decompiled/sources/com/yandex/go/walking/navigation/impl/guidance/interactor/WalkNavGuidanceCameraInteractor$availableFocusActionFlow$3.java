package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.ist;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/guidance/interactor/FocusAction;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/walking/navigation/impl/guidance/interactor/FocusAction;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3", f = "WalkNavGuidanceCameraInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3 walkNavGuidanceCameraInteractor$availableFocusActionFlow$3 = new WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3(this.this$0, continuation);
        walkNavGuidanceCameraInteractor$availableFocusActionFlow$3.L$0 = obj;
        return walkNavGuidanceCameraInteractor$availableFocusActionFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3 walkNavGuidanceCameraInteractor$availableFocusActionFlow$3 = (WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3) create((FocusAction) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        walkNavGuidanceCameraInteractor$availableFocusActionFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FocusAction focusAction = (FocusAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ist istVar = this.this$0.f;
        Objects.toString(focusAction);
        istVar.getClass();
        return zy11.a;
    }
}
