package com.yandex.go.eboks.objects.domain.model;

import defpackage.bvf0;
import defpackage.mth;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final r0 a = bvf0.c(null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        EboksObjectsClientEventResultImpl$awaitResult$1 eboksObjectsClientEventResultImpl$awaitResult$1;
        int i;
        if (continuationImpl instanceof EboksObjectsClientEventResultImpl$awaitResult$1) {
            eboksObjectsClientEventResultImpl$awaitResult$1 = (EboksObjectsClientEventResultImpl$awaitResult$1) continuationImpl;
            int i2 = eboksObjectsClientEventResultImpl$awaitResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsClientEventResultImpl$awaitResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsClientEventResultImpl$awaitResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsClientEventResultImpl$awaitResult$1.label;
                if (i != 0) {
                    b.b(obj);
                    mth mthVar = new mth(this.a, 6);
                    eboksObjectsClientEventResultImpl$awaitResult$1.label = 1;
                    obj = e.y(mthVar, eboksObjectsClientEventResultImpl$awaitResult$1);
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
                return ((Result) obj).getValue();
            }
        }
        eboksObjectsClientEventResultImpl$awaitResult$1 = new EboksObjectsClientEventResultImpl$awaitResult$1(this, continuationImpl);
        Object obj2 = eboksObjectsClientEventResultImpl$awaitResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsClientEventResultImpl$awaitResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
