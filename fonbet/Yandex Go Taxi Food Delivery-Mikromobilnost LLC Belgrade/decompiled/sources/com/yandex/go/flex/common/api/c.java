package com.yandex.go.flex.common.api;

import defpackage.ajr;
import defpackage.mth;
import defpackage.ny61;
import defpackage.zir;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ajr ajrVar, ContinuationImpl continuationImpl) {
        FlexGeoParamsRepositoryKt$awaitSelectedPosition$1 flexGeoParamsRepositoryKt$awaitSelectedPosition$1;
        int i;
        if (continuationImpl instanceof FlexGeoParamsRepositoryKt$awaitSelectedPosition$1) {
            flexGeoParamsRepositoryKt$awaitSelectedPosition$1 = (FlexGeoParamsRepositoryKt$awaitSelectedPosition$1) continuationImpl;
            int i2 = flexGeoParamsRepositoryKt$awaitSelectedPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flexGeoParamsRepositoryKt$awaitSelectedPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flexGeoParamsRepositoryKt$awaitSelectedPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flexGeoParamsRepositoryKt$awaitSelectedPosition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flexGeoParamsRepositoryKt$awaitSelectedPosition$1.L$0 = null;
                    flexGeoParamsRepositoryKt$awaitSelectedPosition$1.label = 1;
                    obj = e.y(new mth(ajrVar.b, 6), flexGeoParamsRepositoryKt$awaitSelectedPosition$1);
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
                return ((zir) obj).a();
            }
        }
        flexGeoParamsRepositoryKt$awaitSelectedPosition$1 = new FlexGeoParamsRepositoryKt$awaitSelectedPosition$1(continuationImpl);
        Object obj2 = flexGeoParamsRepositoryKt$awaitSelectedPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flexGeoParamsRepositoryKt$awaitSelectedPosition$1.label;
        if (i != 0) {
        }
        return ((zir) obj2).a();
    }

    public static final zir b(ajr ajrVar) {
        return (zir) ajrVar.b.a.getValue();
    }
}
