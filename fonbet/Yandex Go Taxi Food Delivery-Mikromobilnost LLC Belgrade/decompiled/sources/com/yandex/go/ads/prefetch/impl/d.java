package com.yandex.go.ads.prefetch.impl;

import defpackage.cvx;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d {
    public final cvx a;

    public d(cvx cvxVar) {
        this.a = cvxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AdvertPrefetchInteractorImpl$isPrefetchEnabled$1 advertPrefetchInteractorImpl$isPrefetchEnabled$1;
        int i;
        if (continuationImpl instanceof AdvertPrefetchInteractorImpl$isPrefetchEnabled$1) {
            advertPrefetchInteractorImpl$isPrefetchEnabled$1 = (AdvertPrefetchInteractorImpl$isPrefetchEnabled$1) continuationImpl;
            int i2 = advertPrefetchInteractorImpl$isPrefetchEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertPrefetchInteractorImpl$isPrefetchEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = advertPrefetchInteractorImpl$isPrefetchEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertPrefetchInteractorImpl$isPrefetchEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AdvertPrefetchExperiment.Companion.getClass();
                    AdvertPrefetchExperiment advertPrefetchExperiment = AdvertPrefetchExperiment.c;
                    advertPrefetchInteractorImpl$isPrefetchEnabled$1.label = 1;
                    obj = this.a.i(advertPrefetchExperiment, advertPrefetchInteractorImpl$isPrefetchEnabled$1);
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
                return Boolean.valueOf(((AdvertPrefetchExperiment) obj).b);
            }
        }
        advertPrefetchInteractorImpl$isPrefetchEnabled$1 = new AdvertPrefetchInteractorImpl$isPrefetchEnabled$1(this, continuationImpl);
        Object obj2 = advertPrefetchInteractorImpl$isPrefetchEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertPrefetchInteractorImpl$isPrefetchEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((AdvertPrefetchExperiment) obj2).b);
    }
}
