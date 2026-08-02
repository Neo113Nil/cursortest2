package com.yandex.go.safety.center.help;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOffHook", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.help.SafetyCenterHelpPresenter$observeCallStateChanging$3", f = "SafetyCenterHelpPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterHelpPresenter$observeCallStateChanging$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $fromOffHook;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterHelpPresenter$observeCallStateChanging$3(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$fromOffHook = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SafetyCenterHelpPresenter$observeCallStateChanging$3 safetyCenterHelpPresenter$observeCallStateChanging$3 = new SafetyCenterHelpPresenter$observeCallStateChanging$3(this.$fromOffHook, continuation);
        safetyCenterHelpPresenter$observeCallStateChanging$3.Z$0 = ((Boolean) obj).booleanValue();
        return safetyCenterHelpPresenter$observeCallStateChanging$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        SafetyCenterHelpPresenter$observeCallStateChanging$3 safetyCenterHelpPresenter$observeCallStateChanging$3 = (SafetyCenterHelpPresenter$observeCallStateChanging$3) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        safetyCenterHelpPresenter$observeCallStateChanging$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        unr0.C(new Object[]{Boolean.valueOf(z), Boolean.valueOf(this.$fromOffHook)}, 2, "offHook: %s, fromOffHook: %s", jst.e);
        return zy11.a;
    }
}
