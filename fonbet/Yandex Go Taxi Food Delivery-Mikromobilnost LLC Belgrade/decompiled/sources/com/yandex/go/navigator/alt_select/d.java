package com.yandex.go.navigator.alt_select;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ e b;

    public d(tpr[] tprVarArr, e eVar) {
        this.a = tprVarArr;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AltSelectPresenter$renderContent$$inlined$combine$1$1 altSelectPresenter$renderContent$$inlined$combine$1$1;
        int i;
        if (continuation instanceof AltSelectPresenter$renderContent$$inlined$combine$1$1) {
            altSelectPresenter$renderContent$$inlined$combine$1$1 = (AltSelectPresenter$renderContent$$inlined$combine$1$1) continuation;
            int i2 = altSelectPresenter$renderContent$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altSelectPresenter$renderContent$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = altSelectPresenter$renderContent$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altSelectPresenter$renderContent$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 2);
                    AltSelectPresenter$renderContent$$inlined$combine$1$3 altSelectPresenter$renderContent$$inlined$combine$1$3 = new AltSelectPresenter$renderContent$$inlined$combine$1$3(this.b, null);
                    altSelectPresenter$renderContent$$inlined$combine$1$1.L$0 = null;
                    altSelectPresenter$renderContent$$inlined$combine$1$1.L$1 = null;
                    altSelectPresenter$renderContent$$inlined$combine$1$1.L$2 = null;
                    altSelectPresenter$renderContent$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, v10Var, altSelectPresenter$renderContent$$inlined$combine$1$3, altSelectPresenter$renderContent$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        altSelectPresenter$renderContent$$inlined$combine$1$1 = new AltSelectPresenter$renderContent$$inlined$combine$1$1(this, continuation);
        Object obj2 = altSelectPresenter$renderContent$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altSelectPresenter$renderContent$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
