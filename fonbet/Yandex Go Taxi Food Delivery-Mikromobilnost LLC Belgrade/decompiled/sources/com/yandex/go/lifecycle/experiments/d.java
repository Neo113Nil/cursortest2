package com.yandex.go.lifecycle.experiments;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes.dex */
public final class d implements q {
    public final /* synthetic */ q a;

    public d(rqo rqoVar) {
        AppLifecycleLcpExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(AppLifecycleLcpExperiment.f);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (AppLifecycleLcpExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        AppLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1 appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1;
        int i;
        if (continuationImpl instanceof AppLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1) {
            appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1 = (AppLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1) continuationImpl;
            int i2 = appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.label = 1;
                    obj = this.a.b(appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((AppLifecycleLcpExperiment) obj).c;
            }
        }
        appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1 = new AppLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1(this, continuationImpl);
        Object obj2 = appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLifecycleScenarioInfoRepositoryImpl$lcpTimeoutMs$1.label;
        if (i != 0) {
        }
        return ((AppLifecycleLcpExperiment) obj2).c;
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
