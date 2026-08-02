package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class o implements tpr {
    public final /* synthetic */ tpr a;

    public o(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffsRepositoryStorage$special$$inlined$map$2$1 tariffsRepositoryStorage$special$$inlined$map$2$1;
        int i;
        if (continuation instanceof TariffsRepositoryStorage$special$$inlined$map$2$1) {
            tariffsRepositoryStorage$special$$inlined$map$2$1 = (TariffsRepositoryStorage$special$$inlined$map$2$1) continuation;
            int i2 = tariffsRepositoryStorage$special$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsRepositoryStorage$special$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffsRepositoryStorage$special$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsRepositoryStorage$special$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar);
                    tariffsRepositoryStorage$special$$inlined$map$2$1.L$0 = null;
                    tariffsRepositoryStorage$special$$inlined$map$2$1.L$1 = null;
                    tariffsRepositoryStorage$special$$inlined$map$2$1.L$2 = null;
                    tariffsRepositoryStorage$special$$inlined$map$2$1.label = 1;
                    if (this.a.collect(nVar, tariffsRepositoryStorage$special$$inlined$map$2$1) == coroutineSingletons) {
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
        tariffsRepositoryStorage$special$$inlined$map$2$1 = new TariffsRepositoryStorage$special$$inlined$map$2$1(this, continuation);
        Object obj2 = tariffsRepositoryStorage$special$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsRepositoryStorage$special$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
