package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.ufx0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ufx0 b;

    public r(tpr tprVar, ufx0 ufx0Var) {
        this.a = tprVar;
        this.b = ufx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1 dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof DialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1) {
            dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1 = (DialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(qVar, dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1 = new DialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dialogueUiStateInteractor$dialogueUiStateFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
