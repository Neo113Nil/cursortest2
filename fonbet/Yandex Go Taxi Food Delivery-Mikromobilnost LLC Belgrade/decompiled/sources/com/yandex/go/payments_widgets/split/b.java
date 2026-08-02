package com.yandex.go.payments_widgets.split;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ f a;

    public b(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1 updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1;
        int i;
        if (continuation instanceof UpdateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1) {
            updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1 = (UpdateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1) continuation;
            int i2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.L$0 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.L$1 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.L$2 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1) == coroutineSingletons) {
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
        updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1 = new UpdateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1(this, continuation);
        Object obj2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbSplitVariablesInteractor$startUpdate$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
