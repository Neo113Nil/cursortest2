package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.fnx0;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kb5 b;

    public o(vpr vprVar, kb5 kb5Var) {
        this.a = vprVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1 dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof DialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1) {
            dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1 = (DialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1) continuation;
            int i2 = dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (jl40.l(((fnx0) obj).e, this.b)) {
                        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.L$0 = null;
                        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.L$1 = null;
                        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.L$2 = null;
                        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.L$3 = null;
                        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1 = new DialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dialogueUiStateInteractor$currentTariffSelectionFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
