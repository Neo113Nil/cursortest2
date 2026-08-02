package com.yandex.go.scooters.offers.v2.components.options;

import defpackage.mth;
import defpackage.ny61;
import defpackage.q5n0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ q5n0 b;

    public b(mth mthVar, q5n0 q5n0Var) {
        this.a = mthVar;
        this.b = q5n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1 scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1) {
            scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1 = (ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1) continuation;
            int i2 = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.L$0 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.L$1 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.L$2 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1 = new ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
