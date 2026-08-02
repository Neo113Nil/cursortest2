package com.yandex.go.payments_widgets.saver;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class j implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ k b;

    public j(mth mthVar, k kVar) {
        this.a = mthVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$1 updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1;
        int i;
        if (continuation instanceof UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$1) {
            updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1 = (UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$1) continuation;
            int i2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.L$0 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.L$1 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.L$2 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.label = 1;
                    if (this.a.collect(iVar, updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1) == coroutineSingletons) {
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
        updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1 = new UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$1(this, continuation);
        Object obj2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
