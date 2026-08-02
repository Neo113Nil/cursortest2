package com.yandex.go.zone.interactors;

import defpackage.ny61;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(com.yandex.go.zone.repository.d dVar, String str, ContinuationImpl continuationImpl) {
        ZoneAnticrisisInteractorKt$getLastZoneNamesJoined$1 zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1;
        Object obj;
        int i;
        List list;
        if (continuationImpl instanceof ZoneAnticrisisInteractorKt$getLastZoneNamesJoined$1) {
            zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1 = (ZoneAnticrisisInteractorKt$getLastZoneNamesJoined$1) continuationImpl;
            int i2 = zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.label = i2 - Integer.MIN_VALUE;
                obj = zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.L$0 = null;
                    zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.L$1 = str;
                    zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.label = 1;
                    obj = dVar.b(zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.L$1;
                    kotlin.b.b(obj);
                }
                String str2 = str;
                if (((List) obj).isEmpty()) {
                    obj = null;
                }
                list = (List) obj;
                if (list == null) {
                    return kotlin.collections.a.X(list, str2, null, null, null, 62);
                }
                return null;
            }
        }
        zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1 = new ZoneAnticrisisInteractorKt$getLastZoneNamesJoined$1(continuationImpl);
        obj = zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAnticrisisInteractorKt$getLastZoneNamesJoined$1.label;
        if (i != 0) {
        }
        String str22 = str;
        if (((List) obj).isEmpty()) {
        }
        list = (List) obj;
        if (list == null) {
        }
    }
}
