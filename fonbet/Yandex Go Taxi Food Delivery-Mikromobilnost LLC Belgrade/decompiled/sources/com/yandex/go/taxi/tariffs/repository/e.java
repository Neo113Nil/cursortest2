package com.yandex.go.taxi.tariffs.repository;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1 selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SelectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1) {
            selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1 = (SelectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1) continuation;
            int i2 = selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.L$0 = null;
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.L$1 = null;
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.L$2 = null;
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.L$3 = null;
                selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.label = 1;
                return this.a.emit(zy11Var, selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1 = new SelectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedMultiTariffsRepositoryImpl$selectedClassesChangedFlow$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
