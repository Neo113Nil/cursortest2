package com.yandex.go.places.experiments.gallery;

import defpackage.amh;
import defpackage.i3y;
import defpackage.lf80;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new amh(24, this));

    public b(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DiscoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1 discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1;
        int i;
        if (continuationImpl instanceof DiscoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1) {
            discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1 = (DiscoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1) continuationImpl;
            int i2 = discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.label = 1;
                    obj = t1b0Var.b(discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1);
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
                DiscoveryOrganizationGalleryExperiment discoveryOrganizationGalleryExperiment = (DiscoveryOrganizationGalleryExperiment) obj;
                return new lf80(discoveryOrganizationGalleryExperiment.c, discoveryOrganizationGalleryExperiment.d, discoveryOrganizationGalleryExperiment.b);
            }
        }
        discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1 = new DiscoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1(this, continuationImpl);
        Object obj2 = discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryOrganizationGalleryExperimentRepository$getGalleryConfig$1.label;
        if (i != 0) {
        }
        DiscoveryOrganizationGalleryExperiment discoveryOrganizationGalleryExperiment2 = (DiscoveryOrganizationGalleryExperiment) obj2;
        return new lf80(discoveryOrganizationGalleryExperiment2.c, discoveryOrganizationGalleryExperiment2.d, discoveryOrganizationGalleryExperiment2.b);
    }
}
