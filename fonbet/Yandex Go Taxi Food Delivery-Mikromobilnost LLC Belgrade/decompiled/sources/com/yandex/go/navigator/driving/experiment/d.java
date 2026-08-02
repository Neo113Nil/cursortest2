package com.yandex.go.navigator.driving.experiment;

import defpackage.d6z;
import defpackage.db50;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final com.yandex.go.navigator.utils.a a;
    public final c b;

    public d(rqo rqoVar, com.yandex.go.navigator.utils.a aVar) {
        this.a = aVar;
        NavigatorControlsExperiment.Companion.getClass();
        NavigatorControlsExperiment navigatorControlsExperiment = NavigatorControlsExperiment.g;
        this.b = new c(com.yandex.go.coroutines.b.d(((jbh) rqoVar).e(navigatorControlsExperiment).a(), new NavigatorControlsExperimentRepository$special$$inlined$start$1(navigatorControlsExperiment, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, NavigatorControlsExperiment navigatorControlsExperiment, ContinuationImpl continuationImpl) {
        NavigatorControlsExperimentRepository$mapExperiment$1 navigatorControlsExperimentRepository$mapExperiment$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z;
        NavigatorControlsExperiment navigatorControlsExperiment2;
        Object b;
        List list;
        com.yandex.go.navigator.utils.a aVar = dVar.a;
        if (continuationImpl instanceof NavigatorControlsExperimentRepository$mapExperiment$1) {
            navigatorControlsExperimentRepository$mapExperiment$1 = (NavigatorControlsExperimentRepository$mapExperiment$1) continuationImpl;
            int i2 = navigatorControlsExperimentRepository$mapExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorControlsExperimentRepository$mapExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorControlsExperimentRepository$mapExperiment$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorControlsExperimentRepository$mapExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z2 = navigatorControlsExperiment.b;
                    List list2 = navigatorControlsExperiment.c;
                    NavigatorControlsExperimentRepository$mapExperiment$2 navigatorControlsExperimentRepository$mapExperiment$2 = new NavigatorControlsExperimentRepository$mapExperiment$2(1, navigatorControlsExperiment, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
                    navigatorControlsExperimentRepository$mapExperiment$1.L$0 = navigatorControlsExperiment;
                    navigatorControlsExperimentRepository$mapExperiment$1.Z$0 = z2;
                    navigatorControlsExperimentRepository$mapExperiment$1.label = 1;
                    Object b2 = aVar.b(list2, navigatorControlsExperimentRepository$mapExperiment$2, navigatorControlsExperimentRepository$mapExperiment$1);
                    if (b2 != coroutineSingletons) {
                        z = z2;
                        obj = b2;
                        navigatorControlsExperiment2 = navigatorControlsExperiment;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = navigatorControlsExperimentRepository$mapExperiment$1.Z$0;
                    list = (List) navigatorControlsExperimentRepository$mapExperiment$1.L$1;
                    kotlin.b.b(obj);
                    return new db50(list, (List) obj, z);
                }
                z = navigatorControlsExperimentRepository$mapExperiment$1.Z$0;
                NavigatorControlsExperiment navigatorControlsExperiment3 = (NavigatorControlsExperiment) navigatorControlsExperimentRepository$mapExperiment$1.L$0;
                kotlin.b.b(obj);
                navigatorControlsExperiment2 = navigatorControlsExperiment3;
                List list3 = (List) obj;
                List list4 = navigatorControlsExperiment2.d;
                NavigatorControlsExperimentRepository$mapExperiment$3 navigatorControlsExperimentRepository$mapExperiment$3 = new NavigatorControlsExperimentRepository$mapExperiment$3(1, navigatorControlsExperiment2, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
                navigatorControlsExperimentRepository$mapExperiment$1.L$0 = null;
                navigatorControlsExperimentRepository$mapExperiment$1.L$1 = list3;
                navigatorControlsExperimentRepository$mapExperiment$1.Z$0 = z;
                navigatorControlsExperimentRepository$mapExperiment$1.label = 2;
                b = aVar.b(list4, navigatorControlsExperimentRepository$mapExperiment$3, navigatorControlsExperimentRepository$mapExperiment$1);
                if (b != coroutineSingletons) {
                    list = list3;
                    obj = b;
                    return new db50(list, (List) obj, z);
                }
                return coroutineSingletons;
            }
        }
        navigatorControlsExperimentRepository$mapExperiment$1 = new NavigatorControlsExperimentRepository$mapExperiment$1(dVar, continuationImpl);
        Object obj2 = navigatorControlsExperimentRepository$mapExperiment$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorControlsExperimentRepository$mapExperiment$1.label;
        if (i != 0) {
        }
        List list32 = (List) obj2;
        List list42 = navigatorControlsExperiment2.d;
        NavigatorControlsExperimentRepository$mapExperiment$3 navigatorControlsExperimentRepository$mapExperiment$32 = new NavigatorControlsExperimentRepository$mapExperiment$3(1, navigatorControlsExperiment2, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
        navigatorControlsExperimentRepository$mapExperiment$1.L$0 = null;
        navigatorControlsExperimentRepository$mapExperiment$1.L$1 = list32;
        navigatorControlsExperimentRepository$mapExperiment$1.Z$0 = z;
        navigatorControlsExperimentRepository$mapExperiment$1.label = 2;
        b = aVar.b(list42, navigatorControlsExperimentRepository$mapExperiment$32, navigatorControlsExperimentRepository$mapExperiment$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
