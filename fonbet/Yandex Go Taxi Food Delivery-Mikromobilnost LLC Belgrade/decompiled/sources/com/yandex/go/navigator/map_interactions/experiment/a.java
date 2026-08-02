package com.yandex.go.navigator.map_interactions.experiment;

import android.net.Uri;
import com.yandex.go.navigator.experiment.NavigatorMapInteractionsExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final t1b0 a;

    public a(rqo rqoVar) {
        NavigatorMapInteractionsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(NavigatorMapInteractionsExperiment.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MapInteractionExperimentRepository$isLongTapEnabled$1 mapInteractionExperimentRepository$isLongTapEnabled$1;
        int i;
        if (continuationImpl instanceof MapInteractionExperimentRepository$isLongTapEnabled$1) {
            mapInteractionExperimentRepository$isLongTapEnabled$1 = (MapInteractionExperimentRepository$isLongTapEnabled$1) continuationImpl;
            int i2 = mapInteractionExperimentRepository$isLongTapEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapInteractionExperimentRepository$isLongTapEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapInteractionExperimentRepository$isLongTapEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapInteractionExperimentRepository$isLongTapEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    mapInteractionExperimentRepository$isLongTapEnabled$1.label = 1;
                    obj = this.a.b(mapInteractionExperimentRepository$isLongTapEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((NavigatorMapInteractionsExperiment) obj).e.a);
            }
        }
        mapInteractionExperimentRepository$isLongTapEnabled$1 = new MapInteractionExperimentRepository$isLongTapEnabled$1(this, continuationImpl);
        Object obj2 = mapInteractionExperimentRepository$isLongTapEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapInteractionExperimentRepository$isLongTapEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((NavigatorMapInteractionsExperiment) obj2).e.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MapInteractionExperimentRepository$isTapEnabled$1 mapInteractionExperimentRepository$isTapEnabled$1;
        int i;
        if (continuationImpl instanceof MapInteractionExperimentRepository$isTapEnabled$1) {
            mapInteractionExperimentRepository$isTapEnabled$1 = (MapInteractionExperimentRepository$isTapEnabled$1) continuationImpl;
            int i2 = mapInteractionExperimentRepository$isTapEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapInteractionExperimentRepository$isTapEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapInteractionExperimentRepository$isTapEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapInteractionExperimentRepository$isTapEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    mapInteractionExperimentRepository$isTapEnabled$1.label = 1;
                    obj = this.a.b(mapInteractionExperimentRepository$isTapEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((NavigatorMapInteractionsExperiment) obj).d);
            }
        }
        mapInteractionExperimentRepository$isTapEnabled$1 = new MapInteractionExperimentRepository$isTapEnabled$1(this, continuationImpl);
        Object obj2 = mapInteractionExperimentRepository$isTapEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapInteractionExperimentRepository$isTapEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((NavigatorMapInteractionsExperiment) obj2).d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable c(ContinuationImpl continuationImpl) {
        MapInteractionExperimentRepository$longTapUgcDeeplink$1 mapInteractionExperimentRepository$longTapUgcDeeplink$1;
        int i;
        String str;
        if (continuationImpl instanceof MapInteractionExperimentRepository$longTapUgcDeeplink$1) {
            mapInteractionExperimentRepository$longTapUgcDeeplink$1 = (MapInteractionExperimentRepository$longTapUgcDeeplink$1) continuationImpl;
            int i2 = mapInteractionExperimentRepository$longTapUgcDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapInteractionExperimentRepository$longTapUgcDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapInteractionExperimentRepository$longTapUgcDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapInteractionExperimentRepository$longTapUgcDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    mapInteractionExperimentRepository$longTapUgcDeeplink$1.label = 1;
                    obj = this.a.b(mapInteractionExperimentRepository$longTapUgcDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                str = ((NavigatorMapInteractionsExperiment) obj).e.b;
                if (str == null) {
                    return Uri.parse(str);
                }
                return null;
            }
        }
        mapInteractionExperimentRepository$longTapUgcDeeplink$1 = new MapInteractionExperimentRepository$longTapUgcDeeplink$1(this, continuationImpl);
        Object obj2 = mapInteractionExperimentRepository$longTapUgcDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapInteractionExperimentRepository$longTapUgcDeeplink$1.label;
        if (i != 0) {
        }
        str = ((NavigatorMapInteractionsExperiment) obj2).e.b;
        if (str == null) {
        }
    }
}
