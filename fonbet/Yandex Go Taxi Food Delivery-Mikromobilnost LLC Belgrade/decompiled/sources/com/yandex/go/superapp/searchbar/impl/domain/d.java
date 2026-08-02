package com.yandex.go.superapp.searchbar.impl.domain;

import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public d(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1 superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1) {
            superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1 = (SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1) continuation;
            int i2 = superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ndw0 e = this.b.e((SuperappSearchbarExperiment) obj);
                    superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.L$0 = null;
                    superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.L$1 = null;
                    superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.L$2 = null;
                    superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.L$3 = null;
                    superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e, superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1 = new SuperappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSearchbarConfigurationRepositoryImpl$observeConfiguration$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
