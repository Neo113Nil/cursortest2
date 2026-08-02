package com.yandex.go.safety.center.instruction;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;

    public b(vpr vprVar, boolean z) {
        this.a = vprVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SafetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1 safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SafetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1) {
            safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1 = (SafetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1) continuation;
            int i2 = safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Boolean) obj).booleanValue() ^ this.b) {
                        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.L$0 = null;
                        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.L$1 = null;
                        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.L$2 = null;
                        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.L$3 = null;
                        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1 = new SafetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterInstructionPresenter$observeCallStateChanging$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
