package com.yandex.mob.datastore;

import defpackage.ny61;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.wls;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(tpg tpgVar, ContinuationImpl continuationImpl) {
        DataStoreExtensionsKt$safeFirst$1 dataStoreExtensionsKt$safeFirst$1;
        int i;
        try {
            if (continuationImpl instanceof DataStoreExtensionsKt$safeFirst$1) {
                dataStoreExtensionsKt$safeFirst$1 = (DataStoreExtensionsKt$safeFirst$1) continuationImpl;
                int i2 = dataStoreExtensionsKt$safeFirst$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreExtensionsKt$safeFirst$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dataStoreExtensionsKt$safeFirst$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreExtensionsKt$safeFirst$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    tpr data = tpgVar.getData();
                    dataStoreExtensionsKt$safeFirst$1.L$0 = null;
                    dataStoreExtensionsKt$safeFirst$1.label = 1;
                    Object y = kotlinx.coroutines.flow.e.y(data, dataStoreExtensionsKt$safeFirst$1);
                    return y == coroutineSingletons ? coroutineSingletons : y;
                }
            }
            if (i == 0) {
            }
        } catch (Exception unused) {
            return null;
        }
        dataStoreExtensionsKt$safeFirst$1 = new DataStoreExtensionsKt$safeFirst$1(continuationImpl);
        Object obj2 = dataStoreExtensionsKt$safeFirst$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreExtensionsKt$safeFirst$1.label;
    }

    public static final o b(tpg tpgVar) {
        return new o(tpgVar.getData(), new DataStoreExtensionsKt$safeFlow$1(3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tpg tpgVar, wls wlsVar, Continuation continuation) {
        DataStoreExtensionsKt$safeUpdate$1 dataStoreExtensionsKt$safeUpdate$1;
        int i;
        try {
            if (continuation instanceof DataStoreExtensionsKt$safeUpdate$1) {
                dataStoreExtensionsKt$safeUpdate$1 = (DataStoreExtensionsKt$safeUpdate$1) continuation;
                int i2 = dataStoreExtensionsKt$safeUpdate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreExtensionsKt$safeUpdate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dataStoreExtensionsKt$safeUpdate$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreExtensionsKt$safeUpdate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        dataStoreExtensionsKt$safeUpdate$1.L$0 = null;
                        dataStoreExtensionsKt$safeUpdate$1.L$1 = null;
                        dataStoreExtensionsKt$safeUpdate$1.label = 1;
                        Object a = tpgVar.a(wlsVar, dataStoreExtensionsKt$safeUpdate$1);
                        return a == obj2 ? obj2 : a;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (Exception unused) {
            return null;
        }
        dataStoreExtensionsKt$safeUpdate$1 = new DataStoreExtensionsKt$safeUpdate$1(continuation);
        Object obj3 = dataStoreExtensionsKt$safeUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreExtensionsKt$safeUpdate$1.label;
    }
}
