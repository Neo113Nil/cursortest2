package com.yandex.go.safety.center.instruction;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Lcom/yandex/go/safety/center/api/SafetyCenterConfig;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "Lzy11;", "<anonymous>", "(Lkotlin/Result;Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$tryToShowInstruction$2", f = "SafetyCenterInstructionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterInstructionPresenter$tryToShowInstruction$2 extends SuspendLambda implements zls {
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SafetyCenterInstructionPresenter$tryToShowInstruction$2 safetyCenterInstructionPresenter$tryToShowInstruction$2 = new SafetyCenterInstructionPresenter$tryToShowInstruction$2(3, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        safetyCenterInstructionPresenter$tryToShowInstruction$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
