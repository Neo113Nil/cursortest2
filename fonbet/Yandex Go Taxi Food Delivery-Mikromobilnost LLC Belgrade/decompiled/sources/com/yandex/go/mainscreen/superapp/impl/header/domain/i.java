package com.yandex.go.mainscreen.superapp.impl.header.domain;

import defpackage.e0w0;
import defpackage.m49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ e0w0 b;

    public i(tpr[] tprVarArr, e0w0 e0w0Var) {
        this.a = tprVarArr;
        this.b = e0w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1 superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1) {
            superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1 = (SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1) continuation;
            int i2 = superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    m49 m49Var = new m49(tprVarArr, 7);
                    SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3 superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3 = new SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3(null, this.b);
                    superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.L$0 = null;
                    superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.L$1 = null;
                    superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.L$2 = null;
                    superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, m49Var, superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$3, superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1 = new SuperAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppHeaderInteractor$getHeaderStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
