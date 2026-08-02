package com.yandex.go.zone.repository;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k {
    public final t1b0 a;

    public k(rqo rqoVar) {
        ZoneFallbackTtlExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(ZoneFallbackTtlExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ZoneFallbackTtlExperimentProvider$cacheTtlSec$1 zoneFallbackTtlExperimentProvider$cacheTtlSec$1;
        int i;
        if (continuationImpl instanceof ZoneFallbackTtlExperimentProvider$cacheTtlSec$1) {
            zoneFallbackTtlExperimentProvider$cacheTtlSec$1 = (ZoneFallbackTtlExperimentProvider$cacheTtlSec$1) continuationImpl;
            int i2 = zoneFallbackTtlExperimentProvider$cacheTtlSec$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneFallbackTtlExperimentProvider$cacheTtlSec$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneFallbackTtlExperimentProvider$cacheTtlSec$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneFallbackTtlExperimentProvider$cacheTtlSec$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneFallbackTtlExperimentProvider$cacheTtlSec$1.label = 1;
                    obj = this.a.b(zoneFallbackTtlExperimentProvider$cacheTtlSec$1);
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
                ZoneFallbackTtlExperiment zoneFallbackTtlExperiment = (ZoneFallbackTtlExperiment) obj;
                return new Integer(!zoneFallbackTtlExperiment.b ? zoneFallbackTtlExperiment.c : 0);
            }
        }
        zoneFallbackTtlExperimentProvider$cacheTtlSec$1 = new ZoneFallbackTtlExperimentProvider$cacheTtlSec$1(this, continuationImpl);
        Object obj2 = zoneFallbackTtlExperimentProvider$cacheTtlSec$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneFallbackTtlExperimentProvider$cacheTtlSec$1.label;
        if (i != 0) {
        }
        ZoneFallbackTtlExperiment zoneFallbackTtlExperiment2 = (ZoneFallbackTtlExperiment) obj2;
        return new Integer(!zoneFallbackTtlExperiment2.b ? zoneFallbackTtlExperiment2.c : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ZoneFallbackTtlExperimentProvider$maxCount$1 zoneFallbackTtlExperimentProvider$maxCount$1;
        int i;
        if (continuationImpl instanceof ZoneFallbackTtlExperimentProvider$maxCount$1) {
            zoneFallbackTtlExperimentProvider$maxCount$1 = (ZoneFallbackTtlExperimentProvider$maxCount$1) continuationImpl;
            int i2 = zoneFallbackTtlExperimentProvider$maxCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneFallbackTtlExperimentProvider$maxCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneFallbackTtlExperimentProvider$maxCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneFallbackTtlExperimentProvider$maxCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneFallbackTtlExperimentProvider$maxCount$1.label = 1;
                    obj = this.a.b(zoneFallbackTtlExperimentProvider$maxCount$1);
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
                ZoneFallbackTtlExperiment zoneFallbackTtlExperiment = (ZoneFallbackTtlExperiment) obj;
                return new Integer(!zoneFallbackTtlExperiment.b ? zoneFallbackTtlExperiment.d : 0);
            }
        }
        zoneFallbackTtlExperimentProvider$maxCount$1 = new ZoneFallbackTtlExperimentProvider$maxCount$1(this, continuationImpl);
        Object obj2 = zoneFallbackTtlExperimentProvider$maxCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneFallbackTtlExperimentProvider$maxCount$1.label;
        if (i != 0) {
        }
        ZoneFallbackTtlExperiment zoneFallbackTtlExperiment2 = (ZoneFallbackTtlExperiment) obj2;
        return new Integer(!zoneFallbackTtlExperiment2.b ? zoneFallbackTtlExperiment2.d : 0);
    }
}
