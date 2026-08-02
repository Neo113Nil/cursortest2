package com.yandex.go.payments_widgets;

import com.yandex.go.payments_widgets.saver.k;
import com.yandex.go.payments_widgets.yandex_bank.RotationDetectorListener;
import com.yandex.go.payments_widgets.yandex_bank.j;
import defpackage.aba0;
import defpackage.bvf0;
import defpackage.mxk0;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.zaa0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g {
    public final ofa0 a;
    public final j b;
    public final com.yandex.go.payments_widgets.split.g c;
    public final k d;
    public final RotationDetectorListener e;
    public final mxk0 f;
    public final aba0 g;
    public final zaa0 h;

    public g(ofa0 ofa0Var, j jVar, com.yandex.go.payments_widgets.split.g gVar, k kVar, RotationDetectorListener rotationDetectorListener, mxk0 mxk0Var, aba0 aba0Var, zaa0 zaa0Var) {
        this.a = ofa0Var;
        this.b = jVar;
        this.c = gVar;
        this.d = kVar;
        this.e = rotationDetectorListener;
        this.f = mxk0Var;
        this.g = aba0Var;
        this.h = zaa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdatePaymentsVariablesInteractorImpl$startUpdate$1 updatePaymentsVariablesInteractorImpl$startUpdate$1;
        int i;
        if (continuationImpl instanceof UpdatePaymentsVariablesInteractorImpl$startUpdate$1) {
            updatePaymentsVariablesInteractorImpl$startUpdate$1 = (UpdatePaymentsVariablesInteractorImpl$startUpdate$1) continuationImpl;
            int i2 = updatePaymentsVariablesInteractorImpl$startUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePaymentsVariablesInteractorImpl$startUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updatePaymentsVariablesInteractorImpl$startUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatePaymentsVariablesInteractorImpl$startUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    UpdatePaymentsVariablesInteractorImpl$startUpdate$2 updatePaymentsVariablesInteractorImpl$startUpdate$2 = new UpdatePaymentsVariablesInteractorImpl$startUpdate$2(this, null);
                    updatePaymentsVariablesInteractorImpl$startUpdate$1.label = 1;
                    if (bvf0.n(updatePaymentsVariablesInteractorImpl$startUpdate$2, updatePaymentsVariablesInteractorImpl$startUpdate$1) == coroutineSingletons) {
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
        updatePaymentsVariablesInteractorImpl$startUpdate$1 = new UpdatePaymentsVariablesInteractorImpl$startUpdate$1(this, continuationImpl);
        Object obj2 = updatePaymentsVariablesInteractorImpl$startUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatePaymentsVariablesInteractorImpl$startUpdate$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
