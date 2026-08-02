package com.yandex.go.shortcuts.impl.ui.interactors;

import defpackage.akt0;
import defpackage.bkt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ bkt0 b;

    public d(tpr[] tprVarArr, bkt0 bkt0Var) {
        this.a = tprVarArr;
        this.b = bkt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1 sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1) {
            sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1 = (SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1) continuation;
            int i2 = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 0);
                    SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3 sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3 = new SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3(null, this.b);
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.L$0 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.L$1 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.L$2 = null;
                    sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, akt0Var, sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3, sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1 = new SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1(this, continuation);
        Object obj2 = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
