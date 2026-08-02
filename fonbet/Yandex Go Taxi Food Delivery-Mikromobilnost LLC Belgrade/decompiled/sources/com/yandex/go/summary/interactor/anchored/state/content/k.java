package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ l b;

    public k(kotlinx.coroutines.flow.internal.g gVar, l lVar) {
        this.a = gVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1 dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1) {
            dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1 = (DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1) continuation;
            int i2 = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.L$0 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.L$1 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.L$2 = null;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(jVar, dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1 = new DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
