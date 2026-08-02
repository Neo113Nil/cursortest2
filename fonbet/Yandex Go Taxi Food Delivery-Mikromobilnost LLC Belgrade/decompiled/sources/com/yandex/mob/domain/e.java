package com.yandex.mob.domain;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final com.yandex.mob.datastore.d a;
    public final u b;
    public final Set c;

    public e(com.yandex.mob.datastore.d dVar, u uVar, Set set) {
        this.a = dVar;
        this.b = uVar;
        this.c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InitialUseCase$Result initialUseCase$Result, ContinuationImpl continuationImpl) {
        ConfigMigrationUseCase$invoke$1 configMigrationUseCase$invoke$1;
        int i;
        Set g;
        if (continuationImpl instanceof ConfigMigrationUseCase$invoke$1) {
            configMigrationUseCase$invoke$1 = (ConfigMigrationUseCase$invoke$1) continuationImpl;
            int i2 = configMigrationUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                configMigrationUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = configMigrationUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = configMigrationUseCase$invoke$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    configMigrationUseCase$invoke$1.L$0 = initialUseCase$Result;
                    configMigrationUseCase$invoke$1.label = 1;
                    obj = this.a.c(configMigrationUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    initialUseCase$Result = (InitialUseCase$Result) configMigrationUseCase$invoke$1.L$0;
                    kotlin.b.b(obj);
                }
                InitialUseCase$Result initialUseCase$Result2 = initialUseCase$Result;
                Set set = (Set) obj;
                g = v4r0.g(this.c, set);
                if (!g.isEmpty()) {
                    ConfigMigrationUseCase$invoke$2 configMigrationUseCase$invoke$2 = new ConfigMigrationUseCase$invoke$2(initialUseCase$Result2, this, set, g, null);
                    configMigrationUseCase$invoke$1.L$0 = null;
                    configMigrationUseCase$invoke$1.L$1 = null;
                    configMigrationUseCase$invoke$1.L$2 = null;
                    configMigrationUseCase$invoke$1.label = 2;
                    if (bvf0.n(configMigrationUseCase$invoke$2, configMigrationUseCase$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        configMigrationUseCase$invoke$1 = new ConfigMigrationUseCase$invoke$1(this, continuationImpl);
        Object obj2 = configMigrationUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = configMigrationUseCase$invoke$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        InitialUseCase$Result initialUseCase$Result22 = initialUseCase$Result;
        Set set2 = (Set) obj2;
        g = v4r0.g(this.c, set2);
        if (!g.isEmpty()) {
        }
        return zy11Var2;
    }
}
