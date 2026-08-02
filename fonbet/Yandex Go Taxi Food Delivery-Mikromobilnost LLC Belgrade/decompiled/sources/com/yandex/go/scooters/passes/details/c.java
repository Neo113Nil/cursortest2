package com.yandex.go.scooters.passes.details;

import defpackage.c3o;
import defpackage.kdd0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c3o b;
    public final /* synthetic */ kdd0 c;

    public c(tpr tprVar, c3o c3oVar, kdd0 kdd0Var) {
        this.a = tprVar;
        this.b = c3oVar;
        this.c = kdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1 scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (ScootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new ScootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesDetailsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
